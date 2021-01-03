package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class 
public class UberBlack extends Car {

  // instance variables 
  private int duration; 
  private int distance;
  
  /** 
  * UberBlack constructor. Creates an instance of the object, uberblack. 
  *
  * @param brand - string of car's brand called from the super constructor. 
  * @param model - string of car's model called from the super constructor. 
  * @param driver - string of driver's name called from the super constructor. 
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberBlack(String brand, String model, String driver, int duration, int distance){
    super(brand, model, driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  /** 
  * UberBlack constructor that calls the above constructor and passes in the first three parameters. 
  *
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberBlack(int duration, int distance){
     this("Tesla","ModelX", "Jess", duration, distance);
  }

  /** 
  * Gettor method that returns the fare price. 
  *
  * @return the fare cost for UberBlack.
  */
  public double getFare(){
    return 8.75 + (duration*0.85) + (distance*2.23);
  }

}