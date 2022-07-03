package com.example.pokedex.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokedex.R;
import com.example.pokedex.domain.Pokemon;
import com.example.pokedex.domain.PokemonType;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    private List<Pokemon> items;

    public PokemonAdapter(List<Pokemon> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pokemon_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pokemon item = items.get(position);
        holder.bindView(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bindView(Pokemon item) {
            ImageView imagemPokemon = itemView.findViewById(R.id.imagemPokemon);
            TextView numeroPokemon = itemView.findViewById(R.id.numeroPokemon);
            TextView nomePokemon = itemView.findViewById(R.id.nomePokemon);
            TextView primeiroTipo = itemView.findViewById(R.id.primeiroTipo);
            TextView segundoTipo = itemView.findViewById(R.id.segundoTipo);
            List<PokemonType> tiposPKMN = item.getTipos();

            numeroPokemon.setText("Nº " + item.getID());
            nomePokemon.setText(item.getNome());
            primeiroTipo.setText(tiposPKMN.get(0).getNome());
            if (tiposPKMN.size() > 1) {
                segundoTipo.setVisibility(View.VISIBLE);
                segundoTipo.setText(tiposPKMN.get(1).getNome());
            }else
                segundoTipo.setVisibility(View.GONE);
        }
    }
}
