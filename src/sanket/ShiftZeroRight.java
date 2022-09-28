/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}
 */

package sanket;

import java.util.Arrays;

public class ShiftZeroRight {

	// Shift all Zero's at the end of an array.
	int[] getArrayZeroShiftRight(int[] arr) {

		int[] temp = new int[arr.length];
		int cntIndex = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				temp[cntIndex++] = arr[index];
			}
		}
		return temp;
	}

	// Shift all zero's at the beginning of the an array.
	int[] getArrayZeroAtBegaining(int[] arr) {

		int[] temp = new int[arr.length];
		int zerocnt = 0;
		int index = 0;
		for (index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				zerocnt++;
			}
		}
		System.out.println("Zero count is : " + zerocnt);

		for (index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				temp[zerocnt++] = arr[index];
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };

		System.out.println("***Program 1 Solution***");
		System.out.println("The input array is :  " + Arrays.toString(input));
		int[] output = new ShiftZeroRight().getArrayZeroShiftRight(input);
		System.out.println("The zero shift to right modified array is : " + Arrays.toString(output));

		System.out.println("\n" + "***Program 2 Solution***");
		System.out.println("The input array is :  " + Arrays.toString(input));
		int[] output2 = new ShiftZeroRight().getArrayZeroAtBegaining(input);
		System.out.println("The zero shift to right modified array is : " + Arrays.toString(output2));
	}
}
