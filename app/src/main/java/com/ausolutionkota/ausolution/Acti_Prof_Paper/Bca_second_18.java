package com.ausolutionkota.ausolution.Acti_Prof_Paper;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ausolutionkota.ausolution.PDF_Activites.P1;
import com.ausolutionkota.ausolution.PDF_Activites.P2;
import com.ausolutionkota.ausolution.PDF_Activites.P3;
import com.ausolutionkota.ausolution.PDF_Activites.P36;
import com.ausolutionkota.ausolution.PDF_Activites.P4;
import com.ausolutionkota.ausolution.PDF_Activites.P5;
import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class Bca_second_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button014,button015;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca_second_18);
        Check_enternet();
        sho();
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bca_second_18.this, P1.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bca_second_18.this, P2.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bca_second_18.this, P3.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bca_second_18.this, P4.class));
            }
        });
        button014.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bca_second_18.this, P5.class));
            }
        });
        button015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bca_second_18.this, P36.class));
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