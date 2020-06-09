package br.navegasaberes.app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationn.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;


public class CuriosidadesFragment extends Fragment {
    RecyclerAdapterCuriosidades adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_curiosidades, container, false);


        // adicionando as info de titulo e conteudo
        ArrayList<String> titulos = new ArrayList<>();
        titulos.add(getContext().getString(R.string.titulo01));
        titulos.add(getContext().getString(R.string.titulo02));
        titulos.add(getContext().getString(R.string.titulo03));
        titulos.add(getContext().getString(R.string.titulo04));
        titulos.add(getContext().getString(R.string.titulo05));
        titulos.add(getContext().getString(R.string.titulo06));



        ArrayList<String> textos = new ArrayList<>();
        textos.add(getContext().getString(R.string.texto01));
        textos.add(getContext().getString(R.string.texto02));
        textos.add(getContext().getString(R.string.texto03));
        textos.add(getContext().getString(R.string.texto04));
        textos.add(getContext().getString(R.string.texto05));
        textos.add(getContext().getString(R.string.texto06));

        //list das imagens
        ArrayList<Integer> imagens = new ArrayList<>();
        imagens.add(R.drawable.ostra);
        imagens.add(R.drawable.quantos_anos_vive_uma_ostra);
        imagens.add(R.drawable.reproducao_ostra);
        imagens.add(R.drawable.maior_ostra_do_mundo);
        imagens.add(R.drawable.como_as_ostras_produzem_perolas);
        imagens.add(R.drawable.maior_perola_do_mundo);


        // set up the RecyclerView
        RecyclerView recyclerView =view.findViewById(R.id.recycler_dicas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {
        });
        adapter = new RecyclerAdapterCuriosidades(getContext(), titulos,textos,imagens);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        return view;
    }


}
