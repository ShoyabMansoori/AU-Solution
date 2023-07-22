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
import com.ausolutionkota.ausolution.PDF_BA.E15;
import com.ausolutionkota.ausolution.PDF_BA.E16;
import com.ausolutionkota.ausolution.PDF_BA.E17;
import com.ausolutionkota.ausolution.PDF_BA.E18;
import com.ausolutionkota.ausolution.PDF_BA.E19;
import com.ausolutionkota.ausolution.PDF_BA.E2;
import com.ausolutionkota.ausolution.PDF_BA.E20;
import com.ausolutionkota.ausolution.PDF_BA.E21;
import com.ausolutionkota.ausolution.PDF_BA.E22;
import com.ausolutionkota.ausolution.PDF_BA.E3;
import com.ausolutionkota.ausolution.PDF_BA.E4;
import com.ausolutionkota.ausolution.PDF_BA.E5;
import com.ausolutionkota.ausolution.PDF_BA.E6;
import com.ausolutionkota.ausolution.PDF_BA.E7;
import com.ausolutionkota.ausolution.PDF_BA.E8;
import com.ausolutionkota.ausolution.PDF_BA.E9;
import com.ausolutionkota.ausolution.PDF_MA.H10;
import com.ausolutionkota.ausolution.PDF_MA.H11;
import com.ausolutionkota.ausolution.PDF_MA.H12;
import com.ausolutionkota.ausolution.PDF_MA.H13;
import com.ausolutionkota.ausolution.PDF_MA.H14;
import com.ausolutionkota.ausolution.PDF_MA.H15;
import com.ausolutionkota.ausolution.PDF_MA.H16;
import com.ausolutionkota.ausolution.PDF_MA.H17;
import com.ausolutionkota.ausolution.PDF_MA.H18;
import com.ausolutionkota.ausolution.PDF_MA.H19;
import com.ausolutionkota.ausolution.PDF_MA.H20;
import com.ausolutionkota.ausolution.PDF_MA.H21;
import com.ausolutionkota.ausolution.PDF_MA.H22;
import com.ausolutionkota.ausolution.PDF_MA.H23;
import com.ausolutionkota.ausolution.PDF_MA.H24;
import com.ausolutionkota.ausolution.PDF_MA.H25;
import com.ausolutionkota.ausolution.PDF_MA.H26;
import com.ausolutionkota.ausolution.PDF_MA.H27;
import com.ausolutionkota.ausolution.PDF_MA.H6;
import com.ausolutionkota.ausolution.PDF_MA.H7;
import com.ausolutionkota.ausolution.PDF_MA.H8;
import com.ausolutionkota.ausolution.PDF_MA.H9;
import com.ausolutionkota.ausolution.R;

public class Msc_second_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msc_second_18);
        sho();
        // Chemistry
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H6.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H7.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H8.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H9.class));
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H10.class));
            }
        });
        // Mathematics
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H11.class));
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H12.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H13.class));
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H14.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H15.class));
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H16.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H17.class));
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H18.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H19.class));
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H20.class));
            }
        });
        // Physics
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H21.class));
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H22.class));
            }
        });
        // Zoology
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H23.class));
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H24.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H25.class));
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H26.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Msc_second_18.this, H27.class));
            }
        });
    }
    private void sho() {
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);
        button14=findViewById(R.id.button14);
        button15=findViewById(R.id.button15);
        button16=findViewById(R.id.button16);
        button17=findViewById(R.id.button17);
        button18=findViewById(R.id.button18);
        button19=findViewById(R.id.button19);
        button20=findViewById(R.id.button20);
        button21=findViewById(R.id.button21);
        button22=findViewById(R.id.button22);
        button23=findViewById(R.id.button23);
        button24=findViewById(R.id.button24);
        button25=findViewById(R.id.button25);
        button26=findViewById(R.id.button26);
        button27=findViewById(R.id.button27);
        button28=findViewById(R.id.button28);
        button29=findViewById(R.id.button29);
        button30=findViewById(R.id.button30);
        button31=findViewById(R.id.button31);
        button32=findViewById(R.id.button32);
        button33=findViewById(R.id.button33);
    }
}