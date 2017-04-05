package com.example.mpstr_000.bikeapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;



public class CruiserBikesHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cruiser_bikes_home);


/**
        // Get the Intent that started this activity and extract the string
        Intent showCruiserBikesHome = getIntent();
 */
    }


    public void openAddRemoveMenu(View view) {
        Intent showAddRemoveMenu = new Intent(this, AddRemoveMenuActivity.class);
        startActivity(showAddRemoveMenu);
    }
    public void openBikeLogs(View view) {
        Intent showBikeLogs = new Intent(this, CruiserBikeLogs.class);
        startActivity(showBikeLogs);
    }
}

