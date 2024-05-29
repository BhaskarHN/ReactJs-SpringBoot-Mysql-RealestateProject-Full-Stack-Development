
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../components/search.css'; // Import your CSS file

function FilterByLocation() {
    const [location, setLocation] = useState('');
    const [propertyDetails, setPropertyDetails] = useState([]);
    const [selectedProperty, setSelectedProperty] = useState(null);

    useEffect(() => {
        fetchPropertyDetails();
    }, []);

    const fetchPropertyDetails = () => {
        axios
            .get(`http://localhost:8080/api/location/${location}`)
            .then((response) => {
                setPropertyDetails(response.data);
            })
            .catch((error) => {
                console.error('Error fetching data:', error); 
            });
    };

    const handleUpdateClick = (property) => {
        setSelectedProperty(property);
        setLocation(property.location);
    };

    const handleDeleteClick = (id) => {
        axios
            .delete(`http://localhost:8080/api/property/${id}`)
            .then((response) => {
                console.log('Property deleted:', response.data);
                fetchPropertyDetails();
            })
            .catch((error) => {
                console.error('Error deleting property:', error);
            });
    };

    const handleSaveUpdate = () => {
        if (selectedProperty) {
            axios
                .put(`http://localhost:8080/api/property/${selectedProperty.id}`, {
                    location,
                })
                .then((response) => {
                    console.log('Property updated:', response.data);
                    setSelectedProperty(null);
                    setLocation('');
                    fetchPropertyDetails();
                })
                .catch((error) => {
                    console.error('Error updating property:', error);
                });
        }
    };

    return (
        <div className="app-container">
            <div className="search-container">
                <div className="navbarr">
                    {/* Add your navbar content here */}
                    <a href="/sidebar">Home</a>
                    
                </div>
                <div className="search-bar">
                    <input
                        type="text"
                        className="search-input"
                        placeholder="Enter location"
                        value={location}
                        onChange={(e) => setLocation(e.target.value)}
                    />
                    <button className="search-button" onClick={fetchPropertyDetails}>
                        Fetch Details
                    </button>
                </div>
            </div>
            <div className="property-details">
                <h1>Property Details</h1>
                <table className='table'>
                    <thead>
                        <tr >
                            <th>ID</th>
                            <th>Property Type</th>
                            <th>Location</th>
                            <th>Price</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {propertyDetails.map((property) => (
                            <tr key={property.id}>
                                <td>{property.id}</td>
                                <td>{property.propertyType}</td>
                                <td>{property.location}</td>
                                <td>${property.price}</td>
                                <td>
                                    <button
                                        className="update-button"
                                        onClick={() => handleUpdateClick(property)}
                                    >
                                        Update
                                    </button>
                                    <button
                                        className="delete-button"
                                        onClick={() => handleDeleteClick(property.id)}
                                    >
                                        Delete
                                    </button>
                                </td>
                            </tr>
                        ))}
                    </tbody>
                </table>
                {selectedProperty && (
                    <div className="update-form">
                        <h3>Update Property</h3>
                        <input
                            type="text"
                            placeholder="New location"
                            value={location}
                            onChange={(e) => setLocation(e.target.value)}
                        />
                        <button className="update-button" onClick={handleSaveUpdate}>
                            Save Update
                        </button>
                        <button
                            className="cancel-button"
                            onClick={() => setSelectedProperty(null)}
                        >
                            Cancel
                        </button>
                    </div>
                )}
            </div>
        </div>
    );
}

export default FilterByLocation;
