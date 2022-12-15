package javathurlab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductDetails {
	public static void main(String[] args) {
		// Get user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the product ID: ");
		String productId = scanner.nextLine();
		System.out.print("Enter the product name: ");
		String productName = scanner.nextLine();
		System.out.print("Enter the product price: ");
		double productPrice = scanner.nextDouble();

		// Write details to file
		try {
			File file = new File("D:\\ProductDetails.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write("Stev Global System inc.");
			writer.write("\n Product ID : "+productId + "\n Porduct Name: "+ productName + "\n Product Price : " + productPrice);
			writer.newLine();
			writer.close();
			System.out.println("Product details saved successfully!");
		} catch (IOException e) {
			System.out.println("An error occurred while trying to write to the file!");
		}
	}
}