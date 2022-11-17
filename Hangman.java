package Sampleworks;


import java.util.*;

public class Hangman {
	public void start() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word to be guessed");

		String word = scanner.nextLine();

		int length = word.length();

		String dashes = "";

		for(int i=0; i<length; i++) {

		dashes = dashes + "_";

		}

		System.out.println(dashes);

		System.out.println("Enter a letter to guess");

		String letter = scanner.nextLine();

		if(word.contains(letter)) {

		int index = word.indexOf(letter);

		char[] charArray = dashes.toCharArray();

		charArray[index] = letter.charAt(0);

		dashes = String.valueOf(charArray);

		System.out.println(dashes);

		} else {

		System.out.println("Sorry, the letter you guessed is not in the word");

		}

	}

   public static void main(String[] args) {
	   Hangman hg = new Hangman();
	   try {
	   hg.start();
	   }
	   catch(ArrayIndexOutOfBoundsException e) {
		   System.out.println(e);
	   }
   }
}