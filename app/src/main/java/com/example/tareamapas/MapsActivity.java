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
import com.example.tareamapas.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker markerPrueba; //Variable
    private ActivityMapsBinding binding;
    private Marker a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
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
        LatLng Cusco = new LatLng(-13.5170887,-71.9785356);
        mMap.addMarker(new MarkerOptions().position(Cusco).draggable(true).title("Marker in Cusco").snippet("Ciudad fundada en 1822"));
        mMap.setOnMarkerClickListener(this);
        LatLng Sacsayhuaman = new LatLng(-13.5089638,-71.9827453);
        mMap.addMarker(new MarkerOptions().position(Sacsayhuaman).draggable(true).title("Estas en Sacsayhuaman").snippet("Sacsayhuam??n es una fortaleza ceremonial inca, ubicada a dos kil??metros al norte de la ciudad de Cuzco. Se comenz?? a construir durante el gobierno del sapa inca Pachac??tec, en el siglo XV; sin embargo, fue Huayna C??pac quien la culmin?? en el siglo XVI").icon(BitmapDescriptorFactory.fromResource(R.drawable.sacsayhuaman)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Sacsayhuaman));
        /**Agregar un recurso o icono diferente al marcador*/
        LatLng Qoricancha = new LatLng(-13.5202208,-71.9751431);
        mMap.addMarker(new MarkerOptions().position(Qoricancha).draggable(true).title("Estas en Qoricancha").snippet("Fue el templo m??s importante durante el Imperio incaico, el cual fue posteriormente destruido casi por completo por los espa??oles durante el proceso de colonizaci??n. El yacimiento se encuentra en la ciudad de Cuzco en el Per??").icon(BitmapDescriptorFactory.fromResource(R.drawable.qoricancha)));
        LatLng Plaza = new LatLng(-13.5167684,-71.9788);
        mMap.addMarker(new MarkerOptions().position(Plaza).draggable(true).title("Estas en la plaza de armas").snippet("La plaza de Armas del Cuzco se encuentra en la ciudad de Cusco, Per??. Ubicada en pleno centro hist??rico de la ciudad es el principal espacio p??blico de la localidad desde antes de su fundaci??n espa??ola en 1534.").icon(BitmapDescriptorFactory.fromResource(R.drawable.plazacusco)));
        LatLng Tambomachay = new LatLng(-13.4787673,-71.9674258);
        mMap.addMarker(new MarkerOptions().position(Tambomachay).draggable(true).title("Estas En Tambomachay").snippet("Tambomachay en espa??ol, o Tampumachay, consiste en un sitio arqueol??gico que fuera destinado para el culto al agua y para que el potentado del Imperio incaico pudiese descansar. Se ubica en la cordillera de los Andes, a solo 7 kil??metros al NE de la ciudad peruana de Cusco. A una altura de 3 700 msnm.").icon(BitmapDescriptorFactory.fromResource(R.drawable.tambomachay)));
        LatLng Lares = new LatLng(-13.1099,-72.0536);
        mMap.addMarker(new MarkerOptions().position(Lares).draggable(true).title("Estas En Ba??os termales de Lares").snippet("Los Ba??os Termales de Lares, son uno de estos recursos termomedicinales que el viajero va a poder disfrutar cuando vaya a una regi??n como el Cusco. Estos ba??os termales, como su nombre indica, se encuentran en el distrito de Lares, que se localiza en la provincia de Calca.").icon(BitmapDescriptorFactory.fromResource(R.drawable.lares)));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        //Camara zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Cusco,10));
    }
    public boolean onMarkerClick(Marker marker) {
        String lat,lng;
        lat = Double.toString(marker.getPosition().latitude);
        lng = Double.toString(marker.getPosition().longitude);

        Toast.makeText(this, "Latitud : "+lat + "," +"Longitud: "+ lng,Toast.LENGTH_SHORT).show();
        return false;
    }
}