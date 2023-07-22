package com.ausolutionkota.ausolution.More;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ausolutionkota.ausolution.R;
import com.ausolutionkota.ausolution.Registration.Manage_activ;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Update_EmailAddress extends AppCompatActivity {
    private Window window;
    private EditText editTextTextEmailAddress2;
    private Button button57;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_email_address);
        if(Build.VERSION.SDK_INT>=21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }
        Init();

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                user.updateEmail(editTextTextEmailAddress2.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Update_EmailAddress.this, "Email update....", Toast.LENGTH_SHORT).show();
                                    firebaseAuth.signOut();
                                    startActivity(new Intent(Update_EmailAddress.this, Manage_activ.class));
                                    finish();
                                }
                                else{
                                    Toast.makeText(Update_EmailAddress.this, "Email Update Faild", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
    private void Init() {
        button57=findViewById(R.id.button57);
        editTextTextEmailAddress2=findViewById(R.id.editTextTextEmailAddress2);
    }
}