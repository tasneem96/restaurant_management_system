package com.example.bmnseats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Homedelivery extends AppCompatActivity {

    public TextView TextView_One;
    public TextView TextView_Two;
    public TextView TextView_Three;

    public EditText EditText_One;
    public EditText EditText_Two;

    public Button Button_One;
    public Button Button_Two;

    public String Edit_Rcv_One;
    public String Edit_Rcv_Two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homedelivery);

        TextView_One=findViewById(R.id.textView1);
        TextView_One.setSelected(true);
        TextView_Two=findViewById(R.id.textView2);
        TextView_Three=findViewById(R.id.textView3);

        EditText_One=findViewById(R.id.editText1);
        EditText_Two=findViewById(R.id.editText2);

        Button_One=findViewById(R.id.button1);
        Button_Two=findViewById(R.id.button2);

        Button_Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Edit_Rcv_One =EditText_One.getText().toString();
                if(Edit_Rcv_One.equalsIgnoreCase("Mirpur") || Edit_Rcv_One.contains("Mirpur") || Edit_Rcv_One.contains("mirpur"))
                {
                    Toast.makeText(Homedelivery.this,"50 Taka will be your Delivery charge",Toast.LENGTH_LONG).show();
                }
                else if(Edit_Rcv_One.equalsIgnoreCase("Dhanmondi ") || Edit_Rcv_One.contains("Dhanmondi") || Edit_Rcv_One.contains("dhanmondi"))
                {
                    Toast.makeText(Homedelivery.this,"70 Taka will be your Delivery charge",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Homedelivery.this,"Route Not found Please try again",Toast.LENGTH_SHORT).show();

                }
            }


        });

        EditText_One.addTextChangedListener(delivery_watcher);
        EditText_Two.addTextChangedListener(delivery_watcher);


    }

    private TextWatcher delivery_watcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Edit_Rcv_One=EditText_One.getText().toString().trim();
            Edit_Rcv_Two=EditText_Two.getText().toString().trim();

            Button_One.setEnabled(!Edit_Rcv_Two.isEmpty() && !Edit_Rcv_Two.isEmpty() && Edit_Rcv_Two.equalsIgnoreCase("Dhaka"));
            Button_One.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent Intent_Payment=new Intent(Homedelivery.this,payment.class);
                    startActivity(Intent_Payment);
                }
            });
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
