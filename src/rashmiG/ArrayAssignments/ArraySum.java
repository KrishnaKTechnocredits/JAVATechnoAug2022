/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

	Write a method to replace element with sum of other elements.

	input : {12,2,11,17}
	output : {30,40,31,25}

	Hint : 12 should be replaced with - 2+11+17
	          2 should be replaced with - 12 + 11+ 17
	          11 should be replaced with - 12+2+17
	          17 should be replaced with - 12+2+11 */

package rashmiG.ArrayAssignments;

import java.util.Arrays;

public class ArraySum {

	int[] getsumOfElements(int[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			int sum = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (index != innerIndex) {
					sum = sum + input[innerIndex];
				}
			}
			output[index] = sum;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 12, 13, 13, 14, 15, 70, 19 };
		int[] input1 = { 12, -2, 11, -17 };
		System.out.println("Input : " + Arrays.toString(input));
		// int[] output=new ArraySum().getsumOfElements(input);
		System.out.println("Output : " + Arrays.toString(new ArraySum().getsumOfElements(input)));
		// System.out.println(Arrays.toString(input));
		System.out.println("Input : " + Arrays.toString(input1));
		System.out.println("Output : " + Arrays.toString(new ArraySum().getsumOfElements(input1)));

	}
}
