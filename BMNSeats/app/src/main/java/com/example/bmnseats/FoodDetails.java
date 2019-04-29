package com.example.bmnseats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodDetails extends AppCompatActivity {
private Button Button_One;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetails);

        Button_One=(Button)findViewById(R.id.deliveryButton);
        Button_One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent_Two=new Intent(FoodDetails.this,Homedelivery.class);
                startActivity(Intent_Two);
            }
        });
    }
}
