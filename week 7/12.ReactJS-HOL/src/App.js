import React, { useState } from 'react';
import Login from './components/Login';
import UserPage from './components/UserPage';
import GuestPage from './components/GuestPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <>
          <UserPage />
          <button onClick={handleLogout}>Logout</button>
        </>
      ) : (
        <>
          <GuestPage />
          <Login onLogin={handleLogin} />
        </>
      )}
    </div>
  );
}

export default App;
