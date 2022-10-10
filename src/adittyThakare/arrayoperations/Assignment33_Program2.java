/*Assignment - 33 : 10th Oct'2022
Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment33_Program2 {

	// Method to print unique numbers from array
	void printUniqueNumbersFromArray(int[] arr) {

		System.out.println("Unique numbers from array: ");

		for (int index = 0; index < arr.length; index++) {
			boolean uniqueFlag = true;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && index != innerIndex) {
					uniqueFlag = false;
					// break;
				}
			}
			if (uniqueFlag) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find unique numbers from array!");
		Assignment33_Program2 assignment33_Program2 = new Assignment33_Program2();
		int[] arr = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("\nInput array: " + Arrays.toString(arr));
		assignment33_Program2.printUniqueNumbersFromArray(arr);

	}

}
