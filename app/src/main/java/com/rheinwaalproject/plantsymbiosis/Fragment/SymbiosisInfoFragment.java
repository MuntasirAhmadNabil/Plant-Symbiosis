package com.rheinwaalproject.plantsymbiosis.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rheinwaalproject.plantsymbiosis.Database.SymbiosisInfoDatabase;
import com.rheinwaalproject.plantsymbiosis.Pojo.SymbiosisInfo;
import com.rheinwaalproject.plantsymbiosis.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SymbiosisInfoFragment extends Fragment {

    private static long value=0;
    private TextView symInfo;
    private String info;


    public SymbiosisInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_symbiosis_info, container, false);
        symInfo= view.findViewById(R.id.symInfoTV);

        info= "Symbiosis is any type of a close and long-term biological interaction between two different biological organisms. Heinrich Anton de Bary defined it as the living together of unlike organisms";


        SymbiosisInfo symbiosisInfo= new SymbiosisInfo(info);

        if(value==0) {
            long insertedRowID = SymbiosisInfoDatabase.getInstance(getContext())
                    .getSymbiosisInfoDao()
                    .insertSymbiosisInfo(symbiosisInfo);
            value++;

            if (insertedRowID > 0) {
                Toast.makeText(getContext(), "Saved", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "Failed to save", Toast.LENGTH_SHORT).show();
            }
        }


        SymbiosisInfo symbioInfogot= SymbiosisInfoDatabase.getInstance(getContext())
                .getSymbiosisInfoDao()
                .getSymbiosisInfo();

        symInfo.setText(symbioInfogot.getInfo());


        return view;
    }

}
