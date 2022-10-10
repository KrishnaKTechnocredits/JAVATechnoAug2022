/*Assignment - 29 : 27th Sep'2022

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/

package rashmiG.ArrayAssignments;

import java.util.Arrays;

class ShiftZerosAtBeginningOfArray {

	int getZerosCount(int[] input) {
		int zeroCount = 0;
		for (int num : input) {
			if (num == 0) {
				zeroCount++;
			}
		}
		return zeroCount;
	}

	int[] getArrayWithZerosAtBeginning(int[] input) {
		int count = getZerosCount(input);
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}

		return output;

	}

	void printZerosAtEndArrayAnotherApproach(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = input.length - 1;
		for (int index = input.length - 1; index >= 0; index--) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex--;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] input1 = { -10, -20, 0 };
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(new ShiftZerosAtBeginningOfArray().getArrayWithZerosAtBeginning(input)));

		System.out.print("\n");
		System.out.println(Arrays.toString(input1));
		System.out.println(Arrays.toString(new ShiftZerosAtBeginningOfArray().getArrayWithZerosAtBeginning(input1)));
		/*
		 * System.out.println(Arrays.toString(input));
		 * 
		 * new
		 * ShiftZerosAtBeginningOfArray().printZerosAtEndArrayAnotherApproach(input);
		 * System.out.println(Arrays.toString(input1)); new
		 * ShiftZerosAtBeginningOfArray().printZerosAtEndArrayAnotherApproach(input1);
		 */

	}
}