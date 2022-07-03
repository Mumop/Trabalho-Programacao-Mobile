package com.example.pokedex.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pokedex.R;
import com.example.pokedex.domain.Pokemon;
import com.example.pokedex.domain.PokemonType;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rvPokemons);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        PokemonType poison = new PokemonType("poison");
        PokemonType grass = new PokemonType("grass");
        List<PokemonType> listaTipo = Arrays.asList(grass, poison);

        Pokemon bulbasaur = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
                1,
                "Bulbasaur",
                listaTipo
                );

        List<Pokemon> listaPokemon = Arrays.asList(bulbasaur, bulbasaur, bulbasaur);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(new PokemonAdapter(listaPokemon));
    }
}