package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class
public class UberComfort extends Car {

  // instance variables
  private int duration; 
  private int distance;

  /** 
  * UberComfort constructor. Creates an instance of the object, uberblacksuv. 
  *
  * @param brand - string of car's brand called from the super constructor. 
  * @param model - string of car's model called from the super constructor. 
  * @param driver - string of driver's name called from the super constructor. 
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberComfort(String brand, String model, String driver, int duration, int distance){
    super(brand, model,driver); 
    this.duration = duration;
    this.distance = distance;
  } 
  
  /** 
  * UberComfort constructor that calls the above constructor and passes in the first three parameters. 
  *
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberComfort(int duration, int distance){
     this("Audi","SQ7","Sarah", duration, distance);
  }

  /** 
  * Gettor method that returns the fare price. 
  *
  * @return the fare cost for UberComfort.
  */ 
  public double getFare(){
    return 3.75 + (duration*0.26) + (distance*0.93);
  }

}