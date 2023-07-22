package com.ausolutionkota.ausolution.Navigation;

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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ausolutionkota.ausolution.Check2;
import com.ausolutionkota.ausolution.Professional_practical_files.BBA_file_main;
import com.ausolutionkota.ausolution.Professional_practical_files.BCA_file_main;
import com.ausolutionkota.ausolution.R;
import com.ausolutionkota.ausolution.Sallabus_courses.Ba;
import com.ausolutionkota.ausolution.Sallabus_courses.Bba;
import com.ausolutionkota.ausolution.Sallabus_courses.Bca;
import com.ausolutionkota.ausolution.Sallabus_courses.Bcom;
import com.ausolutionkota.ausolution.Sallabus_courses.Bsc;
import com.ausolutionkota.ausolution.Sallabus_courses.Ma;
import com.ausolutionkota.ausolution.Sallabus_courses.Mcom;
import com.ausolutionkota.ausolution.Sallabus_courses.Msc;
import com.ausolutionkota.ausolution.UG_practical_files.BA_file_main;
import com.ausolutionkota.ausolution.UG_practical_files.BSC_file_main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Papers_frgs extends Fragment {
    private Button Paytm_cash;  // Paytem cash offer for users.
    private ImageView ba_papers,bsc_papers,bcom_papers,bba_papers,bca_papers,ma_papers,msc_papers,mcom_papers;
    private ImageView ba_file,bsc_file,bba_file,bca_file,ma_file,msc_file;
    private ImageView ba_notes,bsc_notes,bcom_notes,bba_notes,bca_notes,ma_notes,msc_notes,mcom_notes;
    private TextView note_line; // Only Kota University content is available in this application.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_papers_frgs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sho(view); // initialize.
        Check_enternet(); // Check Internet Connaction Function.
        IntentPapers();   // all papers pages click intent.
        IntentFiles();   // // all Files pages click intent.
       // IntentNotes();   // // all Files pages click intent.
        // Only Kota University content is available in this application.
        note_line.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        note_line.setSelected(true);
        // 10-10-21
        Paytm_cash.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // startActivity(new Intent(getContext(), Check.class));
                return false;
            }
        });
        // Paytem cash offer for users.
        Paytm_cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Check2.class));
            }
        });
    }
    private void IntentPapers() {
        // All Papers Intents.
        ba_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Ba.class));
            }
        });
        bsc_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Bsc.class));
            }
        });
        bcom_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Bcom.class));
            }
        });
        bba_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Bba.class));
            }
        });
        bca_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Bca.class));
            }
        });
        ma_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Ma.class));
            }
        });
        msc_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Msc.class));
            }
        });
        mcom_papers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Mcom.class));
            }
        });
    }
    private void IntentFiles() {
        // All Files Intents.
        ba_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BA_file_main.class));
            }
        });
        bsc_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BSC_file_main.class));
            }
        });
        bba_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BBA_file_main.class));
            }
        });
        bca_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BCA_file_main.class));
            }
        });
       /** ma_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MA_file_main.class));
            }
        });
        msc_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MSC_file_main.class));
            }
        }); */
    }
   /** private void IntentNotes() {
        // All Notes Intents.
        ba_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BA_file_main.class));
            }
        });
        bsc_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BSC_file_main.class));
            }
        });
        bcom_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BSC_file_main.class));
            }
        });
        bba_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BBA_file_main.class));
            }
        });
        bca_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BCA_file_main.class));
            }
        });
        ma_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MA_file_main.class));
            }
        });
        msc_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MSC_file_main.class));
            }
        });
        mcom_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BSC_file_main.class));
            }
        });
    } */
    // initialize.
    private void sho(View view) {
        Paytm_cash=view.findViewById(R.id.Paytm_cash);
        note_line=view.findViewById(R.id.note_line);
        // Papers
        ba_papers=view.findViewById(R.id.ba_papers);
        bsc_papers=view.findViewById(R.id.bsc_papers);
        bcom_papers=view.findViewById(R.id.bcom_papers);
        bba_papers=view.findViewById(R.id.bba_papers);
        bca_papers=view.findViewById(R.id.bca_papers);
        ma_papers=view.findViewById(R.id.ma_papers);
        msc_papers=view.findViewById(R.id.msc_papers);
        mcom_papers=view.findViewById(R.id.mcom_papers);
        // Files
        ba_file=view.findViewById(R.id.ba_file);
        bsc_file=view.findViewById(R.id.bsc_file);
        bba_file=view.findViewById(R.id.bba_file);
        bca_file=view.findViewById(R.id.bca_file);
        ma_file=view.findViewById(R.id.ma_file);
        msc_file=view.findViewById(R.id.msc_file);
        //Notes
        ba_notes=view.findViewById(R.id.ba_notes);
        bsc_notes=view.findViewById(R.id.bsc_notes);
        bcom_notes=view.findViewById(R.id.bcom_notes);
        bba_notes=view.findViewById(R.id.bba_notes);
        bca_notes=view.findViewById(R.id.bca_notes);
        ma_notes=view.findViewById(R.id.ma_notes);
        msc_notes=view.findViewById(R.id.msc_notes);
        mcom_notes=view.findViewById(R.id.mcom_notes);
    }
    // Check Internet Connaction.
    private void Check_enternet(){
        ConnectivityManager manager=(ConnectivityManager)getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=manager.getActiveNetworkInfo();
        if(null!=networkInfo){
            if(networkInfo.getType()==ConnectivityManager.TYPE_WIFI){
                Toast.makeText(getContext(), "Thanks for visiting.", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(getContext(), "Check internet.", Toast.LENGTH_SHORT).show();
        }
    }
}