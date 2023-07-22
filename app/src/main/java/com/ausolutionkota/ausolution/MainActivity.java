package com.ausolutionkota.ausolution;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.ausolutionkota.ausolution.Navigation.Manage_navigation_activity;
import com.ausolutionkota.ausolution.Slider.First;
import com.google.firebase.auth.FirebaseAuth;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imageView.startAnimation(rotate);
        // time vali patti ka colour chang ke liye
        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.white));
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (FirebaseAuth.getInstance().getCurrentUser() !=null) {
                    Intent is=new Intent(MainActivity.this, Manage_navigation_activity.class);
                    startActivity(is);
                    finish();
                    return;
                }
                Intent is=new Intent(MainActivity.this, First.class);
                startActivity(is);
                finish();
            }
        },4000);
    }
}