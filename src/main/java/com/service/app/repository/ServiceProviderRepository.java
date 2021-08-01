package com.service.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.app.model.ServiceProviderModel;

@Repository
public interface ServiceProviderRepository extends CrudRepository<ServiceProviderModel, Integer> {

}
