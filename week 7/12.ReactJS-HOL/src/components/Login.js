import React from 'react';

function Login({ onLogin }) {
  return (
    <div>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}

export default Login;
