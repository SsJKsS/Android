package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    public CheckBox chkBoxMusic, chkBoxSing, chkBoxDance, chkBoxTravel, chkBoxReading,
            chkBoxWriting, chkBoxClimbing, chkBoxSwimming, chkBoxExercise, chkBoxFitness,
            chkBoxPhoto, chkBoxFood, chkBoxPainting;
    public Button btnHobbyConfirm;
    public TextView tvHobbyResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        chkBoxMusic = findViewById(R.id.chkBoxMusic);
        chkBoxSing = findViewById(R.id.chkBoxSing);
        chkBoxDance = findViewById(R.id.chkBoxDance);
        chkBoxTravel = findViewById(R.id.chkBoxTravel);
        chkBoxReading = findViewById(R.id.chkBoxReading);
        chkBoxWriting = findViewById(R.id.chkBoxWriting);
        chkBoxClimbing = findViewById(R.id.chkBoxClimbing);
        chkBoxSwimming = findViewById(R.id.chkBoxSwimming);
        chkBoxExercise = findViewById(R.id.chkBoxExercise);
        chkBoxFitness = findViewById(R.id.chkBoxFitness);
        chkBoxPhoto = findViewById(R.id.chkBoxPhoto);
        chkBoxFood = findViewById(R.id.chkBoxFood);
        chkBoxPainting = findViewById(R.id.chkBoxPainting);
        btnHobbyConfirm = findViewById(R.id.btn_btn8);
        tvHobbyResult = findViewById(R.id.tv_hobbyResult);

        btnHobbyConfirm.setOnClickListener(btnOnClick);
    }

        public View.OnClickListener btnOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = getString(R.string.hobbyResult);

                if (chkBoxMusic.isChecked())
                    s += chkBoxMusic.getText().toString();
                if (chkBoxSing.isChecked())
                    s += chkBoxSing.getText().toString();
                if (chkBoxDance.isChecked())
                    s += chkBoxDance.getText().toString();
                if (chkBoxTravel.isChecked())
                    s += chkBoxTravel.getText().toString();
                if (chkBoxReading.isChecked())
                    s += chkBoxReading.getText().toString();
                if (chkBoxWriting.isChecked())
                    s += chkBoxWriting.getText().toString();
                if (chkBoxClimbing.isChecked())
                    s += chkBoxClimbing.getText().toString();
                if (chkBoxSwimming.isChecked())
                    s += chkBoxSwimming.getText().toString();
                if (chkBoxExercise.isChecked())
                    s += chkBoxExercise.getText().toString();
                if (chkBoxFitness.isChecked())
                    s += chkBoxFitness.getText().toString();
                if (chkBoxPhoto.isChecked())
                    s += chkBoxPhoto.getText().toString();
                if (chkBoxFood.isChecked())
                    s += chkBoxFood.getText().toString();
                if (chkBoxPainting.isChecked())
                    s += chkBoxPainting.getText().toString();

                tvHobbyResult.setText(s);
            }
        };
}
