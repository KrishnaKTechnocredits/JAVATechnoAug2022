/*
 * Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89
 */
package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment21 {

	int secondHigh(int[] arrynum) {
		// Arrays.sort(arrynum); tried using this but the original array position change

		int secondhighest = 0, firsthighest = arrynum[0];

		for (int i = 1; i < arrynum.length; i++) {
			if (firsthighest < arrynum[i]) {
				secondhighest = firsthighest;
				firsthighest = arrynum[i];
			} else if (secondhighest < arrynum[i]) {
				secondhighest = arrynum[i];
			}

		}

		return secondhighest;
	}

	public static void main(String[] args) {
		Assignment21 Assignment21 = new Assignment21();

		int[] number = { 10, 99, 33, 44, 89, 76 };
		int secondhigh = Assignment21.secondHigh(number);
		System.out.println("Second highest number from array " + Arrays.toString(number) + " : " + secondhigh);

	}

}
