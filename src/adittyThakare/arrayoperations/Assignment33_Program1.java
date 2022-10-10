/*Assignment - 33 : 10th Oct'2022

Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment33_Program1 {

	// Method 1: Print duplicate numbers from array
	void printDuplicateNumbersFromArray(int[] arr) {
		System.out.println("Duplicate numbers from array: ");
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					System.out.println(arr[innerIndex]);
				}
			}
		}
	}

	// Method 2: Print duplicate numbers from array
	void printDuplicateNumbersFromArrayNew(int[] arr) {
		int replaceNum = 0;
		System.out.println("Duplicate numbers from array: ");
		for (int index = 0; index < arr.length; index++) {
			int numCount = 0;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					numCount++;
					arr[innerIndex] = replaceNum;
				}
			}
			if (numCount > 0 && arr[index] != 0) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find duplicate numbers from array!");
		Assignment33_Program1 assignment33_Program1 = new Assignment33_Program1();
		int[] arr = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("\nInput array: " + Arrays.toString(arr));
		assignment33_Program1.printDuplicateNumbersFromArray(arr);
		int[] arr1 = { 22, 87, 56, 22, 90, 22, 77, 87 };
		System.out.println("\nInput array: " + Arrays.toString(arr1));
		assignment33_Program1.printDuplicateNumbersFromArrayNew(arr1);
	}

}
