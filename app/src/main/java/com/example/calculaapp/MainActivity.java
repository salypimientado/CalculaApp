package com.example.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float a = 2;
    float b = 2.2f;
    double result;
    String text;
    EditText text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.editText);
        suma(a,b);
        resta(a,b);
        multi(a,b);
        div(a,b);
    }


    public void suma(float x, float y)
    {

        result = x+y;

        text = Double.toString(result);

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        Log.d("suma", text);
    }

    public void resta(float x, float y)
    {

        result = x-y;

        text = Double.toString(result);

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        Log.d("resta", text);
    }

    public void multi(float x, float y)
    {

         result = x*y;

        text = Double.toString(result);

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        Log.d("multiplicacion", text);
    }

    public void div(float x, float y)
    {

        result = x/y;

        text = Double.toString(result);

        Toast.makeText(getApplicationContext(), text.getTex, Toast.LENGTH_SHORT);
        Log.d("division", text);
    }

}
