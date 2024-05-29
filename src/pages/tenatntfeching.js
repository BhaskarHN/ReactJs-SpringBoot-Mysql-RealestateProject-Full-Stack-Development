import React, { Component } from 'react';
import axios from 'axios';

class TenantList extends Component {
  constructor() {
    super();
    this.state = {
      tenants: [],
      amount: '', // Input field for entering the amount
    };
  }

  handleAmountChange = (event) => {
    this.setState({ amount: event.target.value });
  };

  fetchTenantsByAmount = () => {
    const { amount } = this.state;

    // Make a GET request to your backend API with the amount parameter
    axios.get(`http://localhost:8080/api/tenant-management/${amount}`)
      .then((response) => {
        this.setState({ tenants: response.data });
      })
      .catch((error) => {
        console.error('Error fetching data:', error);
      });
  };

  render() {
    const { tenants } = this.state;

    return (
      <div>
        <h1>Tenant List</h1>
        <div>
          <label>Enter Amount:</label>
          <input
            type="text"
            value={this.state.amount}
            onChange={this.handleAmountChange}
          />
          <button onClick={this.fetchTenantsByAmount}>Fetch Tenants</button>
        </div>
        <ul>
          {tenants.map((tenant) => (
            <li key={tenant.id}>
              {tenant.contact} - {tenant.amount}
            </li>
          ))}
        </ul>
      </div>
    );
  }
}

export default TenantList;
