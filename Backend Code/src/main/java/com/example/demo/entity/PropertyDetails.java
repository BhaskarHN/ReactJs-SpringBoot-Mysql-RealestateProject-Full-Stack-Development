package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Property_Details")
public class PropertyDetails {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	
	   
	    private String propertyType;

	   
	    private String location;

	    
	    private double price;

	   
	    private int numBedrooms;
	    
	    
	
	  private  String PropertyDescription;
	  
	  private  String ContactInformation;

	
	public PropertyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PropertyDetails(Long id, String propertyType, String location, double price, int numBedrooms,
			String propertyDescription, String contactInformation) {
		super();
		this.id = id;
		this.propertyType = propertyType;
		this.location = location;
		this.price = price;
		this.numBedrooms = numBedrooms;
		PropertyDescription = propertyDescription;
		ContactInformation = contactInformation;
	}


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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
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


	@Override
	public String toString() {
		return "PropertyDetails [id=" + id + ", propertyType=" + propertyType + ", location=" + location + ", price="
				+ price + ", numBedrooms=" + numBedrooms + ", PropertyDescription=" + PropertyDescription
				+ ", ContactInformation=" + ContactInformation + "]";
	}


	


	public PropertyDetails save(PropertyDetails propertymaintennce) {
		// TODO Auto-generated method stub
		return null;
	}


	




	

	



	    

	    // Constructors, getters, setters, etc.
	  
	  
	  
	}



