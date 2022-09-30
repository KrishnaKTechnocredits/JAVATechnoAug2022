/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}*/

package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment29_Program1 {

	// Method to return array having all input array 0 values at the end
	int[] getShiftZeroAtTheEndInArray(int[] inputArray) {
		int[] outputArray = new int[inputArray.length]; // Initialize output array with input array length
		int count = 0;

		for (int index = 0; index < inputArray.length; index++) { // Iterate array till length
			if (inputArray[index] != 0) { // Check if input array index value is not zero
				outputArray[count] = inputArray[index]; // Assign this value to output array
				count++;
			}
		}

		return outputArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment29_Program1 assignment29_Program1 = new Assignment29_Program1();
		int[] inputArray = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Program to shift all Zero's at the end of an array");
		System.out.println("\nInput Array: " + Arrays.toString(inputArray));
		System.out.println(
				"Output Array: " + Arrays.toString(assignment29_Program1.getShiftZeroAtTheEndInArray(inputArray)));
	}

}
