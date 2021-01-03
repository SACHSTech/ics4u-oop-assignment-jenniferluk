package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class
public class UberXL extends Car {

  // instance variables
  private int duration; 
  private int distance;

  public UberXL(String brand, String model, String driver, int duration, int distance){
    super(brand, model,driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  public UberXL(int duration, int distance){
     this("Toyota","Hylander", "Amy", duration, distance);
  }

  // get fare price
  public double getFare(){
    return 5.00 + (duration*0.35) + (distance*1.55);
  }

}