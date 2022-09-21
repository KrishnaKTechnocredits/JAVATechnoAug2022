/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package komalShrivastava;

import java.util.Arrays;

public class SecondHighestNumInArray {

	static int getSecondHighestNum(int[] ar) {
		int maxNum = ar[0];
		int max2ndNum = 0;
		for (int index = 1; index < ar.length; index++) {
			if (maxNum < ar[index])
				maxNum = ar[index];
			else if (max2ndNum < ar[index])
				max2ndNum = ar[index];
		}
		return max2ndNum;
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		int secondHighestNum = getSecondHighestNum(input);
		System.out.println("Second Highest number in the given array " + Arrays.toString(input) + " : " + secondHighestNum);
	}
}