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

import com.ausolutionkota.ausolution.PDF_B_Sc.C144;
import com.ausolutionkota.ausolution.PDF_B_Sc.C145;
import com.ausolutionkota.ausolution.PDF_B_Sc.C146;
import com.ausolutionkota.ausolution.PDF_B_Sc.C147;
import com.ausolutionkota.ausolution.PDF_B_Sc.C31;
import com.ausolutionkota.ausolution.PDF_B_Sc.C32;
import com.ausolutionkota.ausolution.PDF_B_Sc.C33;
import com.ausolutionkota.ausolution.PDF_B_Sc.C34;
import com.ausolutionkota.ausolution.PDF_B_Sc.C35;
import com.ausolutionkota.ausolution.PDF_B_Sc.C36;
import com.ausolutionkota.ausolution.PDF_B_Sc.C37;
import com.ausolutionkota.ausolution.PDF_B_Sc.C38;
import com.ausolutionkota.ausolution.PDF_B_Sc.C39;
import com.ausolutionkota.ausolution.PDF_B_Sc.C40;
import com.ausolutionkota.ausolution.PDF_B_Sc.C41;
import com.ausolutionkota.ausolution.PDF_B_Sc.C42;
import com.ausolutionkota.ausolution.PDF_B_Sc.C43;
import com.ausolutionkota.ausolution.PDF_B_Sc.C44;
import com.ausolutionkota.ausolution.PDF_B_Sc.C45;
import com.ausolutionkota.ausolution.R;

public class Bsc_first_20 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button014,button015,button0014,button0015,button00014,button00015,button114,button115,button1014,button1015,button10014,button10015,button100014,button100015,button1100014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_first_20);
        Check_enternet();
        sho();
        // physics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C31.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C32.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C33.class));
            }
        });
        // Mathematics
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C34.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C35.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C36.class));
            }
        });
        // Chemistry
        button0014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C37.class));
            }
        });
        button0015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C38.class));
            }
        });
        button00014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C39.class));
            }
        });
        // Zoology
        button00015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C40.class));
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C41.class));
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C42.class));
            }
        });
        // Botany
        button1014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C43.class));
            }
        });
        button1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C44.class));
            }
        });
        button10014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C45.class));
            }
        });
        // compulsory
        // hindi
        button10015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C144.class));
            }
        });
        // english
        button100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C145.class));
            }
        });
        // evs
        button100015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C146.class));
            }
        });
        // computer
        button1100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_first_20.this, C147.class));
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