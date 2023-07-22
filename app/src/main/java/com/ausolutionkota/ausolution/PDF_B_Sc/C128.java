package com.ausolutionkota.ausolution.PDF_B_Sc;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.agrawalsuneet.dotsloader.contracts.DotsLoaderBaseView;
import com.ausolutionkota.ausolution.R;
import com.ausolutionkota.ausolution.Sallabus_courses.Bsc;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class C128 extends AppCompatActivity {
    private TextView text1;
    private PDFView pdfview;
    private DotsLoaderBaseView circularDotsLoader;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference sho = database.getReference("ug/bsc/bsc3/2020/chemistry/p2");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_all_in_one);
        Check_enternet();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        pdfview=findViewById(R.id.pdfview);
        text1 = findViewById(R.id.text1);
        sho.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                text1.setText(value);
                Toast.makeText(C128.this, "Loading....", Toast.LENGTH_SHORT).show();
                String url = text1.getText().toString();
                new C128.Retrive().execute(url);
                circularDotsLoader=findViewById(R.id.circularDotsLoader);
                circularDotsLoader.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(C128.this, "Failed to load", Toast.LENGTH_SHORT).show();
            }
        });
    }
    class Retrive extends AsyncTask<String, Void, InputStream> {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL uRl = new URL(strings[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection) uRl.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            } catch (IOException e) {
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfview.fromStream(inputStream).load();
        }
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
            startActivity(new Intent(C128.this, Bsc.class));
        }
    }
}