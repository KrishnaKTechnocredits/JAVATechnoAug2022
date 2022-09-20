/*Assignment 21 - 14th Sept 2022
 * Write program to find second largest number in an array*/

package sanket;

import java.util.Arrays;

public class ArraySecondMax {

	int getSecondMaxFromArray(int[] arr) {

		int maxNumber = arr[0];
		int secondMax = 0;

		for (int index = 1; index < arr.length; index++) {

			if (maxNumber < arr[index]) {
				secondMax = maxNumber;
				maxNumber = arr[index];
			} else if (secondMax < arr[index]) {
				secondMax = arr[index];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 67, 54, 78, 33 };
		int[] arr2 = { 10, 99, 33, 44, 89, 76 };

		System.out.println("The given array is : " + Arrays.toString(arr2));
		System.out.println(
				"The second maximum value in given array is : " + new ArraySecondMax().getSecondMaxFromArray(arr2));
	
		System.out.println("\n" + "The given array is : " + Arrays.toString(arr));
		System.out.println(
				"The second maximum value in given array is : " + new ArraySecondMax().getSecondMaxFromArray(arr));

	}
	
}