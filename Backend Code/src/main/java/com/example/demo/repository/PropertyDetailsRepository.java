package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Property;
@Repository
public interface PropertyDetailsRepository extends  JpaRepository<Property, Long> {

	Property save(Property property);

	
	
	

}
