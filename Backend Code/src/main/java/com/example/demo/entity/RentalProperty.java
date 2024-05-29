package com.example.demo.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RentalProperty_Management")
public class RentalProperty {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Property_Type;
	private String Location;
	private String Price_Range;
	private String Numberof_Bedrooms;
	private String Property_size;
	private String Floor_plan;
	private String Lease_Terms;
	private String Contact;
	private String Parking_Availabilty;
	private String Maintantence_fess;
	private String Availabilty_Status;
	private String Rent_Amount;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Availabilty_Date;
	
	
	public RentalProperty(long id, String property_Type, String location, String price_Range, String numberof_Bedrooms,
			String property_size, String floor_plan, String lease_Terms, String contact, String parking_Availabilty,
			String maintantence_fess, String availabilty_Status, String rent_Amount, Date availabilty_Date) {
		super();
		Id = id;
		Property_Type = property_Type;
		Location = location;
		Price_Range = price_Range;
		Numberof_Bedrooms = numberof_Bedrooms;
		Property_size = property_size;
		Floor_plan = floor_plan;
		Lease_Terms = lease_Terms;
		Contact = contact;
		Parking_Availabilty = parking_Availabilty;
		Maintantence_fess = maintantence_fess;
		Availabilty_Status = availabilty_Status;
		Rent_Amount = rent_Amount;
		Availabilty_Date = availabilty_Date;
	}


	public RentalProperty() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
	}


	public String getProperty_Type() {
		return Property_Type;
	}


	public void setProperty_Type(String property_Type) {
		Property_Type = property_Type;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}


	public String getPrice_Range() {
		return Price_Range;
	}


	public void setPrice_Range(String price_Range) {
		Price_Range = price_Range;
	}


	public String getNumberof_Bedrooms() {
		return Numberof_Bedrooms;
	}


	public void setNumberof_Bedrooms(String numberof_Bedrooms) {
		Numberof_Bedrooms = numberof_Bedrooms;
	}


	public String getProperty_size() {
		return Property_size;
	}


	public void setProperty_size(String property_size) {
		Property_size = property_size;
	}


	public String getFloor_plan() {
		return Floor_plan;
	}


	public void setFloor_plan(String floor_plan) {
		Floor_plan = floor_plan;
	}


	public String getLease_Terms() {
		return Lease_Terms;
	}


	public void setLease_Terms(String lease_Terms) {
		Lease_Terms = lease_Terms;
	}


	public String getContact() {
		return Contact;
	}


	public void setContact(String contact) {
		Contact = contact;
	}


	public String getParking_Availabilty() {
		return Parking_Availabilty;
	}


	public void setParking_Availabilty(String parking_Availabilty) {
		Parking_Availabilty = parking_Availabilty;
	}


	public String getMaintantence_fess() {
		return Maintantence_fess;
	}


	public void setMaintantence_fess(String maintantence_fess) {
		Maintantence_fess = maintantence_fess;
	}


	public String getAvailabilty_Status() {
		return Availabilty_Status;
	}


	public void setAvailabilty_Status(String availabilty_Status) {
		Availabilty_Status = availabilty_Status;
	}


	public String getRent_Amount() {
		return Rent_Amount;
	}


	public void setRent_Amount(String rent_Amount) {
		Rent_Amount = rent_Amount;
	}


	public Date getAvailabilty_Date() {
		return Availabilty_Date;
	}


	public void setAvailabilty_Date(Date availabilty_Date) {
		Availabilty_Date = availabilty_Date;
	}


	@Override
	public String toString() {
		return "RentalProperty [Id=" + Id + ", Property_Type=" + Property_Type + ", Location=" + Location
				+ ", Price_Range=" + Price_Range + ", Numberof_Bedrooms=" + Numberof_Bedrooms + ", Property_size="
				+ Property_size + ", Floor_plan=" + Floor_plan + ", Lease_Terms=" + Lease_Terms + ", Contact=" + Contact
				+ ", Parking_Availabilty=" + Parking_Availabilty + ", Maintantence_fess=" + Maintantence_fess
				+ ", Availabilty_Status=" + Availabilty_Status + ", Rent_Amount=" + Rent_Amount + ", Availabilty_Date="
				+ Availabilty_Date + "]";
	}
	
	
	
	

}
