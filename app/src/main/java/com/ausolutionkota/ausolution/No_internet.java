package com.ausolutionkota.ausolution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.Registration.Manage_activ;

import androidx.appcompat.app.AppCompatActivity;

public class No_internet extends AppCompatActivity {
    private Button button49;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_internet);

        button49=findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent internet=new Intent(No_internet.this, Manage_activ.class);
                startActivity(internet);
                finish();
            }
        });
    }
}