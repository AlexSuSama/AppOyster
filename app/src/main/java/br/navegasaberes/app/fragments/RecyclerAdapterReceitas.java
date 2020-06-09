package br.navegasaberes.app.fragments;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationn.R;

import java.util.List;

public class RecyclerAdapterReceitas extends RecyclerView.Adapter<RecyclerAdapterReceitas.ViewHolder> {
    Context ctx;
    List<String> listaTitulos;
    List<String> listaTextos;
    List<Integer> listImagens;
    private ItemClickListener mClickListener;

    public RecyclerAdapterReceitas(Context context, List<String> listaTitulos, List<String> listaTexto, List<Integer> imgs){
    this.ctx = context;
    this.listaTitulos = listaTitulos;
    this.listaTextos = listaTexto;
    this.listImagens = imgs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(ctx);
        View view = layoutInflater.inflate(R.layout.recycler_row_receitas,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String titulo = listaTitulos.get(position);
        holder.titulo.setText(titulo);

        String texto = listaTextos.get(position);
        holder.texto.setText(texto);

        int imghash = listImagens.get(position);
        holder.imageView.setImageResource(imghash);
    }

    @Override
    public int getItemCount() {
        return listaTitulos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView titulo;
        TextView texto;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            texto = itemView.findViewById(R.id.texto);
            imageView = itemView.findViewById(R.id.imagensReceitas);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }
    // convenience method for getting data at click position
    String getItem(int id) {
        return listaTitulos.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
