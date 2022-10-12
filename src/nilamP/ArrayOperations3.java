/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/
package nilamP;

import java.util.Arrays;

public class ArrayOperations3 {
	int[] getZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputindex = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[outputindex] = input[i];
				outputindex++;
			}
		}
		return output;
	}

	int[] getZeroAtStart(int[] input) {
		int[] output = new int[input.length];
		int outputindex = 3;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				output[outputindex] = input[i];
				outputindex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayOperations3 ao = new ArrayOperations3();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Input Array : " + Arrays.toString(input));
		int[] output = ao.getZeroAtEnd(input);
		System.out.println("All Zero shifted at end : " + Arrays.toString(output));
		int[] output1 = ao.getZeroAtStart(input);
		System.out.println("All Zero shifted at start : " + Arrays.toString(output1));

	}
}
