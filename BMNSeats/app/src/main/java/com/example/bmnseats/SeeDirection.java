package com.example.bmnseats;

<<<<<<< .merge_file_a14892
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
=======
import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
>>>>>>> .merge_file_a07784

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
<<<<<<< .merge_file_a14892
=======
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
>>>>>>> .merge_file_a07784
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SeeDirection extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
<<<<<<< .merge_file_a14892

=======
    //Bundle bundle=getIntent().getExtras();
    //String str=bundle.getString("tag");
>>>>>>> .merge_file_a07784
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_direction);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
<<<<<<< .merge_file_a14892
=======


>>>>>>> .merge_file_a07784
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

        // Add a marker in Sydney and move the camera
<<<<<<< .merge_file_a14892
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
=======
        //EditText Location_Edittext;
        //Location_Edittext=findViewById(R.id.seeDirection);

       // if ((str.contains("Mirpur")))
       // {
            LatLng Savar = new LatLng(23.850309, 90.261009);
            mMap.addMarker(new MarkerOptions()
                    .position(Savar)
                    .title("Savar")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Savar,12));

            LatLng Islamnagar=new LatLng(23.887721, 90.262921);
            mMap.addMarker(new MarkerOptions()
                .position(Islamnagar)
                .title("Islamnagar")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green)));
             mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Islamnagar,12));

             LatLng Gerua=new LatLng(23.878275, 90.258877);
             mMap.addMarker(new MarkerOptions()
                     .position(Gerua)
                     .title("Gerua")
                     .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green)));
             mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Gerua,12));

        LatLng Bishmile=new LatLng(23.896265, 90.270898);
        mMap.addMarker(new MarkerOptions()
                .position(Bishmile)
                .title("Bishmile")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Bishmile,12));
       // }
       /* else
        {
            Toast.makeText(this, "Outlet Not Found", Toast.LENGTH_SHORT).show();
        }*/

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},0);
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        else {

            mMap.setMyLocationEnabled(true);
            mMap.getUiSettings().setMyLocationButtonEnabled(true);
        }

>>>>>>> .merge_file_a07784
    }
}
