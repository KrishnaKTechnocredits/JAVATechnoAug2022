/*Assignment 24 - 17th Sept 2022
 * Write a program that creates an array of inputs where each element is replaced with the sum of the other elements.
 * input = { 12, 2, 11, 17 };
 * output = [30, 40, 31, 25]*/

package sanket;

import java.util.Arrays;

public class ArrayOperationsEx5 {

	int[] processData(int[] arr) {

		int[] output = new int[arr.length];

		for (int index = 0; index < arr.length; index++) {

			int sumValues = 0;
			for (int j = 0; j < arr.length; j++) {
				if (index != j) {
					sumValues = sumValues + arr[j];
				}
			}
			output[index] = sumValues;
		}
		return output;
	}

	public static void main(String[] args) {

		int[] input = { 12, 2, 11, 17 };
		System.out.println("The input array is : " + Arrays.toString(input));
		
		int[] output = new ArrayOperationsEx5().processData(input);
		System.out.println("The output array is : " + Arrays.toString(output));
		
		
	}
}