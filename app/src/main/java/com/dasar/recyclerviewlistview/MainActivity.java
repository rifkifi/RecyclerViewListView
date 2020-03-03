package com.dasar.recyclerviewlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    // ArrayList for galaxy names
    ArrayList galaxyNames = new ArrayList<>(Arrays.asList("galaxy 1", "galaxy 2", "galaxy 3", "galaxy 4", "galaxy 5", "galaxy 6", "galaxy 7","galaxy 8", "galaxy 9", "galaxy 10", "galaxy 11", "galaxy 12", "galaxy 13", "galaxy 14"));
    ArrayList galaxyImages = new ArrayList<>(Arrays.asList(R.drawable.galaxy1, R.drawable.galaxy2, R.drawable.galaxy3, R.drawable.galaxy4, R.drawable.galaxy5, R.drawable.galaxy6, R.drawable.galaxy1,R.drawable.galaxy1, R.drawable.galaxy2, R.drawable.galaxy3, R.drawable.galaxy4, R.drawable.galaxy5, R.drawable.galaxy6, R.drawable.galaxy1));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        // call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, galaxyNames,galaxyImages);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}