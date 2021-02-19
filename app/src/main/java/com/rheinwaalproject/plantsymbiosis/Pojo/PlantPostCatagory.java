//package com.rheinwaalproject.plantsymbiosis.Pojo;
//
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.ForeignKey;
//import androidx.room.Ignore;
//import androidx.room.PrimaryKey;
//
//@Entity(tableName = "tbl_plant_post_catagory",
//        foreignKeys = {
//        @ForeignKey(
//                entity = Plant.class,
//                parentColumns = "plant_id",
//                childColumns = "P_id"
//
//        ),
//                @ForeignKey(
//                        entity = PlantSubCatagory.class,
//                        parentColumns = "psc_id",
//                        childColumns = "PSC_id"
//                )
//        }
//)
//public class PlantPostCatagory {
//
//    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "ppc_id")
//    private int PPCID;
//
//    @ColumnInfo(name = "PSC_id")
//    private int pscID;
//
//    @ColumnInfo(name = "P_id")
//    private int pid;
//
//    @ColumnInfo(name = "related_plant_name")
//    private String relatedPlantName;
//
//
//    public PlantPostCatagory(int pscID, int pid, String relatedPlantName) {
//        this.pscID = pscID;
//        this.pid = pid;
//        this.relatedPlantName = relatedPlantName;
//    }
//
//    @Ignore
//    public PlantPostCatagory(int PPCID, int pscID, int pid, String relatedPlantName) {
//        this.PPCID = PPCID;
//        this.pscID = pscID;
//        this.pid = pid;
//        this.relatedPlantName = relatedPlantName;
//    }
//
//
// /*
//    public PlantPostCatagory(String relatedPlantName) {
//        this.relatedPlantName = relatedPlantName;
//    }
//
//    @Ignore
//    public PlantPostCatagory(int PPCID, String relatedPlantName) {
//        this.PPCID = PPCID;
//        this.relatedPlantName = relatedPlantName;
//    }
//    */
//
//    public int getPPCID() {
//        return PPCID;
//    }
//
//    public void setPPCID(int PPCID) {
//        this.PPCID = PPCID;
//    }
//
//    public int getPscID() {
//        return pscID;
//    }
//
//    public void setPscID(int pscID) {
//        this.pscID = pscID;
//    }
//
//    public int getPid() {
//        return pid;
//    }
//
//    public void setPid(int pid) {
//        this.pid = pid;
//    }
//
//    public String getRelatedPlantName() {
//        return relatedPlantName;
//    }
//
//    public void setRelatedPlantName(String relatedPlantName) {
//        this.relatedPlantName = relatedPlantName;
//    }
//}
