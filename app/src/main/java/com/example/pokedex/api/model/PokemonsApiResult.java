package com.example.pokedex.api.model;

import com.example.pokedex.domain.PokemonType;
import com.example.pokedex.view.PokemonAdapter;

import java.util.List;

public class PokemonsApiResult {
    List<PokemonResult> Resultado;
    int contador;
    String anterior;
    String próximo;
}
class PokemonResult{
    String name;
    String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PokemonResult(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
public class PokemonApiResult{
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
class PokemonTypeSlot{
    int slot;
    PokemonType type;

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public PokemonTypeSlot(int slot, PokemonType type) {
        this.slot = slot;
        this.type = type;
    }
}
