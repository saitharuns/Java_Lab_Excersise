package javathurlab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		scanner.close();
		char[] inputStringArray = inputString.toCharArray();
		Map<Character, Integer> countMap = new HashMap<>();
		for (char c : inputStringArray) {
			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);
			} else {
				countMap.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(
						"Duplicate character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
			}
		}
	}
}