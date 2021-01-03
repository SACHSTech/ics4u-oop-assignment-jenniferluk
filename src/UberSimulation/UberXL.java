package UberStimulation;

import java.util.*;
import UberSimulation.*;

// subclass of Car class
public class UberXL extends Car {

  // instance variables
  private int duration; 
  private int distance;

  /** 
  * UberXL constructor. Creates an instance of the object, uberxl. 
  *
  * @param brand - string of car's brand called from the super constructor. 
  * @param model - string of car's model called from the super constructor. 
  * @param driver - string of driver's name called from the super constructor. 
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberXL(String brand, String model, String driver, int duration, int distance){
    super(brand, model,driver); 
    this.duration = duration;
    this.distance = distance;
  } 

  /** 
  * UberXL constructor that calls the above constructor and passes in the first three parameters. 
  *
  * @param duration - integer of the ride's duration. 
  * @param distance - integer of the ride's distance. 
  */
  public UberXL(int duration, int distance){
     this("Toyota","Hylander", "Amy", duration, distance);
  }

  /** 
  * Gettor method that returns the fare price. 
  *
  * @return the fare cost for UberXL.
  */
  public double getFare(){
    return 5.00 + (duration*0.35) + (distance*1.55);
  }

}