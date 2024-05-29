import React, { useState } from 'react';
import axios from 'axios';
import '../components/propertyDetails.css';
                                          
function PropertyForm() {
  const [property, setProperty] = useState({
    propertyType: '',
    location: '',
    price: 0,
    numBedrooms: 0,
    propertyDescription: '',
    contactInformation: '',
    parking_Availability: '',
    maintenance_Fees: '',
    lease_Terms: '',
    availability_Status: '',
  });

  const [message, setMessage] = useState(''); // State for success/failure message
  const handleChange = (e) => {
    const { name, value } = e.target;
    setProperty({ ...property, [name]: value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post('http://localhost:8080/api/PropertyDetail', property);
      console.log('Property created:', response.data);

      // Set success message
      setMessage('Property created successfully!');

      // Clear the form fields after successful submission
      setProperty({
        propertyType: '',
        location: '',
        price: 0,
        numBedrooms: 0,
        propertyDescription: '',
        contactInformation: '',
        parking_Availability: '',
        maintenance_Fees: '',
        lease_Terms: '',
        availability_Status: '',
      });

      // You can handle success here, e.g., redirect or additional actions
    } catch (error) {
      console.error('Error creating property:', error);

      // Set error message
      setMessage('Property creation failed. Please try again later.');

      // You can handle the error case here, e.g., show an error message or take other actions
    }
  };
  

  return (
    <div className="property">
      <h2>Add a New Property</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Property Type:
          <input
            type="text"
            name="propertyType"
            value={property.propertyType}
            onChange={handleChange}
          />
        </label>
        
        <label>
          Location:
          <input
            type="text"
            name="location"
            value={property.location}
            onChange={handleChange}
          />
        </label>

        <label>
          Price:
          <input
            type="number"
            name="price"
            value={property.price}
            onChange={handleChange}
          />
        </label>

        <label>
          Number of Bedrooms:
          <input
            type="number"
            name="numBedrooms"
            value={property.numBedrooms}
            onChange={handleChange}
          />
        </label>

        <label>
          Property Description:
          <textarea
            name="propertyDescription"
            value={property.propertyDescription}
            onChange={handleChange}
          />
        </label>

        <label>
          Contact Information:
          <input
            type="text"
            name="contactInformation"
            value={property.contactInformation}
            onChange={handleChange}
          />
        </label>

        <label>
          Parking Availability:
          <input
            type="text"
            name="parking_Availability"
            value={property.parking_Availability}
            onChange={handleChange}
          />
        </label>

        <label>
          Maintenance Fees:
          <input
            type="text"
            name="maintenance_Fees"
            value={property.maintenance_Fees}
            onChange={handleChange}
          />
        </label>

        <label>
          Lease Terms:
          <input
            type="text"
            name="lease_Terms"
            value={property.lease_Terms}
            onChange={handleChange}
          />
        </label>

        <label>
          Availability Status:
          <input
            type="text"
            name="availability_Status"
            value={property.availability_Status}
            onChange={handleChange}
          />
        </label>

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default PropertyForm;
