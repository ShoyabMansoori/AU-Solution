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

import com.ausolutionkota.ausolution.PDF_BA.E229;
import com.ausolutionkota.ausolution.PDF_BA.E230;
import com.ausolutionkota.ausolution.PDF_BA.E231;
import com.ausolutionkota.ausolution.PDF_BA.E232;
import com.ausolutionkota.ausolution.PDF_BA.E73;
import com.ausolutionkota.ausolution.PDF_BA.E74;
import com.ausolutionkota.ausolution.PDF_BA.E75;
import com.ausolutionkota.ausolution.PDF_BA.E76;
import com.ausolutionkota.ausolution.PDF_BA.E77;
import com.ausolutionkota.ausolution.PDF_BA.E78;
import com.ausolutionkota.ausolution.PDF_BA.E79;
import com.ausolutionkota.ausolution.PDF_BA.E80;
import com.ausolutionkota.ausolution.PDF_BA.E81;
import com.ausolutionkota.ausolution.PDF_BA.E82;
import com.ausolutionkota.ausolution.PDF_BA.E83;
import com.ausolutionkota.ausolution.PDF_BA.E84;
import com.ausolutionkota.ausolution.PDF_BA.E85;
import com.ausolutionkota.ausolution.PDF_BA.E86;
import com.ausolutionkota.ausolution.PDF_BA.E87;
import com.ausolutionkota.ausolution.PDF_BA.E88;
import com.ausolutionkota.ausolution.PDF_BA.E89;
import com.ausolutionkota.ausolution.PDF_BA.E90;
import com.ausolutionkota.ausolution.PDF_BA.E91;
import com.ausolutionkota.ausolution.PDF_BA.E92;
import com.ausolutionkota.ausolution.PDF_BA.E93;
import com.ausolutionkota.ausolution.PDF_BA.E94;
import com.ausolutionkota.ausolution.PDF_BA.E95;
import com.ausolutionkota.ausolution.PDF_BA.E96;
import com.ausolutionkota.ausolution.R;

public class Ba_second_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_second_18);
        Check_enternet();
        sho();
        //Economics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E73.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E74.class));
            }
        });
        // Home Science
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E75.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E76.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E77.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E78.class));
            }
        });
        // Polytical sccience
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E79.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E80.class));
            }
        });
        // Sociology
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E81.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E82.class));
            }
        });
        // English Literature
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E83.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E84.class));
            }
        });
        // Hindi Literature
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E85.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E86.class));
            }
        });
        // Drawing
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E87.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E88.class));
            }
        });
        // Sanskrit
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E89.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E90.class));
            }
        });
        // History
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E91.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E92.class));
            }
        });
        // Public administration
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E93.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E94.class));
            }
        });
        // Urdu
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E95.class));
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E96.class));
            }
        });
        // Compulsory
        // Hindi
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E229.class));
            }
        });
        // English
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E230.class));
            }
        });
        // EVS
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E231.class));
            }
        });
        // Computer
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_18.this, E232.class));
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