package com.example.bacwatch_drinkinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SizeSelectWine extends AppCompatActivity {
    //Variables to be used across other activities.
    private EditText amtEdit;
    private Button otherWine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_select_wine);

        Button wineGlass =  findViewById(R.id.btnWineGlass);
        otherWine = findViewById(R.id.btnotherWine);
        otherWine.setEnabled(false); //Disable button until an input is entered.

        wineGlass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlcSelector.sizeOfAlc = 5.0;
                Intent changeScreen = new Intent(SizeSelectWine.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        amtEdit = findViewById(R.id.otheramtWine);
        amtEdit.addTextChangedListener(loginTextWatcher);

        otherWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Parses string value of EditText to double
                AlcSelector.sizeOfAlc = Double.parseDouble(amtEdit.getText().toString());
                Intent changeScreen = new Intent(SizeSelectWine.this, AmountSelect.class);
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
            otherWine.setEnabled(!amt.isEmpty()); // Button only enables when amt isn't empty.
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}