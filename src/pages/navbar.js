
import React, { useState } from 'react'; // Importing React and useState from 'react' once
import '../components/navbar.css';
import ImageSlider from './homepageimageslider';
import axios from "axios";
const Navbar = () => {
  return (
    <nav className="navbar">
      <ul className="nav-list">
        <li className="nav-item">
          <a href="sidebar">Home</a>
        </li>
        <li className="nav-item" >
          <a href="/about">About</a><pre></pre>
        </li> 
         <li className="nav-item dropdown">
          <span className="dropdown-btn">Property Management</span>
          <div className="dropdown-content">
            <a href="/propertyDetailsssss">Property Details</a>
            {/* <a href="/option2">Property Search</a> */}
            <a href="propertymaintence">Property Maintenance</a>
            <a href='propertymaintancee'>Property Maintenanceee</a>
            <a href="tenantmanagement">Tenant Management</a>
            <a href="PurchaseProcessManagement">Property Purchase Process Management</a>
          </div>
        </li>
        <li className="nav-item dropdown">
          <span className="dropdown-btn">Rental Management</span>
          <div className="dropdown-content">
            <a href="/filterBylocation">Property Search</a>
            <a href="/RentalProperty">Property Details</a>
            <a href="/RentCollection">Rent Collection</a>
            <a href="/Inboxsentmessage">Inbox Sent Message</a>
          </div>
        </li>
        <li className="nav-item dropdown">
          <span className="dropdown-btn">Profile</span>
          <div className="dropdown-content">
            <a href="/profile">My Profile</a>
          </div>
        </li>
      </ul>
      <ImageSlider/>
    </nav>
  );
};

export default Navbar;

export const PropertyMaintenance = () => {
  const [propertyAddress, setPropertyAddress] = useState("");
  const [description, setDescription] = useState("");
  const [urgencyLevel, setUrgencyLevel] = useState("");
  const [preferredDate, setPreferredDate] = useState("");
  const [preferredTime, setPreferredTime] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();

    // Create a data object to send to the backend
    const data = {
      propertyAddress,
      description,
      urgencyLevel,
      preferredDate,
      preferredTime,
    };

    // Send the data to the Spring Boot backend
    axios.post("http://localhost:8080/api/propertymaintenance", data).then((response) => {
      // Handle the response from the backend if needed
      console.log(response.data);
    });
  };

  return (
    <form onSubmit={handleSubmit} className="center-form">
      <h2>Property Maintenance</h2>
      <label>
        Property Address:
        <input
          type="text"
          value={propertyAddress}
          onChange={(e) => setPropertyAddress(e.target.value)} />
      </label>

      <label>
        Description:
        <input
          type="text"
          value={description}
          onChange={(e) => setDescription(e.target.value)} />
      </label>

      <label>
        Urgency Level:
        <select
          value={urgencyLevel}
          onChange={(e) => setUrgencyLevel(e.target.value)}
        >
          <option value="">Select urgency level</option>
          <option value="Low">Low</option>
          <option value="Medium">Medium</option>
          <option value="High">High</option>
        </select>
      </label>

      <label>
        Preferred Date:
        <input
          type="date"
          value={preferredDate}
          onChange={(e) => setPreferredDate(e.target.value)} />
      </label>
<label>
        Preferred Time:
        <input
          type="time"
          value={preferredTime}
          onChange={(e) => setPreferredTime(e.target.value)} />
      </label>

      <button type="submit">Submit</button>
    </form>
  );
};
