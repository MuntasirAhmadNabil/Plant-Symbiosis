package com.rheinwaalproject.plantsymbiosis.Pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity(tableName = "tbl_plant_details",
        indices= @Index(name = "index_plant_Name_final", value = "plant_name",unique = true))
public class PlantDetails {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "plant_id")
    private int plant_id;

    @ColumnInfo(name = "plant_name")
    private String plantName;

    @ColumnInfo(name = "mutualistic_plants_list")
    private ArrayList<String> mutualisticPlants= new ArrayList<>();

    public PlantDetails(String plantName, ArrayList<String> mutualisticPlants) {
        this.plantName = plantName;
        this.mutualisticPlants = mutualisticPlants;
    }

    @Ignore
    public PlantDetails(int plant_id, String plantName, ArrayList<String> mutualisticPlants) {
        this.plant_id = plant_id;
        this.plantName = plantName;
        this.mutualisticPlants = mutualisticPlants;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public void setPlant_id(int plant_id) {
        this.plant_id = plant_id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public ArrayList<String> getMutualisticPlants() {
        return mutualisticPlants;
    }

    public void setMutualisticPlants(ArrayList<String> mutualisticPlants) {
        this.mutualisticPlants = mutualisticPlants;
    }
}
