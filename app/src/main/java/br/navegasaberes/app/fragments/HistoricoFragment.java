package br.navegasaberes.app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplicationn.R;

public class HistoricoFragment extends Fragment {


    public HistoricoFragment() {
        // Required empty public constructor
    }

    public static HistoricoFragment newInstance(String param1, String param2) {
        HistoricoFragment fragment = new HistoricoFragment();
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


       View view = inflater.inflate(R.layout.fragment_historico, container, false);







                //abri um arquivo pdf do sdcard

              /*  String filename = "aqui";
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +"/"+ filename);
                Intent target = new Intent(Intent.ACTION_VIEW);
                target.setDataAndType(Uri.fromFile(file),"application/pdf");
                target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                Intent intent = Intent.createChooser(target, "Open File");
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // Instruct the user to install a PDF reader here, or something
                }*/


                //criando um diretorio

               /* File dir = new File("/storage/emulated/0/pasta");
                try{
                    if(dir.mkdir()) {
                        System.out.println("diretorio criado");
                    } else {
                        System.out.println("diretorio não criado");
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }*/


                ////segunda tentativa
              //  new File(Environment.getExternalStorageDirectory(), "novaPasta").mkdir();




        // Inflate the layout for this fragment\
        return view;
    }

}
