package com.example.bmnseats;

<<<<<<< .merge_file_a10100
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
=======
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
>>>>>>> .merge_file_a07372

public class FindNearestPoint extends AppCompatActivity {

    private EditText See_Direction;
    private Button Seedirection_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_nearest_point);

        Seedirection_Button=findViewById(R.id.seeDirectionButton);
        //See_Direction=findViewById(R.id.seeDirection);

        Seedirection_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FindNearestPoint.this,SeeDirection.class);
                //String string=See_Direction.getText().toString();
               // intent.putExtra("tag",string);
                startActivity(intent);

            }
        });
    }
}
