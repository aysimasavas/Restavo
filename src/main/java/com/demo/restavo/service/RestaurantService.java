package com.demo.restavo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.restavo.dataAccess.RestaurantRepo;
import com.demo.restavo.entities.Restaurant;

@Service
public class RestaurantService {

	private final RestaurantRepo repo;


	public RestaurantService(RestaurantRepo repo) {
		this.repo = repo;
	}

	public Optional<Restaurant> findAllById(long id) {
		return repo.findById(id);
	}

	public List<Restaurant> findAll() {
		return repo.findAll();
	}

	public Optional<List<Restaurant>> findbycategoryid(long id) {
		return Optional.of(repo.findByCategory_categoryId(id));
	}

	public Restaurant save(Restaurant restaurant) {
		return repo.save(restaurant);
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

	public Optional<List<Restaurant>> findByName(String name) {
		return Optional.of(repo.findByName(name));
	}
}
