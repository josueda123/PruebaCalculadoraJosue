package com.example.pruebacalculadorajosue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button btn1,btn2,btn3,btn4;
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    n1 = (EditText) findViewById(R.id.num1);
    n2 = (EditText) findViewById(R.id.num2);
    btn1 = (Button) findViewById(R.id.suma);
    btn2 = (Button) findViewById(R.id.resta);
    btn3 = (Button) findViewById(R.id.multiplicacion);
    btn4 = (Button) findViewById(R.id.division);
    msg = (TextView) findViewById(R.id.resul);

    btn1.setOnClickListener(this);
    btn2.setOnClickListener(this);
    btn3.setOnClickListener(this);
    btn4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        int nm1 = Integer.parseInt(n1.getText().toString());
        int nm2 = Integer.parseInt(n2.getText().toString());
        int nm3 = nm1 + nm2;
        int nm4 = nm1 - nm2;
        int nm5 = nm1 * nm2;
        int nm6 = nm1 / nm2;

        if (view.getId() == R.id.suma) {
            Intent intentbtn1 = new Intent(this, suma.class);
            msg.setText("El resultado es " + nm3);
        } else if (view.getId() == R.id.resta) {
            Intent intentbtn2 = new Intent(this, resta.class);
            msg.setText("El resultado es " + nm4);
        } else if (view.getId() == R.id.multiplicacion){
            msg.setText("El resultado es " + nm5);
        } else if (view.getId() == R.id.division){
            msg.setText("El resultado es " + nm6);

        }
    }
}
