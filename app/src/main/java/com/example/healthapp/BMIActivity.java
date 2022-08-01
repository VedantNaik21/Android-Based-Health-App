package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Throwable;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        Button button = (Button) findViewById(R.id.btnCalculate);
        button.setOnClickListener(new OnClickListener() {
            private Throwable NumberFormatException;

            @Override
            public void onClick(View view) {
                EditText height = (EditText) findViewById(R.id.height);
                float hgt = Float.parseFloat(height.getText().toString());

                EditText weight = (EditText) findViewById(R.id.weight);
                float wgt = Float.parseFloat(weight.getText().toString());

                displayAnswer(calculate(hgt, wgt));
            }
        });
    }

    public float calculate(float height, float weight){
        float result;
        height *= height;
        result = weight / height;
        return result;
    }

    public void displayAnswer(float answer){
        String finalAnswer = "Your Body Mass Index (BMI) is: ";
        finalAnswer = finalAnswer + "\n" + String.valueOf(answer);

        TextView bmiTextView = (TextView) findViewById(R.id.bmiAnswer);
        bmiTextView.setText(finalAnswer);
        if (answer < 18.5){
            Toast.makeText(this,"You are Underweight!",Toast.LENGTH_SHORT).show();
        }
        else if (answer > 18.5 && answer <=24.9){
            Toast.makeText(this, "Your BMI is Normal!", Toast.LENGTH_SHORT).show();
        }
        else if(answer >=25 && answer <=29.9){
            Toast.makeText(this, "You are Overweight!", Toast.LENGTH_SHORT).show();
        }
        else if(answer >=30 && answer <=34.9){
            Toast.makeText(this, "You are Obese!", Toast.LENGTH_SHORT).show();
        }
        else if(answer >=35){
            Toast.makeText(this, "You are extremely Obese!", Toast.LENGTH_SHORT).show();
        }
    }

}