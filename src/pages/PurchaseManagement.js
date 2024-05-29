import React, { useState } from 'react';
import axios from 'axios';
import '../components/purchase.css'; // Import your CSS file

const PurchaseProcessManagement = () => {
  const [purchaseAgreement, setPurchaseAgreement] = useState(null);
  const [buyerName, setBuyerName] = useState('');
  const [buyerContact, setBuyerContact] = useState('');
  const [propertyType, setPropertyType] = useState('');
  const [propertySize, setPropertySize] = useState('');
  const [purchaseDate, setPurchaseDate] = useState('');
  const [propertyAddress, setPropertyAddress] = useState('');
  const [downPayment, setDownPayment] = useState('');
  const [loanOption, setLoanOption] = useState('');
  const [purchasePrice, setPurchasePrice] = useState('');
  const [shareNotes, setShareNotes] = useState('');
  const [time, setTime] = useState('');

  const handlePurchaseAgreementChange = (event) => {
    setPurchaseAgreement(event.target.files[0]);
  };

  const handleSubmit = async (event) => {
    event.preventDefault();

    const formData = new FormData();
    formData.append('file', purchaseAgreement);
    formData.append('buyer_Name', buyerName);
    formData.append('buyer_Contact', buyerContact);
    formData.append('property_type', propertyType);
    formData.append('property_size', propertySize);
    formData.append('purchase_Date', purchaseDate);
    formData.append('property_Address', propertyAddress);
    formData.append('down_Payment', downPayment);
    formData.append('loan_option', loanOption);
    formData.append('purcahse_Price', purchasePrice);
    formData.append('share_Notes', shareNotes);
    formData.append('time', time);

    try {
      await axios.post('http://localhost:8080/api/PurchaseProcessManagement', formData, {
        headers: {
          'Content-Type': 'multipart/form-data'
        }
      });
      // Handle successful upload
      alert('Purchase process details uploaded successfully');
    } catch (error) {
      // Handle error
      console.error('Error uploading details:', error);
    }
  };

  return (
    <div className="conttainer">
      <h1>Purchase Process Management</h1>
      <form onSubmit={handleSubmit}>
       
        <input type="text" placeholder="Buyer Name" onChange={(e) => setBuyerName(e.target.value)} />
<input type="text" placeholder="Buyer Contact" onChange={(e) => setBuyerContact(e.target.value)} />
<input type="text" placeholder="Property Type" onChange={(e) => setPropertyType(e.target.value)} />
<input type="text" placeholder="Property Size" onChange={(e) => setPropertySize(e.target.value)} />
<h5>Purchase Date</h5>
<input type="date" placeholder="Purchase Date" onChange={(e) => setPurchaseDate(e.target.value)} />
<input type="text" placeholder="Property Address" onChange={(e) => setPropertyAddress(e.target.value)} />
<input type="text" placeholder="Down Payment" onChange={(e) => setDownPayment(e.target.value)} />
<input type="text" placeholder="Loan Option" onChange={(e) => setLoanOption(e.target.value)} />
<input type="text" placeholder="Purchase Price" onChange={(e) => setPurchasePrice(e.target.value)} />
<input type="text" placeholder="Share Notes" onChange={(e) => setShareNotes(e.target.value)} />
<input type="text" placeholder="Time" onChange={(e) => setTime(e.target.value)} />

<h4>Purchase Agreement </h4>
        <input type="file" onChange={handlePurchaseAgreementChange} />
        <button type="submit">Upload</button>
      </form>
    </div>
  );
};

export default PurchaseProcessManagement;
