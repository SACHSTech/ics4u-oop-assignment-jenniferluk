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

  public Booking(String username, int duration, int distance, int passengernum, String usercarChoice, String drivername, String driverphonenum, String driverrating) {
    this.username = username; 
    this.duration = duration; 
    this.distance = distance; 
    this.passengernum = passengernum;
    this.usercarChoice = usercarChoice; 
    this.drivername = drivername; 
    this.driverphonenum = driverphonenum; 
    this.driverrating = driverrating; 
  }
}