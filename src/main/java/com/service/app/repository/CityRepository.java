package com.service.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.app.model.CityModel;

@Repository
public interface CityRepository extends CrudRepository<CityModel, Integer> {

}
