package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PropertyPurcahse;

public interface PurchaseeRepository  extends JpaRepository<PropertyPurcahse,Long>{

	 PropertyPurcahse findById(long id);

	

	

	 

}
