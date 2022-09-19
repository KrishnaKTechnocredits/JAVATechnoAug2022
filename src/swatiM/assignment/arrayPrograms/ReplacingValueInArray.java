package swatiM.assignment.arrayPrograms;

import java.util.Arrays;
public class ReplacingValueInArray {

	int[] getProcessedArray(int[] arr) {
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index + 1] < arr[index]) {
				arr[index] = 0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		ReplacingValueInArray obj = new ReplacingValueInArray();

		int[] inArr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original array: " + Arrays.toString(inArr));

		System.out.println("Output array: " + Arrays.toString(obj.getProcessedArray(inArr)));
	}
}