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

import com.ausolutionkota.ausolution.PDF_BA.E1;
import com.ausolutionkota.ausolution.PDF_BA.E10;
import com.ausolutionkota.ausolution.PDF_BA.E11;
import com.ausolutionkota.ausolution.PDF_BA.E12;
import com.ausolutionkota.ausolution.PDF_BA.E13;
import com.ausolutionkota.ausolution.PDF_BA.E14;
import com.ausolutionkota.ausolution.PDF_BA.E15;
import com.ausolutionkota.ausolution.PDF_BA.E16;
import com.ausolutionkota.ausolution.PDF_BA.E17;
import com.ausolutionkota.ausolution.PDF_BA.E18;
import com.ausolutionkota.ausolution.PDF_BA.E19;
import com.ausolutionkota.ausolution.PDF_BA.E2;
import com.ausolutionkota.ausolution.PDF_BA.E20;
import com.ausolutionkota.ausolution.PDF_BA.E21;
import com.ausolutionkota.ausolution.PDF_BA.E217;
import com.ausolutionkota.ausolution.PDF_BA.E218;
import com.ausolutionkota.ausolution.PDF_BA.E219;
import com.ausolutionkota.ausolution.PDF_BA.E22;
import com.ausolutionkota.ausolution.PDF_BA.E220;
import com.ausolutionkota.ausolution.PDF_BA.E23;
import com.ausolutionkota.ausolution.PDF_BA.E24;
import com.ausolutionkota.ausolution.PDF_BA.E3;
import com.ausolutionkota.ausolution.PDF_BA.E4;
import com.ausolutionkota.ausolution.PDF_BA.E5;
import com.ausolutionkota.ausolution.PDF_BA.E6;
import com.ausolutionkota.ausolution.PDF_BA.E7;
import com.ausolutionkota.ausolution.PDF_BA.E8;
import com.ausolutionkota.ausolution.PDF_BA.E9;
import com.ausolutionkota.ausolution.R;

public class Ba_first_18 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_first_18);
        Check_enternet();
        sho();
        //Economics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E1.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E2.class));
            }
        });
        // Home Science
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E3.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E4.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E5.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E6.class));
            }
        });
        // Political sccience
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E7.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E8.class));
            }
        });
        // Sociology ug/ba/ba1/2018/sociology/p1
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E9.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E10.class));
            }
        });
        // English Literature ug/ba/ba1/2018/english litt/p1
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E11.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E12.class));
            }
        });
        // Hindi Literature ug/ba/ba1/2018/hindi litt/p1
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E13.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E14.class));
            }
        });
        // Drawing ug/ba/ba1/2018/drowing/p1
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E15.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E16.class));
            }
        });
        // Sanskrit ug/ba/ba1/2018/sanskrit/p1
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E17.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E18.class));
            }
        });
        // History ug/ba/ba1/2018/history/p1
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E19.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E20.class));
            }
        });
        // Public administration ug/ba/ba1/2018/public administration /p1
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E21.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E22.class));
            }
        });
        // Urdu ug/ba/ba1/2018/urdu/p1
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E23.class));
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E24.class));
            }
        });
        // Compulsory
        // Hindi   ug/compulsory ba/ba1/2018/hindi compulsory
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E217.class));
            }
        });
        // English ug/compulsory ba/ba1/2018/english compulsory
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E218.class));
            }
        });
        // EVS ug/compulsory ba/ba1/2018/environmental study
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E219.class));
            }
        });
        // Computer ug/compulsory ba/ba1/2018/elementary computer application
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_18.this, E220.class));
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
        button32=findViewById(R.id.button32);
        button33=findViewById(R.id.button33);
        button34=findViewById(R.id.button34);
        button35=findViewById(R.id.button35);
        button36=findViewById(R.id.button36);
        button37=findViewById(R.id.button37);
        button38=findViewById(R.id.button38);
        button39=findViewById(R.id.button39);
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