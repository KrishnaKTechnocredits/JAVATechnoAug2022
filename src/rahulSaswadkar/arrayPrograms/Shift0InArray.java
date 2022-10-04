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
 * 
 */
package rahulSaswadkar.arrayPrograms;

import java.util.Arrays;

public class Shift0InArray {
	public static void main(String[] args) {
		Shift0InArray shift0InArray = new Shift0InArray();
		
		int[] inputArr1 = {10,0,0,3,4,5,0,9};
		
		System.out.println("Input Integer Array : " + Arrays.toString(inputArr1));
		System.out.println("\nOutput Integer Array having 0's shifted to end of Array : " 
				+ Arrays.toString(shift0InArray.shiftZerosToEndOfArr(inputArr1)));
		System.out.println("Output Integer Array having 0's shifted to begining of Array : " 
				+ Arrays.toString(shift0InArray.shiftZerosToBeginingOfArr(inputArr1)));
	}
	
	int[] shiftZerosToEndOfArr(int[] arr) {
		int[] outputArr = new int[arr.length];
		
		for(int inputArrIndex = 0,outputArrIndex = 0 ; inputArrIndex < arr.length ; inputArrIndex++) {
			if(arr[inputArrIndex] != 0) {
				outputArr[outputArrIndex] = arr[inputArrIndex];
				outputArrIndex++;
			}
		}
		return outputArr;
	}
	
	int[] shiftZerosToBeginingOfArr(int[] arr) {
		int countOfZero = 0;
		for(int inputArrIndex = 0; inputArrIndex < arr.length ; inputArrIndex++) {
			if(arr[inputArrIndex] == 0) {
				countOfZero += 1;
			}
		}
		
		int[] outputArr = new int[arr.length];
		for(int inputArrIndex = 0,outputArrIndex = countOfZero ; inputArrIndex < arr.length ; inputArrIndex++) {
			if(arr[inputArrIndex] != 0) {
				outputArr[outputArrIndex] = arr[inputArrIndex];
				outputArrIndex++;
			}
		}
		return outputArr;
	}

}
