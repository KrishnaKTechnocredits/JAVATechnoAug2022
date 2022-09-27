/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 
*/

package deepakPatil.Assignment24ArrayExamples;

import java.util.Arrays;

public class Assignment24 {

	int[] getSumOfOtherElement(int[] input) {

		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i] != input[j]) {
					sum = sum + input[j];
				}
			}
			output[i] = sum;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] inputArray = { 12, 2, 11, 17 };
		System.out.println("Given input array is :" + Arrays.toString(inputArray));
		int[] outputArray=new Assignment24().getSumOfOtherElement(inputArray);
		System.out.println("Modified array by replacing element with sum of other elements:"
				+ Arrays.toString(outputArray));
	}
}
