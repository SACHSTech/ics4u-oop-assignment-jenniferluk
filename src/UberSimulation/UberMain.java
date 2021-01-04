package UberSimulation;

import java.io.*;
import java.util.*;
import java.util.Scanner;

import UberStimulation.*;

// method to print divider
public class UberMain {
  private static void printDivider() {
    for (int i = 0; i < 55; i++) {
      System.out.print("=");
    }
    System.out.println();
  }

  // method to print out Uber logo
  public static void displayLogo() {

    System.out.println(
        "\n    ***    ***   *******    ********  ******* \n    ***    ***   ********   ********  ********\n    ***    ***   ***  ***   ***       ***  ****\n    ***    ***   ***  ***   ***       ***  ****\n    ***    ***   ********   ********  *********\n    ***    ***   *******    ********  ********\n    ***    ***   ***  ***   ***       ***  ****\n    ***    ***   ***  ***   ***       ***   ****\n     ********    ********   ********  ***    ****\n      ******     *******    ********  ***    ****");

    pause(1500);
  }
  
  // method to pause console
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
    String drivername = "";
    String driverrating = ""; 
    String driverphonenum = ""; 
    String choice; 
    String CardNumber; 
    String ExpDate;
    String giftcode;
    int CVV; 
    int TripDuration;
    int TripDistance;
    int passenger = 0;
    double fare = 0; 
    
    // initialize driver object 
    Driver driver = new Driver("");
    
    displayLogo();
    System.out.println();
    printDivider();

    // ask for user information
    System.out.print("Welcome to Uber! Sign Up to Ride: \nFirst Name: ");
    username = keyboard.readLine();

    System.out.print("Last Name: ");
    username = username + " " + keyboard.readLine();

    System.out.print("Enter your mobile number (no dashes): ");
    userphoneNum = keyboard.readLine();
    ;

    System.out.print("Enter your email: ");
    useremail = keyboard.readLine();

    System.out.print("Enter a password: ");
    userpassword = keyboard.readLine();

    // create while loop for booking changes 
    boolean end1 = true; 
    while (end1) {
      System.out.print("Enter the duration of your trip in mins: ");
      TripDuration = Integer.parseInt(keyboard.readLine());

      System.out.print("Enter the distance of your trip in km: ");
      TripDistance = Integer.parseInt(keyboard.readLine());

      // create while loop until user enters appropiate # of passengers
      boolean end2 = true; 
      while(end2){
        System.out.print("Enter the # of passengers: ");
        passenger = Integer.parseInt(keyboard.readLine());
        if(passenger <= 5){
          end2 = false;
        }else{
          System.out.println("You have too many passengers. Please enter 5 or less passengers.");
        }
      }

      // create while loop until user enters valid car option 
      end2 = true;
      while (end2) {
        printDivider();

        boolean carmenu = true; 
        while (carmenu){

          // print out car menu for 3 or less passengers
          if (passenger <= 3) {
            System.out.println("\nChoose a ride: \n * UberX\n * UberComfort\n * UberXL\n * UberBlack\n * UberBlackSUV");

          // print out car menu for 5 or less passengers 
          } else if (3 < passenger && passenger <= 5) {
            System.out.println("Choose a ride: \n" + "UberXL\n" + "UberBlackSUV");
          }
      
          System.out.println("\nFor more information about each car and its fare price, enter 'I'");

          carChoice = keyboard.readLine();

          // set user data based on car choice
          // depending on car choice, parameters will be passed to specific uber car class
          // each uber car will have a driver
          if (carChoice.equalsIgnoreCase("UberX")) {
            Car uberx = new UberX(TripDuration, TripDistance);
            fare = uberx.getFare();
            driver = new Driver("John");
            drivername = driver.getName();
            driverphonenum = driver.getphoneNum();
            driverrating = driver.getRating();
            end2 = false; 
            carmenu = false;
          } else if (carChoice.equalsIgnoreCase("UberComfort")) {
            Car ubercomfort = new UberComfort(TripDuration, TripDistance);
            fare = ubercomfort.getFare();
            driver = new Driver("Sarah");
            drivername = driver.getName();
            driverphonenum = driver.getphoneNum();
            driverrating = driver.getRating();
            end2 = false;
            carmenu = false;
          } else if (carChoice.equalsIgnoreCase("UberXL")) {
            Car uberxl = new UberXL(TripDuration, TripDistance);
            fare = uberxl.getFare();
            driver = new Driver("Amy");
            drivername = driver.getName();
            driverrating = driver.getRating();
            driverphonenum = driver.getphoneNum();
            end2 = false;
            carmenu = false;
          } else if (carChoice.equalsIgnoreCase("UberBlack")) {
            Car uberblack = new UberBlack(TripDuration, TripDistance);
            fare = uberblack.getFare();
            driver = new Driver("Jess");
            drivername = driver.getName();
            driverphonenum = driver.getphoneNum();
            driverrating = driver.getRating();
            end2 = false;
            carmenu = false;
          } else if (carChoice.equalsIgnoreCase("UberBlackSUV")) {
            Car uberblacksuv = new UberBlackSUV(TripDuration, TripDistance);
            fare = uberblacksuv.getFare();
            driver = new Driver("Alex");
            drivername = driver.getName(); 
            driverphonenum = driver.getphoneNum();
            driverrating = driver.getRating();
            end2 = false;
            carmenu = false;
          
          // input to call method from car class 
          } else if (carChoice.equalsIgnoreCase("I")) {
            Car.showInfo();

          // an invalid input will keep the car menu looping 
          } else {
            System.out.println("Invalid input. Please try again.");
          }
        }

      }
      
      System.out.println("Searching for a ride...");
      pause(1000);

      // create object for user 
      User user = new User(username, userphoneNum, useremail, userpassword);

      // pass user and driver info into booking class 
      Booking booking = new Booking(username, TripDistance, TripDuration, passenger, carChoice, fare, drivername, driverphonenum, driverrating);

      System.out.println(booking);

      // create loop for confirmation menu 
      end2 = true;
      while (end2) {
        
        System.out.println("\nTo proceed with payment enter 'P'\nFor more information about your driver enter 'D'\nTo make changes to your booking enter 'C'"); 
        choice = keyboard.readLine();
        
        switch (choice.toUpperCase()) {

            
          case "P" : 

            // ends loop if user chooses to proceed with payment 
            end2 = false; 
            break;
          case "D" :

            // print out driver information 
            System.out.println();
            System.out.println(driver);
            break; 
          
          // end confirmation menu loop but loop back to user input fields to correct booking 
          case "C" :
            end2 = false;
            System.out.println("\nMake changes to your booking");
        }
      }
      end2 = true;
      while(end2){
        System.out.print("\nChoose a payment method by entering the first letter of each option: \n[Credit or Debit Card] [Gift Card]\n");
        choice = keyboard.readLine(); 
     
        switch (choice.toUpperCase()) {
          case "C" :
            System.out.print("Card Number: ");
            CardNumber = keyboard.readLine(); 
            System.out.print("Expiry Date (MM/YY): "); 
            ExpDate = keyboard.readLine(); 
            System.out.print("CVV(123): "); 
            CVV = Integer.parseInt(keyboard.readLine());
            System.out.print("Your total: $"+ booking.getFare() + "\nTo confirm your booking please enter your password: ");
            userpassword = keyboard.readLine(); 
            if (userpassword.equals(user.getpassword())){
              System.out.println("Your booking has been confirmed. Thank you for riding with Uber. Your driver will contact you shortly.");
              end2 = false; 
              end1 = false; 
              break; 
            } else {
              System.out.println("Incorrect password. Please try again.");
            }
          
          case "G" :
            System.out.println("Gift Code: ");
            giftcode = keyboard.readLine(); 
            if (giftcode.equalsIgnoreCase("TOPSECRET")){
              System.out.println("Congratulations! You receive this ride for free! Thank you for riding with Uber. Your driver will contact you shortly.");
              end2 = false; 
              end1 = false; 
              break;
            } else {
              System.out.println("Incorrect gift code. Please try again.");
            }
          }
        }
    }
  }
}