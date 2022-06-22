package com.demo.restavo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restavo.entities.Category;
import com.demo.restavo.entities.Restaurant;
import com.demo.restavo.service.CategoryService;
import com.demo.restavo.service.RestaurantService;

@CrossOrigin(origins = "http://localhost:8078")
@RestController
@RequestMapping("/")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;

	@Autowired
	CategoryService categoryService;

	// tüm restoranları listeler
	@GetMapping("restaurants")
	public ResponseEntity<List<Restaurant>> getAll() {
		List<Restaurant> restaurants = restaurantService.findAll();
		return ResponseEntity.ok(restaurants);
	}

	// id'si verilen restoranı getirir
	@GetMapping("restaurant/{id}")
	public ResponseEntity<Optional<Restaurant>> getRestaurant(@PathVariable("id") long id) {
		Optional<Restaurant> restaurant = restaurantService.findAllById(id);
		return ResponseEntity.ok(restaurant);
	}

	// kategorileri listeler
	@GetMapping("getCategories")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.getAllCategories();
		return ResponseEntity.ok(categories);
	}

	// istenilen kategorideki restoranları listeler
	@GetMapping("getRestaurants/{categoryId}")
	public ResponseEntity<List<Restaurant>> getRestaurantWithCategorie(
			@PathVariable("categoryId") long id) {

		Optional<List<Restaurant>> restaurants = restaurantService.findbycategoryid(id);
		return ResponseEntity.ok(restaurants.get());

	}

}
