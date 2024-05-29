import React, { useState } from 'react';
import axios from 'axios';
import '../components/renatalmanagement.css';

const RentalProperty = () => {
  const [property_Type, setProperty_Type] = useState('');
  const [location, setLocation] = useState('');
  const [price_Range, setPrice_Range] = useState('');
  const [numberof_Bedrooms, setNumberof_Bedrooms] = useState('');
  const [property_size, setProperty_size] = useState('');
  const [floor_plan, setFloor_plan] = useState('');
  const [lease_Terms, setLease_Terms] = useState('');
  const [contact, setContact] = useState('');
  const [parking_Availabilty, setParking_Availabilty] = useState('');
  const [maintantence_fess,setMaintantence_fess] = useState('');
  const [availabilty_Status, setAvailabilty_Status] = useState('');
  const [ rent_Amount, setRent_Amount] = useState('');
  const [availabilty_Date, setAvailabilty_Date] = useState('');

  const handleSubmit = async (event) => {
    event.preventDefault();

    const rentalData = {
      property_Type,
      location,
      price_Range,
      numberof_Bedrooms,
      property_size,
      floor_plan,
      lease_Terms,
      contact,
      parking_Availabilty,
      maintantence_fess,
      availabilty_Status,
      rent_Amount,
      availabilty_Date,
    };

    try {
      await axios.post('http://localhost:8080/api/Rentalmanagement', rentalData);
      alert('Rental property submitted successfully');
    } catch (error) {
      console.error('Error submitting rental property:', error);
    }
  };

  return (
    <div className="connttainer">
  <h1>Rental Property</h1>
  <form onSubmit={handleSubmit}>
    {/* <input type="text" placeholder="Property Type" onChange={(e) => setProperty_Type(e.target.value)} /> */}
    <label htmlFor="Property Type"><h5>Property Type</h5></label>
    <select id="Property Type" onChange={(e) => setProperty_Type(e.target.value)}>
      <option value="Apartment">Apartment</option>
      <option value="House">House</option>
    </select>
    <input type="text" placeholder="Location" onChange={(e) => setLocation(e.target.value)} />
    {/* <input type="text" placeholder="Price Range" onChange={(e) => setPrice_Range(e.target.value)} /> */}
    <label htmlFor="Price Range"><h5>Price Range</h5></label>
    <select id="Price Range" onChange={(e) => setPrice_Range(e.target.value)}>
      <option value="1000 to 3000">1000 to 3000</option>
      <option value="1000 to 5000">1000 to 5000</option>
      <option value="5000 to 10000">5000 to 10000</option>
      <option value="10000 to 20000">10000 to 20000</option>
      <option value="20000 to 50000">20000 to 50000</option>
      <option value="50000 to 100000">50000 to 100000</option>
    </select>
    
    {/* <input type="text" placeholder="Number of Bedrooms" onChange={(e) => setNumberof_Bedrooms(e.target.value)} /> */}
   
    <label htmlFor="Number of Bedrooms"><h5>Number of Bedrooms</h5></label>
    <select id="Number of Bedrooms" onChange={(e) => setNumberof_Bedrooms(e.target.value)}>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="1">3</option>
      <option value="2">4</option>
      <option value="1">5</option>
     
    </select>
   
    <input type="text" placeholder="Property Size" onChange={(e) => setProperty_size(e.target.value)} />
    {/* <input type="text" placeholder="Floor Plan" onChange={(e) => setFloor_plan(e.target.value)} /> */}
    <input type="text" placeholder="Lease Terms" onChange={(e) => setLease_Terms(e.target.value)} />
    <input type="text" placeholder="Contact" onChange={(e) => setContact(e.target.value)} />

    <label htmlFor="Floor Plan"><h5>Floor Plan</h5></label>
    <select id="Floor Plan" onChange={(e) => setFloor_plan(e.target.value)}>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="1">3</option>
      <option value="2">4</option>
      <option value="1">5</option>
      <option value="2">6</option>
      <option value="1">7</option>
      <option value="2">8</option>
    </select>
    <label htmlFor="availabilityStatus"><h5>Availability Status</h5></label>
    <select id="availabilityStatus" onChange={(e) => setAvailabilty_Status(e.target.value)}>
      <option value="yes">Yes</option>
      <option value="no">No</option>
    </select>

    <label htmlFor="parkingAvailability"><h5>Parking Availability</h5></label>
    <select id="parkingAvailability" onChange={(e) => setParking_Availabilty(e.target.value)}>
      <option value="yes">Yes</option>
      <option value="no">No</option>
    </select>

    <label htmlFor="maintenanceFees"><h5>Maintenance Fees</h5></label>
    <select id="maintenanceFees" onChange={(e) => setMaintantence_fess(e.target.value)}>
      <option value="yes">Yes</option>
      <option value="no">No</option>
    </select>

    {/* <input type="text" placeholder="Rent Amount" onChange={(e) => setRent_Amount(e.target.value)} /> */}
    <h5>Availabilty Date</h5>
    <input type="date" placeholder="Availability Date" onChange={(e) => setAvailabilty_Date(e.target.value)} />

    <button type="submit">Submit</button>
  </form>
</div>


 
  );
};

export default RentalProperty;
