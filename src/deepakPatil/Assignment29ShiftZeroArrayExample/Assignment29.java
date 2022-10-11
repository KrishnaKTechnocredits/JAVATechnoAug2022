/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
*/

package deepakPatil.Assignment29ShiftZeroArrayExample;

import java.util.Arrays;

public class Assignment29 {

	int[] shiftAllZerosAtEnd(int[] input) {
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

	int[] shiftAllZerosAtStart(int[] input) {

		int[] output = new int[input.length];
		int count = 0;
		for (int index1 = 0; index1 < input.length; index1++) {
			if (input[index1] == 0)
				count++;
		}

		for (int index2 = 0; index2 < input.length; index2++) {
			if (input[index2] != 0) {
				output[count] = input[index2];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Given input array is :" + Arrays.toString(input));
		System.out.println("\nModified array after shifting all zeros at the end of the array as below :");
		int[] output1 = assignment29.shiftAllZerosAtEnd(input);
		System.out.println(Arrays.toString(output1));

		System.out.println("\nModified array after shifting all zeros at the start of the array as below :");
		int[] output2 = assignment29.shiftAllZerosAtStart(input);
		System.out.println(Arrays.toString(output2));
	}
}
