package UberStimulation;

import java.util.*;
import UberSimulation.*;

public class UberComfort extends Car {

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

  public double getFare(){
    return 3.75 + (duration*0.26) + (distance*0.93);
  }

}