package com.example.pokedex.api;

import com.example.pokedex.api.model.PokemonApiResult;
import com.example.pokedex.api.model.PokemonsApiResult;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface PokemonService {

    @GET("pokemon")
    Call<PokemonsApiResult> listPokemons(@Query("limit")int limit=151);

    @GET("pokemon/{number}")
    Call<PokemonApiResult> getPokemon(int number);
}
