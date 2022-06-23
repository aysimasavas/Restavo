package com.demo.restavo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.restavo.dataAccess.CategoryRepo;
import com.demo.restavo.entities.Category;

@Service
public class CategoryService {

	private final CategoryRepo repo;

	public CategoryService(CategoryRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Category> getAllCategories() {
		return repo.findAll();
	}

	public Category save(Category cat) {
		return repo.save(cat);
	}

}
