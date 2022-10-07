package shubhamG.Assignment31to40;

import java.util.Arrays;

/*Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
		 */
public class Assignment33DuplicateNumber {

	void printDuplicateNumberFromArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		Assignment33DuplicateNumber duplicate = new Assignment33DuplicateNumber();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input array is :" + Arrays.toString(input));
		System.out.println("Duplicate numbers in the input Array are - ");
		duplicate.printDuplicateNumberFromArray(input);
	}
}
