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

package hemanshi;

import java.util.Arrays;

public class Assignment_24 {
	
	int[] getArraySum(int[] arr) {
		
		int[] arrsum = new int[arr.length];
		for(int index = 0; index<arr.length; index++) {
			int sum = 0;
			for(int j = 0; j < arr.length; j++) {
				
				if(index != j) {
					sum = sum +arr[j];
				}
				arrsum[index] = sum;
				
				}
		}
		return arrsum;
	}
	
	public static void main(String[] args) {
		
		int[] input = {12, 2, 11, 17};
		System.out.println("The input array is : " + Arrays.toString(input));
		System.out.println("The output of given array is :");
		System.out.println(Arrays.toString(new Assignment_24().getArraySum(input)));
	}
	
}
