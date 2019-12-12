package com.example.myapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_submit = findViewById(R.id.btn_btn1);
    }

    public void bmi(View view){
        EditText ed_weight = findViewById(R.id.ed_weight);
        EditText ed_height = findViewById(R.id.ed_height);
        EditText ed_name = findViewById(R.id.ed_name);
        String name = ed_name.getText().toString();
        if(ed_name.getText().toString().isEmpty() && ed_weight.getText().toString().isEmpty() && ed_height.getText().toString().isEmpty()) {
            Toast.makeText(this,"Input data!", Toast.LENGTH_LONG).show();
        }
        else if(ed_name.getText().toString().isEmpty()){
            Toast.makeText(this,"Input name!", Toast.LENGTH_LONG).show();
        }
        else if(ed_weight.getText().toString().isEmpty()){
            Toast.makeText(this,"Input weight!", Toast.LENGTH_LONG).show();
        }
        else if(ed_height.getText().toString().isEmpty()){
            Toast.makeText(this,"Input height!", Toast.LENGTH_LONG).show();
        }
        else {
            float weight = Float.parseFloat(ed_weight.getText().toString());
            float height = Float.parseFloat(ed_height.getText().toString()) / 100;
            float bmi = weight / (height * height);
            Intent intent = new Intent(this, Main2Activity.class);
            Bundle bundle = new Bundle();  //如果有多種類的資料需要傳遞，可使用Bundle類別
            bundle.putString("NAME_EXTRA", name);
            bundle.putFloat("BMI_EXTRA", Math.round(bmi));
            intent.putExtras(bundle);  //呼叫Intent類別的putExtras方法，將bundle放入
            startActivity(intent);
        }
    }

    public void toast(View view){
        EditText ed_name = findViewById(R.id.ed_name);
        String name = ed_name.getText().toString();
        Toast.makeText(this,"Hello, " + name, Toast.LENGTH_LONG).show();
    }

    public void alert(View view){

        Button btn_dialog = findViewById(R.id.btn_btn4);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert!");
        builder.setMessage("Alert Test");
        builder.setIcon(R.mipmap.ic_launcher_round);
        builder.setPositiveButton("取消", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "你點選了取消", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
               }
        });
        builder.setNegativeButton("是的", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "你點選了是的", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
