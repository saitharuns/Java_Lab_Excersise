package Java_Lab_Exercises;
import java.util.Scanner;

public class Palindrome { // class
	
	static void checkpalindrome(int a)//method to check palindrome
	{
		int reminder, sum=0, temp; // assigned variable
		temp = a; // a value assigned to temp
		while(a>0){    
			   reminder=a%10;  //getting remainder  
			   sum=(sum*10)+reminder;    
			   a=a/10;    
			  }    
			  if(temp==sum)    // checks the temp is equals to sum
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // Scanner class is created
	   System.out.println("Enter the number to check palindrome ");
		 int num=sc.nextInt(); //input is assigned to num    
		 checkpalindrome(num); // calling the static function using num input as parameter

	}
}


