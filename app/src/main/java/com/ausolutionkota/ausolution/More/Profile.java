package com.ausolutionkota.ausolution.More;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ausolutionkota.ausolution.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    private TextView textView33,textView34,textView35;
    private Button button51,button52;
    private FirebaseFirestore firestore;
    private FirebaseAuth firebaseAuth;
    private String userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Init();
        getdata_from_storage();
        Click_Intent();
    }

    private void Click_Intent() {
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(Profile.this, Update_EmailAddress.class));
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile.this, Update_Password.class));
            }
        });
    }

    private void Init() {
        firestore=FirebaseFirestore.getInstance();
        firebaseAuth=FirebaseAuth.getInstance();
        textView33=findViewById(R.id.textView33);
        textView34=findViewById(R.id.textView34);
        textView35=findViewById(R.id.textView35);
        button51=findViewById(R.id.button51);
        button52=findViewById(R.id.button52);
    }
    private void getdata_from_storage() {
        userid=firebaseAuth.getCurrentUser().getUid();
        firestore.collection("users").document(userid).get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            String Name=task.getResult().getString("name");
                            String Phone=task.getResult().getString("phone");
                            String Email=task.getResult().getString("email");
                            textView33.setText("Hello, "+Name);
                            textView34.setText("+91 "+Phone);
                            textView35.setText(Email);
                        }else{
                            String error=task.getException().getMessage();
                            Toast.makeText(Profile.this,error, Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}