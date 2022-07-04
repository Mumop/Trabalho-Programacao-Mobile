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
        List<PokemonType> tipo1 = Arrays.asList(grass, poison);
        List<PokemonType> tipo2 = Arrays.asList(fire);
        List<PokemonType> tipo3 = Arrays.asList(fire, flying);
        List<PokemonType> tipo4 = Arrays.asList(water);

        Pokemon bulbasaur = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png",
                001,
                "Bulbasaur",
                tipo1
        );
        Pokemon ivysaur = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/002.png",
                002,
                "Ivysaur",
                tipo1
        );
        Pokemon venusaur = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/003.png",
                003,
                "Venusaur",
                tipo1
        );
        Pokemon charmander = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
                004,
                "Charmander",
                tipo2
        );
        Pokemon charmeleon = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/005.png",
                005,
                "Charmeleon",
                tipo2
        );
        Pokemon charizard = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/006.png",
                006,
                "Charizard",
                tipo3
        );
        Pokemon squirtle = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png",
                007,
                "Squirtle",
                tipo4
        );
        Pokemon wartortle = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/008.png",
                008,
                "Wartortle",
                tipo4
        );
        Pokemon blastoise = new Pokemon(
                "http://assets.pokemon.com/assets/cms2/img/pokedex/detail/009.png",
                009,
                "Blastoise",
                tipo4
        );
    
        List<Pokemon> listaPokemon = Arrays.asList(bulbasaur, bulbasaur, bulbasaur);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(new PokemonAdapter(listaPokemon));
    }
}