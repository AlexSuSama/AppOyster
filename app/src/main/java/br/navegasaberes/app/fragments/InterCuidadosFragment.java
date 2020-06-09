package br.navegasaberes.app.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplicationn.R;

import br.navega.app.ostra.activity.MainActivity;


public class InterCuidadosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_inter_cuidados, container, false);

        Button btnPerigo = view.findViewById(R.id.btnPerigos);
        Button btnVidaUtil = view.findViewById(R.id.btnVidaUtil);

        btnVidaUtil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create new fragment and transaction
                VidaUtilFragment frag = new VidaUtilFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack if needed
                transaction.replace(R.id.container4, frag);
                transaction.addToBackStack(null);

// Commit the transaction
                transaction.commit();

            }
        });
        btnPerigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Create new fragment and transaction
               CuidadosFragment frag = new CuidadosFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack if needed
                transaction.replace(R.id.container4, frag);
                transaction.addToBackStack(null);

// Commit the transaction
                transaction.commit();

            }
        });

        return view;
    }


}
