package nehaniG;

public class ArrayOperations {

	int sumOfNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;
	}

	boolean isPrimeNumber(int num) {
		boolean isPrimeNumber = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrimeNumber = false;
			}
		}
		return isPrimeNumber;
	}

	int sumOfPrimeNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (isPrimeNumber(num[index])) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	int maxNumber(int[] num) {
		int maxNumber = num[0];
		for (int index = 0; index < num.length; index++) {
			if (maxNumber < num[index]) {
				maxNumber = num[index];
			}
		}
		return maxNumber;
	}

	int minNumber(int[] num) {
		int minNumber = num[0];
		for (int index = 0; index < num.length; index++) {
			if (minNumber > num[index]) {
				minNumber = num[index];
			}
		}
		return minNumber;
	}

	char middleCharacter(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	void printMiddleCharacter(String[] name) {
		for (int index = 0; index < name.length; index++) {
			char ch = middleCharacter(name[index]);
			System.out.println(name[index] + " -> " + ch);
		}
	}
	public static void main(String[] args) {
			ArrayOperations arrayOperations = new ArrayOperations();
			int[] input1 = { 10, 11, 15 };
			System.out.println("Sum of all the numbers from given array is " +arrayOperations.sumOfNumbers(input1));

			int[] input2 = { 11, 14, 17, 22, 24 };
			System.out.println("Sum of prime numbers from given array is " + arrayOperations.sumOfPrimeNumbers(input2));

			int[] input3 = { 11, 4, 55, 23, 43 };
			System.out.println("Max number from given array is " + arrayOperations.maxNumber(input3));
			System.out.println("Min number from given array is " + arrayOperations.minNumber(input3));

			String[] name = { "Ashish", "Aditty", "Manjiri", "Ankita", "Nehani" };
			System.out.println("\nMiddle character of every array element : ");
			arrayOperations.printMiddleCharacter(name);
	}
}	
