//Assignment - 29 : 27th Sep'2022
//Program 1 : 
//Shift all Zero's at the end of an array.
//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}
package sohail.stringprograms;

import java.util.Arrays;

public class SiftZeroToEndOfArray {
	void getShiftedArray(int[] input) {
		System.out.println("Original Array is: " + Arrays.toString(input));
		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		System.out.println("Shifted Zero to End: " + Arrays.toString(output));
		System.out.println("-----------------------------------------------");

	}

	void getShiftedToStart(int[] input) {
		System.out.println("Original Array is: " + Arrays.toString(input));
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
		System.out.println("Shift Zero Before: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		SiftZeroToEndOfArray shift = new SiftZeroToEndOfArray();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		shift.getShiftedArray(input);
		shift.getShiftedToStart(input);

	}

}
