import React from 'react';
import './App.css';

function App() {
  const offices = [
    {
      name: 'Business Bay',
      rent: 58000,
      address: '789 Commercial St, Pune',
      image: 'https://images.unsplash.com/photo-1570129477492-45c003edd2be?auto=format&fit=crop&w=300&q=80'
    }
  ];

  return (
    <div className="App">
      <h1>Office Space Rental App</h1>
      {offices.map((office, index) => (
        <div key={index} className="office-card">
          <img src={office.image} alt={office.name} />
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
