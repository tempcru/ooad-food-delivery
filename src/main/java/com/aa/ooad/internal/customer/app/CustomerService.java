package com.aa.ooad.internal.customer.app;

import org.apache.commons.lang3.RandomStringUtils;

import com.aa.ooad.internal.customer.entity.Customer;

public class CustomerService {

	public Customer loadCustomer() {
		Customer customer = new Customer();
		customer.setCustomerId(RandomStringUtils.randomAlphabetic(10));
		customer.setCustomerName(RandomStringUtils.randomAlphabetic(3));
		customer.setAddress(RandomStringUtils.randomAlphabetic(3) + "시 " + RandomStringUtils.randomAlphabetic(3) + "구 "+ RandomStringUtils.randomAlphabetic(3) + "동 "+ RandomStringUtils.randomAlphabetic(3) + "아파트");
		customer.setZipcode(RandomStringUtils.randomNumeric(5));
		return customer;
	}
	
}
