package br.navegasaberes.app.fragments;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplicationn.R;

import java.util.List;

public class RecyclerAdapterArtigos extends RecyclerView.Adapter<RecyclerAdapterArtigos.ViewHolder> {

    private Context ctx;
    private List<String> titulos;
    private List<String> textos;

    private ItemClickListener mClickListener;

    public RecyclerAdapterArtigos(Context ctx, List<String> titulos, List<String> textos){
    this.ctx = ctx;
    this.titulos = titulos;
    this.textos = textos;
    }

    @NonNull
    @Override
    public RecyclerAdapterArtigos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_row_artigos,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterArtigos.ViewHolder holder, int position) {
        String titulo = titulos.get(position);
        holder.titulo.setText(titulo);

    }

    @Override
    public int getItemCount() {
        return titulos.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView titulo;
        TextView texto;
        public ViewHolder(View itemView) {
            super(itemView);

            this.titulo = itemView.findViewById(R.id.tituloArtigos);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());


                    Intent intent = new Intent(ctx, PdfReader.class);
                    intent.putExtra("pdf", getAdapterPosition());

                    ctx.startActivity(intent);



        }
    }
    // convenience method for getting data at click position
    String getItem(int id) {
        return titulos.get(id);
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
