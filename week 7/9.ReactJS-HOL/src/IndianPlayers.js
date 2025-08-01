import React from 'react';

const IndianPlayers = () => {
  const players = ['Virat', 'Rohit', 'Dhoni', 'Hardik', 'Shami', 'Bumrah'];
  const [p1, p2, p3, p4, p5, p6] = players;

  const T20players = ['Gill', 'Surya', 'Pant'];
  const RanjiTrophyPlayers = ['Rahane', 'Pujara'];

  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  const oddPlayers = players.filter((_, index) => index % 2 !== 0);
  const evenPlayers = players.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 and Ranji Trophy Players</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
