package UberStimulation;

import java.util.*;
import UberSimulation.*;


public class UberBlackSUV extends Car {

  private int duration; 
  private int distance;

  public UberBlackSUV(String brand, String model, String driver, int duration, int distance){
    super(brand, model, driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  public UberBlackSUV(int duration, int distance){
     this("Cadillac","XTS","Alex", duration, distance);
  }

  public double getFare(){
    return 15.75 + (duration*0.89) + (distance*2.29);
  }
}