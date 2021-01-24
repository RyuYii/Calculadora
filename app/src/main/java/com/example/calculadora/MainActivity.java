package com.example.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        try {
            Integer resp_num = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
            res.setText(resp_num + "");
        }
        catch (Exception e){
            Toast.makeText(this, "numero no valido", Toast.LENGTH_SHORT).show();
        }

    }
    public void resta(View view){
        try {
            Integer resp_num = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
            res.setText(resp_num + "");
        }
        catch (Exception e){
            Toast.makeText(this, "numero no valido", Toast.LENGTH_SHORT).show();
        }
    }
    public void div(View view){
        try {
            Integer resp_num = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
            res.setText(resp_num + "");
        }
        catch (Exception e){
            Toast.makeText(this, "numero no valido", Toast.LENGTH_SHORT).show();
        }
    }
    public void mul(View view){
        try {
            Integer resp_num = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
            res.setText(resp_num + "");
        }
        catch (Exception e){
            Toast.makeText(this, "numero no valido", Toast.LENGTH_SHORT).show();
        };
    }
    public void change_about(View view){
        Intent i =  new Intent(this, about.class);
        startActivity(i);
    }
}