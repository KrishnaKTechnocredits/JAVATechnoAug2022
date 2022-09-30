/*Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}*/

package gauravSahu;

import java.util.Arrays;

public class Assignment24 {

	int[] getsum(int[] arr) {
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j)
					sum = sum + arr[j];
			}output[i] = sum;
		}return output;
	}

	public static void main(String[] args) {
		Assignment24 a24 = new Assignment24();
		int[] input = { 12, 2, 11, 17 };
		int[] output = a24.getsum(input);
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
	}
}
