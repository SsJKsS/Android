package com.example.rockpaperscissorsgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tvResult;
    public ImageView imgtvCom;
    public ImageButton imgbtnScissors, imgbtnRock, imgbtnPaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgbtnScissors = findViewById(R.id.img_scissors);
        imgbtnScissors.setOnClickListener(btnScissorsOnClick);
        imgbtnRock = findViewById(R.id.img_rock);
        imgbtnRock.setOnClickListener(btnRockOnClick);
        imgbtnPaper = findViewById(R.id.img_paper);
        imgbtnPaper.setOnClickListener(btnPaperOnClick);
        imgtvCom = findViewById(R.id.imgtv_com);
        tvResult = findViewById(R.id.tv_result);
    }

    public View.OnClickListener btnScissorsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 1:剪刀 2:石頭 3:布
            int comPlay = (int) (Math.random() * 3 + 1);
            switch (comPlay) {
                case 1:
                    imgtvCom.setImageResource(R.drawable.scissors);
                    tvResult.setText(R.string.tv_drawResult);
                    break;
                case 2:
                    imgtvCom.setImageResource(R.drawable.rock);
                    tvResult.setText(R.string.tv_loseResult);
                    break;
                case 3:
                    imgtvCom.setImageResource(R.drawable.paper);
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
                        imgtvCom.setImageResource(R.drawable.scissors);
                        tvResult.setText(R.string.tv_winResult);
                        break;
                    case 2:
                        imgtvCom.setImageResource(R.drawable.rock);
                        tvResult.setText(R.string.tv_drawResult);
                        break;
                    case 3:
                        imgtvCom.setImageResource(R.drawable.paper);
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
                        imgtvCom.setImageResource(R.drawable.scissors);
                        tvResult.setText(R.string.tv_loseResult);
                        break;
                    case 2:
                        imgtvCom.setImageResource(R.drawable.rock);
                        tvResult.setText(R.string.tv_winResult);
                        break;
                    case 3:
                        imgtvCom.setImageResource(R.drawable.paper);
                        tvResult.setText(R.string.tv_drawResult);
                        break;
                }
            }
        };
    }

