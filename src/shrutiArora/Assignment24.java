/* Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */
package shrutiArora;

import java.util.Arrays;

public class Assignment24 {
	void replaceWithSum(int[]arr) {
		int[] output = new int[arr.length];
		for(int index = 0 ; index<arr.length ; index++) {
			int sum = 0 ;
			for(int innerIndex = 0 ; innerIndex<arr.length; innerIndex++) {
				if(index!=innerIndex) {
					sum+= arr[innerIndex];
				}
			}
			output[index] = sum;
		}
		System.out.println("Output: " + Arrays.toString(output));
	}
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		System.out.println("***************************************Replace Element with Sum******************************");
		int[]arr =  {12,2,11,17};
		System.out.println("input: " + Arrays.toString(arr));
		assignment24.replaceWithSum(arr);
	}
}