package UberSimulation;

import java.io.*;
import java.util.*;
import java.util.Scanner;

import UberStimulation.*;

public class UberMain {

  // method to print divider
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

    // use pause method
    pause(1500);
  }

  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
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
    String choice2; 
    int CardNumber; 
    String ExpDate;
    String giftcode;
    int CVV; 
    int TripDuration;
    int TripDistance;
    int passenger = 0;
    double fare = 0; 
    boolean menu = true;

    
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

    System.out.print("Enter your email: ");
    useremail = keyboard.readLine();

    System.out.print("Enter a password: ");
    userpassword = keyboard.readLine();

    System.out.println("Processing your information...");
    pause(500);

    // clear screen to booking page
    clearScreen();
    System.out.println("Request a ride, hop in, and relax.");
    printDivider();

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

        // if statement to end loop if inpt is valid 
        if (1 <= passenger && passenger <= 5) {
          end2 = false;
        } else {
          System.out.println("Invalid input. Please enter 1-5 passengers.");
        }
      }

      printDivider();

      // create while loop until user enters valid car option 
      end2 = true;
      while (end2) {

        // print out car menu for 3 or less passengers
        if (passenger <= 3) {
          System.out.println("Choose a ride: \n * UberX\n * UberComfort\n * UberXL\n * UberBlack\n * UberBlackSUV");

        // print out car menu for 5 or less passengers 
        } else if (3 < passenger && passenger <= 5) {
          System.out.println("Choose a ride: \n * UberXL\n * UberBlackSUV");
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
        } else if (carChoice.equalsIgnoreCase("UberComfort")) {
          Car ubercomfort = new UberComfort(TripDuration, TripDistance);
          fare = ubercomfort.getFare();
          driver = new Driver("Sarah");
          drivername = driver.getName();
          driverphonenum = driver.getphoneNum();
          driverrating = driver.getRating();
          end2 = false;
        } else if (carChoice.equalsIgnoreCase("UberXL")) {
          Car uberxl = new UberXL(TripDuration, TripDistance);
          fare = uberxl.getFare();
          driver = new Driver("Amy");
          drivername = driver.getName();
          driverrating = driver.getRating();
          driverphonenum = driver.getphoneNum();
          end2 = false;
        } else if (carChoice.equalsIgnoreCase("UberBlack")) {
          Car uberblack = new UberBlack(TripDuration, TripDistance);
          fare = uberblack.getFare();
          driver = new Driver("Jess");
          drivername = driver.getName();
          driverphonenum = driver.getphoneNum();
          driverrating = driver.getRating();
          end2 = false;
        } else if (carChoice.equalsIgnoreCase("UberBlackSUV")) {
          Car uberblacksuv = new UberBlackSUV(TripDuration, TripDistance);
          fare = uberblacksuv.getFare();
          driver = new Driver("Alex");
          drivername = driver.getName(); 
          driverphonenum = driver.getphoneNum();
          driverrating = driver.getRating();
          end2 = false;
        
        // input to call method from car class 
        } else if (carChoice.equalsIgnoreCase("I")) {
          clearScreen();
          Car.showInfo();
          System.out.println("\nEnter 'X' to exit menu.");
          
          // createa while loop to keep the fare menu open 
          while (menu){

            // continue reading line as long as menu is opened
            choice = keyboard.readLine();

            // if statement to see if user closes menu 
            if (choice.equalsIgnoreCase("X")){
              clearScreen();
              menu = false;

            } else {
              System.out.println("Invalid input. Please try again.");
            }
          }

        // an invalid input will keep the car menu looping 
        } else {
          System.out.println("Invalid input. Please try again.\n");
          pause(500);
        }
      }
      
      // reset variable 
      choice = ""; 

      System.out.println("Searching for a ride...");
      pause(1000);
      
      // create object for user 
      User user = new User(username, userphoneNum, useremail, userpassword);

      // pass user and driver info into booking class 
      Booking booking = new Booking(username, TripDistance, TripDuration, passenger, carChoice, fare, drivername, driverphonenum, driverrating);

      // clear screen to confirmation page 
      clearScreen(); 
      
      // print out user's booking info
      System.out.println(booking);
      
      // create loop for confirmation menu 
      end2 = true;
      while (end2) {  
        System.out.println("\nTo proceed with payment enter 'P'\nFor more information about your driver enter 'D'\nTo make changes to your booking enter 'C'"); 
        choice = keyboard.readLine();
        
        switch (choice.toUpperCase()) {

          // ends loop if user chooses to proceed with payment  
          case "P" :  
            end2 = false; 

            // create a loop for checkout menu
            end2 = true;
            while (end2) {
              clearScreen();
              System.out.println("PAYMENT");
              printDivider();
              System.out.print("Choose a payment method by entering the first letter of each option: \n[Credit or Debit Card] [Gift Card]\n");
              choice = keyboard.readLine(); 
          
              switch (choice.toUpperCase()) {

                // user chooses credit or debit option 
                case "C" :
                  System.out.print("Card Number: ");
                  CardNumber = Integer.parseInt(keyboard.readLine()); 
                  System.out.print("Expiry Date (MM/YY): "); 
                  ExpDate = keyboard.readLine(); 
                  System.out.print("CVV(123): "); 
                  CVV = Integer.parseInt(keyboard.readLine());

                  // use getter method to get booking fare price 
                  System.out.print("Your total: $"+ booking.getFare() + "\nTo confirm your booking please enter your password: ");
                  userpassword = keyboard.readLine(); 

                  // if statement to check if users inputted password matches previous password
                  if (userpassword.equals(user.getPassword())){
                    System.out.println("Your booking has been confirmed. Thank you for riding with Uber. Your driver will contact you shortly.");
                    end2 = false; 
                    end1 = false; 
                    break; 
                  } else {
                    System.out.println("Incorrect password. Please try again.");
                    pause(500);
                    break;
                  }
                
                // user chooses gift card option 
                case "G" :
                  System.out.print("Gift Code: ");
                  giftcode = keyboard.readLine(); 

                  // if statement to check if user inputs correct code 
                  if (giftcode.equalsIgnoreCase("TOPSECRET")){
                    System.out.println("Congratulations! You receive this ride for free! Thank you for riding with Uber. Your driver will contact you shortly.");
                    end2 = false; 
                    end1 = false; 
                    break;
                  } else {
                    System.out.println("Incorrect gift code. Please try again.");
                    pause(500);
                  }
                }
            }
            // end program once user finishes payment 
            break;
          
          // print out driver information if user enters D, loop continues 
          case "D" :
            clearScreen();
            System.out.println("YOUR DRIVER");
            printDivider();
            System.out.println(driver);
            System.out.println("\nEnter 'X' to exit menu.");

            menu = true;
            // create a while loop to keep the driver info menu open 
            while (menu){

              // continue reading line as long as menu is opened
              choice2 = keyboard.readLine();

              // if statement to see if user closes menu 
              if (choice2.equalsIgnoreCase("X")){
                clearScreen();
                menu = false;
                System.out.println(booking);
                break;
              } else {
                System.out.println("Invalid input. Please try again.");
              }
            }
          break;
          
          // end confirmation menu loop but loop back to user input fields to correct booking 
          case "C" :
            clearScreen();
            System.out.println("ADJUST YOUR BOOKING");
            printDivider();
            end2 = false;    
            break;

          default :
          System.out.println("Invalid input, try again");
          pause(500);
          clearScreen();
          System.out.println(booking);

        }
      }
    }
  }
}