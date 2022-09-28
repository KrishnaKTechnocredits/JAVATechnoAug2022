/*
 Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
 
 */


package pranjaliV.assignment29;
import java.util.Arrays;

public class ArrayEx29 {
	
	int[] getEndZeroArray(int[] input) {
		int[] output = new int[input.length];
		for(int index=0, outputIndex=0; index<input.length; index++) {
			if(input[index]!=0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;		
	}
	
	int[] getStartZeroArray(int[] input) {
		int[] output = new int[input.length];
		int countZero=0;
		for(int index=0; index<input.length; index++) {//to count no of zeros
			if(input[index]==0) {
				countZero++;
			}
		}
		
		for(int index=0,outputIndex=countZero; index<input.length; index++ ) {// to fill the output array from countZero-1 index
			if(input[index]!=0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		ArrayEx29 arrayEx29 = new ArrayEx29();
		
		int[] input1 = {10,0,0,3,4,5,0,9};
		System.out.println("Shift all Zero's at the end of an array.");
		System.out.println("Input: "+Arrays.toString(input1));
		System.out.println("Output: "+ Arrays.toString(arrayEx29.getEndZeroArray(input1)));
		System.out.println("");
		
		System.out.println("Shift all Zero's at the start of an array.");
		System.out.println("Input: "+Arrays.toString(input1));
		System.out.println("Output: "+ Arrays.toString(arrayEx29.getStartZeroArray(input1)));
		System.out.println("");

		
	}

}
