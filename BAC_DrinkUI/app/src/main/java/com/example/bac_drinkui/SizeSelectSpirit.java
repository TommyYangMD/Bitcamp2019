package com.example.bac_drinkui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class SizeSelectSpirit extends AppCompatActivity {
    //Variables to be used across other activities.
    public static double sizeOfSpirit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_select_spirit);

        Button shot =  findViewById(R.id.btnshot);
        Button doubleshot =  findViewById(R.id.btndouble);
<<<<<<< HEAD
        other =  findViewById(R.id.btnother);
        other.setEnabled(false);
=======
        Button other =  findViewById(R.id.btnother);
>>>>>>> parent of 030703c... test

        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sizeOfSpirit = 1.5;
                Intent changeScreen = new Intent(SizeSelectSpirit.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        doubleshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sizeOfSpirit = 3.0;
                Intent changeScreen = new Intent(SizeSelectSpirit.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sizeOfSpirit = ((EditText));
                Intent changeScreen = new Intent(SizeSelectSpirit.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });
    }
}
