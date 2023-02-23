package com.aa.ooad.internal.restaurant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aa.ooad.internal.restaurant.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, String> {

	List<Menu> findByRestaurantId(String restaurantId);

}
