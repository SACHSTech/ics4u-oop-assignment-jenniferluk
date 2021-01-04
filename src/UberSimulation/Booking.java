package UberStimulation;

import java.util.*;
import UberSimulation.*;
import java.text.DecimalFormat;

public class Booking {
  
  // instance variables
  private String username; 
  private int duration; 
  private int distance; 
  private int passengernum; 
  private String usercarChoice;
  private String drivername; 
  private String driverphonenum; 
  private String driverrating; 
  private String fare;
  DecimalFormat df = new DecimalFormat("###.##");

  /** 
  * Booking constructor. Creates an instance of the object, Booking. 
  *
  * @param username - a string that displays the name of the user
  * @param duration - an integer that displays the duration of the ride 
  * @param distance - an integer that displays the distance of the ride 
  * @param passengernum - an integer that displays the number of passengers 
  * @param usercarChoice - a string that displays the user's car choice
  * @param fare - a double that displays the cost of the ride
  * @param drivername - a string that displays the name of the driver 
  * @param driverphonenum - a string that displays the phone number of the driver 
  * @param driverrating - a string that displays the driver's rating 
  */
  public Booking(String username, int duration, int distance, int passengernum, String usercarChoice, double fare, String drivername, String driverphonenum, String driverrating) {
    this.username = username; 
    this.duration = duration; 
    this.distance = distance; 
    this.passengernum = passengernum;
    this.usercarChoice = usercarChoice; 

    // round fare to 2 decimal place
    this.fare = df.format(fare); 
    this.drivername = drivername; 
    this.driverphonenum = driverphonenum; 
    this.driverrating = driverrating; 
  }

  /** 
  * toString method that returns the booking information 
  * 
  * @return this.username - a string that displays the name of the user
  * @return this.duration - an integer that displays the duration of the ride 
  * @return this.distance - an integer that displays the distance of the ride 
  * @return this.passengernum - an integer that displays the number of passengers 
  * @return this.usercarChoice - a string that displays the user's car choice
  * @return this.fare - a double that displays the cost of the ride
  * @return this.drivername - a string that displays the name of the driver 
  * @return this.driverphonenum - a string that displays the phone number of the driver 
  * @return this.driverrating - a string that displays the driver's rating  
  */ 
  public String toString() {
    return "\nHere is your booking: \nName: " + this.username + "\nRide Duration: " + this.duration + " mins\nRide Distance: " + this.distance + "km\n# of Passengers: " +this.passengernum + "\nFare: $" + this.fare + "\nCar Choice: " + this.usercarChoice + "\nDriver: " + this.drivername + "\nDriver Phone #: " + this.driverphonenum + "\nDriver Rating: " + this.driverrating;
  }

  /** 
  * Getter method that returns the fare 
  * 
  * @return this.fare
  */
  public String getFare(){
    return this.fare;
  }
}