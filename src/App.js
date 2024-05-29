// App.js

import React from 'react';


import RegistrationPage from './pages/RegistrationPage';
import {BrowserRouter,Routes,Route} from "react-router-dom";
import LoginForm from './pages/loginform';
import Navbar from './pages/navbar';
import Profile from './pages/myprofile';
import ImaSlider from './pages/homepageimageslider';
import PropertyMaintenance from "./pages/navbar";
import PurchaseProcessManagement from './pages/PurchaseManagement';
import TentantManagement from './pages/tentantmanagement';
import FilterByLocation from './pages/search';
import RentalProperty from './pages/rentalproperty';
import PropertyDetails from './pages/PropertyDetails';
import PropertyPurchaseDetails from './pages/propertyfecting';
import PropertyForm from'./pages/Property';
import InboxForm from './pages/Inbox';
import RentCollectionForm from './pages/RentCollection';



const App = () => {
  return (
    <div>
      <BrowserRouter>
      <Routes>
<Route path="/registerpage" element={<RegistrationPage/>}/>
<Route path="/loginpage" element={<LoginForm/>}/>
<Route path="/sidebar" element={<Navbar />}/>
<Route path="/profile" element={<Profile />}/>
<Route path="/imageSlider" element={<ImaSlider />}/>
<Route path="/propertydetails" element={<PropertyDetails />}/>
<Route path="/propertymaintence" element={<PropertyMaintenance />}/>
<Route path="/tenantmanagement" element={< TentantManagement/>}/>
<Route path="/filterBylocation" element={< FilterByLocation/>}/>
<Route path="/PurchaseProcessManagement" element={< PurchaseProcessManagement/>}/>
<Route path="/RentalProperty" element={< RentalProperty/>}/>
<Route path="/property/:id" element={< PropertyPurchaseDetails/>}/>
<Route path="/propertyDetailsssss" element={< PropertyForm/>}/>
<Route path="/Inboxsentmessage" element={< InboxForm/>}/>
<Route path="RentCollection" element={<RentCollectionForm/>}/>


      </Routes>
      
      
      </BrowserRouter>
     
    </div>
  );
};

export default App;
