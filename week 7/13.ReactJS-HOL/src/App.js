import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('book');
  const isCourseView = view === 'course';

  return (
    <div style={{ textAlign: 'center', padding: '20px' }}>
      <h1>Blogger App</h1>
      <div>
        <button onClick={() => setView('book')}>Book</button>
        <button onClick={() => setView('blog')}>Blog</button>
        <button onClick={() => setView('course')}>Course</button>
      </div>

      {/* Conditional Rendering Examples */}

      {/* 1. If-Else style */}
      {view === 'book' ? (
        <BookDetails />
      ) : view === 'blog' ? (
        <BlogDetails />
      ) : (
        <CourseDetails />
      )}

      {/* 2. Using logical AND */}
      {isCourseView && <p>This is rendered using logical AND (&&) operator.</p>}
    </div>
  );
}

export default App;
