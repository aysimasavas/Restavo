package com.demo.restavo.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.demo.restavo.entities.Restaurant;


public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
	List<Restaurant> findById(boolean id);
	List<Restaurant> findByName(String name);

	// @Query("select r from restaurant r where r.category_id = :id or ")
	List<Restaurant> findByCategory_categoryId(@Param("category_id") Long id);
	}

