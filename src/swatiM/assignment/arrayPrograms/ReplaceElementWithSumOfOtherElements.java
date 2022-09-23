package swatiM.assignment.arrayPrograms;

/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]
	Write a method to replace element with sum of other elements.
	input : {12,2,11,17}
	output : {30,40,31,25}
	Hint : 12 should be replaced with - 2+11+17
	          2 should be replaced with - 12 + 11+ 17
	          11 should be replaced with - 12+2+17
	          17 should be replaced with - 12+2+11 */

import java.util.Arrays;

public class ReplaceElementWithSumOfOtherElements {

	int[] getSumOfArrayElementsIndex(int[] input) {
		int[] outputArray = new int[input.length];

		for (int index = 0; index < input.length; index++) {
			int sum = 0;
			for (int i = 0; i < input.length; i++) {
				if (input[i] != input[index]) {
					sum = sum + input[i];
				}
			}
			outputArray[index] = sum;
		}
		return outputArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceElementWithSumOfOtherElements assignment24 = new ReplaceElementWithSumOfOtherElements();

		int[] input = { 12, 2, 11, 17 };
		int[] output = assignment24.getSumOfArrayElementsIndex(input);

		System.out.println("Method to replace element with sum of other elements");
		System.out.println("\nInput array: " + Arrays.toString(input) + "\nOutput array: " + Arrays.toString(output));
	}

}
