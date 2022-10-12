//Write a method to replace element with sum of other elements.

//input : {12,2,11,17}
//output : {30,40,31,25}
package akankshaSharma.AllAssignments;

import java.util.Arrays;

public class Assignment24 {

	int[] getSumOfDigits(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input.length; j++) {
				if (i != j) {
					sum = sum + input[j];
				}
				output[i] = sum;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		int[] input = { 12, 2, 11, 17 };
		System.out.print("Input Array is: " + Arrays.toString(input));
		int[] output = assignment24.getSumOfDigits(input);
		System.out.print("\nOutput Array is: " + Arrays.toString(output));
	}
}
