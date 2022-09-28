package nehaniG;

import java.util.Arrays;

public class Assignment29 {
	int[] shiftZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;

			}
		}
		return output;
	}

	int[] shiftZeroAtStart(int[] input) {
		int[] shiftedEnd = shiftZeroAtEnd(input);
		int[] shiftedStart = new int[shiftedEnd.length];
		int j = 0;
		for (int i = shiftedEnd.length - 1; i >= 0; i--) {
			shiftedStart[j] = shiftedEnd[i];
			j++;
		}
		return shiftedStart;
	}

	public static void main(String[] args) {
		int[] num = { 10, 0, 0, 3, 4, 5, 0, 9 };
		Assignment29 assignment29 = new Assignment29();
		System.out.println("Input array : " + Arrays.toString(num));
		System.out.println("Shifting all zero's at the end : " + Arrays.toString(assignment29.shiftZeroAtEnd(num)));

		System.out.println("Input array : " + Arrays.toString(num));
		System.out.println("Shifting all zero's at the start : " + Arrays.toString(assignment29.shiftZeroAtStart(num)));
	}
}
