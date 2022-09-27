/*Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/

package manjiri.arrayEx.asssignment29;

import java.util.Arrays;

public class ShiftRightZerosInArrays {

	int[] getProcessedArray(int[] input) {
		System.out.println("Input Array is: " + Arrays.toString(input));
		System.out.println("----------------------------------------------------------------------------");
		int[] output = new int[input.length];
		int count = 0;

		// To calculate number of zeros in input array
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				count++;
		}
		
		//To create output array with all zeros shifted to the Right
		for (int outIndex = 0; outIndex < input.length; outIndex++) {
			if (input[outIndex] != 0) {
				output[count] = input[outIndex];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] inputArr = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Processed array after shifting zeros to RIGHT is: "
				+ Arrays.toString(new ShiftRightZerosInArrays().getProcessedArray(inputArr)));
	}
}
