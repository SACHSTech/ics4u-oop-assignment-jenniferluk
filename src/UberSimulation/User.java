package UberStimulation;

import java.util.*;

public class User{

  private String name; 
  private String phoneNum; 
  private String email;
  private String password; 
  private int duration; 
  private int distance; 
  private int passengernum; 
  private String ridechoice;

  public User(String username, String userphoneNum, String useremail, String userpassword, int TripDuration, int TripDistance, int passenger, String carChoice) {
    this.name = username;
    this.phoneNum = userphoneNum; 
    this.email = useremail; 
    this.password = userpassword; 
    this.duration = TripDuration; 
    this.distance = TripDistance; 
    this.passengernum = passenger;
    this.ridechoice = carChoice; 
      
  }
  
}