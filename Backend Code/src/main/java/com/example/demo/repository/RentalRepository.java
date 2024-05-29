package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RentalProperty;

public interface RentalRepository extends JpaRepository<RentalProperty,Long> {

	RentalProperty save(RentalProperty rentalproperty);

}
