/*Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */

package manjiri.arrayEx;

import java.util.Arrays;

public class ReplaceArrayElement {
	
	int[] getProcessedArray(int[] inputArr) {
		
		int[] output = new int[inputArr.length];
		
		for(int index = 0; index < inputArr.length; index++) {
			int sum = 0;
			for (int i = 0; i < inputArr.length; i++) {
				if (i != index) {
					sum += inputArr[i];
				}
			}
			output[index] = sum;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		int[] input = {12,2,11,17};
		System.out.println("Original Array is: " + Arrays.toString(input));
		int[] result = new ReplaceArrayElement().getProcessedArray(input);
		System.out.println("Processed Array is: " + Arrays.toString(result));
	}
}
