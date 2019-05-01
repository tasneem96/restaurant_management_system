package com.example.bmnseats;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    private TextView Welcome_Textview;
    private Button Searchitem_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Welcome_Textview=(TextView)findViewById(R.id.welcomeId);
        Searchitem_Button=(Button)findViewById(R.id.searchItems);

        Typeface Type_Face=Typeface.createFromAsset(getAssets(),"fonts/hetilica.ttf");
        Welcome_Textview.setTypeface(Type_Face);

        Searchitem_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent_Searchitem=new Intent(HomePage.this,Home.class);
                startActivity(Intent_Searchitem);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater Inflater_Menu = getMenuInflater();
        Inflater_Menu.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.searchItems)
        {
            Intent Intent_Searchitem=new Intent(HomePage.this,Home.class);
            startActivity(Intent_Searchitem);
        }
        return super.onOptionsItemSelected(item);
    }
}
