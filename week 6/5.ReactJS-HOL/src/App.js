import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    { name: 'React Bootcamp', status: 'ongoing', startDate: '2025-07-01' },
    { name: 'Java Fullstack', status: 'completed', startDate: '2025-06-01' },
    { name: 'Python Essentials', status: 'completed', startDate: '2025-05-15' },
    { name: 'Cloud Foundations', status: 'ongoing', startDate: '2025-07-20' },
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1>My Academy Cohorts</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails
          key={index}
          name={cohort.name}
          status={cohort.status}
          startDate={cohort.startDate}
        />
      ))}
    </div>
  );
}

export default App;