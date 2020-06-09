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

public class RecyclerAdapterCuriosidades extends RecyclerView.Adapter<RecyclerAdapterCuriosidades.ViewHolder> {

    private Context ctx;
    private List<String> titulos;
    private List<String> textos;
    private List<Integer> imagens;
    public RecyclerAdapterCuriosidades(Context ctx, List<String> titulos, List<String> textos, List<Integer>imagens){
    this.ctx = ctx;
    this.titulos = titulos;
    this.textos = textos;
    this.imagens = imagens;

    }

    @NonNull
    @Override
    public RecyclerAdapterCuriosidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_row_curiosidades,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterCuriosidades.ViewHolder holder, int position) {
        String titulo = titulos.get(position);
        holder.titulo.setText(titulo);
        String texto = textos.get(position);
        holder.texto.setText(texto);

        int imghash = imagens.get(position);
        holder.imageView.setImageResource(imghash);
    }

    @Override
    public int getItemCount() {
        return titulos.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView texto;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            this.texto = itemView.findViewById(R.id.textoDicas);
            this.titulo = itemView.findViewById(R.id.tituloDicas);
            this.imageView = itemView.findViewById(R.id.imagemIlustrativa);
        }
    }
}
