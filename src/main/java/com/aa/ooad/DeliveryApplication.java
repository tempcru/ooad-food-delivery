package com.aa.ooad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}

//	private CustomerService customerService;
//	private RestaurantService restaurantService;
//	private Customer customer;

//	public DeliveryApplication() {
//		
//		loadService(); 
//		
//		// 주소정보 등록
//		customer = customerService.loadCustomer();
//		System.out.println("customer :" + customer.toString());
//		
//		// 매장 찾기
//		List<Restaurant> restaurantList = restaurantService.getRestaurantList();
//
//		showRestaurant(restaurantList);
//		
//		//selectRestaurant();
//		//showMenu();
//		
//	}

//	private void showRestaurant(List<Restaurant> restaurantList) {
//		System.out.println("#### 음식점 ####");
//		int menuIndex = 0;
//		StringBuffer sb = new StringBuffer();
//		for (Restaurant resta : restaurantList) {
//			System.out.println(menuIndex + ": "+resta.getRestaurantName());
//			showMenu(resta);
//			menuIndex++;
//		} 
//		System.out.println("-------------------\n");
//		
//	}

//	private void loadService() {
//		customerService = new CustomerService();
//		restaurantService = new RestaurantService();
//	}

//	public static void main(String[] args) {
//		DeliveryApplication app = new DeliveryApplication(); 
//	}

//	public static void showMenu(Restaurant restaurant) {
//		System.out.println("-------------------\n");
//		int menuIndex = 0;
//		StringBuffer sb = new StringBuffer();
//		for (Menu menu : restaurant.getMenuList()) {
//			System.out.println(menuIndex + ": "+menu.getMenuName()+"/"+menu.getPrice()+"원");
//			menuIndex++;
//		} 
//		System.out.println("-------------------\n");
//	}

}
