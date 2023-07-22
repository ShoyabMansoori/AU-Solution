package com.ausolutionkota.ausolution.Navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ausolutionkota.ausolution.More.About_Us;
import com.ausolutionkota.ausolution.More.Connect_with_Us;
import com.ausolutionkota.ausolution.More.Opinion;
import com.ausolutionkota.ausolution.More.Profile;
import com.ausolutionkota.ausolution.More.Term_Condition;
import com.ausolutionkota.ausolution.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class More_frgs extends Fragment {
    private Button button04,button4,button6,button7,button8,button9,button06,button60;
    private TextView textView027;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_more_frgs, container, false);
    }
    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sho(view);
        button60.setMovementMethod(LinkMovementMethod.getInstance()); //link Button
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Profile.class));
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), About_Us.class));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Connect_with_Us.class));
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Term_Condition.class));
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oak=new Intent(Intent.ACTION_DIAL);
                oak.setData(Uri.parse("tel:9460478667"));
                Toast.makeText(getContext(), "Calling..", Toast.LENGTH_SHORT).show();
                startActivity(oak);
            }
        });
        // Share Code.
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String share=textView027.getText().toString();
                Intent sends=new Intent();
                sends.setAction(Intent.ACTION_SEND);
                sends.setType("text/plain");
                sends.putExtra(Intent.EXTRA_TEXT,share);
                startActivity(sends);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Opinion.class));
            }
        });
    }
    private void sho(View view) {
        button04=view.findViewById(R.id.button04);
        button4=view.findViewById(R.id.button4);
        button6=view.findViewById(R.id.button6);
        button60=view.findViewById(R.id.button60);
        button7=view.findViewById(R.id.button7);
        button8=view.findViewById(R.id.button8);
        button9=view.findViewById(R.id.button9);
        button06=view.findViewById(R.id.button06);
        textView027=view.findViewById(R.id.textView027);
    }
}