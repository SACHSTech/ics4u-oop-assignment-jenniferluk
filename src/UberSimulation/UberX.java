package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class
public class UberX extends Car {

  private int duration; 
  private int distance;

  /** 
  * UberX constructor. Creates an instance of the object, uberx. 
  *
  * @param brand - string of car's brand called from the super constructor. 
  * @param model - string of car's model called from the super constructor. 
  * @param driver - string of driver's name called from the super constructor. 
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberX(String brand, String model, String driver, int duration, int distance){
    super(brand, model, driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  /** 
  * UberX constructor that calls the above constructor and passes in the first three parameters. 
  *
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberX(int duration, int distance){
     this("Audi","A6", "John", duration, distance);
  }

  /** 
  * Gettor method that returns the fare price. 
  *
  * @return the fare cost for UberX.
  */ 
  public double getFare(){
    return 2.50 + (duration*0.18) + (distance*0.81);
  }
}