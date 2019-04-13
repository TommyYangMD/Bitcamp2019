package com.example.bac_drinkui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SizeSelectBeer extends AppCompatActivity {
    //Variables to be used across other activities.
    private EditText amtEdit;
    private Button otherBeer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_select_beer);

        Button beerCup =  findViewById(R.id.btnCup);
        Button beerPint =  findViewById(R.id.btnPint);
        otherBeer = findViewById(R.id.btnotherBeer);

        beerCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlcSelect.sizeOfAlc = 12.0;
                Intent changeScreen = new Intent(SizeSelectBeer.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        beerPint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlcSelect.sizeOfAlc = 16.0;
                Intent changeScreen = new Intent(SizeSelectBeer.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        amtEdit = findViewById(R.id.otheramtBeer);
        amtEdit.addTextChangedListener(loginTextWatcher);

        otherBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Parses string value of EditText to double
                AlcSelect.sizeOfAlc = Double.parseDouble(amtEdit.getText().toString());
                Intent changeScreen = new Intent(SizeSelectBeer.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });
    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String amt = amtEdit.getText().toString().trim();
            otherBeer.setEnabled(!amt.isEmpty()); // Button only enables when amt isn't empty.
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
