package com.example.bmnseats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DebitCredit extends AppCompatActivity {

    private EditText Code_EditText;
    private Button Proceed_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debit_credit);

        Code_EditText=findViewById(R.id.verificationCode);
        Proceed_Button=findViewById(R.id.proceedButton);
    }
}
