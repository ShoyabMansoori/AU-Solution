package com.ausolutionkota.ausolution.Registration;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Manage_activ extends AppCompatActivity {
    private FrameLayout Frem;
    private Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_activ);

        Frem=findViewById(R.id.Frem);
        setFregrament(new Login_frgs());

        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.logo_colour));
        }

    }
    public void setFregrament(Fragment fragment) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
        if (fragment instanceof Forget_frgs || fragment instanceof Otp_frgs) {
            fragmentTransaction.addToBackStack(null);
        }
        fragmentTransaction.replace(Frem.getId(),fragment);
        fragmentTransaction.commit();
    }
}