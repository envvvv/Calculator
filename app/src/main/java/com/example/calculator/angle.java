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

public class angle extends AppCompatActivity {

    private EditText angle,cos,sin,tan;

    private double number_a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angle);

        Button turn=(Button)findViewById(R.id.a_turn);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(angle.this,turn.class);
                startActivity(intent);
                finish();
            }
        });

        angle=(EditText)findViewById(R.id.angle);
        cos=(EditText)findViewById(R.id.cos);
        sin=(EditText)findViewById(R.id.sin);
        tan=(EditText)findViewById(R.id.tan);

        Button ok=(Button)findViewById(R.id.a_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String set_angle=angle.getText().toString().trim();
                if(!set_angle.isEmpty())
                {
                    number_a=Double.parseDouble(set_angle);
//                    System.out.println(number);
                    cos.setText(String.valueOf(Math.cos(number_a*Math.PI/180)));
                    sin.setText(String.valueOf(Math.sin(number_a*Math.PI/180)));
                    tan.setText(String.valueOf(Math.tan(number_a*Math.PI/180)));
                }
            }
        });


        Button clear=(Button)findViewById(R.id.a_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angle.setText("");
                cos.setText("");
                sin.setText("");
                tan.setText("");
            }
        });
    }
}