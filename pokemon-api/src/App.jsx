import React from 'react'
import { useState } from 'react'
import './App.css'
import './bootstrap.min.css'
import Pokemon from './components/Pokemon'

const App = () => {
  return (
    <div className='App mt-5'>
      <div className="card mt-5">
      <h1>Pokemon</h1>
      <Pokemon />
      </div>
    </div>
  )
}

export default App