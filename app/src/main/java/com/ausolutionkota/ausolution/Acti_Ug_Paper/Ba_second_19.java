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

import com.ausolutionkota.ausolution.PDF_BA.E100;
import com.ausolutionkota.ausolution.PDF_BA.E101;
import com.ausolutionkota.ausolution.PDF_BA.E102;
import com.ausolutionkota.ausolution.PDF_BA.E103;
import com.ausolutionkota.ausolution.PDF_BA.E104;
import com.ausolutionkota.ausolution.PDF_BA.E105;
import com.ausolutionkota.ausolution.PDF_BA.E106;
import com.ausolutionkota.ausolution.PDF_BA.E107;
import com.ausolutionkota.ausolution.PDF_BA.E108;
import com.ausolutionkota.ausolution.PDF_BA.E109;
import com.ausolutionkota.ausolution.PDF_BA.E110;
import com.ausolutionkota.ausolution.PDF_BA.E111;
import com.ausolutionkota.ausolution.PDF_BA.E112;
import com.ausolutionkota.ausolution.PDF_BA.E113;
import com.ausolutionkota.ausolution.PDF_BA.E114;
import com.ausolutionkota.ausolution.PDF_BA.E115;
import com.ausolutionkota.ausolution.PDF_BA.E116;
import com.ausolutionkota.ausolution.PDF_BA.E117;
import com.ausolutionkota.ausolution.PDF_BA.E118;
import com.ausolutionkota.ausolution.PDF_BA.E119;
import com.ausolutionkota.ausolution.PDF_BA.E120;
import com.ausolutionkota.ausolution.PDF_BA.E233;
import com.ausolutionkota.ausolution.PDF_BA.E234;
import com.ausolutionkota.ausolution.PDF_BA.E235;
import com.ausolutionkota.ausolution.PDF_BA.E236;
import com.ausolutionkota.ausolution.PDF_BA.E97;
import com.ausolutionkota.ausolution.PDF_BA.E98;
import com.ausolutionkota.ausolution.PDF_BA.E99;
import com.ausolutionkota.ausolution.R;

public class Ba_second_19 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_second_19);
        Check_enternet();
        sho();
        //Economics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E97.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E98.class));
            }
        });
        // Home Science
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E99.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E100.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E101.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E102.class));
            }
        });
        // Polytical sccience
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E103.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E104.class));
            }
        });
        // Sociology
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E105.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E106.class));
            }
        });
        // English Literature
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E107.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E108.class));
            }
        });
        // Hindi Literature
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E109.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E110.class));
            }
        });
        // Drawing
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E111.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E112.class));
            }
        });
        // Sanskrit
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E113.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E114.class));
            }
        });
        // History
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E115.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E116.class));
            }
        });
        // Public administration
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E117.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E118.class));
            }
        });
        // Urdu
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E119.class));
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E120.class));
            }
        });
        // Compulsory
        // Hindi
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E233.class));
            }
        });
        // English
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E234.class));
            }
        });
        // EVS
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E235.class));
            }
        });
        // Computer
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_second_19.this, E236.class));
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