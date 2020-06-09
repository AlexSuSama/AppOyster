package br.navegasaberes.app.fragments;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationn.R;

import java.util.List;

public class RecyclerAdapterCuidados extends RecyclerView.Adapter<RecyclerAdapterCuidados.ViewHolder>{


    private Context ctx;
    private List<String> titulos;
    private List<String> textos;
    private List<Integer> imgs;
    private RecyclerAdapterCuidados.ItemClickListener mClickListener;

    public RecyclerAdapterCuidados(Context ctx, List<String> titulos, List<String> textos, List<Integer> imgs){
        this.ctx = ctx;
        this.titulos = titulos;
        this.textos = textos;
        this.imgs = imgs;

    }

    @NonNull
    @Override
    public RecyclerAdapterCuidados.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_row_cuidados,parent,false);

        return new RecyclerAdapterCuidados.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterCuidados.ViewHolder holder, int position) {
        String titulo = titulos.get(position);
        holder.titulo.setText(titulo);

        String texto = textos.get(position);
        holder.texto.setText(texto);

        int imgHash = imgs.get(position);
        holder.img.setImageResource(imgHash);

    }

    @Override
    public int getItemCount() {
        return titulos.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView titulo;
        TextView texto;
        ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);

            this.titulo = itemView.findViewById(R.id.tituloCuidados);
            this.texto = itemView.findViewById(R.id.textoCuidados);
            this.img = itemView.findViewById(R.id.imagemIlustrativaCuidados);

           // itemView.setOnClickListener(this);
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
    void setClickListener(RecyclerAdapterCuidados.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
