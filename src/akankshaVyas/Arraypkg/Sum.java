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

package akankshaVyas.Arraypkg;

import java.util.Arrays;

public class Sum {

	int[] getProcessedSum(int[] arr) {

		int[] arrSum = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {

				if (i != j) {
					sum = sum + arr[j];

				}
				arrSum[i] = sum;
			}
		}
		return arrSum;
	}

	public static void main(String[] args) {

		int[] input = { 12, 2, 11, 17 };
		System.out.println(Arrays.toString(new Sum().getProcessedSum(input)));
	}
}
