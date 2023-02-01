package com.aa.ooad.internal.restaurant.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aa.ooad.internal.restaurant.entity.Restaurant;

public class RestaurantService {

	private List<Restaurant> restaurantList;
	 
	public RestaurantService() {
		this.restaurantList = genRestaurantList();
	}
 

	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}
	
	private List<Restaurant> genRestaurantList() {
		List<Restaurant> temp = new ArrayList<Restaurant>();
		Restaurant rt;
		for (int i = 0; i < 10; i++) {
			temp.add(new Restaurant());
		}
		
		return temp;
	}

}
