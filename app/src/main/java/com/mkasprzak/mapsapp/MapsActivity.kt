package com.mkasprzak.mapsapp

import android.location.LocationRequest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.mkasprzak.mapsapp.databinding.ActivityMapsBinding
import com.google.android.gms.maps.SupportMapFragment

class MapsActivity : AppCompatActivity(), OnMapReadyCallback,
    GoogleMap.OnMapLoadedCallback,
    GoogleMap.OnMarkerClickListener,
    GoogleMap.OnMapLongClickListener {

    private val MY_PERMISSION_REQUEST_FINE_LOCATION = 101
    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var mLocationsRequest: LocationRequest
    private lateinit var locationCallback: LocationCallback
    var gpsMarker: Marker? = null
    private lateinit var mMap: GoogleMap

    @Override
    override fun onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // Create an instance of FusedLocationProviderClient
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
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

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.getUiSettings().setMapToolbarEnabled(false)
        mMap.setOnMapLoadedCallback(this)
        mMap.setOnMapLoadedCallback(this)
        mMap.setOnMarkerClickListener(this)
    }

    override fun onMapLoaded() {
        TODO("Not yet implemented")
    }

    override fun onMarkerClick(p0: Marker): Boolean {
        TODO("Not yet implemented")
    }

    override fun onMapLongClick(p0: LatLng) {
        TODO("Not yet implemented")
    }


}