/*
 * Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 
 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment24 {

	int[] replaceElementWithSum(int[] arry) {
		int[] outputArry = new int[arry.length];
		for (int i = 0; i < arry.length; i++) {
			int sum = 0;
			for (int j = 0; j < arry.length; j++) {
				if (arry[i] != arry[j]) {
					sum = sum + arry[j];
				}

			}
			outputArry[i] = sum;
		}
		return outputArry;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment24 assignment24 = new Assignment24();
		int[] inputArry = { 12, 2, 11, 17 };
		System.out.println("Input Array is-- " + Arrays.toString(inputArry));
		int[] outputArry = assignment24.replaceElementWithSum(inputArry);
		System.out.println("Output Array is-- " + Arrays.toString(outputArry));
	}

}
