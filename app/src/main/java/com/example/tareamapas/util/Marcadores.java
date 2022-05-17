package com.example.tareamapas.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import com.example.tareamapas.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Marcadores {
    GoogleMap mMap;
    Context context;

    public Marcadores(GoogleMap mMap, Context context) {
        this.mMap = mMap;
        this.context = context;
    }
    public void addMarkerDefault(){
        Uno(-13.5170887,-71.9785356,"Cusco");
        Dos(-13.5089638,-71.9827453,"Sacsayhuaman");
        Tres(-13.5202208,-71.9751431,"Qoricancha");
        Cuatro(-13.5167684,-71.9788,"Plaza de Armas");
    }
    public void Uno(Double latitud, Double longitud, String Titulo){
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno =(BitmapDrawable) context.getResources().getDrawable(R.drawable.ruta);
        Bitmap unos = uno.getBitmap();
        Bitmap uns= Bitmap.createScaledBitmap(unos,width,height,false);
        mMap.addMarker(new MarkerOptions().position(punto).title("Estas en Sacsayhuaman").snippet("Sacsayhuamán es una fortaleza ceremonial inca, ubicada a dos kilómetros al norte de la ciudad de Cuzco. Se comenzó a construir durante el gobierno del sapa inca Pachacútec, en el siglo XV; sin embargo, fue Huayna Cápac quien la culminó en el siglo XVI").icon(BitmapDescriptorFactory.fromResource(R.drawable.sacsayhuaman)));
    }
    public void Dos(Double latitud, Double longitud, String Titulo){
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno =(BitmapDrawable) context.getResources().getDrawable(R.drawable.ruta);
        Bitmap unos = uno.getBitmap();
        Bitmap uns= Bitmap.createScaledBitmap(unos,width,height,false);
        mMap.addMarker(new MarkerOptions().position(punto).title(Titulo).snippet("Uno").icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void Tres(Double latitud, Double longitud, String Titulo){
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno =(BitmapDrawable) context.getResources().getDrawable(R.drawable.ruta);
        Bitmap unos = uno.getBitmap();
        Bitmap uns= Bitmap.createScaledBitmap(unos,width,height,false);
        mMap.addMarker(new MarkerOptions().position(punto).title(Titulo).snippet("Uno").icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void Cuatro(Double latitud, Double longitud, String Titulo){
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno =(BitmapDrawable) context.getResources().getDrawable(R.drawable.ruta);
        Bitmap unos = uno.getBitmap();
        Bitmap uns= Bitmap.createScaledBitmap(unos,width,height,false);
        mMap.addMarker(new MarkerOptions().position(punto).title(Titulo).snippet("Uno").icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
}
