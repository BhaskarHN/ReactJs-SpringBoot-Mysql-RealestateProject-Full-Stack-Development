package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Property;
import com.example.demo.entity.PropertyDetails;
@Repository
public interface PropertyRepository extends JpaRepository<PropertyDetails, Long> {

	PropertyDetails save(PropertyDetails propertyDetails);
	  
    @Query("SELECT pd FROM PropertyDetails pd WHERE pd.location = :location")
	  List<PropertyDetails> findByLocation(String location);
    // You can add custom queries here if needed
//	    @Query("SELECT pd FROM PropertyDetails  WHERE pd.location = :location")

	Property save(Property updatedPropertyDetails);
}
