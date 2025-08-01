// src/App.js
import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(0);

  // Multiple functions for increment
  const increment = () => {
    setCounter(prev => prev + 1);
    sayHello();
  };

  const sayHello = () => {
    alert("Hello! Counter increased.");
  };

  const decrement = () => {
    setCounter(prev => prev - 1);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleSyntheticEvent = (event) => {
    event.preventDefault();
    alert("I was clicked");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>React Event Examples</h1>
      <h2>Counter: {counter}</h2>

      <button onClick={increment}>Increment</button>{' '}
      <button onClick={decrement}>Decrement</button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome to React Event Handling!")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleSyntheticEvent}>
        Synthetic Event Button
      </button>

      <br /><br />

      <CurrencyConvertor />
    </div>
  );
}

export default App;
