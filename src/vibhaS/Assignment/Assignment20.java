package vibhaS.Assignment;

public class Assignment20 {

	boolean getSumofNonPrimeNum(int num) {
		boolean isPrime;
		boolean flag = true;

		for (int index = 0; index < num / 2; index++) {
			if (num % 2 == 0) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			isPrime = false;
		} else {
			isPrime = true;
		}
		return isPrime;
	}

	boolean nonPrimeDivBy5and7(int num) {
		boolean isPrime;
		boolean flag = true;

		for (int index = 0; index < num / 2; index++) {
			if (num % 2 != 0 && num % 5 == 0 && num % 7 == 0) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			isPrime = false;
		} else {
			isPrime = true;
		}
		return isPrime;
	}

	void getSumOfNonPrimeDivBy5and7(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean ans = nonPrimeDivBy5and7(arr[index]);
			if (ans == false) {
				sum = sum + arr[index];
			}
		}
		System.out.println("Sum of all non  prime num is divisible by 5 and 7 is=> " + sum);
	}

	void getSumOfNonPrime(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean ans = getSumofNonPrimeNum(arr[index]);
			if (ans == false)
				sum = sum + arr[index];
		}
		System.out.println("Sum of all not prime num is => " + sum);
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		int[] arr = { 11, 13, 17, 22, 44 };
		assignment20.getSumOfNonPrime(arr);
		System.out.println("");
		int[] arr1 = { 11, 35, 17, 105, 44 };
		assignment20.getSumOfNonPrimeDivBy5and7(arr1);
	}
}
