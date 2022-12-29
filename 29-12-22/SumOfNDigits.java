package javathurlab;

import java.util.Scanner;

public class SumOfNDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array:");
		int number = input.nextInt();
		int[] array = new int[number];
		System.out.println("Input " + number + " elements in the array:");
		for (int i = 0; i < number; i++) {
			array[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum += array[i];
		}
		System.out.println("Sum of " + number + " elements stored in the array is: " + sum);
	}
}