package com.example.AuburnTour;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class sub2_Activity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;
    private Marker mMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2_activity);

     SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        //set zoom level to 15 so that we can see Auburn univ as a default setting
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(32.602654, -85.484795), 15));

        //Marker for Quad_Center
        LatLng Quad_Center = new LatLng(32.602654, -85.484795);
        map.moveCamera(CameraUpdateFactory.newLatLng(Quad_Center));
        setCamera(Quad_Center,15,"Quad Center",1);

        //Marker for Student Center
        LatLng Student_Center = new LatLng(32.602695, -85.486444);
        map.moveCamera(CameraUpdateFactory.newLatLng(Student_Center));
        setCamera(Student_Center,15,"Student Center",2);

        //Marker for Haley_Center
        LatLng Haley_Center = new LatLng(32.603658, -85.486396);

        map.moveCamera(CameraUpdateFactory.newLatLng(Haley_Center));
        setCamera(Haley_Center,15,"Haley Center",3);


        //Marker for Thach Concourse
        LatLng Thach_Concourse = new LatLng(32.604149, -85.490225);
        map.moveCamera(CameraUpdateFactory.newLatLng(Thach_Concourse));
        setCamera(Thach_Concourse,15,"Thach Concourse",4);

    }
    private void setCamera(LatLng latlng, float zoom, String building_name,int building_num){

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng,zoom));

        String info = "";

        //title session


        //info session
        String building1 = "Quad_Center";
        String building2 = "Student Center";
        String building3 = "Haley Center";
        String building4 = "Thach Concourse";

        switch(building_num) {
            case  1:   info = building1;

                break;
            case  2:    info = building2;

                break;
            case  3:    info = building3;

                break;
            case  4:    info = building4;

                break;
        }
        MarkerOptions options = new MarkerOptions()
                .position(latlng)
                .title(building_name)
                .snippet(info);
        mMarker = map.addMarker(options);

    }

}