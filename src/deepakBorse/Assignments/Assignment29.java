/*
 * Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
 */
package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment29 {
/*Program 1 : 	Shift all Zero's at the end of an array.
*	input : {10,0,0,3,4,5,0,9}
*	output : {10,3,4,5,9,0,0,0}
*/

	int[] shiftAllZeroAtEnd(int[] intarry) {
		int outindex = 0;
		int[] outarry = new int[intarry.length];

		for (int index = 0; index < intarry.length; index++) {
			if (intarry[index] != 0) {
				outarry[outindex] = intarry[index];
				outindex++;
			}

		}
		return outarry;
	}
/*
 * Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
 */
//Get the zero count from the given array
	int countzeroinArray(int[] intarry) {
		int zerocount = 0;

		for (int index = 0; index < intarry.length; index++) {
			if (intarry[index] == 0) {
				zerocount++;
			}
		}

		return zerocount;
	}
// Shift zero to start
	int[] shiftZeroAtStart(int[] input) {

		int[] output = new int[input.length];
		int zerocount = countzeroinArray(input);
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[zerocount] = input[index];
				zerocount++;
			}

		}
		return output;
	}

	public static void main(String[] args) {
		Assignment29 Assignment = new Assignment29();

		int[] intarry = { 10, 0, 0, 3, 4, 5, 0, 9 };

		System.out.println("Input Array: " + Arrays.toString(intarry));
		int[] output = Assignment.shiftAllZeroAtEnd(intarry);
		System.out.println("Array after shifting zero at end:" + Arrays.toString(output));
		int[] output2 = Assignment.shiftZeroAtStart(intarry);
		System.out.println("Array after shifting zero at Start:" + Arrays.toString(output2));
	}
}