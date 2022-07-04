package com.example.pokedex.api;

import com.example.pokedex.api.model.PokemonApiResult;
import com.example.pokedex.api.model.PokemonsApiResult;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class PokemonsRepository {
    // https://pokeapi.co/api/v2/pokemon/?limit=151
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    PokemonService service = retrofit.create(PokemonService.class);

    public getPokemons(){
        int limit =151;
        Call<PokemonsApiResult> call = service.listPokemons(limit);

        call.enqueue();
    }
}
