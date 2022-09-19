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
package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment24 {

	int[] getEleSumofEle(int[] arrynum) {

		int[] temp = new int[arrynum.length];
		int sum = 0;

		for (int i = 0; i < arrynum.length; i++) {

			for (int j = 0; j < arrynum.length; j++) {

				if (arrynum[j] != arrynum[i]) {

					sum = sum + arrynum[j];
				}

			}

			temp[i] = sum;
			sum = 0;
		}
		//System.out.println(Arrays.toString(temp));
		return (temp);
	}

	public static void main(String[] args) {

		Assignment24 Assignment = new Assignment24();

		int[] input = { 12, 2, 11, 17 };

		int[] output = Assignment.getEleSumofEle(input);
		
		System.out.println("Sum of other Element from given array "+Arrays.toString(input)+" so update array : "+Arrays.toString(output));

	}
}