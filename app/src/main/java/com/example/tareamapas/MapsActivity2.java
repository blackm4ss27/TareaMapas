package com.example.tareamapas;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.tareamapas.databinding.ActivityMaps2Binding;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;
    private Marker a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng Coloso = new LatLng(36.4450032,28.2320119);
        a=mMap.addMarker(new MarkerOptions().position(Coloso).draggable(true).title("Coloso de Rodas").snippet("El coloso de Rodas era una gran estatua del dios sol griego Helios, realizada por el escultor Cares de Lindos en la isla de Rodas en 280 a. C. y destruida por un terremoto en 226 a. C. Es considerada una de las Siete maravillas del mundo antiguo.").icon(BitmapDescriptorFactory.fromResource(R.drawable.coloso)));
        mMap.setOnMarkerClickListener(this);
        LatLng TemploArtemisa = new LatLng(37.9,27.3833);
        b=mMap.addMarker(new MarkerOptions().position(TemploArtemisa).draggable(true).title("Templo de Artemisa").snippet("El Templo de Artemisa o Artemision fue un templo ubicado en la ciudad de Éfeso, Turquía, dedicado a la diosa Artemisa, denominada Diana por los romanos. Su construcción fue comenzada por el rey Creso de Lidia y duró unos 120 años.").icon(BitmapDescriptorFactory.fromResource(R.drawable.artemisa)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Sacsayhuaman));
        /**Agregar un recurso o icono diferente al marcador*/
        LatLng FaroAlejandria = new LatLng(-13.5202208,-71.9751431);
        c=mMap.addMarker(new MarkerOptions().position(FaroAlejandria).draggable(true).title("Faro de Alejandría").snippet("El Faro de Alejandría fue una torre construida en el siglo III a. C. durante la dinastía ptolemaica, en el reinado de Ptolomeo II en la isla de Faro en Alejandría, Egipto, para servir como punto de referencia del puerto y como faro, con una altura estimada de al menos 100 metros.").icon(BitmapDescriptorFactory.fromResource(R.drawable.faroalejandria)));
        LatLng JardinesBabilonia = new LatLng(37.404276,-5.993542);
        d= mMap.addMarker(new MarkerOptions().position(JardinesBabilonia).draggable(true).title("Jardines Colgantes de Babilonia").snippet("Los Jardines Colgantes de Babilonia una de las siete maravillas del mundo antiguo, fueron construidos en el siglo VI a. C durante el reinado de Nabucodonosor II en la antigua ciudad de Babilonia, a orillas del río Éufrates. ").icon(BitmapDescriptorFactory.fromResource(R.drawable.jardinesbabilonia)));
        LatLng Zeus = new LatLng(34.757914,33.028619);
        e=mMap.addMarker(new MarkerOptions().position(Zeus).draggable(true).title("Estatua de Zeus en Olimpia").snippet("La Estatua de Zeus en Olimpia fue una escultura crisoelefantina creada por el escultor Fidias. Situada en Olimpia, se considera una de las Siete Maravillas del Mundo Antiguo. Fue destruida y se perdió en el siglo V d.").icon(BitmapDescriptorFactory.fromResource(R.drawable.zeus)));
        LatLng mausoleo = new LatLng(-13.4787673,-71.9674258);
        f=mMap.addMarker(new MarkerOptions().position(mausoleo).draggable(true).title("Mausoleo de Halicarnaso").snippet("El Mausoleo de Halicarnaso o el Sepulcro de Mausolo fue un monumento funerario suntuoso construido entre el año 353 a. C. y el 350 a. C.\u200B en Halicarnaso para Mausolo, un sátrapa del Imperio persa.").icon(BitmapDescriptorFactory.fromResource(R.drawable.mausoleo)));
        LatLng PiramideGuiza = new LatLng(29.9792345,31.1342019);
        g=mMap.addMarker(new MarkerOptions().position(PiramideGuiza).draggable(true).title("Gran Pirámide de Guiza").snippet("La Gran Pirámide de Guiza es, además de la mayor de las pirámides de Egipto, la más antigua de las siete maravillas del mundo antiguo y la única que todavía perdura. Fue ordenada a construir por el faraón Keops de la cuarta dinastía del Antiguo Egipto.").icon(BitmapDescriptorFactory.fromResource(R.drawable.piramideguiza)));
        //Camara zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Coloso,1));
        mMap.getUiSettings().setZoomControlsEnabled(true);
    }
    public boolean onMarkerClick(Marker marker) {
        String lat,lng;
        lat = Double.toString(marker.getPosition().latitude);
        lng = Double.toString(marker.getPosition().longitude);

        Toast.makeText(this, "Latitud : "+lat + "," +"Longitud: "+ lng,Toast.LENGTH_SHORT).show();
        return false;
    }


}