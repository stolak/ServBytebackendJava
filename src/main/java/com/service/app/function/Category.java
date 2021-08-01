package com.service.app.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.app.model.CategoryModel;
import com.service.app.repository.CategoryRepository;

@Service
public class Category {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public Iterable<CategoryModel> getAllCategory() {
		
		return categoryRepository.findAll();
	}
}
