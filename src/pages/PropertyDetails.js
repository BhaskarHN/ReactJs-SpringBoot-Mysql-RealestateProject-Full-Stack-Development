import React, { useState } from 'react';
import axios from 'axios';
import '../components/propertdetails.css';

const PropertyDetails = () => {
  const [propertyType, setPropertyType] = useState('');
  const [location, setLocation] = useState('');
  const [price, setPrice] = useState('');
  const [numBedrooms, setBedrooms] = useState('');
  const [propertyDescription, setDescription] = useState('');
  const [contactInformation, setContactInformation] = useState('');
  const [message, setMessage] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();

    const propertyData = {
      propertyType,
      location,
      price,
      numBedrooms,
      propertyDescription,
      contactInformation,
      message,
    };

//    
try {
    const response = await axios.post('http://localhost:8080/api/property', propertyData);

    setMessage('Profile created successfully!');
    // Reset form fields
    setPropertyType('');
    setLocation('');
    setPrice('');
    setBedrooms('');
    setDescription('');
    setContactInformation('');

  } catch (error) {
    setMessage('Profile creation failed. Please try again later.');
  }
};

  return (
    <div className="propertycontainer">
      <h2>Property Details</h2>
      <form onSubmit={handleSubmit}>
        <div className="propertyform-group">
          <label htmlFor="propertyType" id='a'>Property Type:</label>
          <input
            type="text"
            id="propertyType"
            value={propertyType}
            onChange={(e) => setPropertyType(e.target.value)}
          />
        </div>
        <div className="propertyform-group">
          <label htmlFor="location" id='a'>Location:</label>
          <input
            type="text"
            id="location"
            value={location}
            onChange={(e) => setLocation(e.target.value)}
          />
        </div>
        <div className="propertyform-group">
          <label htmlFor="price" id='a'>Price:</label>
          <input
            type="number"
            id="price"
            value={price}
            onChange={(e) => setPrice(e.target.value)}
          />
        </div>
        <div className="propertyform-group">
          <label htmlFor="numBedrooms" id='a'>Number of Bedrooms:</label>
          <input
            type="number"
            id="numBedrooms"
            value={numBedrooms}
            onChange={(e) => setBedrooms(e.target.value)}
          />
        </div>
        <div className="propertyform-group">
          <label htmlFor="propertyDescription">Property Description:</label>
          <textarea
            id="propertyDescription"
            value={propertyDescription}
            onChange={(e) => setDescription(e.target.value)}
          />
        </div>
        <div className="propertyform-group">
          <label htmlFor="contactInformation">Contact Information:</label>
          <input
            type="text"
            id="contactInformation"
            value={contactInformation}
            onChange={(e) => setContactInformation(e.target.value)}
          />
        </div>
        <button type="submit" >Submit</button>
      </form>
    </div>
  );
};

export default PropertyDetails;
