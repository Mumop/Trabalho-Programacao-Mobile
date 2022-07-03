package com.example.pokedex.domain;

import java.util.List;

public class Pokemon {
    private String imageUrl;
    private int ID;
    private String nome;
    private List<PokemonType> tipos;

    public Pokemon(String imageUrl, int ID, String nome, List<PokemonType> tipos) {
        this.imageUrl = imageUrl;
        this.ID = ID;
        this.nome = nome;
        this.tipos = tipos;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<PokemonType> getTipos() {
        return this.tipos;
    }

    public void setTipos(List<PokemonType> tipos) {
        this.tipos = tipos;
    }
}

