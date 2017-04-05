package com.example.mpstr_000.bikeapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class HomeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
    }

    public void CruiserBikesButtonClick(View view) {
        Intent showCruiserBikesHome = new Intent(this, CruiserBikesHome.class);
        startActivity(showCruiserBikesHome);
    }

}
