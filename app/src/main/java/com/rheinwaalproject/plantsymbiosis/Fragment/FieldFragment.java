package com.rheinwaalproject.plantsymbiosis.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rheinwaalproject.plantsymbiosis.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FieldFragment extends Fragment {


    public FieldFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_field, container, false);
    }

}

