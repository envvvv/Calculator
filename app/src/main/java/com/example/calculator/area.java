package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class area extends AppCompatActivity {

    private EditText km2,m2,cm2,mm2;

    private double number2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        Button turn=(Button)findViewById(R.id.ar_turn);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(area.this,turn.class);
                startActivity(intent);
                finish();
            }
        });

        km2=(EditText)findViewById(R.id.km2);
        m2=(EditText)findViewById(R.id.m2);
        cm2=(EditText)findViewById(R.id.cm2);
        mm2=(EditText)findViewById(R.id.mm2);


        Button ok=(Button)findViewById(R.id.ar_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String set_km2=km2.getText().toString().trim();
                String set_m2=m2.getText().toString().trim();
                String set_cm2=cm2.getText().toString().trim();
                String set_mm2=mm2.getText().toString().trim();
                if(!set_km2.isEmpty())
                {
                    number2=Double.parseDouble(set_km2)*1000*1000;
//                    System.out.println(number);
                    m2.setText(String.valueOf(number2));
                    number2=number2*100*100;
                    cm2.setText(String.valueOf(number2));
                    number2=number2*10*10;
                    mm2.setText(String.valueOf(number2));
                }
                else if(!set_m2.isEmpty())
                {
                    number2=Double.parseDouble(set_m2)/1000/1000;
//                    System.out.println(number);
                    km2.setText(String.valueOf(number2));
                    number2=Double.parseDouble(set_m2)*100*100;
                    cm2.setText(String.valueOf(number2));
                    number2=number2*10*10;
                    mm2.setText(String.valueOf(number2));
                }
                else if(!set_cm2.isEmpty())
                {

                    number2=Double.parseDouble(set_cm2)*10;
//                    System.out.println(number);
                    mm2.setText(String.valueOf(number2));
                    number2=number2/1000/1000;
                    m2.setText(String.valueOf(number2));
                    number2=number2/1000/1000;
                    km2.setText(String.valueOf(number2));
                }
                else if(!set_mm2.isEmpty())
                {

                    number2=Double.parseDouble(set_mm2)/10/10;
//                    System.out.println(number);
                    cm2.setText(String.valueOf(number2));
                    number2=number2/100/100;
                    m2.setText(String.valueOf(number2));
                    number2=number2/1000/1000;
                    km2.setText(String.valueOf(number2));
                }
            }
        });


        Button clear=(Button)findViewById(R.id.ar_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                km2.setText("");
                m2.setText("");
                cm2.setText("");
                mm2.setText("");
            }
        });
    }
}