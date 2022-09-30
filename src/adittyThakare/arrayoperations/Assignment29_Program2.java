/*Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment29_Program2 {

	// Method to return array having all input array 0 values at the beginning
	int[] getShiftZeroAtTheBeginningInArray(int[] inputArray) {
		int[] outputArray = new int[inputArray.length]; // Initialize output array with input array length
		int count = 0;

		for (int index = 0; index < inputArray.length; index++) { // Iterate array till length
			if (inputArray[index] == 0) { // Check how many values are zero and store in count
				count++;
			}
		}
		for (int index = 0; index < inputArray.length; index++) { // Iterate array till length
			if (inputArray[index] != 0) { // Check if input array index value is not zero
				outputArray[count] = inputArray[index]; // Start output array index from count value Assign input array
														// value to output array
				count++;
			}
		}

		return outputArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment29_Program2 assignment29_Program2 = new Assignment29_Program2();
		int[] inputArray = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Program to shift all Zero's at the beginning of an array");
		System.out.println("\nInput Array: " + Arrays.toString(inputArray));
		System.out.println("Output Array: "
				+ Arrays.toString(assignment29_Program2.getShiftZeroAtTheBeginningInArray(inputArray)));
	}

}
