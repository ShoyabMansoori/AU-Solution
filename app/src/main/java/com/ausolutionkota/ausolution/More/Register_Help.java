package com.ausolutionkota.ausolution.More;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ausolutionkota.ausolution.R;

public class Register_Help extends AppCompatActivity {
     private Button button41,button42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__help);
        button41=findViewById(R.id.button41);
        button42=findViewById(R.id.button42);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register_Help.this,Opinion.class));
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oak = new Intent(Intent.ACTION_DIAL);
                oak.setData(Uri.parse("tel:9460478667"));
                Toast.makeText(Register_Help.this, "Calling..", Toast.LENGTH_SHORT).show();
                startActivity(oak);
            }
        });
    }
}