/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */

package pankajBhatt;

import java.util.Arrays;

public class Assignment24_17Sep2022 {
	
	int[] getSumOfOtherElements(int[] input) {
		int[] process = new int[input.length];
		int sum = 0;
		for( int index = 0; index < input.length ; index++ ) {
			for( int index1 = 0; index1 < input.length ; index1++ ) {
				if( ! (index == index1)) {
					process[index] += input[index1]   ; 
				}
			}
		}
		return process;
	}

	public static void main(String[] args) {
		Assignment24_17Sep2022 assignment24_17Sep2022 = new Assignment24_17Sep2022();
		int[] arr = {12,2,11,17};
		String output = Arrays.toString(assignment24_17Sep2022.getSumOfOtherElements(arr));
		System.out.println(output);
	}
}
