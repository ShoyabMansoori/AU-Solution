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

import com.ausolutionkota.ausolution.PDF_B_Com.G25;
import com.ausolutionkota.ausolution.PDF_B_Com.G26;
import com.ausolutionkota.ausolution.PDF_B_Com.G27;
import com.ausolutionkota.ausolution.PDF_B_Com.G28;
import com.ausolutionkota.ausolution.PDF_B_Com.G29;
import com.ausolutionkota.ausolution.PDF_B_Com.G30;
import com.ausolutionkota.ausolution.PDF_B_Com.G71;
import com.ausolutionkota.ausolution.PDF_B_Com.G72;
import com.ausolutionkota.ausolution.PDF_B_Com.G73;
import com.ausolutionkota.ausolution.PDF_B_Com.G74;
import com.ausolutionkota.ausolution.R;

public class Bcom_second_19 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcom_second_19);
        Check_enternet();
        sho();
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G25.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G26.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G27.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G28.class));
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G29.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G30.class));
            }
        });
        // Compulsory
        // English
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G71.class));
            }
        });
        // Hindi
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G72.class));
            }
        });
        // EVS
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G73.class));
            }
        });
        // Computer
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bcom_second_19.this, G74.class));
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