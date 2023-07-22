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

import com.ausolutionkota.ausolution.PDF_B_Com.G1;
import com.ausolutionkota.ausolution.PDF_B_Com.G2;
import com.ausolutionkota.ausolution.PDF_B_Com.G3;
import com.ausolutionkota.ausolution.PDF_B_Com.G4;
import com.ausolutionkota.ausolution.PDF_B_Com.G5;
import com.ausolutionkota.ausolution.PDF_B_Com.G55;
import com.ausolutionkota.ausolution.PDF_B_Com.G56;
import com.ausolutionkota.ausolution.PDF_B_Com.G57;
import com.ausolutionkota.ausolution.PDF_B_Com.G58;
import com.ausolutionkota.ausolution.PDF_B_Com.G6;
import com.ausolutionkota.ausolution.R;

public class Bcom_first_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcom_first_18);
        Check_enternet();
        sho();
        // Accontancy and business statics   ug/bcom/bcom1/2018/Accountancy and Business Statistics/p1
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G1.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G2.class));
            }
        });
        // Bussiness administration    ug/bcom/bcom1/2018/Business Administration/p1
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G3.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G4.class));
            }
        });
        // Economic administrator and finance managment ug/bcom/bcom1/2018/Economic Administration and Financial Management/p1
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G5.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G6.class));
            }
        });
        // Compulsory
        // English ug/compulsory bsc_bcom/bsc_bcom 1/2018/english compulsory
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G55.class));
            }
        });
        // Hindi ug/compulsory bsc_bcom/bsc_bcom 1/2018/hindi compulsory
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G56.class));
            }
        });
        // EVS ug/compulsory bsc_bcom/bsc_bcom 1/2018/environmental study
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G57.class));
            }
        });
        // Computer ug/compulsory bsc_bcom/bsc_bcom 1/2018/elementary computer application
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_first_18.this, G58.class));
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