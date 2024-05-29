import React, { useState } from 'react';
import axios from 'axios';
import '../components/myprofile.css';

const Profile = () => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [localAddress, setLocalAddress] = useState('');
  const [permanentAddress, setPermanentAddress] = useState('');
  const [contactDetails, setContactDetails] = useState('');
  const [message, setMessage] = useState('');
  
  const handleSubmit = async (e) => {
    e.preventDefault();

    const profileData = {
      name,
      email,
      localAddress,
      permanentAddress,
      contactDetails,
      message,
      
    };

    try {
      const response = await axios.post('http://localhost:8080/api/profile', profileData);

      setMessage('Profile created successfully!');
      // Reset form fields
      setName('');
      setEmail('');
      setLocalAddress('');
      setPermanentAddress('');
      setContactDetails('');

    } catch (error) {
      setMessage('Profile creation failed. Please try again later.');
    }
  };

  return (
    <div name="profile">
      <h2>Profile Form</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="name">Name:</label>
          <input
            type="text"
            id="name"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="localAddress">Local Address:</label>
          <input
            type="text"
            id="localAddress"
            value={localAddress}
            onChange={(e) => setLocalAddress(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="permanentAddress">Permanent Address:</label>
          <input
            type="text"
            id="permanentAddress"
            value={permanentAddress}
            onChange={(e) => setPermanentAddress(e.target.value)}
          />
        </div>
        <div>
          <label htmlFor="contactDetails">Contact Details:</label>
          <input
            type="text"
            id="contactDetails"
            value={contactDetails}
            onChange={(e) => setContactDetails(e.target.value)}
          />
        </div>
        <button type="submit">Create Profile</button>
        {message && <p>{message}</p>}
      </form>
    </div>
  );
};

export default Profile;
