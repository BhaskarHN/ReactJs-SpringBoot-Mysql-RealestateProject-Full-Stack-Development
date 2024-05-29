import React, { Component } from 'react';
import axios from 'axios';

class PropertyPurchaseDetails extends Component {
  constructor(props) {
    super(props);
    this.state = {
      id: '',
      purchase: null,
    };
  }

  handleChange = (event) => {
    this.setState({ id: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault();

    // Replace with your Spring Boot backend URL
    axios
      .get(`http://localhost:8080/api/getPropertyPurchaseById/${this.state.id}`)
      .then((response) => {
        this.setState({ purchase: response.data });
      })
      .catch((error) => {
        console.error('Error fetching data:', error);
      });
  };

  render() {
    return (
      <div>
        <h2>Property Purchase Details by ID</h2>
        <form onSubmit={this.handleSubmit}>
          <input
            type="text"
            placeholder="Enter Property ID"
            value={this.state.id}
            onChange={this.handleChange}
          />
          <button type="submit">Search</button>
        </form>
        {this.state.purchase && (
          <div>
            <h3>Property Purchase Details:</h3>
            <p>ID: {this.state.purchase.Id}</p>
            <p>Buyer Name: {this.state.purchase.Buyer_Name}</p>
            {/* Add more details here */}
            <p>Buyer Contact: {this.state.purchase.Buyer_Contact}</p>
    <p>Property Type: {this.state.purchase.Property_type}</p>
            <p>Property Size: {this.state.purchase.Property_size}</p>
    <p>Property Address: {this.state.purchase.Property_Address}</p>
    <p>Purchase Price: {this.state.purchase.Purcahse_Price}</p>
    <p>Down Payment: {this.state.purchase.Down_Payment}</p>
    <p>Purchase Date: {this.state.purchase.Purchase_Date}</p>
    <p>Time: {this.state.purchase.Time}</p>
    <p>Loan Option: {this.state.purchase.Loan_option}</p>
    <p>Share Notes: {this.state.purchase.Share_Notes}</p>
          </div>
        )}
      </div>
    );
  }
}

export default PropertyPurchaseDetails;

