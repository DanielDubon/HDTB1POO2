/**
 * Daniel Dubon, 22233
 * Bianca Calderón, 22272
 * Andrés Ortega, 22305
 */
package Model;

import java.util.ArrayList;

public class Radio implements IRadio {
 private String freq;
 private double actualStationFM;

 private int actualStationAM;
 private boolean isON;
 private int[] saveFreq = new int[12];


 private ArrayList<Integer>  RadioAMFAVS = new ArrayList<Integer>();
 private ArrayList<Double>  RadioFMFAVS = new ArrayList<Double>();

 public Radio(String freq, int actualStation, boolean isON) {
  this.freq = "AM";
  this.actualStationAM = 530;
  this.actualStationFM = 87.9;
  this.isON = false;
 }

 @Override
 public void on() {
  this.isON = true;
 }

 @Override
 public void off() {
  this.isON = false;
 }

 @Override
 public boolean isOn() {
  return isON;
 }

 @Override
 public void setFrequence(String freq) throws Exception {
   this.freq = freq;
 }

 @Override
 public String getFrequence() {
  return freq;
 }

 @Override
 public void Forward() {
  if (freq.equals("AM")){

    if (!(actualStationAM>=1610)) {
     actualStationAM = actualStationAM + 10;
    }else {
     actualStationAM = 530;
    }
  }

  if (freq.equals("FM")){

   if (!(actualStationFM>=107.9)) {
    actualStationFM = actualStationFM + 0.2;
   }else {
    actualStationFM = 87.9;
   }
  }

 }

 @Override
 public void Backward() {
  if (freq.equals("AM")){

   if (!(actualStationAM==530)) {
    actualStationAM = actualStationAM - 10;
   }else {
    actualStationAM = 1610;
   }
  }

  if (freq.equals("FM")){

   if (!(actualStationFM==87.9)) {
    actualStationFM = actualStationFM - 0.2;
   }else {
    actualStationFM = 107.9;
   }
  }
 }

 @Override
 public double getFMActualStation() {
  return actualStationFM;
 }

 @Override
 public int getAMActualStation() {
  return actualStationAM;
 }

 @Override
 public void setFMActualStation(double actualStation) {
        this.actualStationFM = actualStation;
 }

 @Override
 public void setAMActualStation(int actualStation) {
       this.actualStationAM = actualStation;
 }

 @Override
 public void saveFMStation(double actualStation, int slot) {

     RadioFMFAVS.add(slot,actualStation);
 }

 @Override
 public void saveAMStation(int actualStation, int slot) {

  RadioAMFAVS.add(slot,actualStation);

  }

  @Override
  public double getFMSlot ( int slot){
   return 0;
  }

  @Override
  public int getAMSlot ( int slot){
   return 0;
  }
 }

