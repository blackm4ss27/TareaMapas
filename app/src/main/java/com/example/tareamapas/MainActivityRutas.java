package com.example.tareamapas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityRutas extends AppCompatActivity {
    EditText et1,et2;
    Button btnIr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_rutas);
        et1 = findViewById(R.id.ubicacion);
        et2 = findViewById(R.id.destino);
        btnIr = findViewById(R.id.btIr);

        btnIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sSource = et1.getText().toString().trim();
                String sDestino = et2.getText().toString().trim();

                if(sSource.equals("")&& sDestino.equals("") ){
                    Toast.makeText(getApplicationContext(),"Ingrese la Ubicacion", Toast.LENGTH_SHORT).show();
                }else{
                    DiplayTrack(sSource,sDestino);
                }
            }
        });
    }
    private void DiplayTrack(String source, String destino){
        try{
            Uri uri = Uri.parse("https://www.google.co.in/maps/dir"+ source + " / "+destino);

            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setPackage("com.google.android.apps.maps");
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
        }catch (ActivityNotFoundException e){
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?=com.google.android.apps.maps");
            Intent intent = new Intent(Intent.ACTION_VIEW,uri);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }
}