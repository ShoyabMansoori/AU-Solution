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

import com.ausolutionkota.ausolution.PDF_B_Sc.C100;
import com.ausolutionkota.ausolution.PDF_B_Sc.C101;
import com.ausolutionkota.ausolution.PDF_B_Sc.C102;
import com.ausolutionkota.ausolution.PDF_B_Sc.C103;
import com.ausolutionkota.ausolution.PDF_B_Sc.C104;
import com.ausolutionkota.ausolution.PDF_B_Sc.C105;
import com.ausolutionkota.ausolution.PDF_B_Sc.C160;
import com.ausolutionkota.ausolution.PDF_B_Sc.C161;
import com.ausolutionkota.ausolution.PDF_B_Sc.C162;
import com.ausolutionkota.ausolution.PDF_B_Sc.C163;
import com.ausolutionkota.ausolution.PDF_B_Sc.C91;
import com.ausolutionkota.ausolution.PDF_B_Sc.C92;
import com.ausolutionkota.ausolution.PDF_B_Sc.C93;
import com.ausolutionkota.ausolution.PDF_B_Sc.C94;
import com.ausolutionkota.ausolution.PDF_B_Sc.C95;
import com.ausolutionkota.ausolution.PDF_B_Sc.C96;
import com.ausolutionkota.ausolution.PDF_B_Sc.C97;
import com.ausolutionkota.ausolution.PDF_B_Sc.C98;
import com.ausolutionkota.ausolution.PDF_B_Sc.C99;
import com.ausolutionkota.ausolution.R;

public class Bsc_third_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button014,button015,button0014,button0015,button00014,button00015,button114,button115,button1014,button1015,button10014,button10015,button100014,button100015,button1100014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_third_18);
        Check_enternet();
        sho();
        // physics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C91.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C92.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C93.class));
            }
        });
        // Mathematics
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C94.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C95.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C96.class));
            }
        });
        // Chemistry
        button0014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C97.class));
            }
        });
        button0015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C98.class));
            }
        });
        button00014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C99.class));
            }
        });
        // Zoology
        button00015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C100.class));
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C101.class));
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C102.class));
            }
        });
        // Botany
        button1014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C103.class));
            }
        });
        button1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C104.class));
            }
        });
        button10014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C105.class));
            }
        });
        // compulsory
        // hindi
        button10015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C160.class));
            }
        });
        // english
        button100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C161.class));
            }
        });
        // evs
        button100015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C162.class));
            }
        });
        // computer
        button1100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_18.this, C163.class));
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