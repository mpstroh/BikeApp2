package com.example.mpstr_000.bikeapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//This is a public class to remove cruisers

public class RemoveCruiser extends AppCompatActivity {

    EditText removeCruiserBikeInput;
    TextView removeCruiserBikeText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_cruiser);
        removeCruiserBikeInput = (EditText) findViewById(R.id.cruiserBikeInput);
        removeCruiserBikeText = (TextView) findViewById(R.id.cruiserBikeText);
        dbHandler = new MyDBHandler(this, null, null, 1);

    }
    public void removeButtonClicked(View view){
        String inputText = removeCruiserBikeInput.getText().toString();
        dbHandler.deleteBike(inputText);

    }


}
