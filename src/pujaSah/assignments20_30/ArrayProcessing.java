package pujaSah.assignments20_30;

import java.util.Arrays;

public class ArrayProcessing {
	int[] getProcessedArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] < arr[i]) {
				arr[i + 1] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ArrayProcessing obj = new ArrayProcessing();

		int[] inArr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original array: " + Arrays.toString(inArr));

		System.out.println("Output array: " + Arrays.toString(obj.getProcessedArray(inArr)));
	}
}
