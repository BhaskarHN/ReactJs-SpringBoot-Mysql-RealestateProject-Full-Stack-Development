import React, { useState } from 'react';
import axios from 'axios';

import '../components/loginform.css';

const LoginForm = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  async function handleSubmit(event) {
    event.preventDefault();
    try {
      const a = await axios.post("http://localhost:8080/api/login", {
        email: email,
        password: password
      });

      if (a.status ===200) {
        console.log("Login successful!");
        // Handle successful login 
      } else {
        console.log("Login failed. Please check your email and password.");
        // Handle unsuccessful login 
      }

    } catch (err) {
      console.log("Login failed. Please try again later.");
    }
  }

  return (
    <div className="logincontaineer">
      <h2>Login Page</h2>
      <form onSubmit={handleSubmit}>
        <div className="loginform-group">
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className="loginform-group">
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
      <button type="submit"onClick={() => window.location.href = '/sidebar'} >Login</button>
        
        <p className="sidebar"> <a href="/registerpage">Register Here</a></p>
      </form>
    </div>
  );
};

export default LoginForm;
