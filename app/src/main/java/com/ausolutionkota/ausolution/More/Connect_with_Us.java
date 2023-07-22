package com.ausolutionkota.ausolution.More;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;

import com.ausolutionkota.ausolution.R;

import androidx.appcompat.app.AppCompatActivity;

public class Connect_with_Us extends AppCompatActivity {
private TextView textView31,textView031,textView0031,textView00031;
//.              insta  facebook  website youtube
private Button button53,button54,button55,button56;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_with__us);
        sho();
    }
    private void sho() {
        button53=findViewById(R.id.button53);
        button54=findViewById(R.id.button54);
        button55=findViewById(R.id.button55);
        button56=findViewById(R.id.button56);
        // Link ke liye
        button56.setMovementMethod(LinkMovementMethod.getInstance());
        button55.setMovementMethod(LinkMovementMethod.getInstance());
        button53.setMovementMethod(LinkMovementMethod.getInstance());
        button54.setMovementMethod(LinkMovementMethod.getInstance());
    }
}