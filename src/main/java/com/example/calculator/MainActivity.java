package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ViewGroup mainlayout;
      EditText No1, No2;
      Button add , Subtract , Multiply , Divide ,Precent;
      TextView calculate;
      float result;
      float num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainlayout = (RelativeLayout) findViewById(R.id.RelativeLayout);
        No1 = (EditText) findViewById(R.id.edit1);
        No2 = (EditText) findViewById(R.id.edit2);
        add = (Button) findViewById(R.id.plus);
        Subtract = (Button) findViewById(R.id.Minus);
        Multiply = (Button) findViewById(R.id.Multiply);
        Divide = (Button) findViewById(R.id.division);
        Precent = (Button) findViewById(R.id.Precent);
        calculate = (TextView) findViewById(R.id.Result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(No1.getText().toString());
                num2 = Float.parseFloat(No2.getText().toString());
                if(No1.getText()!=null&&No1.getText()!=null )
                {
                    result = num1 + num2;
                    calculate.setText(String.valueOf(result));
                }
              else {
                    toastMessage("fill all fields");

                }
            }


        });
        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(No1.getText().toString());
                num2 = Float.parseFloat(No2.getText().toString());
                if(No1.getText().toString().isEmpty()){
                    toastMessage("fill all fields");
                    result = num1 ;
                    calculate.setText(String.valueOf(result));
                }
                if(No2.getText().toString().isEmpty()){
                    toastMessage("fill all fields");
                    result =  num2;
                    calculate.setText(String.valueOf(result));
                }
                result = num1 - num2;
                calculate.setText(String.valueOf(result));
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(No1.getText().toString());
                num2 = Float.parseFloat(No2.getText().toString());
                if(No1.getText().toString().isEmpty()){
                    toastMessage("fill all fields");
                    result = num1 ;
                    calculate.setText(String.valueOf(result));
                }
                if(No2.getText().toString().isEmpty()){
                    toastMessage("fill all fields");
                    result =  num2;
                    calculate.setText(String.valueOf(result));
                }

                result = num1 * num2;
                calculate.setText(String.valueOf(result));
            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.parseFloat(No1.getText().toString());
                num2 = Float.parseFloat(No2.getText().toString());
                if(No1.getText().toString().isEmpty()){
                    toastMessage("fill all fields");
                    result = num1 ;
                    calculate.setText(String.valueOf(result));
                }
                if(No2.getText().toString().isEmpty()){
                    toastMessage("fill all fields");
                    result =  num2;
                    calculate.setText(String.valueOf(result));
                }

                result = num1 / num2;
                calculate.setText(String.valueOf(result));
            }
        });
        Precent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Float.parseFloat(No1.getText().toString());
                num2 = Float.parseFloat(No2.getText().toString());
                if(No1.getText().toString()!=null){
                    result = num1/100 ;
                    calculate.setText(String.valueOf(result));
                }
                if(No2.getText().toString().isEmpty()){
                    result =  num2/100;
                    calculate.setText(String.valueOf(result));
                }

            }
        });
    }

    //toastMessage

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}