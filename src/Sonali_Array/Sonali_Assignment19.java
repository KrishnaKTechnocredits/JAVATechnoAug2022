package Sonali_Array;

public class Sonali_Assignment19 {
	int sumOfAllNumbers(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
			} else
				isPrime = true;
		}
		return isPrime;
	}
	int sumOfPrimeNumber(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i])) {
				sum = sum + arr[i];
			}
		}

		return sum;
	}
	int maxNumberFromArray(int[] arr) {
		int maxNumber = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxNumber < arr[i]) {
				maxNumber = arr[i];
			}
		}
		return maxNumber;
	}
	int minNumberFromArray(int[] arr) {
		int minNumber = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (minNumber >= arr[i]) {
				minNumber = arr[i];
			}
		}
		return minNumber;
	}
	char middleCharacter(String str) {
		char middle;
		if (str.length() % 2 == 0) {
			middle = str.charAt((str.length() / 2) - 1);
		} else {
			middle = str.charAt(str.length() / 2);
		}
		return middle;
	}

	void middleCharOfArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			char ch = middleCharacter(arr[i]);
			System.out.println("Middle character of String " + arr[i] + " is: " + ch);
		}
	}
	public static void main(String[] args) {

		Sonali_Assignment19 sonali_assignment19 = new Sonali_Assignment19();

		int[] num1 = { 10, 11, 15 };
		System.out.println("Sum of all number of given array is: " + sonali_assignment19.sumOfAllNumbers(num1));

		int[] num2 = { 11, 14, 17, 22, 44 };
		System.out.println("\nSum of Prime numbers from given array is: " + sonali_assignment19.sumOfPrimeNumber(num2));

		int[] num3 = { 11, 4, 55, 23, 43 };
		System.out.println("\nMax number from given array is: " + sonali_assignment19.maxNumberFromArray(num3));

		int[] num4 = { 11, 4, 55, 23, 43 };
		System.out.println("\nMin number from given array is: " + sonali_assignment19.minNumberFromArray(num4));

		String[] str1 = { "Ashish", "Aditty", "Manjiri", "Ankita" };	
		System.out.println("\nMiddle characters from given strings are - ");
		sonali_assignment19.middleCharOfArray(str1);

	}
}
