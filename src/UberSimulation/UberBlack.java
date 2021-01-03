package UberStimulation;

import java.util.*;
import UberSimulation.*;


public class UberBlack extends Car {
  private int duration; 
  private int distance;
 


  public UberBlack(String brand, String model, String driver, int duration, int distance){
    super(brand, model, driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  public UberBlack(int duration, int distance){
     this("Tesla","ModelX", "Jess", duration, distance);
  }

  public double getFare(){
    return 8.75 + (duration*0.85) + (distance*2.23);
  }

}