package UberStimulation;

import java.util.*;
import UberSimulation.*;

public class User{

  // instance variables
  private String username; 
  private String userphoneNum; 
  private String useremail;
  private String userpassword; 
  
  /** 
  * User constructor. Creates an instance of the object, user. 
  *
  * @param username - a string that displays the name of the user
  * @param userphoneNum - a string that displays the user's phone number
  * @param useremail - a string that displays the user's email 
  * @param userpassword - a string that displays the user'string password 
  */
  public User(String username, String userphoneNum, String useremail, String userpassword) {
    this.username = username;
    this.userphoneNum = userphoneNum; 
    this.useremail = useremail; 
    this.userpassword = userpassword;      
  }
  
  /** 
  * Gettor method that returns user's password. 
  *
  * @return the user's password.
  */
  public String getPassword(){
    return userpassword;
  }
}