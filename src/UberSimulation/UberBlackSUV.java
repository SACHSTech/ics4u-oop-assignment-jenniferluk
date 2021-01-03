package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class
public class UberBlackSUV extends Car {

  // instance variables
  private int duration; 
  private int distance;

  /** 
  * UberBlackSUV constructor. Creates an instance of the object, uberblacksuv. 
  *
  * @param brand - string of car's brand called from the super constructor. 
  * @param model - string of car's model called from the super constructor. 
  * @param driver - string of driver's name called from the super constructor. 
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberBlackSUV(String brand, String model, String driver, int duration, int distance){
    super(brand, model, driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  /** 
  * UberBlackSUV constructor that calls the above constructor and passes in the first three parameters. 
  *
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberBlackSUV(int duration, int distance){
     this("Cadillac","XTS","Alex", duration, distance);
  }

  /** 
  * Gettor method that returns the fare price. 
  *
  * @return the fare cost for UberBlackSUV.
  */ 
  public double getFare(){
    return 15.75 + (duration*0.89) + (distance*2.29);
  }
}