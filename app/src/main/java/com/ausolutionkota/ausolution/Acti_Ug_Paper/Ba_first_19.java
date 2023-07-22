package com.ausolutionkota.ausolution.Acti_Ug_Paper;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ausolutionkota.ausolution.PDF_BA.E221;
import com.ausolutionkota.ausolution.PDF_BA.E222;
import com.ausolutionkota.ausolution.PDF_BA.E223;
import com.ausolutionkota.ausolution.PDF_BA.E224;
import com.ausolutionkota.ausolution.PDF_BA.E25;
import com.ausolutionkota.ausolution.PDF_BA.E26;
import com.ausolutionkota.ausolution.PDF_BA.E27;
import com.ausolutionkota.ausolution.PDF_BA.E28;
import com.ausolutionkota.ausolution.PDF_BA.E29;
import com.ausolutionkota.ausolution.PDF_BA.E30;
import com.ausolutionkota.ausolution.PDF_BA.E31;
import com.ausolutionkota.ausolution.PDF_BA.E32;
import com.ausolutionkota.ausolution.PDF_BA.E33;
import com.ausolutionkota.ausolution.PDF_BA.E34;
import com.ausolutionkota.ausolution.PDF_BA.E35;
import com.ausolutionkota.ausolution.PDF_BA.E36;
import com.ausolutionkota.ausolution.PDF_BA.E37;
import com.ausolutionkota.ausolution.PDF_BA.E38;
import com.ausolutionkota.ausolution.PDF_BA.E39;
import com.ausolutionkota.ausolution.PDF_BA.E40;
import com.ausolutionkota.ausolution.PDF_BA.E41;
import com.ausolutionkota.ausolution.PDF_BA.E42;
import com.ausolutionkota.ausolution.PDF_BA.E43;
import com.ausolutionkota.ausolution.PDF_BA.E44;
import com.ausolutionkota.ausolution.PDF_BA.E45;
import com.ausolutionkota.ausolution.PDF_BA.E46;
import com.ausolutionkota.ausolution.PDF_BA.E47;
import com.ausolutionkota.ausolution.PDF_BA.E48;
import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class Ba_first_19 extends AppCompatActivity {
    private Button button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_first_19);
        Check_enternet();
        sho();
        //Economics
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E25.class));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E26.class));
            }
        });
        // Home Science
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E27.class));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E28.class));
            }
        });
        // Geography
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E29.class));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E30.class));
            }
        });
        // Polytical sccience
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E31.class));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E32.class));
            }
        });
        // Sociology
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E33.class));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E34.class));
            }
        });
        // English Literature
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E35.class));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E36.class));
            }
        });
        // Hindi Literature
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E37.class));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E38.class));
            }
        });
        // Drawing
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E39.class));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E40.class));
            }
        });
        // Sanskrit
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E41.class));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E42.class));
            }
        });
        // History
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E43.class));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E44.class));
            }
        });
        // Public administration
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E45.class));
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E46.class));
            }
        });
        // Urdu
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E47.class));
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E48.class));
            }
        });
        // Compulsory
        // Hindi
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E221.class));
            }
        });
        // English
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E222.class));
            }
        });
        // EVS
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E223.class));
            }
        });
        // Computer
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ba_first_19.this, E224.class));
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