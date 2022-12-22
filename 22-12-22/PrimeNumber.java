public class PrimeNumber {
	
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("The number is Prime Number");
		} else {
			System.out.println("The number is not a Prime Number");
		}
	}
}

/*
Output..............

C:\Users\TONI-VIJAY\Desktop\22-12-22>java PrimeNumber 3
The number is Prime Number

*/