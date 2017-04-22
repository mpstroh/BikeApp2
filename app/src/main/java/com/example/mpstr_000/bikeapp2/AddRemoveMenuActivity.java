package com.example.mpstr_000.bikeapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class AddRemoveMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_remove_menu);

        //Intent showAddRemoveMenu = getIntent();
    }

    public void openAddCruiser(View view) {
        Intent showAddCruiser = new Intent(this, addCruiser.class);
        startActivity(showAddCruiser);
    }

    public void openRemoveCruiser(View view) {
        Intent showRemoveCruiser = new Intent(this, RemoveCruiser.class);
        startActivity(showRemoveCruiser);
    }
}
