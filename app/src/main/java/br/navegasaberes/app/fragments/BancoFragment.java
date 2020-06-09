package br.navegasaberes.app.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationn.R;


public class BancoFragment extends Fragment {

    public BancoFragment() {
        // Required empty public constructor
    }

    public static BancoFragment newInstance(String param1, String param2) {
        BancoFragment fragment = new BancoFragment();
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
        //crinado um  alert dialog


        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setIcon(R.drawable.icone);
        builder.setTitle("Aceita os termos?");
        builder.setMessage(getString(R.string.termo_de_uso));
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"obrigado",Toast.LENGTH_SHORT).show();
            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_banco, container, false);

        final EditText editTextNome = view.findViewById(R.id.editTextNome);
        final EditText editTextEnd = view.findViewById(R.id.editTextEnd);
        final EditText editTextTelefone = view.findViewById(R.id.editTextTelefone);
        final EditText editTextEmail = view.findViewById(R.id.editTextEmail);
        final EditText editTextSugestao = view.findViewById(R.id.editTextSugestao);

        Button btnSend = view.findViewById(R.id.btnSendMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = editTextNome.getText().toString();
                String end =  editTextEnd.getText().toString();
                String telefone = editTextTelefone.getText().toString();
                String email = editTextEmail.getText().toString();
                String sugestao = editTextSugestao.getText().toString();

                String message = "Nome: "+nome + "\n Endereço: " + end +"\n Telefone: "+ telefone +"\n Email: "+email+"\n Ideia para pesquisa: "+ sugestao;

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","alexsusama@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "IDEIA PARA PESQUISA ");
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(emailIntent, "Send email..."));

            }
        });

        return view;

    }


}
