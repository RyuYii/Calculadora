package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num_1);
        num2 = findViewById(R.id.num_2);
        res = findViewById(R.id.respuesta);
    }

    public void suma(View view){
        Integer resp_num = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        res.setText(resp_num + "");
    }
    public void resta(View view){
        Integer resp_num = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
        res.setText(resp_num + "");
    }
    public void div(View view){
        Integer resp_num = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        res.setText(resp_num + "");
    }
    public void mul(View view){
        Integer resp_num = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        res.setText(resp_num + "");
    }
}