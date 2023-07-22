package com.ausolutionkota.ausolution.Sallabus_courses;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;

import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_first_18;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_first_19;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_first_20;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_second19;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_second_18;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_second_20;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_third_18;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_third_19;
import com.ausolutionkota.ausolution.Acti_Prof_Paper.Bba_third_20;
import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class Bba extends AppCompatActivity {
    // papers on application.
    private Button First_2020,First_2019,First_2018,Second_2020,Second_2019,Second_2018,Third_2020,Third_2019,Third_2018;
    private Button First_web,Second_web,Third_web; // papers on website.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba);
        init();
        Click_intents();
        animation();
        First_web.setMovementMethod(LinkMovementMethod.getInstance()); //Link in String.
        Second_web.setMovementMethod(LinkMovementMethod.getInstance()); //Link in String.
        Third_web.setMovementMethod(LinkMovementMethod.getInstance()); //Link in String.
    }
    public void animation() {
        overridePendingTransition(R.anim.left_side_in,R.anim.right_side_out);
    }
    private void Click_intents() {
        First_2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First_20();
                startActivity(new Intent(Bba.this, Bba_first_20.class));
                animation();
            }
        });
        First_2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First_19();
                startActivity(new Intent(Bba.this, Bba_first_19.class));
                animation();
            }
        });
        First_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                First_18();
                startActivity(new Intent(Bba.this, Bba_first_18.class));
                animation();
            }
        });
        Second_2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Second_20();
                startActivity(new Intent(Bba.this, Bba_second_20.class));
                animation();
            }
        });
        Second_2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Second_19();
                startActivity(new Intent(Bba.this, Bba_second19.class));
                animation();
            }
        });
        Second_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Second_18();
                startActivity(new Intent(Bba.this, Bba_second_18.class));
                animation();
            }
        });
        Third_2020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Third_20();
                startActivity(new Intent(Bba.this, Bba_third_20.class));
                animation();
            }
        });
        Third_2019.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Third_19();
                startActivity(new Intent(Bba.this, Bba_third_19.class));
                animation();
            }
        });
        Third_2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Third_18();
                startActivity(new Intent(Bba.this, Bba_third_18.class));
                animation();
            }
        });

    }
    private void First_20() {
        First_2020.setBackgroundResource(R.drawable.a2);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void First_19() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a2);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void First_18() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a2);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Second_20() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a2);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Second_19() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a2);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Second_18() {

        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a2);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Third_20() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a2);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Third_19() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a2);
        Third_2018.setBackgroundResource(R.drawable.a1);
    }
    private void Third_18() {
        First_2020.setBackgroundResource(R.drawable.a1);
        First_2019.setBackgroundResource(R.drawable.a1);
        First_2018.setBackgroundResource(R.drawable.a1);
        Second_2020.setBackgroundResource(R.drawable.a1);
        Second_2019.setBackgroundResource(R.drawable.a1);
        Second_2018.setBackgroundResource(R.drawable.a1);
        Third_2020.setBackgroundResource(R.drawable.a1);
        Third_2019.setBackgroundResource(R.drawable.a1);
        Third_2018.setBackgroundResource(R.drawable.a2);
    }

    private void init() {
        First_2020=findViewById(R.id.First_2020);
        First_2019=findViewById(R.id.First_2019);
        First_2018=findViewById(R.id.First_2018);
        Second_2020=findViewById(R.id.Second_2020);
        Second_2019=findViewById(R.id.Second_2019);
        Second_2018=findViewById(R.id.Second_2018);
        Third_2020=findViewById(R.id.Third_2020);
        Third_2019=findViewById(R.id.Third_2019);
        Third_2018=findViewById(R.id.Third_2018);
        // 2016,2017 web papers.
        First_web=findViewById(R.id.First_web);
        Second_web=findViewById(R.id.Second_web);
        Third_web=findViewById(R.id.Third_web);
    }
}