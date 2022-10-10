/*		 
program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8*/

package smitaVetal;

import java.util.Arrays;

public class Assignment33_3 {
	
	void printMissingNumberFromArray(int[] arr, int startNum, int endNum) {
		System.out.println("\nMissing numbers from range " + startNum + " to " + endNum + " : ");
		for (int index = startNum; index <= endNum; index++) {
			boolean numFlag = true;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (index == arr[innerIndex]) {
					numFlag = false;
					break;
				}
			}
			if (numFlag) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_3 prog = new Assignment33_3();
		int[] arr = { 1, 3, 9, 5, 6, 10 };
		System.out.println("Program to print missing numbers from array!");
		System.out.println("\nInput array: " + Arrays.toString(arr));
		prog.printMissingNumberFromArray(arr, 1, 10);
	}

}
