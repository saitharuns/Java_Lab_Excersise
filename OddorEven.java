package javaproject;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;// declaring the variable
		System.out.println("Enter the Number : ");
		Scanner sc = new Scanner(System.in);// Using Scanner class for input purpose
		a=sc.nextInt();// assigning an input from console to the variable a; 
		String check = (a%2==0)?"Even":"Odd";// Ternary Operator is used for checking the condition;
		System.out.println("the given number:  "+a+" "+check);// the output will be printed;

	}

}
//by Sai Tharun S