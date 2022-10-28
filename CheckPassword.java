package javaproject;
import java.util.Scanner;


public class CheckPassword {
	String a,b;// declared a String Variables;	
	void getpass(String a, String b){ //getting the value;
		
		this.a=a;//a in method is assigned to a in class
		this.b=b;//b in method is assigned to b in class
	}
	void checkpass(){ // used to check password;
		if(this.a.equals(b)) { // it checks the condition
			System.out.println("The Given Password is Matching");// if the condition passes then it prints this line.
		}else {
			System.out.println("Error Check Again");// if the condition fails then this statement will be printed.
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckPassword cp=new CheckPassword();// object is created for a class
		Scanner sc = new Scanner(System.in);// object is created for a Scanner class 
		String c,d;//two strings are created to take the input from the user 
		System.out.println("Enter Your Password ");
		c=sc.next();// takeing first input as password
		System.out.println("Re-enter Your Password ");
		d=sc.next();// takeing second input as confirm password
		cp.getpass(c, d);// passing those two input to a getpass parameterized method
		cp.checkpass();//calling the checkpass method.

	}

}
