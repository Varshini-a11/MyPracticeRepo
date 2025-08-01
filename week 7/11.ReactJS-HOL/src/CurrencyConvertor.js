// src/CurrencyConvertor.js
import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 0.011; // Example: 1 INR = 0.011 Euro
    setEuros((parseFloat(rupees) * conversionRate).toFixed(2));
  };

  return (
    <div>
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in INR"
        />
        <button type="submit">Convert</button>
      </form>
      {euros !== null && (
        <p>{rupees} INR = {euros} EUR</p>
      )}
    </div>
  );
}

export default CurrencyConvertor;
