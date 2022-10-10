/*
 Assignment - 24 : 17th Sep'2022 

[program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 
 */
package namratamishra.Array;

public class ArrayElementsReplacingWithSumofOtherElements {

	void getArrayElementsZerosAtLast(int[] input) {

		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int k = 0; k < input.length; k++)

			{
				if (i != k)
					sum = sum + input[k];
			}
			output[i] = sum;
			System.out.print(output[i]+",");
		}
	}

	public static void main(String[] args) {
		int input[] = { 12, 2, 11, 17 };
		ArrayElementsReplacingWithSumofOtherElements aezal = new ArrayElementsReplacingWithSumofOtherElements();
		aezal.getArrayElementsZerosAtLast(input);

	}
}
