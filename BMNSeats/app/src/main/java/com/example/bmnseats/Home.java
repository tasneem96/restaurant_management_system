package com.example.bmnseats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private ListView Search_Items;
    ArrayAdapter<String> adapter;
    private SearchView Searchview_Id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Search_Items= (ListView)findViewById(R.id.searchItems);

        Searchview_Id = (SearchView) findViewById(R.id.searchviewId);
        final String[] Item_Names= getResources().getStringArray(R.array.itemNames);

        adapter= new ArrayAdapter<String>(Home.this, R.layout.sample_layout1, R.id.Textview_Id, Item_Names ) ;

        Search_Items.setAdapter(adapter);

        Search_Items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = Item_Names[position];
                Toast.makeText(Home.this, value, Toast.LENGTH_SHORT).show();
                Intent Intent_One= new Intent(Home.this,FoodDetails.class);
                startActivity(Intent_One);
            }
        });

        Searchview_Id.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }

    }

