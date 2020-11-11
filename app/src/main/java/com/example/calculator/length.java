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
import android.widget.TextView;

public class length extends AppCompatActivity {

    private EditText km,m,cm,mm;

    private double number=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        Button turn=(Button)findViewById(R.id.l_turn);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(length.this,turn.class);
                startActivity(intent);
                finish();
            }
        });

        km=(EditText)findViewById(R.id.km);
        m=(EditText)findViewById(R.id.m);
        cm=(EditText)findViewById(R.id.cm);
        mm=(EditText)findViewById(R.id.mm);

//        final String set_km=km.getText().toString().trim();
//        String set_m=m.getText().toString().trim();
//        String set_cm=cm.getText().toString().trim();
//        String set_mm=mm.getText().toString().trim();

//        final double s_km=Double.parseDouble(set_km);
//        final double s_m = Double.parseDouble(set_m);
//        final double s_cm=Double.parseDouble(set_cm);
//        double s_mm=Double.parseDouble(set_mm);


        Button ok=(Button)findViewById(R.id.l_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String set_km=km.getText().toString().trim();
                String set_m=m.getText().toString().trim();
                String set_cm=cm.getText().toString().trim();
                String set_mm=mm.getText().toString().trim();
                if(!set_km.isEmpty())
                {
                    number=Double.parseDouble(set_km)*1000;
//                    System.out.println(number);
                    m.setText(String.valueOf(number));
                    number=number*100;
                    cm.setText(String.valueOf(number));
                    number=number*10;
                    mm.setText(String.valueOf(number));
                }
                else if(!set_m.isEmpty())
                {
                    number=Double.parseDouble(set_m)/1000;
//                    System.out.println(number);
                    km.setText(String.valueOf(number));
                    number=Double.parseDouble(set_m)*100;
                    cm.setText(String.valueOf(number));
                    number=number*10;
                    mm.setText(String.valueOf(number));
                }
                else if(!set_cm.isEmpty())
                {

                    number=Double.parseDouble(set_cm)*10;
//                    System.out.println(number);
                    mm.setText(String.valueOf(number));
                    number=number/1000;
                    m.setText(String.valueOf(number));
                    number=number/1000;
                    km.setText(String.valueOf(number));
                }
                else if(!set_mm.isEmpty())
                {

                    number=Double.parseDouble(set_mm)/10;
//                    System.out.println(number);
                    cm.setText(String.valueOf(number));
                    number=number/100;
                    m.setText(String.valueOf(number));
                    number=number/1000;
                    km.setText(String.valueOf(number));
                }
            }
        });


        Button clear=(Button)findViewById(R.id.l_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                km.setText("");
                m.setText("");
                cm.setText("");
                mm.setText("");
            }
        });

    }
}