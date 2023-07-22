package com.ausolutionkota.ausolution.Registration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ausolutionkota.ausolution.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Forget_frgs extends Fragment {

    public Forget_frgs() {
        // Required empty public constructor
    }
    private EditText phone_4;
    private Button reset_4;
    private ProgressBar progressBar;
    private FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forget_frgs, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        firebaseAuth= FirebaseAuth.getInstance();
        reset_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_4.setError(null);
                progressBar.setVisibility(View.INVISIBLE);
                reset_4.setEnabled(false);
                firebaseAuth.sendPasswordResetEmail(phone_4.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()) {
                                    progressBar.setVisibility(View.VISIBLE);
                                    Toast.makeText(getContext(), "password reset email send sucessfully.", Toast.LENGTH_SHORT).show();
                                    getActivity().onBackPressed();
                                }else{
                                    String errot=task.getException().getMessage();
                                    phone_4.setError(errot);
                                    progressBar.setVisibility(View.INVISIBLE);
                                }reset_4.setEnabled(true);
                            }
                        });
            }
        });
    }
    private void init(View view) {
        phone_4=view.findViewById(R.id.phone_4);
        reset_4=view.findViewById(R.id.reset_4);
        progressBar=view.findViewById(R.id.progressBar);
    }
}