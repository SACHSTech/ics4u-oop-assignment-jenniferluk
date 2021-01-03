package UberStimulation;

import java.util.*;

public abstract class Car{

  // instance variables 
  private String brand;
  private String model;    
  private String driver; 
   
    
  public Car(String brand, String model, String driver){
      this.brand = brand;
      this.model = model; 
      this.driver = driver; 
  }
  
  // print out car info menu 
  public static void showInfo() {
    System.out.println("\nFind the right ride\n--------------------\n* UberX (1-3)\nAffordable, everyday rides\nFare Breakdown:\nBase Fare .................... $2.50\n+ Per Minute ................. $0.18\n+ Per Kilometer .............. $0.81");

    System.out.println("\n* UberComfort (1-3)\nNewer cars with extra legroom\nFare Breakdown:\nBase Fare .................... $3.75\n+ Per Minute ................. $0.26\n+ Per Kilometer .............. $0.93");

    System.out.println("\n* UberXL (1-5)\nAffordable rides for groups up to 5\nFare Breakdown:\nBase Fare .................... $5.00\n+ Per Minute ................. $0.35\n+ Per Kilometer .............. $1.55");

    System.out.println("\n* UberBlack (1-3)\nLuxury rides with professional drivers\nFare Breakdown:\nBase Fare .................... $8.75\n+ Per Minute ................. $0.85\n+ Per Kilometer .............. $2.23");

    System.out.println("\n* UberBlackSUV (1-5)\nLuxury rides for 5 with professional drivers\nFare Breakdown:\nBase Fare .................... $15.75\n+ Per Minute ................. $0.89\n+ Per Kilometer .............. $2.29");

  }

  // fare price depends on car choice
  public abstract double getFare();
  
}
