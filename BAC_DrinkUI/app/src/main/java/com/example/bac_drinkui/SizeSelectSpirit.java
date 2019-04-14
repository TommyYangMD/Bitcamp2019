package com.example.bac_drinkui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class SizeSelectSpirit extends AppCompatActivity {
    //Variables to be used across other activities.
    private EditText amtEdit;
    private Button other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_select_spirit);

        Button shot =  findViewById(R.id.btnshot);
        Button doubleshot =  findViewById(R.id.btndouble);
        other =  findViewById(R.id.btnother);
        other.setEnabled(false);

        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlcSelect.sizeOfAlc = 1.5;
                Intent changeScreen = new Intent(SizeSelectSpirit.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        doubleshot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlcSelect.sizeOfAlc = 3.0;
                Intent changeScreen = new Intent(SizeSelectSpirit.this, AmountSelect.class);
                startActivity(changeScreen);
            }
        });

        amtEdit = findViewById(R.id.otheramt);
        amtEdit.addTextChangedListener(loginTextWatcher);

        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Parses string value of EditText to double
                AlcSelect.sizeOfAlc = Double.parseDouble(amtEdit.getText().toString());
                Intent changeScreen = new Intent(SizeSelectSpirit.this, AmountSelect.class);
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
            other.setEnabled(!amt.isEmpty()); // Button only enables when amt isn't empty.
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
