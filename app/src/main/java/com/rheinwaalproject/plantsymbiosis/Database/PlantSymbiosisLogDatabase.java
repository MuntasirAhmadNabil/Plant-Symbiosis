package com.rheinwaalproject.plantsymbiosis.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.rheinwaalproject.plantsymbiosis.Pojo.Plant;
import com.rheinwaalproject.plantsymbiosis.Pojo.PlantDetails;
import com.rheinwaalproject.plantsymbiosis.Pojo.PlantSubCatagory;
import com.rheinwaalproject.plantsymbiosis.doas.PlantSymbiosisLogDao;
import com.rheinwaalproject.plantsymbiosis.typeconverter.TypeConverter;

@Database(entities = {Plant.class, PlantSubCatagory.class, PlantDetails.class},
        version = 2,
        exportSchema = false )
@TypeConverters({TypeConverter.class})
public abstract class PlantSymbiosisLogDatabase extends RoomDatabase {

    private static PlantSymbiosisLogDatabase db;
    public abstract PlantSymbiosisLogDao getPlantSymbiosisLogDao();

    public static PlantSymbiosisLogDatabase getInstance(Context context){
        if(db != null){
            return db;
        }

        db= Room.databaseBuilder(context, PlantSymbiosisLogDatabase.class, "plant_sym_log_db")
                .allowMainThreadQueries()
                .build();

        return db;

    }

}
