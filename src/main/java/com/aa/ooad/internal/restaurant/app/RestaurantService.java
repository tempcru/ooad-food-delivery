package com.aa.ooad.internal.restaurant.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.aa.ooad.internal.restaurant.entity.Menu;
import com.aa.ooad.internal.restaurant.entity.Restaurant;
import com.aa.ooad.internal.restaurant.repository.MenuRepository;
import com.aa.ooad.internal.restaurant.repository.RestaurantRepository;

@Service
@Transactional
public class RestaurantService {

//	private List<Restaurant> restaurantList;
//	 
//	public RestaurantService() {
//		this.restaurantList = genRestaurantList();
//	}
// 
//
//	public List<Restaurant> getRestaurantList() {
//		return restaurantList;
//	}
//	
//	private List<Restaurant> genRestaurantList() {
//		List<Restaurant> temp = new ArrayList<Restaurant>();
//		Restaurant rt;
//		for (int i = 0; i < 10; i++) {
//			temp.add(new Restaurant());
//		}
//		
//		return temp;
//	}
	
	private RestaurantRepository repository;
	private MenuRepository menuRepository;
	
	public RestaurantService(RestaurantRepository repository, MenuRepository menuRepository) {
		super();
		this.repository = repository;
		this.menuRepository = menuRepository;
	}

	public List<Restaurant> getRestaurantList() {
		
		List<Restaurant> list = repository.findAll();
		return list;
	}

	public List<Menu> getMenuList(String restaurantId) { 
		return menuRepository.findByRestaurantId(restaurantId);
	}
	
	
	

}
