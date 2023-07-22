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

import com.ausolutionkota.ausolution.PDF_BA.E169;
import com.ausolutionkota.ausolution.PDF_BA.E170;
import com.ausolutionkota.ausolution.PDF_BA.E171;
import com.ausolutionkota.ausolution.PDF_BA.E172;
import com.ausolutionkota.ausolution.PDF_BA.E173;
import com.ausolutionkota.ausolution.PDF_BA.E174;
import com.ausolutionkota.ausolution.PDF_BA.E175;
import com.ausolutionkota.ausolution.PDF_BA.E176;
import com.ausolutionkota.ausolution.PDF_BA.E177;
import com.ausolutionkota.ausolution.PDF_BA.E178;
import com.ausolutionkota.ausolution.PDF_BA.E179;
import com.ausolutionkota.ausolution.PDF_BA.E180;
import com.ausolutionkota.ausolution.PDF_BA.E181;
import com.ausolutionkota.ausolution.PDF_BA.E182;
import com.ausolutionkota.ausolution.PDF_BA.E183;
import com.ausolutionkota.ausolution.PDF_BA.E184;
import com.ausolutionkota.ausolution.PDF_BA.E185;
import com.ausolutionkota.ausolution.PDF_BA.E186;
import com.ausolutionkota.ausolution.PDF_BA.E187;
import com.ausolutionkota.ausolution.PDF_BA.E188;
import com.ausolutionkota.ausolution.PDF_BA.E189;
import com.ausolutionkota.ausolution.PDF_BA.E190;
import com.ausolutionkota.ausolution.PDF_BA.E191;
import com.ausolutionkota.ausolution.PDF_BA.E192;
import com.ausolutionkota.ausolution.PDF_BA.E245;
import com.ausolutionkota.ausolution.PDF_BA.E246;
import com.ausolutionkota.ausolution.PDF_BA.E247;
import com.ausolutionkota.ausolution.PDF_BA.E248;
import com.ausolutionkota.ausolution.R;

public class Ba_third_19 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_third_19);
        Check_enternet();
        sho();
        //Economics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E169.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E170.class));
            }
        });
        // Home Science
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E171.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E172.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E173.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E174.class));
            }
        });
        // Polytical sccience
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E175.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E176.class));
            }
        });
        // Sociology
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E177.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E178.class));
            }
        });
        // English Literature
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E179.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E180.class));
            }
        });
        // Hindi Literature
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E181.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E182.class));
            }
        });
        // Drawing
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E183.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E184.class));
            }
        });
        // Sanskrit
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E185.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E186.class));
            }
        });
        // History
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E187.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E188.class));
            }
        });
        // Public administration
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E189.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E190.class));
            }
        });
        // Urdu
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E191.class));
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E192.class));
            }
        });
        // Compulsory
        // Hindi
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E245.class));
            }
        });
        // English
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E246.class));
            }
        });
        // EVS
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E247.class));
            }
        });
        // Computer
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_third_19.this, E248.class));
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