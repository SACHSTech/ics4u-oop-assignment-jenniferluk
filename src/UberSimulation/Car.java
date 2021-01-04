package UberStimulation;

import java.util.*;
import UberSimulation.*;

public abstract class Car{

  // instance variables 
  private String brand;
  private String model;    
  private String driver; 
   
  /** 
  * Car constructor. Creates an instance of the 5 uber cars. 
  *
  * @param brand - string of the car's brand 
  * @param model - string of the car's model 
  * @param driver - string of the car's driver 
  */
  public Car(String brand, String model, String driver){
    this.brand = brand;
    this.model = model; 
    this.driver = driver; 
  }
  
  /**
  * void method with no return value. Used to print out the information of each car. 
  */ 
  public static void showInfo() {
    System.out.println("\nFind the right ride\n--------------------\n* UberX (1-3)\nAffordable, everyday rides\nFare Breakdown:\nBase Fare .................... $2.50\n+ Per Minute ................. $0.18\n+ Per Kilometer .............. $0.81");

    System.out.println("\n* UberComfort (1-3)\nNewer cars with extra legroom\nFare Breakdown:\nBase Fare .................... $3.75\n+ Per Minute ................. $0.26\n+ Per Kilometer .............. $0.93");

    System.out.println("\n* UberXL (1-5)\nAffordable rides for groups up to 5\nFare Breakdown:\nBase Fare .................... $5.00\n+ Per Minute ................. $0.35\n+ Per Kilometer .............. $1.55");

    System.out.println("\n* UberBlack (1-3)\nLuxury rides with professional drivers\nFare Breakdown:\nBase Fare .................... $8.75\n+ Per Minute ................. $0.85\n+ Per Kilometer .............. $2.23");

    System.out.println("\n* UberBlackSUV (1-5)\nLuxury rides for 5 with professional drivers\nFare Breakdown:\nBase Fare .................... $15.75\n+ Per Minute ................. $0.89\n+ Per Kilometer .............. $2.29");

  }

  /**
  * Abstract getter method that returns the fare specific to the Uber car choice.
  */
  public abstract double getFare();
  
}
