package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {
  private String discData;
  private final HashMap<String, String> discInfo;


  private final int storageCapacityInMB;
  private final int spinSpeedInRPM;
  public BaseDisc(int storageCapacity, int spinSpeed){

      this.discData = "";
      this.discInfo = new HashMap<String, String>();

      this.storageCapacityInMB = storageCapacity;
      this.spinSpeedInRPM = spinSpeed;

      this.discInfo.put("Storage Capacity",String.valueOf(storageCapacity));
      this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));
  }
    public BaseDisc(int storageCapacity, int spinSpeed,String tittle){

        this(storageCapacity,spinSpeed);
        this.discInfo.put("Tittle", tittle);
    }



    protected void writeData(String data){
      this.discData +=data;
 }
 public String readData(){
      return this.discData;
 }
 public HashMap<String, String> getInfo(){
      return this.discInfo;
 }



    public int getStorageCapacity(){
      return this.storageCapacityInMB;
    }
    public int getSpinSpeed(){
      return this.spinSpeedInRPM;
    }
}
