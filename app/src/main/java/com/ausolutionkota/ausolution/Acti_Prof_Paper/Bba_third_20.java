package com.ausolutionkota.ausolution.Acti_Prof_Paper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ausolutionkota.ausolution.PDF_BBA.A78;
import com.ausolutionkota.ausolution.PDF_BBA.A79;
import com.ausolutionkota.ausolution.PDF_BBA.A80;
import com.ausolutionkota.ausolution.PDF_BBA.A81;
import com.ausolutionkota.ausolution.PDF_BBA.A82;
import com.ausolutionkota.ausolution.PDF_BBA.A83;
import com.ausolutionkota.ausolution.PDF_BBA.A84;
import com.ausolutionkota.ausolution.PDF_BBA.A85;
import com.ausolutionkota.ausolution.PDF_BBA.A86;
import com.ausolutionkota.ausolution.PDF_BBA.A87;
import com.ausolutionkota.ausolution.PDF_BBA.A96;
import com.ausolutionkota.ausolution.R;

public class Bba_third_20 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button014,button015,button0014,button0015,button00014,button00015,button114;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba_third_20);
        Check_enternet();
        sho();
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A78.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A79.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A80.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A81.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A82.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A83.class));
            }
        });
        button0014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A84.class));
            }
        });
        button0015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A85.class));
            }
        });
        button00014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A86.class));
            }
        });
        button00015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A87.class));
            }
        });
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bba_third_20.this, A96.class));
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
    }
    private void Check_enternet(){
        ConnectivityManager manager=(ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=manager.getActiveNetworkInfo();
        if(null!=networkInfo){
            if(networkInfo.getType()==ConnectivityManager.TYPE_WIFI){
              //  Toast.makeText(getApplicationContext(), "WIFI Enabled", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
        }
    }
}