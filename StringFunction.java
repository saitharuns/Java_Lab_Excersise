package Sampleworks;

import java.util.Scanner;
// class 
public class StringFunction 
{ 
	// main method
	public static void main(String[] args) 
	{
		//scanner class used for input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stirng :");
		String str = sc.next(); // taking a string as input
	
		System.out.println("Original String: " + str); //display the original string
		System.out.println("Length of the string: " + str.length());// display the length of the string
		System.out.println("Which Character Position is required ");
		int a=sc.nextInt();//asking to Which Character Position is required
		System.out.println("Character at position "+a+": " + str.charAt(a)); // displaying the position
		System.out.println("First occurrence of 's': " + str.indexOf('s')); // displaying the index of string
		System.out.println("Enter the string for concatination");
		String s=sc.next();//taking input for concatination
		System.out.println("String after concatenation: " + str.concat(""+s)); //displaying the concatinated string
		System.out.println("String in uppercase: " + str.toUpperCase()); //displaying the given string in uppercase
		System.out.println("String in lowercase: " + str.toLowerCase()); //displaying the given string in lowercase
	} 
}