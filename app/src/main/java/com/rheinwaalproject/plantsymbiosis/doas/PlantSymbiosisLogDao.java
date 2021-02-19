package com.rheinwaalproject.plantsymbiosis.doas;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.rheinwaalproject.plantsymbiosis.Pojo.Plant;
import com.rheinwaalproject.plantsymbiosis.Pojo.PlantDetails;
//
import com.rheinwaalproject.plantsymbiosis.Pojo.PlantSubCatagory;

import java.util.List;

@Dao
public interface PlantSymbiosisLogDao {

//    @Query("select * from tbl_plant")
//    List<Plant> getAllPlants();
//
//    @Query("select * from tbl_plant where plant_name like :pName")
//    Plant getPlantByName(String pName);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    long insertPlant(Plant plant);
//
//    @Update
//    int updatePlant(Plant plant);
//
//    @Delete
//    int deletePlant(Plant plant);
//
//    @Query("select * from tbl_plant_sub_catagory")
//    List<PlantSubCatagory> getAllSubCatagory();
//
//    @Query("select * from tbl_plant_sub_catagory where sub_catagory_name like :sCName")
//    PlantSubCatagory getSubCatagoryByName(String sCName);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    long insertSubCatagory(PlantSubCatagory catagory);
//
//    @Update
//    int updateSubCatagory(PlantSubCatagory catagory);
//
//    @Delete
//    int deleteSubCatagory(PlantSubCatagory catagory);

//    @Query("select * from tbl_plant_post_catagory")
//    List<PlantPostCatagory> getAllPostCatagory();
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    long insertPostCatagory(PlantPostCatagory catagory);
//
//    @Update
//    int updatePostCatagory(PlantPostCatagory catagory);
//
//    @Delete
//    int deletePostCatagory(PlantPostCatagory catagory);

    @Query("select * from tbl_plant_details")
    List<PlantDetails> getAllPlantDetails();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertPlantDetails(PlantDetails details);


}
