package Sampleworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    static void calcuate() {
    	// create a new Scanner object
    	Scanner input = new Scanner(System.in);
    // print a welcome message
    System.out.println("Welcome to the Calculator!");
    
    // perform calculation until the user enters 'n' or 'N'
    while (true) {
      
      // get first input from the user
      System.out.print("Enter the first number: ");
      int num1 = input.nextInt();
      
      // get second input from the user
      System.out.print("Enter the second number: ");
      int num2 = input.nextInt();
      
      // print the menu
      System.out.println("\nSelect an operation:");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.print("\nEnter your choice: ");
      int choice = input.nextInt();
      
      // perform the selected operation
      int result = 0;
      switch (choice) {
        case 1:
          result = num1 + num2;
          break;
        case 2:
          result = num1 - num2;
          break;
        case 3:
          result = num1 * num2;
          break;
        case 4:
          result = num1 / num2;
          break;
        default:
          System.out.println("Invalid input!");
          continue;
      }
      
      // print the result
      System.out.println("Result: " + result);
  
    }
    }
	  public static void main(String[] args) {
	    try { // checking for the exceptions in the above functions
	    	calcuate();
	    }
	    catch(ArithmeticException | InputMismatchException e) {
	    	System.out.println(e); 

	    }
	  }
	}