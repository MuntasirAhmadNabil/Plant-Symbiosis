package com.rheinwaalproject.plantsymbiosis.Pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_plant_sub_catagory")
public class PlantSubCatagory {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "psc_id")
    private int PSCID;

    @ColumnInfo(name = "sub_catagory_name")
    private String subCatagoryName;

    public PlantSubCatagory(String subCatagoryName) {
        this.subCatagoryName = subCatagoryName;
    }

    @Ignore
    public PlantSubCatagory(int PSCID, String subCatagoryName) {
        this.PSCID = PSCID;
        this.subCatagoryName = subCatagoryName;
    }

    public int getPSCID() {
        return PSCID;
    }

    public void setPSCID(int PSCID) {
        this.PSCID = PSCID;
    }

    public String getSubCatagoryName() {
        return subCatagoryName;
    }

    public void setSubCatagoryName(String subCatagoryName) {
        this.subCatagoryName = subCatagoryName;
    }
}
