package com.service.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.app.model.OrderedItemsModel;

@Repository
public interface OrderedItemsRepository extends CrudRepository<OrderedItemsModel, Integer> {

}
