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

package pujaSah.assignments20_30;

import java.util.Arrays;

public class ShiftingArrays {

	// Method to shift all Zero's at the end of an array
	void displayArrayShiftAtBegining(int[] arr) {
		int[] outArr = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				outArr[count] = arr[index];
				count++;
			}
		}
		System.out.println(Arrays.toString(outArr));
	}

	// Method to shift all Zero's at the beginning of an array
	void displayArrayShiftAtEnd(int[] arr) {
		int[] outArr = new int[arr.length];
		int count = arr.length - 1;
		for (int index = arr.length - 1; index >= 0; index--) {
			if (arr[index] > 0) {
				outArr[count] = arr[index];
				count--;
			}
		}
		System.out.println(Arrays.toString(outArr));
	}

	public static void main(String[] args) {
		int[] inArr = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Input Array: " + Arrays.toString(inArr) + "\n");

		System.out.println("Shifting all Zero's at the end of array....  ");
		new ShiftingArrays().displayArrayShiftAtBegining(inArr);

		System.out.println("\nShifting all Zero's at the beginning of array....  ");
		new ShiftingArrays().displayArrayShiftAtEnd(inArr);
	}

}
