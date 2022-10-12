/*Assignment - 29 :
Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
*/

package apurvaBabel.Assignment21to30;

import java.util.Arrays;

public class Assignment29_ShiftingZero {

	// Method to shift all zero's at the end of an array
	void getAllZeroShiftedAtEnd(int[] input) {
		System.out.println("Shifting all zero's at the end");
		System.out.println("Input Array : " + Arrays.toString(input));

		int[] output = new int[input.length];
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		System.out.println("Output Array : " + Arrays.toString(output));
	}

	// Method to shift all zero's at the beginning of an array
	void getAllZeroShiftedAtStart(int[] input) {
		System.out.println("\nShifting all zero's at the beginning");
		System.out.println("Input Array : " + Arrays.toString(input));

		int[] output = new int[input.length];
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				count++;
			}
		}

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}

		System.out.println("Output Array : " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment29_ShiftingZero assignment29 = new Assignment29_ShiftingZero();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		assignment29.getAllZeroShiftedAtEnd(input);
		assignment29.getAllZeroShiftedAtStart(input);
	}
}
