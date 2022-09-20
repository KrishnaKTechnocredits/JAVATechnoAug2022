/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */
package ankitaBarwad;

import java.util.Arrays;

public class ReplaceWithSumOfOtherElement {
	int[] getReplacedWithOtherElementsSum(int[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		for (int oIndex = 0; oIndex < inputArray.length; oIndex++) {
			int sum = 0;
			for (int iIndex = 0; iIndex < inputArray.length; iIndex++) {
				if (oIndex != iIndex) {
					sum = sum + inputArray[iIndex];
				}
				outputArray[oIndex] = sum;
			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		ReplaceWithSumOfOtherElement replaceElementExample = new ReplaceWithSumOfOtherElement();
		int[] inputArray = { 12, 2, 11, 17 };
		int[] outputArray = replaceElementExample.getReplacedWithOtherElementsSum(inputArray);
		System.out.println("Input String : " + Arrays.toString(inputArray) + "\nOutput String : " + Arrays.toString(outputArray));
	}
}
