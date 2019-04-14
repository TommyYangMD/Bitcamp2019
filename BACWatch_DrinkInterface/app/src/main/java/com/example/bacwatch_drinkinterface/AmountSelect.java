package com.example.bacwatch_drinkinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class AmountSelect extends AppCompatActivity {

    // To be used to count the amount
    public static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount_select);

        ImageButton plus = findViewById(R.id.plusDrink);
        ImageButton minus = findViewById(R.id.minusDrink);
        Button submit = findViewById(R.id.btnsubmit);

        //Updates text view based on which kind of alcohol and size of drink you have.
        ((TextView)findViewById(R.id.textDisplayDrink)).setText("("+ AlcSelector.typeOfAlc + ": " + AlcSelector.sizeOfAlc + " Fl Oz.)");

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.amt)).setText(Integer.toString(++counter));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((counter - 1) < 0){
                    ((TextView)findViewById(R.id.amt)).setText(Integer.toString(counter));
                } else {
                    ((TextView)findViewById(R.id.amt)).setText(Integer.toString(--counter));
                }

            }
        });
    }
}
