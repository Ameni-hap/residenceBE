package com.restaurant.management.repository;

import org.springframework.data.repository.CrudRepository;

import com.restaurant.management.model.Plate;

public interface PlateRepository  extends CrudRepository<Plate, Integer>{

}
