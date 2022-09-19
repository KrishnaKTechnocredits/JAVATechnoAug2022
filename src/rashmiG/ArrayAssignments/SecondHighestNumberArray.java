/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package rashmiG.ArrayAssignments;

import java.util.Arrays;

public class SecondHighestNumberArray {

	int getsecondHighestNumber(int[] input) {
		int maxNumber = input[0];
		int secondMaxNumber = 0;
		for (int index = 1; index < input.length; index++) {
			if (input[index] > maxNumber) {
				secondMaxNumber = maxNumber;
				maxNumber = input[index];
			} else if (input[index] > secondMaxNumber && input[index]!=maxNumber) {
				secondMaxNumber = input[index];
			}
		}
		return secondMaxNumber;
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		int[] input1 = { 10, 99, 33 };
		int[] input2= {10,99,33,100,89,100};
		System.out.println(Arrays.toString(input) + "\n Second highest number from given array is : "
				+ new SecondHighestNumberArray().getsecondHighestNumber(input));
		System.out.println(Arrays.toString(input1) + "\n Second highest number from given array is : "
				+ new SecondHighestNumberArray().getsecondHighestNumber(input1));
		System.out.println(Arrays.toString(input2) + "\n Second highest number from given array is : "
				+ new SecondHighestNumberArray().getsecondHighestNumber(input2));
	}
}