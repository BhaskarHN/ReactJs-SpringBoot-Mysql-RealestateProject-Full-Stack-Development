
import React, { useState } from 'react';
import axios from 'axios';
import '../components/registration.css';

const RegistrationPage = () => {
  const [id, setId] = useState(''); 
  const [firstName, setFullName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [lastName, setLastname] = useState('');
  const [confirmPassword, setConfirmpassword] = useState('');

  
  async function handleSubmit(event)
  {

 event.preventDefault();
    try
    {
      await axios.post("http://localhost:8080/api/register",
      
      {
id:id,
firstName:firstName,
lastName:lastName,
email:email,
password:password,
confirmPassword:confirmPassword
      });
      alert("user registration successfully");
      setId("");
      setFullName("");
      setEmail("");
      setPassword("");
      setLastname("");
      setConfirmpassword("");
      
    }

    catch(err)
    {
      alert("user registration failed");
    }
  }
    

  
      
  return (
    <div className="containerr">
      <h2>Registration Page</h2>
      <form onSubmit={handleSubmit}>
     

        <div className="registerform-group">
          <label htmlFor="fullName" className='lable-style'>First Name:</label>
          <input
            type="text"
            id="fullName"
            value={firstName}
            onChange={(e) => setFullName(e.target.value)}
          />
        </div>
        <div className="registerform-group">
        <label htmlFor="lastname" className='lable-style'>LastName:</label>
          <input
            type="text"
            id="lastName"
            value={lastName}
            onChange={(e) => setLastname(e.target.value)}
          />
          </div>
          <div className="registerform-group">
          <label htmlFor="email" className='lable-style'>Email:</label>
          <input
            type="email"
            id="email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className="registerform-group">
          <label htmlFor="password" className='lable-style'>Password:</label>
          <input
            type="password"
            id="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />
        </div>
        <div className="registerform-group">
        <label htmlFor="confirmpassword" className='lable-style'>Confirm Password:</label>
          <input
            type="text"
            id="confirmpassword"
            value={confirmPassword}
            onChange={(e) => setConfirmpassword(e.target.value)}
          />

        </div>
        <button type="submit" onClick={handleSubmit}  >Register</button>
        <p className='sidebar'>Already have an account?<a href='loginpage' >Sign in</a></p>
      </form>
    </div>
  );
};
export default RegistrationPage;