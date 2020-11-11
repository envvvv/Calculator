package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class turn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn);
        final Button turn=(Button)findViewById(R.id.back);
        turn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        final Button angle=(Button)findViewById(R.id.jiao);
        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,angle.class);
                startActivity(intent);
                finish();
            }
        });

        final Button length=(Button)findViewById(R.id.length);
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,length.class);
                startActivity(intent);
                finish();
            }
        });

        Button math=(Button)findViewById(R.id.math);
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,math.class);
                startActivity(intent);
                finish();
            }
        });

        Button area=(Button)findViewById(R.id.area);
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,area.class);
                startActivity(intent);
                finish();
            }
        });

        Button volume=(Button)findViewById(R.id.volume);
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,volume.class);
                startActivity(intent);
                finish();
            }
        });


        Button help=(Button)findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(turn.this,help.class);
                startActivity(intent);
                finish();
            }
        });

    }
}