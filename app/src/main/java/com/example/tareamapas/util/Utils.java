package com.example.tareamapas.util;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Utils {
    public static Coordenadas coordenadas = new Coordenadas();
    public static List<List<HashMap<String, String>>> routes = new ArrayList<List<HashMap<String, String>>>();
    public static void markersDefault(GoogleMap nMap, Context context){
        new Marcadores(nMap,context).addMarkerDefault();
    }
}
