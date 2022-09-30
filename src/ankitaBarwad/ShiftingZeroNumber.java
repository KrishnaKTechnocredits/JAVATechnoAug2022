/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/
package ankitaBarwad;

import java.util.Arrays;

public class ShiftingZeroNumber {

	void printZerosAtEnd(int[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		int innerIndex = 0;
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] != 0) {
				outputArray[innerIndex] = inputArray[index];
				innerIndex++;
			}
		}
		System.out.println("Zero at End Array : " + Arrays.toString(outputArray));
	}

	void printZerosAtStart(int[] inputArray) {
		int[] outputArray = new int[inputArray.length];
		int count = 0;
		for (int index = 0; index < outputArray.length; index++) {
			if (inputArray[index] == 0) {
				count++;
			}
		}
		for (int index = 0; index < inputArray.length; index++) {
			if (inputArray[index] != 0) {
				outputArray[count] = inputArray[index];
				count++;
			}
		}
		System.out.println("Zero at Start Array : " + Arrays.toString(outputArray));
	}

	public static void main(String args[]) {
		ShiftingZeroNumber shiftingZeroNumber = new ShiftingZeroNumber();
		int[] arr = new int[] { 10, 0, 0, 3, 4, 5, 0, 9 };
		System.out.println("Input Array : " + Arrays.toString(arr));
		shiftingZeroNumber.printZerosAtEnd(arr);
		shiftingZeroNumber.printZerosAtStart(arr);
	}
}
