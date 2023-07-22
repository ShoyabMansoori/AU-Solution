package com.ausolutionkota.ausolution.Navigation;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.ausolutionkota.ausolution.Models.Viewpageadepter;
import com.ausolutionkota.ausolution.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import eu.dkaratzas.android.inapp.update.Constants;
import eu.dkaratzas.android.inapp.update.InAppUpdateManager;
import eu.dkaratzas.android.inapp.update.InAppUpdateStatus;

public class Manage_navigation_activity extends AppCompatActivity implements InAppUpdateManager.InAppUpdateHandler {
    private FirebaseFirestore firebaseFirestore;
    private FirebaseAuth firebaseAuth;
    private TabLayout tablayout;
    private ViewPager myviewpager;
    private long backPassedTime;
    private Window window;
    InAppUpdateManager inAppUpdateManager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_navigation_activity);
        sho();
        // App ki time bar vali patti ko colour dene ke liye.
        if(Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }

        setupViewPager(myviewpager);
        tablayout.setupWithViewPager(myviewpager);
        // Tab layout par icon set ke liye.
        tablayout.getTabAt(0).setIcon(R.drawable.ic_paper);
        tablayout.getTabAt(1).setIcon(R.drawable.ic_sallabus);
        tablayout.getTabAt(2).setIcon(R.drawable.ic_more);

        inAppUpdateManager = InAppUpdateManager.Builder(this,101)
                .resumeUpdates(true)
                .mode(Constants.UpdateMode.FLEXIBLE)
                .snackBarAction("An update has just been downloaded")
                .snackBarAction("RESTART")
                .handler(this);
        inAppUpdateManager.checkForAppUpdate();
    }
    private void sho() {
        tablayout=findViewById(R.id.tablayout);
        myviewpager=findViewById(R.id.myviewpager);
        firebaseFirestore=FirebaseFirestore.getInstance();
        firebaseAuth=FirebaseAuth.getInstance();
    }
    private void setupViewPager(ViewPager viewPager){
        Viewpageadepter viewpageradapter = new Viewpageadepter(getSupportFragmentManager());
        viewpageradapter.addFragment(new Papers_frgs(),"Papers");
        viewpageradapter.addFragment(new Syllabus_frgs(),"Syllabus");
        viewpageradapter.addFragment(new More_frgs(),"For You");
        viewPager.setAdapter(viewpageradapter);
    }
    /** back jane par 2sec me double tep */
    @Override
    public void onBackPressed() {
        if (backPassedTime+2000>System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(this, "Press back Again Exit", Toast.LENGTH_SHORT).show();
        }
        backPassedTime=System.currentTimeMillis();
    }
    /** Playstor Update pop up */
    @Override
    public void onInAppUpdateError(int code, Throwable error) {
    }
    @Override
    public void onInAppUpdateStatus(InAppUpdateStatus status) {
        if (status.isDownloaded()){
            View view=getWindow().getDecorView().findViewById(android.R.id.content);
            Snackbar snackbar=Snackbar.make(view,"An update has just been downloaded",Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction("", new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    inAppUpdateManager.completeUpdate();
                }
            });snackbar.show();
        }
    }
}