package com.example.bmnseats;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DebitCredit extends AppCompatActivity {

    private EditText Acname_Edittext,Cardno_Edittext;
    private Button Proceed_Button,Refresh_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debit_credit);

        Acname_Edittext=findViewById(R.id.acHolderName);
        Cardno_Edittext=findViewById(R.id.cardNo);
        Proceed_Button=findViewById(R.id.proceedButton);

        //init database
        FirebaseDatabase Database_Firebase = FirebaseDatabase.getInstance();
        final DatabaseReference Table_Payment = Database_Firebase.getReference("payment");

        Proceed_Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {



            }
        });



    }
}
