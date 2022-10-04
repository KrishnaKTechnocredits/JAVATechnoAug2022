package shubhamG.Assignment11to20;

public class ArrayPractice {

	int getSumOfAllNumbers(int[] arr) {
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
				break;
			} else
				isPrime = true;
		}
		return isPrime;
	}

	int getSumOfPrimeNumber(int[] arr) {
		// ArrayPractice checkPrime = new ArrayPractice();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrimeNumber(arr[i])) {
				sum = sum + arr[i];
			}
		}

		return sum;
	}

	int getMaxNumberFromArray(int[] arr) {
		int maxNumber = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maxNumber < arr[i]) {
				maxNumber = arr[i];
			}
		}
		return maxNumber;
	}

	int getMinNumberFromArray(int[] arr) {
		int minNumber = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (minNumber >= arr[i]) {
				minNumber = arr[i];
			}
		}
		return minNumber;
	}

	char getMiddleCharacter(String str) {
		char middle;
		if (str.length() % 2 == 0) {
			middle = str.charAt((str.length() / 2) - 1);
		} else {
			middle = str.charAt(str.length() / 2);
		}
		return middle;
	}

	void getMiddleCharOfArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			char ch = getMiddleCharacter(arr[i]);
			System.out.println("Middle character of String " + arr[i] + " is: " + ch);
		}
	}

	public static void main(String[] args) {

		ArrayPractice arrayPractice = new ArrayPractice();

		int[] num1 = { 10, 11, 15 };
		System.out.println("Sum of all number of given array is: " + arrayPractice.getSumOfAllNumbers(num1));

		int[] num2 = { 11, 14, 17, 22, 44 };
		System.out.println("\nSum of Prime numbers from given array is: " + arrayPractice.getSumOfPrimeNumber(num2));

		int[] num3 = { 11, 4, 55, 23, 43 };
		System.out.println("\nMax number from given array is: " + arrayPractice.getMaxNumberFromArray(num3));

		int[] num4 = { 11, 4, 55, 23, 43 };
		System.out.println("\nMin number from given array is: " + arrayPractice.getMinNumberFromArray(num4));

		String[] str1 = { "Ashish", "Aditty", "Manjiri", "Ankita" };	
		System.out.println("\nMiddle characters from given strings are - ");
		arrayPractice.getMiddleCharOfArray(str1);

	}

}
