package Java_Lab_Exercises; // package
import java.util.Scanner; // imported scanner for input

public class SwapWithTemp {// class 
	
	static void swap(int a , int b) {  // static method with two parameters
 		//assume a as 10 and b as 20
		int temp; // created a temporary variable for swapping  
		temp = a; // the value of a stores in temp : temp = 10.
		a = b; //the b value will be stored in a : a = 20.
		b = temp;// the temp value will be stored in b : b= 10.
		// a=20 and b=10
		System.out.println("After Swap "+a+" "+b); //the value will be printed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// scanner class created
		System.out.println("Enter two numbers for Swapping");
		int firstval = sc.nextInt();// first value inserted here
		int secondval = sc.nextInt();// second value will be inserted here
		System.out.println("Before Swapping"+firstval+" "+secondval);
		swap(firstval,secondval);//the static method is called for swap using parameters
	}

}
