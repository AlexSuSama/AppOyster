package br.navegasaberes.app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplicationn.R;

import java.util.ArrayList;
import java.util.List;

public class CuidadosFragment extends Fragment {
    RecyclerAdapterCuidados adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_cuidados, container, false);

      List<String> titulos = new ArrayList<>();
      titulos.add("Cultivo de ostras");
      titulos.add(getContext().getString(R.string.cuidado_titulo_01));
        titulos.add(getContext().getString(R.string.cuidado_titulo_02));
        titulos.add(getContext().getString(R.string.cuidado_titulo_03));

        List<String> textos = new ArrayList<>();
        textos.add(getContext().getString(R.string.cuidado_texto00));
        textos.add(getContext().getString(R.string.cuidado_texto01));
        textos.add(getContext().getString(R.string.cuidado_texto02));
        textos.add(getContext().getString(R.string.cuidado_texto03));

        List<Integer> imgs = new ArrayList<>();
      imgs.add(R.drawable.cultivo_de_ostra);
        imgs.add(R.drawable.riscos_fisicos);
        imgs.add(R.drawable.riscos_quimicos);
        imgs.add(R.drawable.riscos_biologicos);


        // set up the RecyclerView
        RecyclerView recyclerView =view.findViewById(R.id.recycler_cuidados);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {
        });
        adapter = new RecyclerAdapterCuidados(getContext(), titulos, textos, imgs);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        return view;
    }

    //
}
