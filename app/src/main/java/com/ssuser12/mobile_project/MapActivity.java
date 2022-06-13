package com.ssuser12.mobile_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {
   GoogleMap gMap;
   MapFragment mapFrag;

  @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_map);
      setTitle("원데이클래스 세부 주소 확인");;
      mapFrag.getMapAsync(this);
  }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap=googleMap;
        gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(37.568256,126.897240),15));

    }
}
