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

public class volume extends AppCompatActivity {

    private EditText km3,m3,cm3,mm3;

    private double number3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        final Button turn=(Button)findViewById(R.id.v_turn);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(volume.this,turn.class);
                startActivity(intent);
                finish();
            }
        });

        km3=(EditText)findViewById(R.id.km3);
        m3=(EditText)findViewById(R.id.m3);
        cm3=(EditText)findViewById(R.id.cm3);
        mm3=(EditText)findViewById(R.id.mm3);

        Button ok=(Button)findViewById(R.id.v_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String set_km3=km3.getText().toString().trim();
                String set_m3=m3.getText().toString().trim();
                String set_cm3=cm3.getText().toString().trim();
                String set_mm3=mm3.getText().toString().trim();
                if(!set_km3.isEmpty())
                {
                    number3=Double.parseDouble(set_km3)*1000*1000*1000;
//                    System.out.println(number);
                    m3.setText(String.valueOf(number3));
                    number3=number3*100*100*100;
                    cm3.setText(String.valueOf(number3));
                    number3=number3*10*10*10;
                    mm3.setText(String.valueOf(number3));
                }
                else if(!set_m3.isEmpty())
                {
                    number3=Double.parseDouble(set_m3)/1000/1000/1000;
//                    System.out.println(number);
                    km3.setText(String.valueOf(number3));
                    number3=Double.parseDouble(set_m3)*100*100*100;
                    cm3.setText(String.valueOf(number3));
                    number3=number3*10*10*10;
                    mm3.setText(String.valueOf(number3));
                }
                else if(!set_cm3.isEmpty())
                {

                    number3=Double.parseDouble(set_cm3)*10*10*10;
//                    System.out.println(number);
                    mm3.setText(String.valueOf(number3));
                    number3=number3/1000/1000/1000;
                    m3.setText(String.valueOf(number3));
                    number3=number3/1000/1000/1000;
                    km3.setText(String.valueOf(number3));
                }
                else if(!set_mm3.isEmpty())
                {

                    number3=Double.parseDouble(set_mm3)/10/10/10;
//                    System.out.println(number);
                    cm3.setText(String.valueOf(number3));
                    number3=number3/100/100/100;
                    m3.setText(String.valueOf(number3));
                    number3=number3/1000/1000/1000;
                    km3.setText(String.valueOf(number3));
                }
            }
        });


        Button clear=(Button)findViewById(R.id.v_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                km3.setText("");
                m3.setText("");
                cm3.setText("");
                mm3.setText("");
            }
        });
    }
}