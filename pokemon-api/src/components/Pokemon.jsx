import React from "react";
import axios from "axios";
import { useState } from "react";

const Pokemon = () => {
  const [pokemon, setPokemon] = useState([]);

  const handleClick = (e) => {
    axios
      .get("https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0")
      .then((res) => {
        setPokemon(res.data.results);
      });
  };

  return (
    <div>
      <button onClick={handleClick}>Fetch Pokemon</button>
      {pokemon.map((pokemon, i) => {
        return (
          <div key={i}>
            <p>{pokemon.name}</p>
          </div>
        );
      })}
    </div>
  );
};

export default Pokemon;
