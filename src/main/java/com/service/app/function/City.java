package com.service.app.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.app.model.CityModel;
import com.service.app.repository.CityRepository;

@Service
public class City {

	@Autowired
	private CityRepository cityRepository;
	
	public Iterable<CityModel> getAllCity() {
		return cityRepository.findAll();
	}
}
