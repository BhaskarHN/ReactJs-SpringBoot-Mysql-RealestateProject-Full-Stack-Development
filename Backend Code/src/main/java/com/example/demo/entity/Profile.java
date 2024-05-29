package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Profile Details")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String localAddress;
    private String permanentAddress;
    private String contactDetails;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
	public Profile(Long id, String name, String email, String localAddress, String permanentAddress,
			String contactDetails) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.localAddress = localAddress;
		this.permanentAddress = permanentAddress;
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", email=" + email + ", localAddress=" + localAddress
				+ ", permanentAddress=" + permanentAddress + ", contactDetails=" + contactDetails + "]";
	}
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters, setters, and constructors (including a default constructor)

    // Additional methods if needed (e.g., getters and setters)
}
