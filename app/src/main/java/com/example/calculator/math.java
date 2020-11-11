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

public class math extends AppCompatActivity {


    private EditText two,eight,ten,sixteen;

    private String number_m;
    int number_mt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        final Button turn=(Button)findViewById(R.id.m_turn);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(math.this,turn.class);
                startActivity(intent);
                finish();
            }
        });


        two=(EditText)findViewById(R.id.m_two);
        eight=(EditText)findViewById(R.id.m_eight);
        ten=(EditText)findViewById(R.id.m_ten);
        sixteen=(EditText)findViewById(R.id.m_sixteen);

        Button ok=(Button)findViewById(R.id.m_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String set_two=two.getText().toString().trim();
                String set_eight=eight.getText().toString().trim();
                String set_ten=ten.getText().toString().trim();
                String set_sixteen=sixteen.getText().toString().trim();
                if(!set_two.isEmpty())
                {
                    number_m=Integer.valueOf(set_two,2).toString();
                    number_mt=Integer.parseInt(number_m);
                    ten.setText(String.valueOf(number_m));
                    eight.setText(String.valueOf(Integer.toOctalString(number_mt)));
                    sixteen.setText(String.valueOf(Integer.toHexString(number_mt)));

                }
                else if(!set_ten.isEmpty())
                {
                    number_mt=Integer.parseInt(set_ten);
                    two.setText(String.valueOf(Integer.toBinaryString(number_mt)));
                    eight.setText(String.valueOf(Integer.toOctalString(number_mt)));
                    sixteen.setText(String.valueOf(Integer.toHexString(number_mt)));
                }
                else if(!set_eight.isEmpty())
                {
                    number_m=Integer.valueOf(set_eight,8).toString();
                    number_mt=Integer.parseInt(number_m);
                    ten.setText(String.valueOf(number_mt));
                    two.setText(String.valueOf(Integer.toBinaryString(number_mt)));
                    sixteen.setText(String.valueOf(Integer.toHexString(number_mt)));
                }
                else if(!set_sixteen.isEmpty())
                {
                    number_m=Integer.valueOf(set_sixteen,16).toString();
                    number_mt=Integer.parseInt(number_m);
                    ten.setText(String.valueOf(number_mt));
                    two.setText(String.valueOf(Integer.toBinaryString(number_mt)));
                    eight.setText(String.valueOf(Integer.toOctalString(number_mt)));
                }
            }
        });


        Button clear=(Button)findViewById(R.id.m_clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two.setText("");
                eight.setText("");
                ten.setText("");
                sixteen.setText("");
            }
        });

    }
}