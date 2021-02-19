package com.rheinwaalproject.plantsymbiosis.doas;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.rheinwaalproject.plantsymbiosis.Pojo.SymbiosisInfo;

@Dao
public interface SymbiosisInfoDao {

    @Insert
    long insertSymbiosisInfo(SymbiosisInfo symbiosisInfo);

    @Query("select * from tbl_symbiosis_info")
    SymbiosisInfo getSymbiosisInfo();

    @Update
    int updateSymbiosisInfo(SymbiosisInfo symbiosisInfo);
}
