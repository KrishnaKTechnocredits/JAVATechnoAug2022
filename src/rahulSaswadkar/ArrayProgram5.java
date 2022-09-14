/*Assignment - 21 : 14th Sep'2022
Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89
 */

package rahulSaswadkar;

import java.util.Arrays;

public class ArrayProgram5 {
	public static void main(String[] args) {
		ArrayProgram5 arrayProgram5 = new ArrayProgram5();
		int[] num1 = { 10, 99, 33, 44, 89, 76 };
		int[] num2 = { 10, 99, 33, 101, 89, 76, 103 };
		int[] num3 = { 10, 99, 33, 103, 89, 76, 101, 104, 110 };

		System.out.println("Second highest number in given array " + Arrays.toString(num1) + " is : "
				+ arrayProgram5.getSecondHighestNumberFromArray(num1));
		System.out.println("\nSecond highest number in given array " + Arrays.toString(num2) + " is : "
				+ arrayProgram5.getSecondHighestNumberFromArray(num2));
		System.out.println("\nSecond highest number in given array " + Arrays.toString(num3) + " is : "
				+ arrayProgram5.getSecondHighestNumberFromArray(num3));
	}

	int getSecondHighestNumberFromArray(int[] num) {
		int maxNumber = num[0];
		int secondMaxNumber = num[1];

		if (num[0] < num[1]) {
			maxNumber = num[1];
			secondMaxNumber = num[0];
		}

		for (int index = 2; index < num.length; index++) {
			if (num[index] > maxNumber) {
				secondMaxNumber = maxNumber;
				maxNumber = num[index];

			} else if (num[index] > secondMaxNumber)
				secondMaxNumber = num[index];
		}
		return secondMaxNumber;
	}
}
