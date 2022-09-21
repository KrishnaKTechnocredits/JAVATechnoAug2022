/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.*/

package komalShrivastava;

import java.util.Arrays;

public class ReplaceElementWithSum {
	
	static int[] getReplacedArrayWithSumOfOtherElements(int[] input) {
		int[] processedArray = new int[input.length];
		for(int index=0; index<input.length; index++) {
			int sum = 0;
			for(int j=0; j<input.length; j++) {
				if(index!=j) 
					sum = sum + input[j];
		    }
		processedArray[index] = sum;
		}
		return processedArray;
	}

	public static void main(String[] args) {
		int[] input = {12,2,11,17, 0, 1};
		int []processedArray = getReplacedArrayWithSumOfOtherElements(input);
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Output : " + Arrays.toString(processedArray));
	}
}