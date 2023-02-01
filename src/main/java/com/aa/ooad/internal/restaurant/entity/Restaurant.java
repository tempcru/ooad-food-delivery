package com.aa.ooad.internal.restaurant.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

public class Restaurant {

	private String restaurantId;
	private String restaurantName;
	private List<Menu> menuList;
	
	public Restaurant() {
		this.restaurantId = UUID.randomUUID().toString();
		this.restaurantName = RandomStringUtils.randomAlphabetic(10);
		menuList = new ArrayList<>(); 
		
		List<Option> cutletOptions = new ArrayList<Option>();
		List<Option> curryOptions = new ArrayList<Option>();
		cutletOptions.add(new Option("일반", 0));
		cutletOptions.add(new Option("왕돈까스", 2000));
		cutletOptions.add(new Option("치즈가루", 1000));
		
	    curryOptions.add(new Option("보통", 0));
	    curryOptions.add(new Option("맵게", 200));
	    curryOptions.add(new Option("치킨", 1000));
	    curryOptions.add(new Option("새우", 2000));
	    curryOptions.add(new Option("난 추가", 2000));
		
		menuList.add(new Menu("돈까스", 10000, cutletOptions));
		menuList.add(new Menu("카레라이스", 9000, curryOptions));
	}
	
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public List<Menu> getMenuList() {
		return menuList;
	}
	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

}
