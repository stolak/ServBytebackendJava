package com.service.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.app.model.ItemsModel;

@Repository
public interface ItemsRepository extends CrudRepository<ItemsModel, Integer> {
	
}
