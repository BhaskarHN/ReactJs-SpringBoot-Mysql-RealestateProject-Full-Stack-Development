package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.http.HttpStatus;

import jakarta.persistence.*;

@Entity
@Table(name="Registration")
public class User {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String FirstName;
	private String LastName;

	private String Email;
	private String Password;
	private String ConfirmPassword;
	private String Token;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	public User(String firstName, String lastName, String email, String password, String confirmPassword,
			String token) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		ConfirmPassword = confirmPassword;
		Token = token;
	}
	
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", Password=" + Password + ", ConfirmPassword=" + ConfirmPassword + ", Token=" + Token + "]";
	}
	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	

}
