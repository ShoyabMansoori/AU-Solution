package com.ausolutionkota.ausolution;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ausolutionkota.ausolution.Registration.Manage_activ;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Check extends AppCompatActivity {
    private EditText editTextTextEmailAddress,editTextTextPassword;
    private Button button50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        editTextTextEmailAddress=findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword=findViewById(R.id.editTextTextPassword);
        button50=findViewById(R.id.button50);

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String OldPassword=editTextTextEmailAddress.getText().toString().trim();
                String NewPassword=editTextTextPassword.getText().toString().trim();
                if (TextUtils.isEmpty(OldPassword)){
                    editTextTextEmailAddress.setError("Enter OldPassword");
                    return;
                }
                if (TextUtils.isEmpty(NewPassword)){
                    editTextTextPassword.setError("Enter NewPassword");
                    return;
                }
                if (NewPassword.length()<6){
                    editTextTextPassword.setError("minimum length 6");
                    return;
                }
                updatePassword(OldPassword,NewPassword);
            }
        });
    }

    private void updatePassword(String oldPassword, String newPassword) {
        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
        FirebaseUser user=firebaseAuth.getCurrentUser();

        AuthCredential authCredential= EmailAuthProvider.getCredential(user.getEmail(), oldPassword);
        user.reauthenticate(authCredential)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                       user.updatePassword(newPassword)
                               .addOnSuccessListener(new OnSuccessListener<Void>() {
                                   @Override
                                   public void onSuccess(Void unused) {
                                       Toast.makeText(Check.this, "Password Update....", Toast.LENGTH_SHORT).show();
                                       startActivity(new Intent(Check.this, Manage_activ.class));
                                       finish();
                                   }
                               })
                               .addOnFailureListener(new OnFailureListener() {
                                   @Override
                                   public void onFailure(@NonNull Exception e) {
                                       Toast.makeText(Check.this, "Password Update Faild", Toast.LENGTH_SHORT).show();
                                   }
                               });
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Check.this, "Check old Password", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}