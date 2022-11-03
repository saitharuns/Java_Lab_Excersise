package Java_Lab_Exercises; // package
import java.util.Scanner; // imported scanner for input
public class PrimeOrNot { // Class 
	
	static {  // Static block is used for display the heading
		System.out.println("Check prime or Not Program");
	}
	void checkprime(int a)//method is created with 1 parameter assume i=3
	{
		boolean con = false; //boolean is used for true or false condition
		for(int i=2;i<= a/2; i++) // 2<=3/2 
		{
			// to check number is not prime goes to the if condition 
			if(a%i==0)//in this condition fails
			{
				con=true;
				break;
			}// so it come out of the loop and the con will remain false
		}
		if(con==false) { 
			System.out.println("The Number "+a+" is Prime ");
		}
		else { // if the con = true then the else statement will be executed
			System.out.println("The Number "+a+" is not Prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeOrNot obj = new PrimeOrNot(); // object is created for class
		Scanner sc = new Scanner(System.in); // scanner object is created
		System.out.println("enter the number to find Prime ");
		int num = sc.nextInt();//assigning the input to num
		obj.checkprime(num);// calling checkprime method with num as parameter

	}

}
