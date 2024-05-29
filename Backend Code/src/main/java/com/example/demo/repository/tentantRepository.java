package com.example.demo.repository;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Tentant;
import com.example.demo.entity.User;

public interface tentantRepository  extends JpaRepository<Tentant, Long>{

//	List<Tentant> findByAmount(String amount);

  
}
