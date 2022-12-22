import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//accept number from user
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int copy = num;
		int reverse = 0;
		
		//reverse the number
		while (copy != 0) {
			int rem = copy % 10;
			reverse = (reverse * 10) + rem;
			copy /= 10;
		}
		
		//check if number is palindrome or not
		if (num == reverse) 
			System.out.println("The number is a Palindrome");
		else
			System.out.println("The number is not a Palindrome");
		
		sc.close();
	}
}
/*
output

C:\Users\TONI-VIJAY\Desktop\22-12-22>java PalindromeChecker
Enter a number: 3
The number is a Palindrome

*/