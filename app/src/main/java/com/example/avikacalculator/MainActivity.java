package com.example.avikacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText txtnum1,txtnum2;
        txtnum1=(EditText)findViewById(R.id.editText1);
        txtnum2=(EditText)findViewById(R.id.editText2);
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum2.getText().toString());
        int sum=num1+num2;
        Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();

    }

    public void subtract(View view) {
        EditText txtnum1,txtnum2;
        txtnum1=(EditText)findViewById(R.id.editText1);
        txtnum2=(EditText)findViewById(R.id.editText2);
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum2.getText().toString());
        int sub=num1-num2;
        Toast.makeText(getApplicationContext(),String.valueOf(sub),Toast.LENGTH_LONG).show();
    }

    public void multiply(View view) {
        EditText txtnum1,txtnum2;
        txtnum1=(EditText)findViewById(R.id.editText1);
        txtnum2=(EditText)findViewById(R.id.editText2);
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum2.getText().toString());
        int mul=num1*num2;
        Toast.makeText(getApplicationContext(),String.valueOf(mul),Toast.LENGTH_LONG).show();
    }

    public void divide(View view) {
        EditText txtnum1,txtnum2;
        txtnum1=(EditText)findViewById(R.id.editText1);
        txtnum2=(EditText)findViewById(R.id.editText2);
        int num1=Integer.parseInt(txtnum1.getText().toString());
        int num2=Integer.parseInt(txtnum2.getText().toString());
        int div=num1/num2;
        Toast.makeText(getApplicationContext(),String.valueOf(div),Toast.LENGTH_LONG).show();
    }
}