/*
 Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}
 */

package swapnilMaheshwari.ArrayPrograms;

public class ShiftAllZerosAtTheEnd {
	int[] getShiftAllZerosAtTheEnd(int[] arr) {
		int[] outputArr = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				outputArr[j] = arr[i];
				j++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		int[] input = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] output = new ShiftAllZerosAtTheEnd().getShiftAllZerosAtTheEnd(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(output[i]);

		}
	}
}
