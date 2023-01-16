/**
 * Daniel Dubon, 22233
 * Bianca Calderón, 22272
 * Andrés Ortega, 22305
 */
package Model;

public class Radio implements IRadio {
 private String freq;
 private double actualStation;
 private boolean isON;
 private int[] saveFreq = new int[12];


 public Radio(String freq, int actualStation, boolean isON) {
  this.freq = "";
  this.actualStation = 0.0;
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
  return isOn();
 }

 @Override
 public void setFrequence(String freq) throws Exception {
  if (freq.equals("AM")) {
   if (530 <= actualStation && actualStation <= 1610 && actualStation % 10 == 0) {
    this.actualStation = actualStation;
   } else {
    System.out.println("No es una frecuencia AM válida");
   }
  } else if (freq.equals("FM")) {
    if (87.9 <= actualStation && actualStation <= 107.9 && actualStation % 0.2 == 0) {
     this.actualStation = actualStation;
     } else {
    System.out.println("No es una frecuencia FM válida");
    }
  }
 }

 @Override
 public String getFrequence() {
  return null;
 }

 @Override
 public void Forward() {

 }

 @Override
 public void Backward() {

 }

 @Override
 public double getFMActualStation() {
  return 0;
 }

 @Override
 public int getAMActualStation() {
  return 0;
 }

 @Override
 public void setFMActualStation(double actualStation) {

 }

 @Override
 public void setAMActualStation(int actualStation) {

 }

 @Override
 public void saveFMStation(double actualStation, int slot) {

 }

 @Override
 public void saveAMStation(int actualStation, int slot) {
   if (slot >= 1 && slot <= 12){
    this.saveFreq[slot-1] = actualStation;
}else{
    System.out.println("Botón no válido");
   }

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

