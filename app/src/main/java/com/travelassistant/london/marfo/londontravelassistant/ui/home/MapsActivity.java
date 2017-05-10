package com.travelassistant.london.marfo.londontravelassistant.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.travelassistant.london.marfo.londontravelassistant.LondonTravelAssistantApplication;
import com.travelassistant.london.marfo.londontravelassistant.R;
import com.travelassistant.london.marfo.londontravelassistant.rpc.TFLRequestManager;
import com.travelassistant.london.marfo.londontravelassistant.rpc.responses.Station;

import java.util.List;

import javax.inject.Inject;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,  RequestStationsListener{

    @Inject
    TFLRequestManager tflRequestManager;

    private GoogleMap mMap;

    private LatLng londonLatLng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ((LondonTravelAssistantApplication)getApplication()).getNetComponent().inject(this);

        doStuffsInBackground();
    }

    private void doStuffsInBackground() {
        tflRequestManager.getStatusLondonBuses("139", "inbound", this);
        tflRequestManager.getBusArrivalTimes("139", "490G00006979", this);
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
    }

    @Override
    public void onRequestStationSucceded(@NonNull List<Station> stations) {
        for (Station station : stations) {
            LatLng stationPosition = new LatLng(station.getLat(), station.getLon());
            mMap.addMarker(new MarkerOptions().position(stationPosition).title(station.getName()));
        }
        Station firstStation = stations.get(0);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(firstStation.getLat(), firstStation.getLon())));
    }

    @Override
    public void onRequestStationFailed() {
        // do nothing for now
    }

    @Override
    public void onArrivalTimesReceived() {

    }
}
