package com.demo.restavo.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restavo.entities.Category;
import com.demo.restavo.entities.Restaurant;
import com.demo.restavo.service.CategoryService;
import com.demo.restavo.service.RestaurantService;

@CrossOrigin
@RestController
@RequestMapping("/")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;

	@Autowired
	CategoryService categoryService;

	@GetMapping("restaurants")
	public ResponseEntity<List<Restaurant>> getAll() {
		List<Restaurant> restaurants = restaurantService.findAll();
		return ResponseEntity.ok(restaurants);
	}


	@GetMapping("restaurant/{id}")
	public ResponseEntity<Optional<Restaurant>> getRestaurant(@PathVariable("id") long id) {
		Optional<Restaurant> restaurant = restaurantService.findAllById(id);
		return ResponseEntity.ok(restaurant);
	}


	@GetMapping("getCategories")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.getAllCategories();
		return ResponseEntity.ok(categories);
	}


	@GetMapping("getRestaurants/{categoryId}")
	public ResponseEntity<List<Restaurant>> getRestaurantWithCategorie(
			@PathVariable("categoryId") long id) {

		Optional<List<Restaurant>> restaurants = restaurantService.findbycategoryid(id);
		return ResponseEntity.ok(restaurants.get());

	}

	@PostMapping("/restaurant/create")
	public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.save(restaurant);
		return ResponseEntity.ok(restaurant);
	}

	@PostMapping("/category/create")
	public ResponseEntity<Category> addRestaurant(@RequestBody Category category) {
		categoryService.save(category);
		return ResponseEntity.ok(category);
	}

	
	@DeleteMapping("/restaurant/delete/{id}")
	public ResponseEntity<String> deleteRestaurant(@PathVariable("id") long id) {
		restaurantService.delete(id);
		return ResponseEntity.ok("deleted");
	}

	@GetMapping("/search")
	public ResponseEntity<List<Restaurant>> search(@RequestParam String searchName) {
		Optional<List<Restaurant>> restaurants = restaurantService.findByName(searchName);
		return ResponseEntity.ok(restaurants.get());
	}

}
