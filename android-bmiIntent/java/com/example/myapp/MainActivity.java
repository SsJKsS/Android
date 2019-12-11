package com.example.myapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_submit = findViewById(R.id.btn_btn1);
//        btn_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity();
//            }
//        });
    }

    public void bmi(View view){
        EditText ed_weight = findViewById(R.id.ed_weight);
        EditText ed_height = findViewById(R.id.ed_height);
        EditText ed_name = findViewById(R.id.ed_name);
        String name = ed_name.getText().toString();
        float weight = Float.parseFloat(ed_weight.getText().toString());
        float height = Float.parseFloat(ed_height.getText().toString()) / 100;
        float bmi = weight / (height * height);
        Intent intent = new Intent(this, Main2Activity.class);
        Bundle bundle = new Bundle();  //如果有多種類的資料需要傳遞，可使用Bundle類別
        bundle.putString("NAME_EXTRA", name);
        bundle.putFloat("BMI_EXTRA", bmi);
        intent.putExtras(bundle);  //呼叫Intent類別的putExtras方法，將bundle放入
        startActivity(intent);
    }
}
