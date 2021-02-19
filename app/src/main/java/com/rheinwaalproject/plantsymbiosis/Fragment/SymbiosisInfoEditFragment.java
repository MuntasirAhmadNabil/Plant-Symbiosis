package com.rheinwaalproject.plantsymbiosis.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rheinwaalproject.plantsymbiosis.Database.SymbiosisInfoDatabase;
import com.rheinwaalproject.plantsymbiosis.Pojo.SymbiosisInfo;
import com.rheinwaalproject.plantsymbiosis.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SymbiosisInfoEditFragment extends Fragment {

    private EditText editsyminfo;
    private Button saveSymInfo;



    public SymbiosisInfoEditFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_symbiosis_info_edit, container, false);

        editsyminfo= view.findViewById(R.id.editSymInfoET);
        saveSymInfo= view.findViewById(R.id.SaveInfoBtn);


        Bundle bundle= getArguments();
        final String symInfo= bundle.getString("message");
        final int symID= bundle.getInt("id");

        editsyminfo.setText(symInfo);


        saveSymInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editedSysInfo= editsyminfo.getText().toString();
                SymbiosisInfo symbiosisInfo= new SymbiosisInfo(symID,editedSysInfo);
                int updatedRow= SymbiosisInfoDatabase.getInstance(getContext())
                        .getSymbiosisInfoDao()
                        .updateSymbiosisInfo(symbiosisInfo);

                if(updatedRow>0){
                    Toast.makeText(getContext(), "Updated", Toast.LENGTH_SHORT).show();
                    getFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new SymbiosisInfoFragment()).addToBackStack(null).commit();

                }else {
                    Toast.makeText(getContext(), "Failed to update", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

}
