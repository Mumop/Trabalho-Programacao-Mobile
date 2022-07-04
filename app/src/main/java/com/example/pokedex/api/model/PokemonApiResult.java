package com.example.pokedex.api.model;

public class PokemonApiResult {
    int id;
    String name;
    PokemonTypeSlot types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonTypeSlot getTypes() {
        return types;
    }

    public void setTypes(PokemonTypeSlot types) {
        this.types = types;
    }

    public PokemonApiResult(int id, String name, PokemonTypeSlot types) {
        this.id = id;
        this.name = name;
        this.types = types;
    }
}
