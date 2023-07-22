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

import com.ausolutionkota.ausolution.PDF_B_Com.G19;
import com.ausolutionkota.ausolution.PDF_B_Com.G20;
import com.ausolutionkota.ausolution.PDF_B_Com.G21;
import com.ausolutionkota.ausolution.PDF_B_Com.G22;
import com.ausolutionkota.ausolution.PDF_B_Com.G23;
import com.ausolutionkota.ausolution.PDF_B_Com.G24;
import com.ausolutionkota.ausolution.PDF_B_Com.G67;
import com.ausolutionkota.ausolution.PDF_B_Com.G68;
import com.ausolutionkota.ausolution.PDF_B_Com.G69;
import com.ausolutionkota.ausolution.PDF_B_Com.G70;
import com.ausolutionkota.ausolution.R;

public class Bcom_second_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcom_second_18);
        Check_enternet();
        sho();
        // Accountancy and business statistics    ug/bcom/bcom2/2018/Accountancy and Business Statistics/p1
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G19.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G20.class));
            }
        });
        // Business Administration        ug/bcom/bcom2/2018/Business Administration/p1
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G21.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G22.class));
            }
        });
        // Economic Administration and Financal Managment    ug/bcom/bcom2/2018/Economic Administration and Financial Management/p1
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G23.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G24.class));
            }
        });
        // Compulsory
        // English
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G67.class));
            }
        });
        // Hindi
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G68.class));
            }
        });
        // EVS
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G69.class));
            }
        });
        // Computer
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_18.this, G70.class));
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