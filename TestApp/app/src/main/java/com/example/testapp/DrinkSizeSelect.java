package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class DrinkSizeSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_size_select);

        Spinner alcSelector = findViewById(R.id.alcSelector);

        //Array of alcohol values
        String[] alcType = {"Beer", "Hard Liquor/Spirit", "Wine"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, alcType);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alcSelector.setAdapter(adapter);
    }
}
