/*
 * Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : { 10, 12, 44, 12, 77, 67, 12, 44 , 44, 33, 44, 12};
output : 12
         44
*/
package pujaSah.assignments20_30;

import java.util.Arrays;

public class DuplicateNumbers {

	void displayDuplicateNumbers(int[] inArr) {
		System.out.println("Input Array: " + Arrays.toString(inArr));
		System.out.println("Duplicate numbers in the array are: ");
		for (int index = 0; index < inArr.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < inArr.length; innerIndex++) {
				if (inArr[index] == inArr[innerIndex] && index != innerIndex && inArr[index] != 0) {
					count++;
					inArr[innerIndex] = 0;
				}
			}
			if (count > 0) {
				System.out.println(inArr[index]);
				inArr[index] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 44, 12, 77, 67, 12, 44, 44, 33, 44, 12 };
		new DuplicateNumbers().displayDuplicateNumbers(arr);
	}
}
