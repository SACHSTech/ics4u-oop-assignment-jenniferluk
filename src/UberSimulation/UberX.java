package UberStimulation;

import java.util.*;

public class UberX extends Car {
  String brand;
  String model;

  public UberX(String username, String userphoneNum, String useremail, String userpassword, int TripDuration, int TripDistance, int passenger, String carChoice){
    super(username, userphoneNum, useremail, userpassword, TripDuration, TripDistance, passenger, carChoice);
    this.brand = "Ford";
    this.model = "Ford";

  } 
  // public void printDataCar() {
  //     super.printDataCar();
  //     System.out.println("Model: " + model + " Brand : " + brand);
  //   }
    
}