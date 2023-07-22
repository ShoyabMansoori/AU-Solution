package com.ausolutionkota.ausolution.Registration;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ausolutionkota.ausolution.Navigation.Manage_navigation_activity;
import com.ausolutionkota.ausolution.No_internet;
import com.ausolutionkota.ausolution.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Login_frgs extends Fragment {

    public Login_frgs() {
        // Required empty public constructor
    }
    private Button login_1;
    private TextView create_1,forget_password;
    private EditText phone_1,password_1;
    private ProgressBar progressBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_frgs, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        Check_enternet(); // Check Internet Connaction Function.
        login_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone_1.setError(null);
                password_1.setError(null);
                if (phone_1.getText().toString().isEmpty()) {
                    phone_1.setError("Enter mobile number ");
                    return;
                }
                if (password_1.getText().toString().isEmpty()) {
                    password_1.setError("Enter password");
                    return;
                }
                if (phone_1.getText().toString().matches("\\d{10}")) {
                    progressBar.setVisibility(View.VISIBLE);
                    FirebaseFirestore.getInstance().collection("users").whereEqualTo("phone",phone_1.getText().toString())
                            .get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                List<DocumentSnapshot> document=task.getResult().getDocuments();
                                if (document.isEmpty()) {
                                    phone_1.setError("Mobile number not found");
                                    progressBar.setVisibility(View.INVISIBLE);
                                    return;
                                }else {
                                    String email=document.get(0).get("email").toString();
                                    Login_mathod(email);
                                }
                            }else {
                                String error=task.getException().getMessage();
                                Toast.makeText(getContext(),error, Toast.LENGTH_SHORT).show();
                                progressBar.setVisibility(View.INVISIBLE);
                            }
                        }
                    });
                    return;
                } else{
                    phone_1.setError("please Enter a valid mobile number");
                }
            }

        });
        create_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Manage_activ)getActivity()).setFregrament(new Create_frgs());
            }
        });
        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Manage_activ)getActivity()).setFregrament(new Forget_frgs());
            }
        });
    }
    private void init(View view) {
        login_1=view.findViewById(R.id.login_1);
        create_1=view.findViewById(R.id.create_1);
        forget_password=view.findViewById(R.id.forget_password);
        progressBar=view.findViewById(R.id.progressBar);
        phone_1=view.findViewById(R.id.phone_1);
        password_1=view.findViewById(R.id.password_1);
    }
    // Check Internet Connaction.
    private void Check_enternet(){
        ConnectivityManager manager=(ConnectivityManager)getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=manager.getActiveNetworkInfo();
        if(null!=networkInfo){
            if(networkInfo.getType()==ConnectivityManager.TYPE_WIFI){
                Toast.makeText(getContext(), ".", Toast.LENGTH_SHORT).show();
            }
        }else {
            Intent oa=new Intent(getContext(), No_internet.class);
            startActivity(oa);
            getActivity().finish();
        }
    }
    private void Login_mathod(String email) {
        FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
        firebaseAuth.signInWithEmailAndPassword(email,password_1.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Intent oa=new Intent(getContext(), Manage_navigation_activity.class);
                    startActivity(oa);
                    getActivity().finish();
                }else {
                    String error=task.getException().getMessage();
                    Toast.makeText(getContext(),error, Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}