package com.ausolutionkota.ausolution.UG_practical_files;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class BA_file_main extends AppCompatActivity {
private Button button122,button124;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_a_file_main);
        sho();
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BA_file_main.this,BA_practical_1.class));
            }
        });
        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BA_file_main.this,BA_practical_2.class));
            }
        });
    }
    private void sho() {
        button122=findViewById(R.id.button122);
        button124=findViewById(R.id.button124);
    }
}