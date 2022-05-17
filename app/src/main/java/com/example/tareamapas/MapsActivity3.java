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
import com.example.tareamapas.databinding.ActivityMaps3Binding;

public class MapsActivity3 extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    private GoogleMap mMap;
    private ActivityMaps3Binding binding;
    private Marker a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps3Binding.inflate(getLayoutInflater());
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

        LatLng ciudadPetra = new LatLng(30.3497724,35.3764846);
        a=mMap.addMarker(new MarkerOptions().position(ciudadPetra).title("Ciudad de Petra").snippet("Petra es una ciudad arqueológica famosa en el desierto, al sudoeste de Jordania. Fundada alrededor del 300 a. C., era la capital del Reino Nabateo. Se puede acceder a través de un estrecho cañón llamado Al Siq y contiene tumbas y templos tallados en acantilados de arenisca de color rosa, motivo por el que se la conoce como la \"Ciudad Rosa\". Su estructura más famosa probablemente sea el Al Khazneh de 45 metros de altura, un templo con una fachada y decoración al estilo griego, que se conoce como El Tesoro.").icon(BitmapDescriptorFactory.fromResource(R.drawable.petraa)));
        mMap.setOnMarkerClickListener(this);
        LatLng tajMahal = new LatLng(27.1750123,78.0420968);
        b=mMap.addMarker(new MarkerOptions().position(tajMahal).title("Taj Mahal").snippet("El Taj Mahal \u200B\u200B es un monumento funerario construido entre 1631 y 1654 en la ciudad de Agra, estado de Uttar Pradesh, a orillas del río Yamuna, por el emperador musulmán Shah Jahan de la dinastía mogol.").icon(BitmapDescriptorFactory.fromResource(R.drawable.tajmahal)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Sacsayhuaman));
        /**Agregar un recurso o icono diferente al marcador*/
        LatLng Machupicchu = new LatLng(-13.164422,-72.5450851);
        c=mMap.addMarker(new MarkerOptions().position(Machupicchu).draggable(true).title("Machu Picchu ").snippet("Machu Picchu es una ciudadela inca ubicada en las alturas de las montañas de los Andes en Perú, sobre el valle del río Urubamba. Se construyó en el siglo XV y luego fue abandonada, y es famosa por sus sofisticadas paredes de piedra seca que combinan enormes bloques sin el uso de un mortero, los edificios fascinantes que se relacionan con las alineaciones astronómicas y sus vistas panorámicas. El uso exacto que tuvo sigue siendo un misterio.").icon(BitmapDescriptorFactory.fromResource(R.drawable.machupicchu)));
        LatLng Chichen = new LatLng(23,-102);
        d= mMap.addMarker(new MarkerOptions().position(Chichen).draggable(true).title("Chichén Itzá").snippet("Chichén Itzá es un complejo de ruinas mayas famoso a nivel mundial en la península de Yucatán de México. Una enorme pirámide escalonada, conocida como El Castillo, domina los 6.5 km cuadrados de la ciudad antigua, que prosperó desde aproximadamente el año 600 d.C. hasta el siglo XIII. Los tallados gráficos en piedra sobreviven en estructuras como el campo de pelota, el Templo de los Guerreros y el Muro de las Calaveras. En las noches, espectáculos de luces y sonidos iluminan la sofisticada geometría de las construcciones. ").icon(BitmapDescriptorFactory.fromResource(R.drawable.chinchen)));
        LatLng coliseo = new LatLng(41.8899551,12.4942704);
        e=mMap.addMarker(new MarkerOptions().position(coliseo).draggable(true).title("Coliseo de Roma").snippet("El Coliseo o Anfiteatro Flavio \u200B es un anfiteatro de la época del Imperio romano, construido en el siglo I. Está ubicado en el este del Foro Romano, y fue el más grande de los que se construyeron en el Imperio romano.").icon(BitmapDescriptorFactory.fromResource(R.drawable.coliseo)));
        LatLng muralla = new LatLng(40.4319077,116.5703749);
        f=mMap.addMarker(new MarkerOptions().position(muralla).draggable(true).title("La gran Muralla China").snippet("La Gran Muralla China es una de las siete maravillas del mundo moderno y como tal merece especial mención. Este monumento está formado por una serie de fortificaciones hechas de piedra, ladrillo, tierra apisonada, madera y otros materiales. Generalmente construidos a lo largo de una línea de este a oeste a través de las fronteras históricas del norte de China para proteger a los estados e imperios chinos contra las incursiones e invasiones de los diversos grupos nómadas de la estepa euroasiática. Te contamos más datos sobre La Gran Muralla China que seguro no conocías.").icon(BitmapDescriptorFactory.fromResource(R.drawable.murallachina)));
        LatLng cristoRedentor = new LatLng(-22.9519173,-43.210495);
        g=mMap.addMarker(new MarkerOptions().position(cristoRedentor).draggable(true).title("Cristo Redentor").snippet("El Cristo Redentor o Cristo del Corcovado es una estatua art déco de Jesús de Nazaret con los brazos abiertos mostrando a la ciudad de Río de Janeiro, Brasil. La estatua tiene una altura de 38 metros sobre un pedestal de 8 metros.\u200B\u200B").icon(BitmapDescriptorFactory.fromResource(R.drawable.cristoredentor)));
        //Camara zoom
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cristoRedentor,1));
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