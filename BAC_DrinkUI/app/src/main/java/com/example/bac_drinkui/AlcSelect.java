package com.example.bac_drinkui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AlcSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton beerBtn = findViewById(R.id.beerbtn);
        ImageButton wineBtn = findViewById(R.id.winebtn);
        ImageButton spiritBtn = findViewById(R.id.spiritbtn);

        spiritBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeScreen = new Intent(AlcSelect.this, SizeSelectSpirit.class);
                startActivity(changeScreen);
            }
        });
    }
}
