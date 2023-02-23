package com.aa.ooad.internal.restaurant.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aa.ooad.internal.restaurant.app.RestaurantService;
import com.aa.ooad.internal.restaurant.entity.Menu;
import com.aa.ooad.internal.restaurant.entity.Restaurant;

@CrossOrigin(origins = "http://localhost:9090")
@RestController
@RequestMapping(path = "/restaurant")
public class RestaurantController {

	private final RestaurantService service;

	public RestaurantController(RestaurantService service) {
		super();
		this.service = service;
	}
	
	@GetMapping()
	public ResponseEntity<List<Restaurant>> getRestaurantList() {
		return ResponseEntity.ok(service.getRestaurantList());
	}

	@GetMapping("/{restaurantId}/menu")
	public ResponseEntity<List<Menu>> getMenuList(@PathVariable("restaurantId") String restaurantId) {
		return ResponseEntity.ok(service.getMenuList(restaurantId));
	}
	
}
