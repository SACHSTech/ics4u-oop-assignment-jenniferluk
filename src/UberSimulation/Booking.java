package UberStimulation;

import java.util.*;

public class Booking {
  
  private String username; 
  private int duration; 
  private int distance; 
  private int passengernum; 
  private String usercarChoice;
  private String drivername; 
  private String driverphonenum; 
  private String driverrating; 
  private double fare;

  public Booking(String username, int duration, int distance, int passengernum, String usercarChoice, double Fare, String drivername, String driverphonenum, String driverrating) {
    this.username = username; 
    this.duration = duration; 
    this.distance = distance; 
    this.passengernum = passengernum;
    this.usercarChoice = usercarChoice; 
    this.fare = fare; 
    this.drivername = drivername; 
    this.driverphonenum = driverphonenum; 
    this.driverrating = driverrating; 
  }

  public String toString() {
    return "\nHere is your booking: \nName: " + this.username + "\nRide Duration: " + this.duration + "\nRide Distance: " + this.distance + "\n# of Passengers: " +this.passengernum + "\nFare: " + this.fare + "\nCar Choice: " + this.usercarChoice + "\nDriver: " + this.drivername + "\nDriver Phone #: " + this.driverphonenum + "\nDriver Rating: " + this.driverrating;
  }
}