package UberStimulation;

import java.util.*;
import UberSimulation.*;

public class UberX extends Car {

  private int duration; 
  private int distance;

  public UberX(String brand, String model, String driver, int duration, int distance){
    super(brand, model, driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  public UberX(int duration, int distance){
     this("Audi","A6", "John", duration, distance);
  }

  public double getFare(){
    return 2.50 + (duration*0.18) + (distance*0.81);
  }

}