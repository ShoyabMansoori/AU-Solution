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

import com.ausolutionkota.ausolution.PDF_B_Sc.C106;
import com.ausolutionkota.ausolution.PDF_B_Sc.C107;
import com.ausolutionkota.ausolution.PDF_B_Sc.C108;
import com.ausolutionkota.ausolution.PDF_B_Sc.C109;
import com.ausolutionkota.ausolution.PDF_B_Sc.C110;
import com.ausolutionkota.ausolution.PDF_B_Sc.C111;
import com.ausolutionkota.ausolution.PDF_B_Sc.C112;
import com.ausolutionkota.ausolution.PDF_B_Sc.C113;
import com.ausolutionkota.ausolution.PDF_B_Sc.C114;
import com.ausolutionkota.ausolution.PDF_B_Sc.C115;
import com.ausolutionkota.ausolution.PDF_B_Sc.C116;
import com.ausolutionkota.ausolution.PDF_B_Sc.C117;
import com.ausolutionkota.ausolution.PDF_B_Sc.C118;
import com.ausolutionkota.ausolution.PDF_B_Sc.C119;
import com.ausolutionkota.ausolution.PDF_B_Sc.C120;
import com.ausolutionkota.ausolution.PDF_B_Sc.C164;
import com.ausolutionkota.ausolution.PDF_B_Sc.C165;
import com.ausolutionkota.ausolution.PDF_B_Sc.C166;
import com.ausolutionkota.ausolution.PDF_B_Sc.C167;
import com.ausolutionkota.ausolution.R;

public class Bsc_third_19 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button014,button015,button0014,button0015,button00014,button00015,button114,button115,button1014,button1015,button10014,button10015,button100014,button100015,button1100014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_third_19);
        Check_enternet();
        sho();
        // physics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C106.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C107.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C108.class));
            }
        });
        // Mathematics
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C109.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C110.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C111.class));
            }
        });
        // Chemistry
        button0014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C112.class));
            }
        });
        button0015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C113.class));
            }
        });
        button00014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C114.class));
            }
        });
        button00015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C115.class));
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C116.class));
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C117.class));
            }
        });
        // Botany
        button1014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C118.class));
            }
        });
        button1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C119.class));
            }
        });
        button10014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C120.class));
            }
        });
        // compulsory
        // hindi
        button10015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C164.class));
            }
        });
        // english
        button100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C165.class));
            }
        });
        // evs
        button100015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C166.class));
            }
        });
        // computer
        button1100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_third_19.this, C167.class));
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