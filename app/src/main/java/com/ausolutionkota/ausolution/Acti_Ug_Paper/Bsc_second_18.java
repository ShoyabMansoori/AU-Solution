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

import com.ausolutionkota.ausolution.PDF_B_Sc.C148;
import com.ausolutionkota.ausolution.PDF_B_Sc.C149;
import com.ausolutionkota.ausolution.PDF_B_Sc.C150;
import com.ausolutionkota.ausolution.PDF_B_Sc.C151;
import com.ausolutionkota.ausolution.PDF_B_Sc.C46;
import com.ausolutionkota.ausolution.PDF_B_Sc.C47;
import com.ausolutionkota.ausolution.PDF_B_Sc.C48;
import com.ausolutionkota.ausolution.PDF_B_Sc.C49;
import com.ausolutionkota.ausolution.PDF_B_Sc.C50;
import com.ausolutionkota.ausolution.PDF_B_Sc.C51;
import com.ausolutionkota.ausolution.PDF_B_Sc.C52;
import com.ausolutionkota.ausolution.PDF_B_Sc.C53;
import com.ausolutionkota.ausolution.PDF_B_Sc.C54;
import com.ausolutionkota.ausolution.PDF_B_Sc.C55;
import com.ausolutionkota.ausolution.PDF_B_Sc.C56;
import com.ausolutionkota.ausolution.PDF_B_Sc.C57;
import com.ausolutionkota.ausolution.PDF_B_Sc.C58;
import com.ausolutionkota.ausolution.PDF_B_Sc.C59;
import com.ausolutionkota.ausolution.PDF_B_Sc.C60;
import com.ausolutionkota.ausolution.R;

public class Bsc_second_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button014,button015,button0014,button0015,button00014,button00015,button114,button115,button1014,button1015,button10014,button10015,button100014,button100015,button1100014;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc_second_18);
        Check_enternet();
        sho();
        // physics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C46.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C47.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C48.class));
            }
        });
        // Mathematics
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C49.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C50.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C51.class));
            }
        });
        // Chemistry
        button0014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C52.class));
            }
        });
        button0015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C53.class));
            }
        });
        button00014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C54.class));
            }
        });
        // Zoology
        button00015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C55.class));
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C56.class));
            }
        });
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C57.class));
            }
        });
        // Botany
        button1014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C58.class));
            }
        });
        button1015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C59.class));
            }
        });
        button10014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C60.class));
            }
        });
        // compulsory
        // hindi
        button10015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C148.class));
            }
        });
        // english
        button100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C149.class));
            }
        });
        // evs
        button100015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C150.class));
            }
        });
        // computer
        button1100014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bsc_second_18.this, C151.class));
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