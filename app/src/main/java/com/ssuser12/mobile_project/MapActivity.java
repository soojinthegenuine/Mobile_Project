package com.ssuser12.mobile_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_map);
      setTitle("원데이클래스 세부 주소 확인");;
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }


        @Override
        public void onMapReady(final GoogleMap googleMap) {
            mMap = googleMap;

            LatLng SEOUL = new LatLng(37.56, 126.97);

            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(SEOUL);
            markerOptions.title("서울");
            markerOptions.snippet("스무디 원데이 클래스");
            mMap.addMarker(markerOptions);

            mMap.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        }

    }