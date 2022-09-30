package rohini.arrayAssignments;
//Assignment 19
//Program 1: Sum of array
public class SumOfArray {
	int sumArray(int[] array1) {
		int sum = 0;
		System.out.print("Array Elements: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(+array1[i] + ",");
			sum = sum + array1[i];
		}

		return sum;
	}
//Program 2: Sum of prime numbers
	boolean isPrime(int number) {
		boolean flag = true;

		for (int index = 2; index < number / 2; index++) {
			if (number % index == 0) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		return flag;

	}
	int sumOfPrime(int[] input) {
		int sum = 0;
		System.out.print("Array elements: ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(+input[i] + ",");
			if (isPrime(input[i]) == true) {
				sum = sum + input[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] array1 = { 10, 11, 15 };
		int output = new SumOfArray().sumArray(array1);
		System.out.println("\nSum: " + output);
		int[] input = { 11, 14, 17, 22, 44 };
		int sum = new SumOfArray().sumOfPrime(input);
		System.out.println("\nSum of prime numbers: " + sum);

	}
}
