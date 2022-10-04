/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}*/

package rashmiG.ArrayAssignments;

import java.util.Arrays;

class ShiftZerosAtEndOfArray {

	int[] getArrayWithZerosAtEnd(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	void printArrayWithZerosAtEnd(int[] input) {
		int[] output = getArrayWithZerosAtEnd(input);
		/*
		 * for(int num : output){ System.out.print(num+" "); }
		 */
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		ShiftZerosAtEndOfArray zerosAtEndArray = new ShiftZerosAtEndOfArray();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println(Arrays.toString(input));
		zerosAtEndArray.printArrayWithZerosAtEnd(input);
	}
}
