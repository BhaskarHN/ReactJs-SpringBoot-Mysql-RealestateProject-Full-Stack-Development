package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PropertyMaintenance;

@Repository
public interface PropertyMaintenanceRepository extends JpaRepository<PropertyMaintenance, Long> {
    // Add any custom queries if needed
}

