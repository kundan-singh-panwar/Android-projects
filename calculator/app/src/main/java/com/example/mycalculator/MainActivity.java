package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Addition,subtraction,multiplication,division;
    private EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Addition = (Button)findViewById(R.id.btnadd);
        subtraction = (Button)findViewById(R.id.btnsub);
        multiplication = (Button)findViewById(R.id.btnmult);
        division = (Button)findViewById(R.id.btndiv);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        et3 = (EditText)findViewById(R.id.et3);

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")||et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter Some Values", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1+a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        //Subtraction

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")||et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter Some Values", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1-a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        //Multiplication

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")||et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter Some Values", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1*a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        //Division

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("")||et2.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Please Enter Some Values", Toast.LENGTH_SHORT).show();
                }
                else{
                    et1.getText().toString();
                    et2.getText().toString();
                    double a1=Double.valueOf(et1.getText().toString());
                    double a2=Double.valueOf(et2.getText().toString());
                    double a3;
                    a3 = a1/a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });









    }
}
