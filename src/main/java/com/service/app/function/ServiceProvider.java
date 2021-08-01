package com.service.app.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.app.model.ServiceProviderModel;
import com.service.app.repository.ServiceProviderRepository;

@Service
public class ServiceProvider {

	@Autowired
	private ServiceProviderRepository serviceProviderRepository;
	
	public Iterable<ServiceProviderModel> getAllServiceProvider() {
		
		return serviceProviderRepository.findAll();
	}
}
