/*Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}
Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 
*/
package rohanNaik.Assignments;

import java.util.Arrays;

public class Assignment24Array {

	int[] replaceElement(int[] input) {

		int[] output = new int[input.length];

		// int i = 0;
		for (int index = 0; index < input.length; index++) {
			int sum = 0;
			for (int i = 0; i < input.length; i++) {
				sum = sum + input[i];
			}
			sum = sum - input[index];
			output[index] = sum;
		}

		return output;
	}

	public static void main(String[] args) {
		Assignment24Array obj = new Assignment24Array();
		int[] input = { 12, 2, 11, 17 };
		int[] printArr = obj.replaceElement(input);
		System.out.print(Arrays.toString(printArr));
	}

}
