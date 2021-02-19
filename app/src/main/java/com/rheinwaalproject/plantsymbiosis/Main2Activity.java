package com.rheinwaalproject.plantsymbiosis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rheinwaalproject.plantsymbiosis.Database.PlantSymbiosisLogDatabase;
import com.rheinwaalproject.plantsymbiosis.Database.SymbiosisInfoDatabase;
import com.rheinwaalproject.plantsymbiosis.Fragment.FieldFragment;
import com.rheinwaalproject.plantsymbiosis.Fragment.HomeFragment;
import com.rheinwaalproject.plantsymbiosis.Fragment.PlantTreeFragment;
import com.rheinwaalproject.plantsymbiosis.Fragment.SymbiosisInfoEditFragment;
import com.rheinwaalproject.plantsymbiosis.Fragment.SymbiosisInfoFragment;
import com.rheinwaalproject.plantsymbiosis.Pojo.Plant;
import com.rheinwaalproject.plantsymbiosis.Pojo.SymbiosisInfo;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    public BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch ((item.getItemId())){
                case R.id.navigation_home:
                    switchFragment(new HomeFragment());
                    return true;
                case R.id.navigation_field:
                    switchFragment(new FieldFragment());
                    return true;
                case R.id.navigation_plant_tree:
                    switchFragment(new PlantTreeFragment());
                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        switchFragment(new HomeFragment());
    }

    private void switchFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void FieldButton(View view) {
        switchFragment(new SymbiosisInfoFragment());

    }



    public void editSymInfoBtn(View view) {

        SymbiosisInfo syminfo=
                SymbiosisInfoDatabase.getInstance(this)
                .getSymbiosisInfoDao()
                .getSymbiosisInfo();

        String ss= syminfo.getInfo();
        int infoID= syminfo.getId();


        Bundle bundle=new Bundle();
        bundle.putString("message", ss);
        bundle.putInt("id", infoID);
        //set Fragmentclass Arguments
        SymbiosisInfoEditFragment fragobj=new SymbiosisInfoEditFragment();
        fragobj.setArguments(bundle);
        switchFragment(fragobj);


    }
}
