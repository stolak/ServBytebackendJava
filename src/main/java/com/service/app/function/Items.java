package com.service.app.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.app.model.ItemsModel;
import com.service.app.repository.ItemsRepository;

@Service
public class Items {

	@Autowired
	private ItemsRepository itemsRepository;
	
	public Iterable<ItemsModel> getAllItems() {
		return itemsRepository.findAll();
	}
}
