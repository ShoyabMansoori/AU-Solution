package com.ausolutionkota.ausolution.UG_practical_files;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class BSC_file_main extends AppCompatActivity {

private Button button120,button121,button0120,button0121,button00120,button0122,button0123,button122,button123,button00122,button124,button125,button126,button127,button128;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_s_c_file_main);
        sho();
        // bsc 1 year files
        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_1.class));
            }
        });
        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_2.class));
            }
        });
        button0120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_3.class));
            }
        });
        button0121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_4.class));
            }
        });
        button00120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_5.class));
            }
        });
        // bsc 2 year practical files
        button0122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_6.class));
            }
        });
        button0123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_7.class));
            }
        });
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_8.class));
            }
        });
        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_9.class));
            }
        });
        button00122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_10.class));
            }
        });
        // bsc 3 year practical files
        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_11.class));
            }
        });
        button125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_12.class));
            }
        });
        button126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_13.class));
            }
        });
        button127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_14.class));
            }
        });
        button128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BSC_file_main.this,BSC_practical_15.class));
            }
        });
    }
    private void sho() {
        button120=findViewById(R.id.button120);
        button121=findViewById(R.id.button121);
        button0120=findViewById(R.id.button0120);
        button0121=findViewById(R.id.button0121);
        button00120=findViewById(R.id.button00120);
        button0122=findViewById(R.id.button0122);
        button0123=findViewById(R.id.button0123);
        button122=findViewById(R.id.button122);
        button123=findViewById(R.id.button123);
        button00122=findViewById(R.id.button00122);
        button124=findViewById(R.id.button124);
        button125=findViewById(R.id.button125);
        button126=findViewById(R.id.button126);
        button127=findViewById(R.id.button127);
        button128=findViewById(R.id.button128);
    }
}