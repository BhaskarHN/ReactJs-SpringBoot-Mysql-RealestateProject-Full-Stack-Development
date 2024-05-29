package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Custom queries can be added here if needed
}

