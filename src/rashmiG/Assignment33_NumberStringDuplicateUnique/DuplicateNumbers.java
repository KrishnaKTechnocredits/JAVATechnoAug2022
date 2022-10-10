/*Assignment - 33 : 1st Oct'2022

Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33*/

package rashmiG.Assignment33_NumberStringDuplicateUnique;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumbers {

	private int getReplaceNumber(int[] input) {
		int replaceNumber = 0;
		boolean isZeroAvailableFlag = false;
		int minNumber = input[0];
		for (int num : input) {
			if (num == 0)
				isZeroAvailableFlag = true;
			if (num < minNumber)
				minNumber = num;
		}
//		if(isZeroAvailableFlag)
//			 replaceNumber=minNumber-1;
//		else
//			 replaceNumber=0;

		// replaceNumber=isZeroAvailableFlag?minNumber-1:replaceNumber;
		// return replaceNumber=isZeroAvailableFlag?minNumber-1:replaceNumber;
		// return replaceNumber=isZeroAvailableFlag==true?minNumber-1:replaceNumber;
		return isZeroAvailableFlag == true ? minNumber - 1 : replaceNumber;
	}

	void displayDuplicateNumbers(int[] input) {
		int[] output = getCopyArray(input);
		System.out.println(Arrays.toString(output));
		System.out.println("\nOutput");
		int replaceNumber = getReplaceNumber(input);
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			if (!(input[index] == replaceNumber)) {
				for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
					if (input[index] == input[innerIndex]) {
						input[innerIndex] = replaceNumber;
						count++;
					}
				}
			}
			if (count > 1)
				System.out.println(input[index]);
		}
	}

	int[] getCopyArray(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have in array");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + (index + 1) + " number");
			input[index] = sc.nextInt();
		}
		new DuplicateNumbers().displayDuplicateNumbers(input);
		sc.close();

//		int[] arr = { 10, 20, 10, 44, 33, 55, 33 };
//		int[] arr1 = { 10, 90, -9, 0, -1, 90, 56, 89, 56, 90, 56, -9 };
//		DuplicateNumbers number = new DuplicateNumbers();
//		number.displayDuplicateNumbers(arr);
//		number.displayDuplicateNumbers(arr1);

	}

}
