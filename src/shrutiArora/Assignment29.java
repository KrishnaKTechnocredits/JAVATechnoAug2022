/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/
package shrutiArora;

import java.util.Arrays;

public class Assignment29 {
	int[] getZeroAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index]> 0) {
				output[outputIndex] = input[index];
				outputIndex++;

			}
		}
		return output;
	}
	int[] getZeroAtbegin(int[] arr) {
		int[] output = new int[arr.length];
		int outputIndex = arr.length - 1;
		for (int index = arr.length - 1; index >= 0; index--) {
			if (arr[index] != 0) {
				output[outputIndex] = arr[index];
				outputIndex--;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		System.out.println("**********************************************************Program1*****************************************");
		int[] input = {10,0,0,3,4,5,0,9};
		System.out.println("input: " + Arrays.toString(input));
	    int[] output =  assignment29.getZeroAtEnd(input);
	    System.out.println( "output: " +Arrays.toString(output));
	    System.out.println("input: " + Arrays.toString(input));
	    int[] arr =  assignment29.getZeroAtbegin(input);
	    System.out.println("output: " + Arrays.toString(arr));
	}
}