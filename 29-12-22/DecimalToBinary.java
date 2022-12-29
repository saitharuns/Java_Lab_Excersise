package javathurlab;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter the decimal number to convert ");
		Scanner sc = new Scanner(System.in);
		int decimalNumber = sc.nextInt();
		int[] binaryNumber = new int[8];

		// counter for binary array
		int i = 0;
		while (decimalNumber > 0) {
			// storing remainder in binary array
			binaryNumber[i] = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
			i++;
		}

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNumber[j]);

		sc.close();
	}
}