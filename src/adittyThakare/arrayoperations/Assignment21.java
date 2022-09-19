/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment21 {
	
	int getMaximumArrayElement(int[] inputArray) {
		int firstMax=inputArray[0];
		int secondMax=inputArray[1];
		
		for(int index=1;index<inputArray.length;index++) {
			if(firstMax<inputArray[index]) {
				secondMax=firstMax;
				firstMax=inputArray[index];
			}
			else if(secondMax<inputArray[index]) {
				secondMax=inputArray[index];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment21 assignment21 = new Assignment21();
		
		int[] input = {10,99,33,44,89,76}, input1 = {100,103,0,97,99}, input2 = {56,76,12,99,34};
		
		System.out.println("Program to find second highest number from array!");
		System.out.println("\nInput array: "+Arrays.toString(input));
		System.out.println("Output: "+assignment21.getMaximumArrayElement(input));
		System.out.println("\nInput array: "+Arrays.toString(input1));
		System.out.println("Output: "+assignment21.getMaximumArrayElement(input1));
		System.out.println("\nInput array: "+Arrays.toString(input2));
		System.out.println("Output: "+assignment21.getMaximumArrayElement(input2));
	}

}
