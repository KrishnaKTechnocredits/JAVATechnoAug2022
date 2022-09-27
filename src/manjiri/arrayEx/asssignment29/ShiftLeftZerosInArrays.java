/*Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}*/

package manjiri.arrayEx.asssignment29;

import java.util.Arrays;

public class ShiftLeftZerosInArrays {
	
	
	int[] getProcessedArray(int[] input) {
		System.out.println("Input array is: " + Arrays.toString(input));
		System.out.println("-------------------------------------------------------------------------------");
		int[] output = new int[input.length];
		int outIndex = 0;
		
		//To create output array with all zeros shifted to the Left
		for (int index = 0; index < input.length; index++) {
			if(input[index] != 0) {
				output[outIndex] = input[index];
				outIndex++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] inputArr = {10,0,0,3,4,5,0,9};
		System.out.println("Processed array after shifting zeros to the LEFT is: " + Arrays.toString(new ShiftLeftZerosInArrays().getProcessedArray(inputArr)));
	}

}
