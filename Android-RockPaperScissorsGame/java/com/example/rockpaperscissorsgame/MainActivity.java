package com.example.rockpaperscissorsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tvComPlay, tvResult;
    public Button btnScissors, btnRock, btnPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnScissors = findViewById(R.id.btn_scissors);
        btnScissors.setOnClickListener(btnScissorsOnClick);
        btnRock = findViewById(R.id.btn_rock);
        btnRock.setOnClickListener(btnRockOnClick);
        btnPaper = findViewById(R.id.btn_paper);
        btnPaper.setOnClickListener(btnPaperOnClick);
        tvComPlay = findViewById(R.id.tv_com);
        tvResult = findViewById(R.id.tv_result);
    }

    public View.OnClickListener btnScissorsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 1:剪刀 2:石頭 3:布
            int comPlay = (int) (Math.random() * 3 + 1);
            switch (comPlay) {
                case 1:
                    tvComPlay.setText(R.string.btn_scissors);
                    tvResult.setText(R.string.tv_drawResult);
                    break;
                case 2:
                    tvComPlay.setText(R.string.btn_rock);
                    tvResult.setText(R.string.tv_loseResult);
                    break;
                case 3:
                    tvComPlay.setText(R.string.btn_paper);
                    tvResult.setText(R.string.tv_winResult);
                    break;
            }
        }
    };

        public View.OnClickListener btnRockOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1:剪刀 2:石頭 3:布
                int comPlay = (int) (Math.random() * 3 + 1);
                switch (comPlay) {
                    case 1:
                        tvComPlay.setText(R.string.btn_scissors);
                        tvResult.setText(R.string.tv_winResult);
                        break;
                    case 2:
                        tvComPlay.setText(R.string.btn_rock);
                        tvResult.setText(R.string.tv_drawResult);
                        break;
                    case 3:
                        tvComPlay.setText(R.string.btn_paper);
                        tvResult.setText(R.string.tv_loseResult);
                        break;
                }
            }
        };

        public View.OnClickListener btnPaperOnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1:剪刀 2:石頭 3:布
                int comPlay = (int) (Math.random() * 3 + 1);
                switch (comPlay) {
                    case 1:
                        tvComPlay.setText(R.string.btn_scissors);
                        tvResult.setText(R.string.tv_loseResult);
                        break;
                    case 2:
                        tvComPlay.setText(R.string.btn_rock);
                        tvResult.setText(R.string.tv_winResult);
                        break;
                    case 3:
                        tvComPlay.setText(R.string.btn_paper);
                        tvResult.setText(R.string.tv_drawResult);
                        break;
                }
            }
        };
    }

