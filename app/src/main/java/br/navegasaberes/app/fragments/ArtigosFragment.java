package br.navegasaberes.app.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

import com.example.myapplicationn.R;

import java.util.ArrayList;

public class ArtigosFragment extends Fragment {
    RecyclerAdapterArtigos adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_artigos, container, false);

        ArrayList<String> titulos = new ArrayList<>();
        titulos.add(getString(R.string.sampaio));
        titulos.add(getString(R.string.ostra_do_mangue));
        titulos.add(getString(R.string.negocio_sebrae));
        titulos.add(getString(R.string.ostra_nativa));
        titulos.add(getString(R.string.ostra_de_alagoas));
        titulos.add(getString(R.string.residuo_solido));
        titulos.add(getString(R.string.influensia_da_salinidade));


        ArrayList<String> textos = new ArrayList<>();
        textos.add("texto dicas texto dicas texto dicas dicas texto dicas  dicas texto dicas  dicas texto dicas  dicas texto dicas  ");
        textos.add("texto dicas texto dicas texto dicas dicas texto dicas  dicas texto dicas  dicas texto dicas  dicas texto dicas  ");
        textos.add("texto dicas texto dicas texto dicas dicas texto dicas  dicas texto dicas  dicas texto dicas  dicas texto dicas  ");
        textos.add("texto dicas texto dicas texto dicas dicas texto dicas  dicas texto dicas  dicas texto dicas  dicas texto dicas  ");
        textos.add("texto dicas texto dicas texto dicas dicas texto dicas  dicas texto dicas  dicas texto dicas  dicas texto dicas  ");



        //funciona tranquilamente.
       /*
        pdfView = view.findViewById(R.id.pdfView);
        pdfView.fromAsset("Sistema Integrado de Gestão de Atividades Acadêmicas.pdf").load();
    */


        // set up the RecyclerView
        RecyclerView recyclerView =view.findViewById(R.id.recycler_artigos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {
        });
        adapter = new RecyclerAdapterArtigos(getContext(), titulos,textos);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        return view;
    }


}
