/*
 * Return second highest from given array
 * input : {10,99,33,44,89,76}
 * Output: 89
 */

package shridharKumbhar.assignment21_30;

import java.util.Arrays;

public class Assignment21 {

	private int[] getMaxNum(int[] arr) {

		int maxNum = arr[0];
		int[] output = new int[2];

		for (int i = 1; i < arr.length - 1; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
				output[0] = maxNum;
				output[1] = i;
			}
		}
		return output;
	}

	int getSecondMax(int[] arr) {

		int input[] = getMaxNum(arr);
		int Num1 = input[0];
		int NumIndex1 = input[1];
		int secondMax;

		if (NumIndex1 == 0) {
			secondMax = arr[1];
		} else
			secondMax = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == Num1)
				continue;
			else {
				if (secondMax < arr[i]) {
					secondMax = arr[i];
				}
			}
		}

		return secondMax;
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("input: " + Arrays.toString(input));
		Assignment21 a21 = new Assignment21();
		int secondMax = a21.getSecondMax(input);
		System.out.println("Output: " + secondMax);
	}
}