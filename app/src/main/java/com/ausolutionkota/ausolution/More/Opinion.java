package com.ausolutionkota.ausolution.More;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ausolutionkota.ausolution.R;

public class Opinion extends AppCompatActivity {
    private EditText textView29,textView30,textView029;
    private Button button40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion);

        textView29=findViewById(R.id.textView29);
        textView029=findViewById(R.id.textView029);
        textView30=findViewById(R.id.textView30);
        button40=findViewById(R.id.button40);

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sho();
            }
        });
    }
    private void sho() {
        String to=textView029.getText().toString();
        String[] recipient=to.split(",");

        String subject=textView29.getText().toString();
        String message=textView30.getText().toString();

        Intent i=new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,recipient);
        i.putExtra(Intent.EXTRA_SUBJECT,subject);
        i.putExtra(Intent.EXTRA_TEXT,message);
        i.setType("message/refc822");
        startActivity(Intent.createChooser(i,"chose an email client"));
    }
}