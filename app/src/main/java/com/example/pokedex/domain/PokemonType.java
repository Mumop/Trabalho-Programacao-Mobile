package com.example.pokedex.domain;

public class PokemonType {

    private String nome;

    public PokemonType(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
