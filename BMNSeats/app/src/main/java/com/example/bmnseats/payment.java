package com.example.bmnseats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class payment extends AppCompatActivity {

    private RadioGroup Radio_Group;
    private Button Confirm_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Radio_Group= findViewById(R.id.radioGroupId);
        Confirm_Button= findViewById(R.id.confirmButton);

        Confirm_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=Radio_Group.getCheckedRadioButtonId();

                if(v.getId()==R.id.confirmButton  )
                {
                    if(selectedId==R.id.debitCreditRadioButton)
                    {
                        Intent Intent_DebitCredit=new Intent(payment.this,DebitCredit.class);
                        startActivity(Intent_DebitCredit);
                    }
                    else if(selectedId==R.id.mobileBankingRadioButton)
                    {
                        Intent Intent_Mobilebanking=new Intent(payment.this,MobileBanking.class);
                        startActivity(Intent_Mobilebanking);
                    }
                }

            }
        });


    }
    }

