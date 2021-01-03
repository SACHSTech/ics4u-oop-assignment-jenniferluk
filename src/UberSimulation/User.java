package UberStimulation;

import java.util.*;

public class User{

  public String username; 
  public String userphoneNum; 
  public String useremail;
  public String userpassword; 
  public int duration; 
  public int distance; 
  public int passengernum; 
  public String usercarChoice;

  public User(String username, String userphoneNum, String useremail, String userpassword, int duration, int distance, int passengernum, String usercarChoice) {
    this.username = username;
    this.userphoneNum = userphoneNum; 
    this.useremail = useremail; 
    this.userpassword = userpassword; 
    this.duration = duration; 
    this.distance = distance; 
    this.passengernum = passengernum;
    this.usercarChoice = usercarChoice; 
      
  }
  
}