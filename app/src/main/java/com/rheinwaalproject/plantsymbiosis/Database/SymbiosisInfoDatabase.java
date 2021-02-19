package com.rheinwaalproject.plantsymbiosis.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.rheinwaalproject.plantsymbiosis.Pojo.SymbiosisInfo;
import com.rheinwaalproject.plantsymbiosis.doas.SymbiosisInfoDao;

@Database(entities = {SymbiosisInfo.class}, version = 1)
public abstract class SymbiosisInfoDatabase extends RoomDatabase {

    private static SymbiosisInfoDatabase db;
    public abstract SymbiosisInfoDao getSymbiosisInfoDao();

    public static SymbiosisInfoDatabase getInstance(Context context){
        if(db != null){
            return db;
        }

        db= Room.databaseBuilder(context, SymbiosisInfoDatabase.class, "sym_info_db")
                .allowMainThreadQueries()
                 .build();

        return db;
    
    }
}
