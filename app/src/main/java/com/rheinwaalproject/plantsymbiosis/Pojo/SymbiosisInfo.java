package com.rheinwaalproject.plantsymbiosis.Pojo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "tbl_symbiosis_info")
public class SymbiosisInfo {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "symbiosis_info")
    private String info;

    public SymbiosisInfo(String info) {
        this.info = info;
    }

    @Ignore
    public SymbiosisInfo(int id, String info) {
        this.id = id;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
