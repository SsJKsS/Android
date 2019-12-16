package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class Main3Activity extends AppCompatActivity {

    private NumberPicker numPickerRank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        numPickerRank = findViewById(R.id.numberPicker);
        numPickerRank.setMinValue(0);
        numPickerRank.setMaxValue(5);
        numPickerRank.setValue(3);
    }
}
