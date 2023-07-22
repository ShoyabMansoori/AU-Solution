package com.ausolutionkota.ausolution.Sallabus_courses;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.Acti_Pg_Paper.Mcom_first_18;
import com.ausolutionkota.ausolution.Acti_Pg_Paper.Mcom_first_19;
import com.ausolutionkota.ausolution.Acti_Pg_Paper.Mcom_first_20;
import com.ausolutionkota.ausolution.Acti_Pg_Paper.Mcom_second_18;
import com.ausolutionkota.ausolution.Acti_Pg_Paper.Mcom_second_19;
import com.ausolutionkota.ausolution.Acti_Pg_Paper.Mcom_second_20;
import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class Mcom extends AppCompatActivity {
    // papers on application.
    private Button Previous_2020,Previous_2019,Previous_2018,Final_2020,Final_2019,Final_2018;
    private Button Previous_web,Final_web; // papers on website.
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcom);
          init();
          Click_intents();
          animation();
          Previous_web.setMovementMethod(LinkMovementMethod.getInstance()); //Link in String.
          Final_web.setMovementMethod(LinkMovementMethod.getInstance()); //Link in String.
      }
    public void animation() {
        overridePendingTransition(R.anim.left_side_in,R.anim.right_side_out);
    }
    private void Click_intents() {
        Previous_2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Previous_20();
                startActivity(new Intent(Mcom.this, Mcom_first_20.class));
                animation();
            }
        });
        Previous_2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Previous_19();
                startActivity(new Intent(Mcom.this, Mcom_first_19.class));
                animation();
            }
        });
        Previous_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Previous_18();
                startActivity(new Intent(Mcom.this, Mcom_first_18.class));
                animation();
            }
        });
        Final_2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Final_20();
                startActivity(new Intent(Mcom.this, Mcom_second_20.class));
                animation();
            }
        });
        Final_2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Final_19();
                startActivity(new Intent(Mcom.this, Mcom_second_19.class));
                animation();
            }
        });
        Final_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Final_18();
                startActivity(new Intent(Mcom.this, Mcom_second_18.class));
                animation();
            }
        });
    }
    private void Previous_20() {
        Previous_2020.setBackgroundResource(R.drawable.a2);
        Previous_2019.setBackgroundResource(R.drawable.a1);
        Previous_2018.setBackgroundResource(R.drawable.a1);
        Final_2020.setBackgroundResource(R.drawable.a1);
        Final_2019.setBackgroundResource(R.drawable.a1);
        Final_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Previous_19() {
        Previous_2020.setBackgroundResource(R.drawable.a1);
        Previous_2019.setBackgroundResource(R.drawable.a2);
        Previous_2018.setBackgroundResource(R.drawable.a1);
        Final_2020.setBackgroundResource(R.drawable.a1);
        Final_2019.setBackgroundResource(R.drawable.a1);
        Final_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Previous_18() {
        Previous_2020.setBackgroundResource(R.drawable.a1);
        Previous_2019.setBackgroundResource(R.drawable.a1);
        Previous_2018.setBackgroundResource(R.drawable.a2);
        Final_2020.setBackgroundResource(R.drawable.a1);
        Final_2019.setBackgroundResource(R.drawable.a1);
        Final_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Final_20() {
        Previous_2020.setBackgroundResource(R.drawable.a1);
        Previous_2019.setBackgroundResource(R.drawable.a1);
        Previous_2018.setBackgroundResource(R.drawable.a1);
        Final_2020.setBackgroundResource(R.drawable.a2);
        Final_2019.setBackgroundResource(R.drawable.a1);
        Final_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Final_19() {
        Previous_2020.setBackgroundResource(R.drawable.a1);
        Previous_2019.setBackgroundResource(R.drawable.a1);
        Previous_2018.setBackgroundResource(R.drawable.a1);
        Final_2020.setBackgroundResource(R.drawable.a1);
        Final_2019.setBackgroundResource(R.drawable.a2);
        Final_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Final_18() {

        Previous_2020.setBackgroundResource(R.drawable.a1);
        Previous_2019.setBackgroundResource(R.drawable.a1);
        Previous_2018.setBackgroundResource(R.drawable.a1);
        Final_2020.setBackgroundResource(R.drawable.a1);
        Final_2019.setBackgroundResource(R.drawable.a1);
        Final_2018.setBackgroundResource(R.drawable.a2);
    }

    private void init() {
        Previous_2020=findViewById(R.id.Previous_2020);
        Previous_2019=findViewById(R.id.Previous_2019);
        Previous_2018=findViewById(R.id.Previous_2018);
        Final_2020=findViewById(R.id.Final_2020);
        Final_2019=findViewById(R.id.Final_2019);
        Final_2018=findViewById(R.id.Final_2018);
        // 2016,2017 web papers.
        Previous_web=findViewById(R.id.Previous_web);
        Final_web=findViewById(R.id.Final_web);
    }
}