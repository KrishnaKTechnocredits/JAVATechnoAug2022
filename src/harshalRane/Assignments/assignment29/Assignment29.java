/*
 * Program 1 : 
Shift all Zero's at the end of an array.
input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.
input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
 */

package harshalRane.Assignments.assignment29;

import java.util.Arrays;

public class Assignment29 {
	//Program 1: Method to Shift all Zero's at the end of an array
	int[] shiftZerosAtEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}
	
	//Program 2: Shift all zero's at the beginning of the an array
	
	int[] shiftZerosAtStart(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 3;

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args){
		Assignment29 assignment29 = new Assignment29();
		int[] input = {10,0,0,3,4,5,0,9};
		System.out.println("Input Array is: \n"+Arrays.toString(input));
		System.out.println("---------------------");
		
		int[] output = assignment29.shiftZerosAtEnd(input);
		System.out.println("Output array after shifting all zeros at the end of Array: \n"+Arrays.toString(output));
		System.out.println("---------------------");
		
		int[] output1 = assignment29.shiftZerosAtStart(input);
		System.out.println("Output array after shifting all zeros at the start of Array: \n"+Arrays.toString(output1));
		}
}
