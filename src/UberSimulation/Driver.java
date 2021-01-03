package UberStimulation;

import java.util.*;

public class Driver{
  
  // instance variable
  private String name; 
  private String phoneNum; 
  private String email;
  private String rating; 
  private String car; 

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
    
  public String getName(){
    return this.name;
  }

  public String getphoneNum(){
    return this.phoneNum;
  }

  public String getEmail(){
    return this.email;
  }

  public String getRating(){
    return this.rating;
  }

  // print out driver info 
  public String toString(){
    return "Driver Name: " + this.name + "\nPhone #: " + this.phoneNum + "\nEmail: " + this.email + "\nRating: " +this.rating + "\nCar: " + this.car;
   
  }
 
}