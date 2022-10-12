/*
 Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33  
 */
package swapnilMaheshwari.ArrayPrograms.Assignment33;

import java.util.Arrays;

public class DuplicateNumbersFromArray {
	void getDuplicateNumberFromArray(int[] input) {
		int[] output = new int[input.length];

		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				for (int j = i + 1; j < input.length; j++) {
					if ((input[i] == input[j]) && i != j) {
						output[i] = input[i];
						input[j] = 0;
					}
				}
			}
			if (output[i] != 0)
				System.out.println(+output[i]);
		}
	}

	public static void main(String[] args) {
		int[] inputArr = { 10, 20, 10, 33, 55, 33, 12, 44 };
		new DuplicateNumbersFromArray().getDuplicateNumberFromArray(inputArr);

	}
}
