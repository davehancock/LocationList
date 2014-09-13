package com.djh.android.locationlist.map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.djh.android.locationlist.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Activity to encapsulate Mapping behaviour.
 */
public class LocationListMapActivity extends Activity {

    private static final LatLng HOME = new LatLng(50.7387,-1.8846);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);
        GoogleMap map = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapFrag)).getMap();
        map.addMarker(new MarkerOptions().position(HOME).title("Hamburg"));

        // Move the camera instantly to hamburg with a zoom of 15.
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(HOME, 20));

        // Zoom in, animating the camera.
        map.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.map, menu);
        return true;
    }

}
