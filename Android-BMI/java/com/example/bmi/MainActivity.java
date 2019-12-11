package com.example.bmi;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //findViews();
    }

//    private void findViews() {
//        EditText et_weight = findViewById(R.id.et_weight);
//        EditText et_height = findViewById(R.id.et_height);
//        Button btn_caculate = findViewById(R.id.btn_submit);
//    }

    private void bmi(View v) {
        EditText et_weight = findViewById(R.id.et_weight);
        EditText et_height = findViewById(R.id.et_height);
        Button btn_caculate = findViewById(R.id.btn_submit);
        String w = et_weight.getText().toString();
        String h = et_height.getText().toString();
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("BMI", String.valueOf(bmi));
        Toast.makeText(this, String.valueOf(bmi), Toast.LENGTH_LONG).show();
    }
}
