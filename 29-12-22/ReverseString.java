package javathurlab;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String inputString = scanner.nextLine();
		scanner.close();
		int length = inputString.length();
		String reverseString = "";
		for (int i = length - 1; i >= 0; i--) {
			reverseString = reverseString + inputString.charAt(i);
		}
		System.out.println("Reversed string is:");
		System.out.println(reverseString);
	}
}