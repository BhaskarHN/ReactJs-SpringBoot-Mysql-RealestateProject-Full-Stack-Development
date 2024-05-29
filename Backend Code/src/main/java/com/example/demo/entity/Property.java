package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PropertryDetails")
public class Property {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	  private String propertyType;
	  private String location;
	  private int price;
	  private int numBedrooms;
	  private  String PropertyDescription;
	  private  String ContactInformation;
	  private String Parking_Availability;
	  private String Maintenance_Fees;
	  private String Lease_Terms;
	  private String Availability_Status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public String getPropertyDescription() {
		return PropertyDescription;
	}
	public void setPropertyDescription(String propertyDescription) {
		PropertyDescription = propertyDescription;
	}
	public String getContactInformation() {
		return ContactInformation;
	}
	public void setContactInformation(String contactInformation) {
		ContactInformation = contactInformation;
	}
	public String getParking_Availability() {
		return Parking_Availability;
	}
	public void setParking_Availability(String parking_Availability) {
		Parking_Availability = parking_Availability;
	}
	public String getMaintenance_Fees() {
		return Maintenance_Fees;
	}
	public void setMaintenance_Fees(String maintenance_Fees) {
		Maintenance_Fees = maintenance_Fees;
	}
	public String getLease_Terms() {
		return Lease_Terms;
	}
	public void setLease_Terms(String lease_Terms) {
		Lease_Terms = lease_Terms;
	}
	public String getAvailability_Status() {
		return Availability_Status;
	}
	public void setAvailability_Status(String availability_Status) {
		Availability_Status = availability_Status;
	}
	public Property(Long id, String propertyType, String location, int price, int numBedrooms,
			String propertyDescription, String contactInformation, String parking_Availability, String maintenance_Fees,
			String lease_Terms, String availability_Status) {
		super();
		this.id = id;
		this.propertyType = propertyType;
		this.location = location;
		this.price = price;
		this.numBedrooms = numBedrooms;
		PropertyDescription = propertyDescription;
		ContactInformation = contactInformation;
		Parking_Availability = parking_Availability;
		Maintenance_Fees = maintenance_Fees;
		Lease_Terms = lease_Terms;
		Availability_Status = availability_Status;
	}
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", propertyType=" + propertyType + ", location=" + location + ", price=" + price
				+ ", numBedrooms=" + numBedrooms + ", PropertyDescription=" + PropertyDescription
				+ ", ContactInformation=" + ContactInformation + ", Parking_Availability=" + Parking_Availability
				+ ", Maintenance_Fees=" + Maintenance_Fees + ", Lease_Terms=" + Lease_Terms + ", Availability_Status="
				+ Availability_Status + "]";
	}
	  
	  

}
