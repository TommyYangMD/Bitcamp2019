package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Spinner alcList = findViewById(R.id.alcType);

        //Array of alcohol values
        String[] alcType = {"Beer", "Hard Liquor/Spirit", "Wine"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, alcType);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alcList.setAdapter(adapter);*/

        //Create new button objects
        Button btnBeer = findViewById(R.id.btnBeer);
        Button btnWine = findViewById(R.id.btnWine);
        Button btnSpirit = findViewById(R.id.btnSpirit);

        btnBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeScreen = new Intent(MainActivity.this, DrinkSizeSelect.class);
                startActivity(changeScreen);
            }
        });

        btnWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeScreen = new Intent(MainActivity.this, DrinkSizeSelect.class);
                startActivity(changeScreen);
            }
        });

        btnSpirit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeScreen = new Intent(MainActivity.this, DrinkSizeSelect.class);
                startActivity(changeScreen);
            }
        });
    }

    private void ToastMessage(String message){
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
