package br.navegasaberes.app.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.github.barteksc.pdfviewer.PDFView;
import com.example.myapplicationn.R;

public class PdfReader extends AppCompatActivity {
    TextView txt;
    PdfReader pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_reader);

        Bundle dados= getIntent().getExtras();

        if(dados != null){
            PDFView pdfView;
          switch (dados.getInt("pdf")){
              case 0:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("no_ritmo_da_mare.pdf").load();
                break;

              case 1:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("crescimento_da_ostra_do_mangue.pdf").load();
                  break;

              case 2:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("negocio_de_ostra.pdf").load();
                  break;

              case 3:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("Crescimento_de_ostra_nativa.pdf").load();
                  break;
              case 4:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("cultivo_de_ostras_em_alogoas.pdf").load();
                  break;

              case 5:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("residuo_da_malacocultura.pdf").load();
                  break;

              case 6:

                  pdfView = findViewById(R.id.pdfViewfull);
                  pdfView.fromAsset("Influencia_da_salinidade.pdf").load();
                  break;

          }

        }

    }

}
