/*
 Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)
  
 */
package swapnilMaheshwari.ArrayPrograms;

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
				if (output[i]!=0)
					System.out.println(+output[i]);
		}
	}

	public static void main(String[] args) {
		int[] inputArr = { 10, 12, 44, 12, 77, 67, 12, 44 };
		new DuplicateNumbersFromArray().getDuplicateNumberFromArray(inputArr);

	}
}
