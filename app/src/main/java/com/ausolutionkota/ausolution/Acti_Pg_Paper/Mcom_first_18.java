package com.ausolutionkota.ausolution.Acti_Pg_Paper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.PDF_BA.E1;
import com.ausolutionkota.ausolution.PDF_BA.E10;
import com.ausolutionkota.ausolution.PDF_BA.E11;
import com.ausolutionkota.ausolution.PDF_BA.E12;
import com.ausolutionkota.ausolution.PDF_BA.E13;
import com.ausolutionkota.ausolution.PDF_BA.E14;
import com.ausolutionkota.ausolution.PDF_BA.E2;
import com.ausolutionkota.ausolution.PDF_BA.E3;
import com.ausolutionkota.ausolution.PDF_BA.E4;
import com.ausolutionkota.ausolution.PDF_BA.E5;
import com.ausolutionkota.ausolution.PDF_BA.E6;
import com.ausolutionkota.ausolution.PDF_BA.E7;
import com.ausolutionkota.ausolution.PDF_BA.E8;
import com.ausolutionkota.ausolution.PDF_BA.E9;
import com.ausolutionkota.ausolution.PDF_B_Com.G145;
import com.ausolutionkota.ausolution.PDF_B_Com.G146;
import com.ausolutionkota.ausolution.PDF_B_Com.G147;
import com.ausolutionkota.ausolution.PDF_B_Com.G148;
import com.ausolutionkota.ausolution.PDF_B_Com.G149;
import com.ausolutionkota.ausolution.PDF_B_Com.G150;
import com.ausolutionkota.ausolution.PDF_B_Com.G151;
import com.ausolutionkota.ausolution.PDF_B_Com.G152;
import com.ausolutionkota.ausolution.PDF_B_Com.G153;
import com.ausolutionkota.ausolution.PDF_B_Com.G154;
import com.ausolutionkota.ausolution.PDF_B_Com.G155;
import com.ausolutionkota.ausolution.PDF_B_Com.G156;
import com.ausolutionkota.ausolution.PDF_B_Com.G157;
import com.ausolutionkota.ausolution.PDF_B_Com.G158;
import com.ausolutionkota.ausolution.R;

public class Mcom_first_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcom_first_18);
        sho();
        // Accountancy and Business Statistics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G146.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G147.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G148.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G149.class));
            }
        });
        // Business Administration
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G150.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G151.class));
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G152.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G153.class));
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G154.class));
            }
        });
        // Economic Administration and Financial Management
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G155.class));
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G156.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G157.class));
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Mcom_first_18.this, G158.class));
            }
        });
    }
    private void sho() {
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
    }
}