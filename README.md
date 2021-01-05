[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3824720&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

## Class Diagram
<img src="https://github.com/SACHSTech/ics4u-oop-assignment-jenniferluk/blob/main/src/Class%20Diagram.png?raw=true"> 

## Summary
The system that is being model is the Uber ride service system that stimulates the booking process of an Uber ride. The program is made using seven objects which are Booking, Driver, User, and the 5 Uber car options, UberX, UberXL, UberComfort, UberBlack, and UberBlackSUV, which inherits the car object. 

The main object is the Booking object which stores the User, Car, and Driver information. Whenever a user creates an account and chooses their car choice, a driver will be assigned to their car and the parameters passed through the User and Driver object will be passed through the Booking class as well. Therefore, this ia a has-a relationship or aggregation. 

Next, each car can be further divided into 5 classes of Uber car types. This is a is-relationship or is abstract since UberX, UberXL, UberComfort, UberBlack, and UberBlackSUV is a car. All 5 Uber cars are cars, but not all Uber cars are cars since they do not qualify Uber's vehicle requirements. Depending on which car the user chooses, details such as the car brand, model, driver, and fare price will be different. The car class holds the general data that each car has which is the brand, model, and a driver. There is also an abstract method called getFare and it's abstract since the fare varies per car. 

To use the program, the user simply needs to follow the prompts that are given in the console. Whenever the user inputs an invalid input, a specific section of the program will loop until the user's inputs meets the specific condition(s). Once the user has finished inputting the required information, the program will proceed with storing all the information and printing it out to confirm with the user. In the end, the user will make a payment and complete the booking process. 