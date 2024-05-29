package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Property_Maintenance")
public class PropertyMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String propertyAddress;
    private String description;
    private String urgencyLevel;
    private String preferredDate;
    private String preferredTime;
	public PropertyMaintenance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PropertyMaintenance(Long id, String propertyAddress, String description, String urgencyLevel,
			String preferredDate, String preferredTime) {
		super();
		this.id = id;
		this.propertyAddress = propertyAddress;
		this.description = description;
		this.urgencyLevel = urgencyLevel;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrgencyLevel() {
		return urgencyLevel;
	}
	public void setUrgencyLevel(String urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}
	public String getPreferredDate() {
		return preferredDate;
	}
	public void setPreferredDate(String preferredDate) {
		this.preferredDate = preferredDate;
	}
	public String getPreferredTime() {
		return preferredTime;
	}
	public void setPreferredTime(String preferredTime) {
		this.preferredTime = preferredTime;
	}
	@Override
	public String toString() {
		return "PropertyMaintenance [id=" + id + ", propertyAddress=" + propertyAddress + ", description=" + description
				+ ", urgencyLevel=" + urgencyLevel + ", preferredDate=" + preferredDate + ", preferredTime="
				+ preferredTime + "]";
	}
	
    
    
}

