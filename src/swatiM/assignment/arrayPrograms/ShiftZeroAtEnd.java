package swatiM.assignment.arrayPrograms;

/*Program 1 : 
Shift all Zero's at the end of an array.
input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0} */

import java.util.Arrays;

public class ShiftZeroAtEnd {

	void shiftZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		System.out.println("Output: Shifting all zero's at " + "the end of the an array:\n" + Arrays.toString(output));
	}

	public static void main(String[] args) {

		System.out.println("Program 1 : Shift all Zero's at the end of an array.");
		int[] num = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Given Array is: " + Arrays.toString(num));
		ShiftZeroAtEnd assignment29_Prog1 = new ShiftZeroAtEnd();
		assignment29_Prog1.shiftZeroAtEnd(num);
	}

}