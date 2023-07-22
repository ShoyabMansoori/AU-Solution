package com.ausolutionkota.ausolution.Slider;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.ausolutionkota.ausolution.R;
import com.ausolutionkota.ausolution.Registration.Manage_activ;

import androidx.appcompat.app.AppCompatActivity;

public class Fourth extends AppCompatActivity {
    private Button button104,button105;
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        button104=findViewById(R.id.button104);
        button105=findViewById(R.id.button105);
        if(Build.VERSION.SDK_INT>=21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.logo_colour));
        }
        // previous
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fourth.this, Third.class));
                overridePendingTransition(R.anim.left_side_in,R.anim.right_side_out);
                finish();
            }
        });
        // Go button
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Fourth.this, Manage_activ.class));
                overridePendingTransition(R.anim.left_side_out,R.anim.right_side_in);
                finish();
            }
        });
    }
}