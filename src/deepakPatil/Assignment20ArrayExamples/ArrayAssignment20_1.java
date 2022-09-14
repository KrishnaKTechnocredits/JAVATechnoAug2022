/*Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)


2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

*/

package deepakPatil.Assignment20ArrayExamples;

import java.util.Arrays;

public class ArrayAssignment20_1 {

	boolean isPrime(int num) {

		boolean status = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	int getSumOfNotPrime(int[] arr) {
		int notPrimeSum = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isPrime(arr[i]);
			if (flag == false)
				notPrimeSum = notPrimeSum + arr[i];
		}
		return notPrimeSum;
	}

	int getSumOfNotPrimeAndDivisbleby5and7(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])!=true) {
				if (arr[i] % 5 == 0 && arr[i] % 7 == 0)
					sum = sum + arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayAssignment20_1 arrayAssignment20 = new ArrayAssignment20_1();

		int[] input1 = { 11, 13, 17, 22, 44 };
		System.out.println("Given array is " + Arrays.toString(input1));
		System.out.println("Sum of not prime number from given array is " + arrayAssignment20.getSumOfNotPrime(input1));

		int[] input2 = { 11, 35, 17, 105, 44 };
		System.out.println("\nGiven array is " + Arrays.toString(input2));
		System.out.println("Sum of not prime and divisible by 5 and 7 numbers from given array is "
				+ arrayAssignment20.getSumOfNotPrimeAndDivisbleby5and7(input2));

	}
}
