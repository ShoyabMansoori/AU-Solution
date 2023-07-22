package com.ausolutionkota.ausolution.Professional_practical_files;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class BCA_file_main extends AppCompatActivity {
private Button button120,button121,button122,button123,button124,button125,button126,button127,button128,button129;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_c_a_file_main);
        sho();
        // bca 1 year file
        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_1.class));
            }
        });
        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_2.class));
            }
        });
        // bca 2 year file
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_3.class));
            }
        });
        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_4.class));
            }
        });
        // bca 3 year file
        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_5.class));
            }
        });
        button125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_6.class));
            }
        });
        button126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_7.class));
            }
        });
        button127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_8.class));
            }
        });
        button128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_9.class));
            }
        });
        button129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BCA_file_main.this,BCA_Practical_10.class));
            }
        });
    }
    private void sho() {
        button120=findViewById(R.id.button120);
        button121=findViewById(R.id.button121);
        button122=findViewById(R.id.button122);
        button123=findViewById(R.id.button123);
        button124=findViewById(R.id.button124);
        button125=findViewById(R.id.button125);
        button126=findViewById(R.id.button126);
        button127=findViewById(R.id.button127);
        button128=findViewById(R.id.button128);
        button129=findViewById(R.id.button129);
    }
}