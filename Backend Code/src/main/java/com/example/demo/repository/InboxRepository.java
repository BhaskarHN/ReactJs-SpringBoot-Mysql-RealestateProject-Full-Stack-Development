package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Inbox;
import com.example.demo.entity.Property;

public interface InboxRepository extends JpaRepository< Inbox,Long> {

//	Property save(Property property);

	
Inbox save(Inbox inbox);
}
