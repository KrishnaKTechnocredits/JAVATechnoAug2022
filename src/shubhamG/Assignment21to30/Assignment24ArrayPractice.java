package shubhamG.Assignment21to30;

/*Assignment - 24 : 17th Sep'2022 [program complexity : medium, expected time : 30 mins]

Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}*/

import java.util.Arrays;

public class Assignment24ArrayPractice {

	int[] getArrayWithElementsReplacedWithSum(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j];
			}
			output[i] = sum - arr[i];
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment24ArrayPractice arrayPractice = new Assignment24ArrayPractice();

		int[] intput = { 12, 2, 11, 17 };
		System.out.println("Input Array is : " + Arrays.toString(intput));

		int[] output = arrayPractice.getArrayWithElementsReplacedWithSum(intput);
		System.out.println("Output Array after processing is: " + Arrays.toString(output));
	}

}
