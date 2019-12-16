package com.example.myapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private RadioGroup radGrpAge;
    private RadioButton radBtnAge1, radBtnAge2;

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

        Spinner spnGender = findViewById(R.id.spn1);
        spnGender.setOnItemSelectedListener(spnGenderOnItemSelected);

        radGrpAge = findViewById(R.id.radGrpGender);
        radBtnAge1 = findViewById(R.id.radBtnAge1);
        radBtnAge2 = findViewById(R.id.radBtnAge2);
        radGrpAge.setOnCheckedChangeListener(radGrpAgeOnCheckedChange);

    }

    public void back(View view) {
        Button btn_back = findViewById(R.id.btn_btn2);
        finish();
    }

    private AdapterView.OnItemSelectedListener spnGenderOnItemSelected = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 1:
                    Toast.makeText(Main2Activity.this, "Male", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    Toast.makeText(Main2Activity.this, "Female", Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private RadioGroup.OnCheckedChangeListener radGrpAgeOnCheckedChange =
            new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup radioGroup, int i){
            if(i == R.id.radBtnGender1){
                radBtnAge1.setText(getString(R.string.maleAgeLess18));
                radBtnAge2.setText(getString(R.string.maleAgeGreater18));
            }
            else{
                radBtnAge1.setText(getString(R.string.femaleAgeLess16));
                radBtnAge2.setText(getString(R.string.femaleAgeGreater16));
            }

        }
    };


}
