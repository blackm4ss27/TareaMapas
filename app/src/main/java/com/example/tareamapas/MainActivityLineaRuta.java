package com.example.tareamapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityLineaRuta extends AppCompatActivity {

    EditText et_ubicacion, et_destino;
    Button ruta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linea_ruta);

        et_ubicacion = findViewById(R.id.ubicacion);
        et_destino = findViewById(R.id.destino);
        ruta = findViewById(R.id.btIr);

        ruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSource= et_ubicacion.getText().toString().trim();
                String sDestination= et_destino.getText().toString().trim();

                if (sSource.equals("")&& sDestination.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Ingrese la ubicacion", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    DiplayTrack(sSource, sDestination);
                }
            }
        });
    }
    private void DiplayTrack(String sSource, String sDestination)
    {
        try {
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir/" + sSource + "/" + sDestination);

            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");

            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}