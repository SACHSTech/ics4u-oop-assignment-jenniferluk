package UberSimulation;

import java.io.*;
import java.util.*;
import java.util.Scanner;


import UberStimulation.Car;
import UberStimulation.User;

public class UberMain {
  private static void printDivider() {
        for(int i = 0; i < 55; i++)
        {
            System.out.print("=");
        }
        System.out.println();

  }
  public static void displayLogo() {

    System.out.println("\n    ***    ***   *******    ********  ******* \n    ***    ***   ********   ********  ********\n    ***    ***   ***  ***   ***       ***  ****\n    ***    ***   ***  ***   ***       ***  ****\n    ***    ***   ********   ********  *********\n    ***    ***   *******    ********  ********\n    ***    ***   ***  ***   ***       ***  ****\n    ***    ***   ***  ***   ***       ***   ****\n     ********    ********   ********  ***    ****\n      ******     *******    ********  ***    ****"); 

    pause(1500);
  }
  
  private static void pause(int pauseLength) {
    try {
        Thread.sleep(pauseLength);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
  }

  public static void main(String args[]) throws IOException {
    
    // Initialize buffered reader
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    // Declare variables
    String username; 
    String carChoice = ""; 
    String userphoneNum;
    String useremail;
    String userpassword;
    int TripDuration; 
    int TripDistance; 
    int passenger = 0; 

    displayLogo();
    System.out.println();
    printDivider();

    System.out.print("Welcome to Uber! Sign Up to Ride: \nFirst Name: ");
    username = keyboard.readLine();

    System.out.print("Last Name: ");
    username = username + " " +keyboard.readLine();  
    
    System.out.print("Enter your mobile number (no dashes): ");
    userphoneNum = keyboard.readLine();;
    // String number = phoneNum.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    
    System.out.print("Enter your email: ");
    useremail = keyboard.readLine();

    System.out.print("Enter a password: ");
    userpassword = keyboard.readLine();
    // System.out.print(password);

    System.out.print("Enter the duration of your trip in mins: ");
    TripDuration = Integer.parseInt(keyboard.readLine());

    System.out.print("Enter the distance of your trip in km: ");
    TripDistance = Integer.parseInt(keyboard.readLine());
    
    System.out.print("Enter the # of passengers: ");
    passenger = Integer.parseInt(keyboard.readLine());
    
    boolean end = true;
    while (end) {  
      printDivider();

      if (passenger <= 3){
        System.out.println("Choose a ride: \n * UberX\n * UberComfort\n * UberXL\n * UberBlack\n * UberBlackSUV");
      }else if(3 < passenger && passenger <= 5){
        System.out.println("Choose a ride: \n" + "UberXL\n"+"UberBlackSUV");
      }else{
        System.out.println("You have too many passengers. Please book again with 5 or less passengers.");
        break;
      }
      System.out.println("\nFor more information about each car and its fare price, enter 'I'");
      carChoice = keyboard.readLine();
      
      if (carChoice.equalsIgnoreCase("I")) {
        Car.showInfo();
        
      }else{
        end = false;
      }
        
    }
    User user = new User(username, userphoneNum, useremail, userpassword, TripDistance, TripDuration, passenger, carChoice);





  }

}