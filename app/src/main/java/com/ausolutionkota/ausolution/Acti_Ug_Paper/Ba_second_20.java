package com.ausolutionkota.ausolution.Acti_Ug_Paper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ausolutionkota.ausolution.PDF_BA.E121;
import com.ausolutionkota.ausolution.PDF_BA.E122;
import com.ausolutionkota.ausolution.PDF_BA.E123;
import com.ausolutionkota.ausolution.PDF_BA.E124;
import com.ausolutionkota.ausolution.PDF_BA.E125;
import com.ausolutionkota.ausolution.PDF_BA.E126;
import com.ausolutionkota.ausolution.PDF_BA.E127;
import com.ausolutionkota.ausolution.PDF_BA.E128;
import com.ausolutionkota.ausolution.PDF_BA.E129;
import com.ausolutionkota.ausolution.PDF_BA.E130;
import com.ausolutionkota.ausolution.PDF_BA.E131;
import com.ausolutionkota.ausolution.PDF_BA.E132;
import com.ausolutionkota.ausolution.PDF_BA.E133;
import com.ausolutionkota.ausolution.PDF_BA.E134;
import com.ausolutionkota.ausolution.PDF_BA.E135;
import com.ausolutionkota.ausolution.PDF_BA.E136;
import com.ausolutionkota.ausolution.PDF_BA.E137;
import com.ausolutionkota.ausolution.PDF_BA.E138;
import com.ausolutionkota.ausolution.PDF_BA.E139;
import com.ausolutionkota.ausolution.PDF_BA.E140;
import com.ausolutionkota.ausolution.PDF_BA.E141;
import com.ausolutionkota.ausolution.PDF_BA.E142;
import com.ausolutionkota.ausolution.PDF_BA.E143;
import com.ausolutionkota.ausolution.PDF_BA.E144;
import com.ausolutionkota.ausolution.PDF_BA.E237;
import com.ausolutionkota.ausolution.PDF_BA.E238;
import com.ausolutionkota.ausolution.PDF_BA.E239;
import com.ausolutionkota.ausolution.PDF_BA.E240;
import com.ausolutionkota.ausolution.R;

public class Ba_second_20 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_second_20);
        Check_enternet();
        sho();
        //Economics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E121.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E122.class));
            }
        });
        // Home Science
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E123.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E124.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E125.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E126.class));
            }
        });
        // Polytical sccience
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E127.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E128.class));
            }
        });
        // Sociology
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E129.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E130.class));
            }
        });
        // English Literature
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E131.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E132.class));
            }
        });
        // Hindi Literature
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E133.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E134.class));
            }
        });
        // Drawing
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E135.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E136.class));
            }
        });
        // Sanskrit
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E137.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E138.class));
            }
        });
        // History
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E139.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E140.class));
            }
        });
        // Public administration
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E141.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E142.class));
            }
        });
        // Urdu
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E143.class));
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E144.class));
            }
        });
        // Compulsory
        // Hindi
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E237.class));
            }
        });
        // English
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E238.class));
            }
        });
        // EVS
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E239.class));
            }
        });
        // Computer
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_20.this, E240.class));
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
        button34=findViewById(R.id.button34);
        button35=findViewById(R.id.button35);
        button36=findViewById(R.id.button36);
        button37=findViewById(R.id.button37);
        button38=findViewById(R.id.button38);
        button39=findViewById(R.id.button39);
    }
    private void Check_enternet(){
        ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=manager.getActiveNetworkInfo();
        if(null!=networkInfo){
            if(networkInfo.getType()==ConnectivityManager.TYPE_WIFI){
                // Toast.makeText(getApplicationContext(), "WIFI Enabled", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
        }
    }
}