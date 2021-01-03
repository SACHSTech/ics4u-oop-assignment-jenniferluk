package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class
public class UberComfort extends Car {

  // instance variables
  private int duration; 
  private int distance;

  public UberComfort(String brand, String model, String driver, int duration, int distance){
    super(brand, model,driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  public UberComfort(int duration, int distance){
     this("Audi","SQ7","Sarah", duration, distance);
  }

  // get fare price 
  public double getFare(){
    return 3.75 + (duration*0.26) + (distance*0.93);
  }

}