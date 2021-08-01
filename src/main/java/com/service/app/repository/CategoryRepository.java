package com.service.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.app.model.CategoryModel;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel, Integer> {

}
