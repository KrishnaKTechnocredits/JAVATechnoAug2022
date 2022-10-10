//Assignment29 - 27th Sep 2022

package komalShrivastava;

import java.util.Arrays;

public class ArrayZeroShift {
	
	//method to shift all Zeros in Integer Array
	//Set shiftLeft as true to shift all Zeroes to left side in Array
	//Set shiftLeft as false to shift all Zeroes to right side in Array

	int[] getShiftZeroesToRight(int[] arrInput, boolean shiftLeft) {
		int[] arrOutput = new int[arrInput.length];
		int j = 0;
		int count = 0;
		if(shiftLeft) {			//if block will be executed when shiftLeft is true
			for(int i = 0; i<arrInput.length; i++) {
				if(arrInput[i]==0)
					count++;
			}
		}	
		for(int index=0; index<arrInput.length; index++) {
			if(arrInput[index]!=0) {
				arrOutput[j+count] = arrInput[index];
				j++;
			}
		}
		return arrOutput;
	}
	
	public static void main(String[] args) {
		int[] input = {10,0,0,3,4,5,0,9};
		int[] outputRight = new ArrayZeroShift().getShiftZeroesToRight(input, false);
		System.out.println("Zeros shifted to Right side in Array");
		System.out.println("Input : " + Arrays.toString(input) + "\nOutput : " + Arrays.toString(outputRight));
		
		System.out.println("-------------------------------------------");
		System.out.println("Zeros shifted to Left side in Array");
		int[] outputLeft = new ArrayZeroShift().getShiftZeroesToRight(input, true);
		System.out.println("Input : " + Arrays.toString(input) + "\nOutput : " + Arrays.toString(outputLeft));
	}
}