package com.rheinwaalproject.plantsymbiosis.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.rheinwaalproject.plantsymbiosis.Database.PlantDDB;
import com.rheinwaalproject.plantsymbiosis.Database.PlantDetailsDatabase;
import com.rheinwaalproject.plantsymbiosis.Database.PlantSymbiosisLogDatabase;
import com.rheinwaalproject.plantsymbiosis.Pojo.Plant;
import com.rheinwaalproject.plantsymbiosis.Pojo.PlantDetails;
import com.rheinwaalproject.plantsymbiosis.Pojo.PlantSubCatagory;
import com.rheinwaalproject.plantsymbiosis.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private Button plantbtn;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        plantbtn= view.findViewById(R.id.plantbtnid);

        plantbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ArrayList<String> mPlants= new ArrayList<>();
                mPlants.add("vuttaaaaa");
                mPlants.add("kumraaaaa");
                mPlants.add("potollll");
                mPlants.add("lauu");

                PlantDetails details= new PlantDetails("begun",mPlants);

               long plantDetailsStatus=  PlantDDB.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .insertPlantDetails(details);

                if(plantDetailsStatus>0)
                {
                    Log.e("details status: ", "Successfully added plant details.");
                }else {
                    Log.e("details status: ", "Failed");
                }


                List<PlantDetails> foundDetails= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .getAllPlantDetails();

                for(PlantDetails plantInfo: foundDetails){
                    String p_name= plantInfo.getPlantName();
                    ArrayList<String> mu_plants_list= plantInfo.getMutualisticPlants();
                    Log.e("plant name is: ",p_name);
                    Log.e("mutualistic plist siz: ",String.valueOf(mu_plants_list.size()));
                }

                /*

                Plant p= new Plant("koiooo");
                PlantSubCatagory psc= new PlantSubCatagory("sub list started 1");


                PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .insertPlant(p);

                long pscStatus= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .insertSubCatagory(psc);


                Plant gotplant= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .getPlantByName("koiooo");

                PlantSubCatagory gotSubCatagoryName= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .getSubCatagoryByName("sub list started 1");


                PlantPostCatagory ppca= new PlantPostCatagory(gotplant.getPlantID(),gotSubCatagoryName.getPSCID(),"kumraaaaa");

                long ppcaStatus= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .insertPostCatagory(ppca);

                if(pscStatus>0)
                {
                    Log.e("psc status: ", "Successfully added catagory.");
                }else {
                    Log.e("psc status: ", "Failed");
                }

                if(ppcaStatus>0)
                {
                    Log.e("ppca status: ", "Successfully added post catagory.");
                }else {
                    Log.e("ppca status: ", "Failed");
                }

                List<Plant> found= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .getAllPlants();

                List<PlantSubCatagory> foundPsc= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .getAllSubCatagory();

                List<PlantPostCatagory> foundPpca= PlantSymbiosisLogDatabase.getInstance(getContext())
                        .getPlantSymbiosisLogDao()
                        .getAllPostCatagory();

                for(Plant p_name: found){
                    String name= p_name.getPlantName();
                    Log.e("plant name is: ",name);
                }

                for(PlantSubCatagory psc_name: foundPsc){
                    String name= psc_name.getSubCatagoryName();
                    int plantID= psc_name.getPSCID();
                    Log.e("Sub catagory name is: ",name);
                    Log.e("Sub catagory name is: ",String.valueOf(plantID));
                }

                for(PlantPostCatagory ppca_name: foundPpca){
                    String name= ppca_name.getRelatedPlantName();
                    int ppcaid= ppca_name.getPPCID();
                    int plantID= ppca_name.getPid();
                    int subplantid= ppca_name.getPscID();
                    Log.e("Post catagory name is: ",name);
                    Log.e("Post catagory id is: ",String.valueOf(ppcaid));
                    Log.e("Sub catagory id is: ",String.valueOf(subplantid));
                    Log.e("Plant id is: ",String.valueOf(plantID));
                }

                Toast.makeText(getContext(), String.valueOf(found.size()), Toast.LENGTH_SHORT).show();

                */
            }
        });
        return view;
    }

}
