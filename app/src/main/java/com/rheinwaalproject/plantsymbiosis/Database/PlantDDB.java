package com.rheinwaalproject.plantsymbiosis.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.rheinwaalproject.plantsymbiosis.Pojo.PlantDetails;
import com.rheinwaalproject.plantsymbiosis.doas.PlantSymbiosisLogDao;
import com.rheinwaalproject.plantsymbiosis.typeconverter.TypeConverter;

@Database(entities = {PlantDetails.class},
        version = 1,
        exportSchema = false )
@TypeConverters({TypeConverter.class})
public abstract class PlantDDB extends RoomDatabase {

    private static PlantDDB db;

    public abstract PlantSymbiosisLogDao getPlantSymbiosisLogDao();

    public static PlantDDB getInstance(Context context) {
        if (db != null) {
            return db;
        }

        db = Room.databaseBuilder(context, PlantDDB.class, "plant_detail_db")
                .allowMainThreadQueries()
                .build();

        return db;
    }
}
