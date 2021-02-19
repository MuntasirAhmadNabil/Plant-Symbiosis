package com.rheinwaalproject.plantsymbiosis.Pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_plant",
          indices= @Index(name = "index_plant_Name", value = "plant_name",unique = true)
)
public class Plant {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "plant_id")
    private int plantID;

    @ColumnInfo(name = "plant_name")
    private String plantName;

    public Plant(String plantName) {
        this.plantName = plantName;
    }

    @Ignore
    public Plant(int plantID, String plantName) {
        this.plantID = plantID;
        this.plantName = plantName;
    }

    public int getPlantID() {
        return plantID;
    }

    public void setPlantID(int plantID) {
        this.plantID = plantID;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }
}
