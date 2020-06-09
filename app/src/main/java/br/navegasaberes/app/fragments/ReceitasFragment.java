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

public class ReceitasFragment extends Fragment {

    RecyclerAdapterReceitas adapter;

    public ReceitasFragment() {
        // Required empty public constructor
    }

    public static ReceitasFragment newInstance(String param1, String param2) {
        ReceitasFragment fragment = new ReceitasFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_receitas, container, false);

        ArrayList<String> titulos = new ArrayList<>();
        titulos.add(getContext().getString(R.string.receita_01_ostra_gratinada));
        titulos.add(getContext().getString(R.string.receita_02_ostra_com_molho_de_pimenta_e_laranja));
        titulos.add(getContext().getString(R.string.receita_03_ostra_com_vinagre_de_coco));
        titulos.add(getContext().getString(R.string.receita_04_salada_de_macarrao_com_ostra_defumada));
        titulos.add(getContext().getString(R.string.receita_05_ostra_a_moda_do_chefe));


        ArrayList<String> textos = new ArrayList<>();
        textos.add(getContext().getString(R.string.receita_01_ostra_gratinada_texto));
        textos.add(getContext().getString(R.string.receita_02_ostra_com_molho_de_pimenta_e_laranja_texto));
        textos.add(getContext().getString(R.string.receita_03_ostra_com_vinagre_de_coco_texto));
        textos.add(getContext().getString(R.string.receita_04_salada_de_macarrao_com_ostra_defumada_texto));
        textos.add(getContext().getString(R.string.receita_05_ostra_a_moda_do_chefe_texto));

        ArrayList<Integer> imagens = new ArrayList<>();
                imagens.add(R.drawable.ostra_gratinada_01);
                imagens.add(R.drawable.ostra_com_molho_de_pimenta);
                imagens.add(R.drawable.ostra_com_vinagre_de_coco);
                imagens.add(R.drawable.salada_de_macarrao_com_ostra_defumada);
        imagens.add(R.drawable.ostra_a_moda_do_chefe);

        // set up the RecyclerView
        RecyclerView recyclerView =view.findViewById(R.id.fasesOstras);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {
        });
        adapter = new RecyclerAdapterReceitas(getContext(), titulos,textos,imagens);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        return view;
    }

}
