package com.example.calculaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    float a = 2;
    float b = 2.2f;
    double result;
    String text;
 //   String textoraro;
    EditText text1;
    EditText text2;
    EditText text3;
    EditText text4;
  //  EditText numA;
  //  EditText numB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.editText);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
       // numA = findViewById(R.id.editText7);
       // numB = findViewById(R.id.editText8);
        suma(a,b);
        resta(a,b);
        multi(a,b);
        div(a,b);
       // cycle();
      //  final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        //executorService.scheduleAtFixedRate(myTask, 0, 1, TimeUnit.SECONDS);
    }


    public void suma(float x, float y)
    {

        result = x+y;

        text = Double.toString(result);
        text1.setText(text);

        Toast.makeText(getApplicationContext(), text1.getText(), Toast.LENGTH_SHORT);
        Log.d("suma", text);
    }

    public void resta(float x, float y)
    {

        result = x-y;

        text = Double.toString(result);
        text2.setText(text);

        Toast.makeText(getApplicationContext(), text1.getText(), Toast.LENGTH_SHORT);
        Log.d("resta", text);
    }

    public void multi(float x, float y)
    {

         result = x*y;

        text = Double.toString(result);
        text3.setText(text);

        Toast.makeText(getApplicationContext(), text1.getText(), Toast.LENGTH_SHORT);
        Log.d("multiplicacion", text);
    }

    public void div(float x, float y)
    {

        result = x/y;

        text = Double.toString(result);
        text4.setText(text);

        Toast.makeText(getApplicationContext(), text1.getText(), Toast.LENGTH_SHORT);
        Log.d("division", text);
    }

/*
    public void cycle()
    {
        textoraro = numA.getText().toString();
a = Float.valueOf(textoraro);
        textoraro = numB.getText().toString();
        b = Float.valueOf(textoraro);
        suma(a,b);
        resta(a,b);
        multi(a,b);
        div(a,b);
      //  cycle();
    }
*/
}