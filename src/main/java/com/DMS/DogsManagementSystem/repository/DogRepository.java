package com.DMS.DogsManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.DMS.DogsManagementSystem.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog> findByName(String name);
}
