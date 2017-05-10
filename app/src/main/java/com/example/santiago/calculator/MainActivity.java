package com.example.santiago.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonZero = (Button) findViewById(R.id.button0);
        Button buttonOne = (Button) findViewById(R.id.button1);
        Button buttonTwo = (Button) findViewById(R.id.button2);
        Button buttonThree = (Button) findViewById(R.id.button3);
        Button buttonFour = (Button) findViewById(R.id.button4);
        Button buttonFive = (Button) findViewById(R.id.button5);
        Button buttonSix = (Button) findViewById(R.id.button6);
        Button buttonSeven = (Button) findViewById(R.id.button7);
        Button buttonEight = (Button) findViewById(R.id.button8);
        Button buttonNine = (Button) findViewById(R.id.button9);
        Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        Button buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        Button buttonDivide = (Button) findViewById(R.id.buttonDiv);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMult);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonEqual = (Button) findViewById(R.id.buttonEqual);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button botonPresionado = (Button)v;
                EditText editText = (EditText) findViewById(R.id.editResultado) ;
                StringBuilder contenido = new StringBuilder(editText.getText());
                contenido.append(botonPresionado.getText());
                editText.setText(contenido.toString() );
            }
        };

        View.OnClickListener listenerEqual = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editResultado) ;
                StringBuilder contenido = new StringBuilder(editText.getText());
                String valores[] = contenido.toString().split("\\+");
                Integer resultado=0;
                for(int i = 0; i < valores.length; i++){

                    resultado = resultado +Integer.valueOf(valores[i]);
                }
                editText.setText(resultado.toString());

            }
        };

        buttonZero.setOnClickListener(listener);
        buttonOne.setOnClickListener(listener);
        buttonTwo.setOnClickListener(listener);
        buttonThree.setOnClickListener(listener);
        buttonFour.setOnClickListener(listener);
        buttonFive.setOnClickListener(listener);
        buttonSix.setOnClickListener(listener);
        buttonSeven.setOnClickListener(listener);
        buttonEight.setOnClickListener(listener);
        buttonNine.setOnClickListener(listener);
        buttonAdd.setOnClickListener(listener);
        buttonSubtract.setOnClickListener(listener);
        buttonDivide.setOnClickListener(listener);
        buttonMultiply.setOnClickListener(listener);
        buttonDot.setOnClickListener(listener);
        buttonEqual.setOnClickListener(listenerEqual);
    }
}
