package akankshaVyas.StringOperation;

import java.util.Arrays;

public class Array {

	int[] getProcessArray(int[] arr) {

		for (int index = 0; index < (arr.length) - 1; index++) {
			if (arr[index] > arr[index + 1]) {
				arr[index] = 0;
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("input array is" + Arrays.toString(input));
		int[] output = new Array().getProcessArray(input);
		System.out.println("output array is " + Arrays.toString(output));

	}
}
