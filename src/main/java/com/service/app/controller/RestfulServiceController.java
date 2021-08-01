package com.service.app.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.app.function.Category;
import com.service.app.function.City;
import com.service.app.function.Items;
import com.service.app.function.ServiceProvider;
import com.service.app.model.CategoryModel;
import com.service.app.model.CityModel;
import com.service.app.model.ItemsModel;
import com.service.app.model.ServiceProviderModel;
import com.service.app.repository.ItemsRepository;
import com.service.app.repository.OrderedItemsRepository;
@CrossOrigin("*")
@RestController
public class RestfulServiceController {
	
	@Autowired
	private Category category;
	@Autowired
	private City city;
	@Autowired
	private Items items;
	@Autowired
	private ServiceProvider serviceProvider;
	
	@Autowired
	ItemsRepository itemsRepository;
	
	@Autowired
	private OrderedItemsRepository ordereditemRepository;
	
	@RequestMapping(value = {"/api/categories"}, method = RequestMethod.GET)
	public Iterable<CategoryModel> getCategory() {
		
		return category.getAllCategory();
	}

	@RequestMapping(value = {"/api/city"}, method = RequestMethod.GET)
	public Iterable<CityModel> getCity() {
		
		return city.getAllCity();
	}
	
	@RequestMapping(value = {"/api/serviceprovider"}, method = RequestMethod.GET)
	public Iterable<ServiceProviderModel> getServiceProvider() {
		
		return serviceProvider.getAllServiceProvider();
	}
	
	@RequestMapping(value = {"/api/item-list"}, method = RequestMethod.GET)
	public Iterable<ItemsModel> getItem() {
		
		return items.getAllItems();
	}
	@RequestMapping(value = {"/api/item-list/{id}"}, method = RequestMethod.GET)
	
	public ResponseEntity<ItemsModel> getItemById(@PathVariable("id") int id) {
		Optional<ItemsModel> itemData = itemsRepository.findById(id);
		if (itemData.isPresent()) {
			return new ResponseEntity<>(itemData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
