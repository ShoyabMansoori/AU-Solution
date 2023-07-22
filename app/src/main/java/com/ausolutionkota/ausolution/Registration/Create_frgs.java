package com.ausolutionkota.ausolution.Registration;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ausolutionkota.ausolution.More.Register_Help;
import com.ausolutionkota.ausolution.No_internet;
import com.ausolutionkota.ausolution.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.SignInMethodQueryResult;

import java.util.regex.Pattern;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Create_frgs extends Fragment {

    public Create_frgs() {
    }
    private EditText editText, editText1,editText2, editText3, editText4, editText5;
    private ProgressBar progressBar;
    private Button button;
    private TextView textView4,textView5,textView37,textView36;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private FirebaseAuth firebaseAuth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_frgs, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();
        Init(view);
        Check_enternet();
        textView5.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView5.setSelected(true);
        textView36.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView36.setSelected(true);

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Manage_activ) getActivity()).setFregrament(new Login_frgs());
            }
        });
        textView37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Register_Help.class));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = editText.getText().toString();
                String Course = editText1.getText().toString();
                String Email = editText2.getText().toString();
                String Phone = editText3.getText().toString();
                String Password = editText4.getText().toString();
                String Copassword = editText5.getText().toString();
                if (Name.isEmpty()) {
                    editText.setError("Enter Full Name");
                    return;
                }
                if (Course.isEmpty()) {
                    editText1.setError("Enter Your Course");
                    return;
                }
                if (Email.isEmpty()) {
                    editText2.setError("Enter Email");
                    return;
                }
                if (!VALID_EMAIL_ADDRESS_REGEX.matcher(editText2.getText().toString()).find()) {
                    editText2.setError("Incorrect Email");
                    return;
                }
                if (Phone.isEmpty()) {
                    editText3.setError("Enter mobile number");
                    return;
                }
                if (Phone.length() < 10) {
                    editText3.setError("Short Length");
                    return;
                }
                if (Phone.length() > 10) {
                    editText3.setError("Length to Long");
                    return;
                }
                if (Password.isEmpty()) {
                    editText4.setError("Enter Password");
                    return;
                }
                if (Password.length() < 6) {
                    editText4.setError("minimum length 6");
                    return;
                }
                if (!Password.equals(Copassword)) {
                    editText5.setError("Check Password");
                    return;
                }
                createacco();
            }
        });
    }
    private void Init(View view) {
        editText = view.findViewById(R.id.editText);
        editText1 = view.findViewById(R.id.editText1);
        editText2 = view.findViewById(R.id.editText2);
        editText3 = view.findViewById(R.id.editText3);
        editText4 = view.findViewById(R.id.editText4);
        editText5 = view.findViewById(R.id.editText5);
        textView4 = view.findViewById(R.id.textView4);
        textView37 = view.findViewById(R.id.textView37);
        textView36 = view.findViewById(R.id.textView36);
        textView5 = view.findViewById(R.id.textView5);
        progressBar = view.findViewById(R.id.progressBar);
        button = view.findViewById(R.id.button);
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
    private void createacco() {
        progressBar.setVisibility(View.VISIBLE);
        firebaseAuth.fetchSignInMethodsForEmail(editText2.getText().toString()).addOnCompleteListener(new OnCompleteListener<SignInMethodQueryResult>() {
            @Override
            public void onComplete(@NonNull Task<SignInMethodQueryResult> task) {
                if (task.isSuccessful()) {
                    if (task.getResult().getSignInMethods().isEmpty()) {
                        ((Manage_activ) getActivity()).setFregrament(new
                                Otp_frgs(editText2.getText().toString(), editText3.getText().toString(), editText4.getText().toString(), editText.getText().toString(),editText1.getText().toString()));
                    } else {
                        editText2.setError("Email Alweready Exest");
                        progressBar.setVisibility(View.INVISIBLE);
                    }
                } else {
                    String error = task.getException().getMessage();
                    Toast.makeText(getContext(), error, Toast.LENGTH_SHORT).show();
                }
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }
}