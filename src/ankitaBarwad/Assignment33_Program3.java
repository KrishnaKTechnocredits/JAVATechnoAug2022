/*Assignment - 33 : 10th Oct'2022
program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program3 {

	// program 3 : print missing numbers from given array from range 1 to 10.
	void printMissingNumberFromArray(int[] inputArray, int startIndex, int lastIndex) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		for (int index = startIndex; index <= lastIndex; index++) {
			boolean isMissing = false;
			for (int innerIndex = 0; innerIndex < inputArray.length; innerIndex++) {
				if (index != inputArray[innerIndex]) {
					isMissing = true;
				} else {
					isMissing = false;
					break;
				}
			}
			if (isMissing) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_Program3 program3 = new Assignment33_Program3();
		System.out.println("Program 3 : print missing numbers from given array from range 1 to 10.");
		int[] inputArray3 = { 1, 3, 9, 5, 6, 10 };
		program3.printMissingNumberFromArray(inputArray3, 1, 10);
	}
}