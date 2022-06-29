package com.demo.restavo.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restavo.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
