import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 90 },
    { name: 'Rohit', score: 85 },
    { name: 'Dhoni', score: 60 },
    { name: 'Hardik', score: 70 },
    { name: 'Shami', score: 50 },
    { name: 'Bumrah', score: 75 },
    { name: 'Surya', score: 65 },
    { name: 'Jadeja', score: 80 },
    { name: 'Gill', score: 95 },
    { name: 'Kuldeep', score: 68 },
    { name: 'Ashwin', score: 55 },
  ];

  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
