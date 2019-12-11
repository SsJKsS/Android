package com.example.myapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();  //呼叫getIntent()得到Intent物件
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("NAME_EXTRA");
        float bmi = bundle.getFloat("BMI_EXTRA");
        TextView tv_result = findViewById(R.id.tv_result);
        tv_result.setText(name + "'s BMI : " + bmi);
    }
       public void back(View view){
           Button btn_back = findViewById(R.id.btn_btn2);
           finish();
        }
}
