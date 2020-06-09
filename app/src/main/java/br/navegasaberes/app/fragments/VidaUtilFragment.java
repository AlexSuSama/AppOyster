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


public class VidaUtilFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // RecyclerAdapterVidaUtil adapter;
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vida_util, container, false);




/*
        List<String> titulos = new ArrayList<>();
        titulos.add("titulo 01");

        List<String> textos = new ArrayList<>();
        textos.add("texto 01");

        List<Integer> imgs = new ArrayList<>();
        imgs.add(R.drawable.ostra);


        // set up the RecyclerView
        RecyclerView recyclerView =view.findViewById(R.id.recycler_vidaUtil);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {
        });
        adapter = new RecyclerAdapterVidaUtil(getContext(), titulos, textos, imgs);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
*/
        return view;
    }

}
