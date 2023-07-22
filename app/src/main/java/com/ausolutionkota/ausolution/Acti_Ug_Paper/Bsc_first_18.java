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

import com.ausolutionkota.ausolution.PDF_B_Sc.C1;
import com.ausolutionkota.ausolution.PDF_B_Sc.C10;
import com.ausolutionkota.ausolution.PDF_B_Sc.C11;
import com.ausolutionkota.ausolution.PDF_B_Sc.C12;
import com.ausolutionkota.ausolution.PDF_B_Sc.C13;
import com.ausolutionkota.ausolution.PDF_B_Sc.C136;
import com.ausolutionkota.ausolution.PDF_B_Sc.C137;
import com.ausolutionkota.ausolution.PDF_B_Sc.C138;
import com.ausolutionkota.ausolution.PDF_B_Sc.C139;
import com.ausolutionkota.ausolution.PDF_B_Sc.C14;
import com.ausolutionkota.ausolution.PDF_B_Sc.C15;
import com.ausolutionkota.ausolution.PDF_B_Sc.C2;
import com.ausolutionkota.ausolution.PDF_B_Sc.C3;
import com.ausolutionkota.ausolution.PDF_B_Sc.C4;
import com.ausolutionkota.ausolution.PDF_B_Sc.C5;
import com.ausolutionkota.ausolution.PDF_B_Sc.C6;
import com.ausolutionkota.ausolution.PDF_B_Sc.C7;
import com.ausolutionkota.ausolution.PDF_B_Sc.C8;
import com.ausolutionkota.ausolution.PDF_B_Sc.C9;
import com.ausolutionkota.ausolution.R;

public class Bsc_first_18 extends AppCompatActivity {
private Button button12,button13,button14,button15,button014,button015,button0014,button0015,button00014,button00015,button114,button115,button1014,button1015,button10014,button10015,button100014,button100015,button1100014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_first_18);
        Check_enternet();
        sho();
        // physics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C1.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C2.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C3.class));
            }
        });
        // Mathematics
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C4.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C5.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C6.class));
            }
        });
        // Chemistry
        button0014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C7.class));
            }
        });
        button0015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C8.class));
            }
        });
        button00014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C9.class));
            }
        });
        // Zoology
        button00015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C10.class));
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C11.class));
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C12.class));
            }
        });
        // Botany
        button1014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C13.class));
            }
        });
        button1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C14.class));
            }
        });
        button10014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C15.class));
            }
        });
        // compulsory
          // hindi
        button10015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C136.class));
            }
        });
        // english
        button100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C137.class));
            }
        });
        // evs
        button100015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C138.class));
            }
        });
        // computer
        button1100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_18.this, C139.class));
            }
        });
    }
    private void sho() {
        button12=findViewById(R.id.button12);
        button13=findViewById(R.id.button13);
        button14=findViewById(R.id.button14);
        button15=findViewById(R.id.button15);
        button014=findViewById(R.id.button014);
        button015=findViewById(R.id.button015);
        button0014=findViewById(R.id.button0014);
        button0015=findViewById(R.id.button0015);
        button00014=findViewById(R.id.button00014);
        button00015=findViewById(R.id.button00015);
        button114=findViewById(R.id.button114);
        button115=findViewById(R.id.button115);
        button1014=findViewById(R.id.button1014);
        button1015=findViewById(R.id.button1015);
        button10014=findViewById(R.id.button10014);
        button10015=findViewById(R.id.button10015);
        button100014=findViewById(R.id.button100014);
        button100015=findViewById(R.id.button100015);
        button1100014=findViewById(R.id.button1100014);
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