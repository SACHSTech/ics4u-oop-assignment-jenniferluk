package UberSimulation;

import java.io.*;
import java.util.*;

public class UberMain {

  public static void main(String args[]) throws IOException {
    
    // Initialize buffered reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Declare variables
    String Name; 
    String carChoice; 
    String phoneNum;
    String email;
    String password; 
    int TripDuration; 
    int TripDistance; 

    System.out.print("Welcome to Uber! Sign Up to Ride \nFirst Name: ");
    Name = keyboard.readLine();

    System.out.print("Last Name: ");
    Name = Name + " " +keyboard.readLine();  
    
    System.out.print("Enter your mobile number (no dashes): ");
    phoneNum = keyboard.readLine();;
    String number = phoneNum.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    
    System.out.print("Enter your email: ");
    email = keyboard.readLine();

    System.out.print("Enter a password: ");
    password = keyboard.readLine();
    System.out.print(password);

    // Car myCar = Car.getInstance();

    // Booking user = new Booking(new User(Name, email,  )
  }

}