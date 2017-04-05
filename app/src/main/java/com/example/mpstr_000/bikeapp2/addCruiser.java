package com.example.mpstr_000.bikeapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class addCruiser extends AppCompatActivity {

    EditText cruiserBikeInput;
    TextView cruiserBikeText;
    MyDBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cruiser);
        cruiserBikeInput = (EditText) findViewById(R.id.cruiserBikeInput);
        cruiserBikeText = (TextView) findViewById(R.id.cruiserBikeText);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    //Add a product to the database
    public void addButtonClicked(View view){
        Bikes bikeNumber = new Bikes(cruiserBikeInput.getText().toString());
        dbHandler.addBike(bikeNumber);
        printDatabase();
    }

    //Print the database
    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        cruiserBikeText.setText(dbString);
        cruiserBikeInput.setText("");
    }

}
