package namratamishra.Array;

/*Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36
*/

import java.util.Scanner;

class ArraySumOfNumbers {

	int getArraySumOfNumbers(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		ArraySumOfNumbers asn = new ArraySumOfNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements of array to get sum");
		int n = sc.nextInt();
		int[] arrayToSum = new int[n];
		System.out.println("Enter  elements of array to get sum");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			arrayToSum[i] = sc.nextInt();
		}
		System.out.println("Sum of numbers from the given set of array is: " + asn.getArraySumOfNumbers(arrayToSum));

		sc.close();

	}
}