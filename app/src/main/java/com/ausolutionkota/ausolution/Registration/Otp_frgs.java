package com.ausolutionkota.ausolution.Registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.ausolutionkota.ausolution.Navigation.Manage_navigation_activity;
import com.ausolutionkota.ausolution.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Otp_frgs extends Fragment {

    public Otp_frgs(String email_2, String phone_2, String password_2, String name,String course) {
        this.email_2=email_2;
        this.phone_2=phone_2;
        this.password_2=password_2;
        this.name=name;
        this.course=course;
    }
    private EditText editText4;
    private Button button2,button3;
    private ProgressBar progressBar2;
    private String email_2,phone_2,password_2,name,course;
    private Timer timer;
    private int count=30;
    private String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mcallback;
    private FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otp_frgs, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firebaseAuth=FirebaseAuth.getInstance();
        init(view);
        sendotp();

        timer=new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (count ==0){
                            button2.setText("Resend");
                            button2.setEnabled(true);
                            button2.setAlpha(1f);
                        } else {
                            button2.setText("Resend in "+count);
                            count--;
                        }
                    }
                });
            }
        },0,1000);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resendotp();
                button2.setEnabled(false);
                button2.setAlpha(0.5f);
                count=60;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText4.getText()==null || editText4.getText().toString().isEmpty()){
                    return;
                }
                editText4.setError(null);
                String code=editText4.getText().toString();
                PhoneAuthCredential credential=PhoneAuthProvider.getCredential(mVerificationId,code);
                signInWithPhoneAuthCredential(credential);
                progressBar2.setVisibility(View.VISIBLE);
            }
        });
    }
    private void init(View view) {
        editText4=view.findViewById(R.id.editText4);
        button2=view.findViewById(R.id.button2);
        button3=view.findViewById(R.id.button3);
        progressBar2=view.findViewById(R.id.progressBar2);
    }
    private void sendotp() {
        mcallback=new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential credential) {
            }
            @Override
            public void onVerificationFailed(FirebaseException e) {
                if (e instanceof FirebaseAuthInvalidCredentialsException) {
                    editText4.setError(e.getMessage());
                } else if (e instanceof FirebaseTooManyRequestsException) {
                    editText4.setError(e.getMessage());
                }progressBar2.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onCodeSent(@NonNull String verificationId,
                                   @NonNull PhoneAuthProvider.ForceResendingToken token) {
                mVerificationId = verificationId;
                mResendToken = token;
            }
        };
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91"+phone_2,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                getActivity(),               // Activity (for callback binding)
                mcallback);
    }
    private void resendotp() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                "+91"+phone_2,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                getActivity(),               // Activity (for callback binding)
                mcallback,mResendToken);
    }
    private void signInWithPhoneAuthCredential(final PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = task.getResult().getUser();
                            AuthCredential credential= EmailAuthProvider.getCredential(email_2,password_2);
                            user.linkWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        FirebaseFirestore firebaseFirestore=FirebaseFirestore.getInstance();
                                        Map<String,Object> map=new HashMap<>();
                                        map.put("email",email_2);
                                        map.put("phone",phone_2);
                                        map.put("name",name);
                                        map.put("password",password_2);
                                        map.put("course",course);
                                        firebaseFirestore.collection("users").document(firebaseAuth.getCurrentUser().getUid()).set(map)
                                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                                    @Override
                                                    public void onComplete(@NonNull Task<Void> task) {
                                                        if(task.isSuccessful()) {
                                                            Intent oa=new Intent(getActivity(), Manage_navigation_activity.class);
                                                            startActivity(oa);
                                                            getActivity().finish();
                                                        }else {
                                                            String error=task.getException().getMessage();
                                                            Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
                                                            progressBar2.setVisibility(View.INVISIBLE);
                                                        }
                                                    }
                                                });
                                    } else{
                                        String error=task.getException().getMessage();
                                        Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
                                        progressBar2.setVisibility(View.INVISIBLE);
                                    }
                                }
                            });
                        } else {

                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                editText4.setError("invalid OTP");
                            }progressBar2.setVisibility(View.INVISIBLE);
                        }
                    }
                });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }
}