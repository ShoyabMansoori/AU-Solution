package com.ausolutionkota.ausolution.Acti_Pg_Paper;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ausolutionkota.ausolution.PDF_B_Com.G100;
import com.ausolutionkota.ausolution.PDF_B_Com.G101;
import com.ausolutionkota.ausolution.PDF_B_Com.G102;
import com.ausolutionkota.ausolution.PDF_B_Com.G103;
import com.ausolutionkota.ausolution.PDF_B_Com.G104;
import com.ausolutionkota.ausolution.PDF_B_Com.G105;
import com.ausolutionkota.ausolution.PDF_B_Com.G106;
import com.ausolutionkota.ausolution.PDF_B_Com.G107;
import com.ausolutionkota.ausolution.PDF_B_Com.G108;
import com.ausolutionkota.ausolution.PDF_B_Com.G109;
import com.ausolutionkota.ausolution.PDF_B_Com.G91;
import com.ausolutionkota.ausolution.PDF_B_Com.G92;
import com.ausolutionkota.ausolution.PDF_B_Com.G93;
import com.ausolutionkota.ausolution.PDF_B_Com.G94;
import com.ausolutionkota.ausolution.PDF_B_Com.G95;
import com.ausolutionkota.ausolution.PDF_B_Com.G96;
import com.ausolutionkota.ausolution.PDF_B_Com.G97;
import com.ausolutionkota.ausolution.PDF_B_Com.G98;
import com.ausolutionkota.ausolution.PDF_B_Com.G99;
import com.ausolutionkota.ausolution.R;
import com.ausolutionkota.ausolution.Sallabus_courses.Ma;

import androidx.appcompat.app.AppCompatActivity;

public class Ma_first_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_first_18);
        Check_enternet();
        sho();
        // Economic
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G91.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G92.class));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G93.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G94.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G95.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G96.class));
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G97.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G98.class));
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G99.class));
            }
        });
        // history
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G100.class));
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G101.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G102.class));
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G103.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G104.class));
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G105.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G106.class));
            }
        });
        // Public administration
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G107.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G108.class));
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ma_first_18.this, G109.class));
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
        button22=findViewById(R.id.button22);
        button23=findViewById(R.id.button23);
        button24=findViewById(R.id.button24);
        button25=findViewById(R.id.button25);
        button26=findViewById(R.id.button26);
        button27=findViewById(R.id.button27);
        button28=findViewById(R.id.button28);
        button29=findViewById(R.id.button29);
        button30=findViewById(R.id.button30);
        button31=findViewById(R.id.button31);
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
            startActivity(new Intent(Ma_first_18.this, Ma.class));
            finish();
        }
    }
}