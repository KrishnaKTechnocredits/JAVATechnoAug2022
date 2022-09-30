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
package asthaSrivastava.array.assignments;

import java.util.Arrays;

public class ShiftZeros {

	//Shift all Zero's at the end of an array
	int[] getAllZeroToEnd(int[] arr) {
		int[] output = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				output[j] = arr[i];
				j++;
			}
		}

		return output;
	}
	
	//Shift all Zero's at the beginning of an array.

	int[] getAllZerosToStart(int[] arr) {
		
		int[] outputArr = new int[arr.length];
		int j =arr.length-1;

		for (int i = arr.length-1; i >=0; i--) {

			if (arr[i] != 0) {
				outputArr[j] = arr[i];
				j--;
			}
		}

		return outputArr;
	}
	
	public static void main(String[] args) {
		ShiftZeros test = new ShiftZeros();
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] output = test.getAllZeroToEnd(input);
		
		System.out.println("Print Zero's At the End:" +Arrays.toString(output));
		System.out.println("--------------------------");
		
		int[] output1 = test.getAllZerosToStart(input);
		System.out.println("Print Zero's At the Beginning:" +Arrays.toString(output1));
	}
}
