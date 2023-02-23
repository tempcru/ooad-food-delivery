package com.aa.ooad.config;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.convert.Jsr310Converters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EntityScan(basePackages = {"com.aa.ooad.internal"}, basePackageClasses = {Jsr310Converters.class})
@EnableJpaRepositories(
		basePackages= "com.aa.ooad.internal",
		entityManagerFactoryRef= "entityManagerFactory",
		transactionManagerRef = "transactionManager"
		)
public class jpaConfig {

	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	
	@Value("${spring.datasource.name}")
	private String userName;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	
	@Autowired
	private Environment env;
	
	@Bean(name = "dataSource")
	public HikariDataSource dataSource() { 
		
		HikariDataSource datasource = new HikariDataSource();
		datasource.setUsername(userName);
		datasource.setPassword(password);
		datasource.setJdbcUrl(jdbcUrl);
		datasource.setDriverClassName(driver);
		datasource.setMaximumPoolSize(10);
		return datasource;
	}
	
	public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
    	final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.aa.ooad.internal");
        
        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        final HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.physical_naming_strategy", PhysicalNamingStrategyStandardImpl.class.getName());
        properties.put("hibernate.implicit_naming_strategy", SpringImplicitNamingStrategy.class.getName());
        properties.put("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "com.aa.ooad.config.SQLDialect");
        
        em.setJpaPropertyMap(properties);
        em.afterPropertiesSet();

        return em.getObject();
    }
	
}
