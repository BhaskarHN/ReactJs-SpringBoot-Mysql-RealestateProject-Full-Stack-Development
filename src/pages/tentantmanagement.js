
import React, { useState } from 'react';
import axios from 'axios';
import '../components/tentantmanagement.css';


const TenantManagement = () => {
  const [tenatantPicture, setTenatantPicture] = useState(null);
  const [uploadLeaseAgreement, setUploadLeaseAgreement] = useState(null);
  const [contact, setContact] = useState('');
  const [leaseStartDate, setLeaseStartDate] = useState('');
  const [leaseEndDate, setLeaseEndDate] = useState('');
  const [securityDeposit, setSecurityDeposit] = useState('');
  const [paymentDate, setPaymentDate] = useState('');
  const [amount, setAmount] = useState('');
  const [paymentStatus, setPaymentStatus] = useState('');

  const handleTenatantPictureChange = (event) => {
    setTenatantPicture(event.target.files[0]);
  };

  const handleUploadLeaseAgreementChange = (event) => {
    setUploadLeaseAgreement(event.target.files[0]);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();

    const formData = new FormData();
    formData.append('file', tenatantPicture);
    formData.append('uploadlease_agreement', uploadLeaseAgreement);
    formData.append('contact', contact);
    formData.append('leaseStart_date', leaseStartDate);
    formData.append('leaseEnd_date', leaseEndDate);
    formData.append('security_Deposit', securityDeposit);
    formData.append('paymentDate', paymentDate);
    formData.append('amount', amount);
    formData.append('paymentStatus', paymentStatus);

    try {
      await axios.post('http://localhost:8080/api/tentantmanagement', formData, {
        headers: {
          'Content-Type': 'multipart/form-data'
        }
      });
      // Handle successful upload
      alert('Image uploaded successfully');
    } catch (error) {
      // Handle error
      console.error('Error uploading image:', error);
    }
  };

  return (
    <div className="contaiinerr">
      <h2>Tenant Management</h2>
      <form onSubmit={handleSubmit}>
        
        <input type="text" placeholder="Contact" onChange={(e) => setContact(e.target.value)} />
        <h5>LeaseStart Date</h5>
        <input type="date" placeholder="Lease Start Date" onChange={(e) => setLeaseStartDate(e.target.value)} />
        <h5>LeaseEnd Date</h5>
        <input type="date" placeholder="Lease End Date" onChange={(e) => setLeaseEndDate(e.target.value)} />
        <input type="text" placeholder="Security Deposit" onChange={(e) => setSecurityDeposit(e.target.value)} />
        <h5>Payment Date</h5>
        <input type="date" placeholder="Payment Date" onChange={(e) => setPaymentDate(e.target.value)} />
        <input type="text" placeholder="Amount" onChange={(e) => setAmount(e.target.value)} />
        
      <input type="text" placeholder="Payment Status" onChange={(e) => setPaymentStatus(e.target.value)} />
      <h5>Upload TenantPicture</h5>
        <input type="file" onChange={handleTenatantPictureChange} />
        <h5>Upload LeaseAgreement</h5>
        <input type="file" onChange={handleUploadLeaseAgreementChange} />
        <button type="submit">Upload</button>
      </form>
    </div>
  );
};

export default TenantManagement;
