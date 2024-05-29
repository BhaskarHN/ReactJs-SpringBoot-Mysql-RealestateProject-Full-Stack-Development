import React, { useState } from 'react';
import axios from 'axios';
import '../components/Rentcollection.css';

function RentCollectionForm() {
  const [propertyType, setPropertyType] = useState('');
  const [location, setLocation] = useState('');
  const [floor, setFloor] = useState('');
  const [rentAmount, setRentAmount] = useState('');
  const [payAmountDate, setPayAmountDate] = useState('');
  const [time, setTime] = useState('');
  const [paymentType, setPaymentType] = useState('');
  const [file, setFile] = useState(null);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const formData = new FormData();
    formData.append('property_Type', propertyType);
    formData.append('location', location);
    formData.append('floor', floor);
    formData.append('rentAmount', rentAmount);
    formData.append('payAmount_Date', payAmountDate);
    formData.append('time', time);
    formData.append('paymentType', paymentType);
    formData.append('file', file);

    try {
      const response = await axios.post('http://localhost:8080/api/RentCollection', formData);

      // Handle the response from the server here (e.g., show a success message)
      console.log('Server Response:', response.data);

      // Reset the form fields after submission
      setPropertyType('');
      setLocation('');
      setFloor('');
      setRentAmount('');
      setPayAmountDate('');
      setTime('');
      setPaymentType('');
      setFile(null);
    } catch (error) {
      // Handle errors (e.g., display an error message)
      console.error('Error:', error);
    }
  };

  return (
    <div class="RentCollection">
      <h1>Rent Collection Form</h1>
      <form onSubmit={handleSubmit}>
       
        
        <label htmlFor="Property Type"><h3>Property Type</h3></label>
    <select id="Property Type" onChange={(e) => setPropertyType(e.target.value)}>
      <option value="Apartment">Apartment</option>
      <option value="House">House</option>
    </select>
   
<div>
  <label>Location</label>
  <input
    type="text"
    value={location}
    onChange={(e) => setLocation(e.target.value)}
  />
</div>
<label htmlFor="Floor Plan"><h3>Floor Plan</h3></label>
    <select id="Floor Plan" onChange={(e) => setFloor(e.target.value)}>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="1">3</option>
      <option value="2">4</option>
      <option value="1">5</option>
      <option value="2">6</option>
      <option value="1">7</option>
      <option value="2">8</option>
    </select>
<div>
  <label>Rent Amount</label>
  <input
    type="number"
    value={rentAmount}
    onChange={(e) => setRentAmount(e.target.value)}
  />
</div>
<div>
  <label>Pay Amount Date</label>
  <input
    type="date"
    value={payAmountDate}
    onChange={(e) => setPayAmountDate(e.target.value)}
  />
</div>
<div>
  <label>Time</label>
  <input
    type="time"
    value={time}
    onChange={(e) => setTime(e.target.value)}
  />
</div>

<label htmlFor="Payment Type"><h3>Payment Type</h3></label>
    <select id="Payment Type" onChange={(e) => setPaymentType(e.target.value)}>
      <option value="Offine">Offine</option>
      <option value="Online">Online</option>
    </select>
<div>
  <label>Relavent File</label>
  <input
    type="file"
    onChange={(e) => setFile(e.target.files[0])}
  />
</div>

       
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default RentCollectionForm;
