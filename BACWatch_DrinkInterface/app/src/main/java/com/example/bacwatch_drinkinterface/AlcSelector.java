package com.example.bacwatch_drinkinterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AlcSelector extends AppCompatActivity {
    //Variables to be used across other activities.
    public static String typeOfAlc;
    public static double sizeOfAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcselector);

        ImageButton beerBtn = findViewById(R.id.beerbtn);
        ImageButton wineBtn = findViewById(R.id.winebtn);
        ImageButton spiritBtn = findViewById(R.id.spiritbtn);

        beerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfAlc = "Beer";
                Intent changeScreen = new Intent(AlcSelector.this, SizeSelectBeer.class);
                startActivity(changeScreen);
            }
        });

        wineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfAlc = "Wine";
                Intent changeScreen = new Intent(AlcSelector.this, SizeSelectWine.class);
                startActivity(changeScreen);
            }
        });

        spiritBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                typeOfAlc = "Hard Liquor/Spirit";
                Intent changeScreen = new Intent(AlcSelector.this, SizeSelectSpirit.class);
                startActivity(changeScreen);
            }
        });
    }
}
