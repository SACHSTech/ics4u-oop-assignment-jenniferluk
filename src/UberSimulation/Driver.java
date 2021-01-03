package UberStimulation;

import java.util.*;

public class Driver{
  
  // instance variable
  private String name; 
  private String phoneNum; 
  private String email;
  private String rating; 
  private String car; 

  /** 
  * Driver constructor. Creates an instance of the object, Driver. 
  *
  * @param name - string of the driver's name
  */
  public Driver(String name){
    this.name = name;

    // set driver data based on name 
    if (this.name.equalsIgnoreCase("John")){
      this.phoneNum = "416-822-9080"; 
      this.email = "john.s@uber.com"; 
      this.rating = "4/5";
      this.car = "Audi A6";
    } else if(this.name.equalsIgnoreCase("Sarah")){
      this.phoneNum = "416-967-2090"; 
      this.email = "sarah.l@uber.com"; 
      this.rating = "4.2/5";
      this.car = "Audi SQ7";
    } else if(this.name.equalsIgnoreCase("Amy")){
      this.phoneNum = "647-348-0426"; 
      this.email = "amy.t@uber.com"; 
      this.rating = "4.5/5";
      this.car = "Toyota Hylander";
    } else if(this.name.equalsIgnoreCase("Jess")){
      this.phoneNum = "647-788-8088"; 
      this.email = "jess.c@uber.com"; 
      this.rating = "3.9/5";
      this.car = "Tesla ModelX";
    } else if(this.name.equalsIgnoreCase("Alex")){
      this.phoneNum = "416-425-1245"; 
      this.email = "alex.o@uber.com"; 
      this.rating = "4.8/5";
      this.car = "Cadillac XTS";
    }
  }
  
  /** 
  * Gettor method that returns the name of the driver. 
  *
  * @return this.name - string of the driver's name.
  */
  public String getName(){
    return this.name;
  }

  /** 
  * Gettor method that returns the phone number of the driver. 
  *
  * @return this.phoneNum - string of the driver's phone number.
  */
  public String getphoneNum(){
    return this.phoneNum;
  }

  /** 
  * Gettor method that returns the email of the driver. 
  *
  * @return this.email - string of the driver's email.
  */
  public String getEmail(){
    return this.email;
  }

  /** 
  * Gettor method that returns the  rating of the driver. 
  *
  * @return this.phoneNum - string of the driver's rating.
  */
  public String getRating(){
    return this.rating;
  }

  /** 
  * toString method to print out the driver's information. 
  *
  * @return this.name - string of the driver's name.
  * @return this.email - string of the driver's email.
  * @return this.phoneNum - string of the driver's phone number
  * @return this.phoneNum - string of the driver's rating.
  */ 
  public String toString(){
    return "Driver Name: " + this.name + "\nPhone #: " + this.phoneNum + "\nEmail: " + this.email + "\nRating: " +this.rating + "\nCar: " + this.car;
   
  }
 
}