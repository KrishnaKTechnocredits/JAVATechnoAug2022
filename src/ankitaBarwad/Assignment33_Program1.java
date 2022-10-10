/*Assignment - 33 : 10th Oct'2022
Program 1: print duplicate numbers from given array. 
input : {10,20,10,44,33,55,33};
output : 10
		 33
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program1 {

	// Program 1: print duplicate numbers from given array.
	void printDuplicateNumbers(int[] inputArray) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		int replaceNumber;
		boolean isZeroAvailable = false;
		int minNum = inputArray[0];

		for (int index = 0; index < inputArray.length; index++) {
			isZeroAvailable = (inputArray[index] == 0) ? true : false;
			minNum = (minNum > inputArray[index]) ? inputArray[index] : minNum;
		}

		replaceNumber = (isZeroAvailable) ? (minNum - 1) : 0;

		for (int index = 0; index < inputArray.length; index++) {
			boolean isDuplicate = false;
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				if ((inputArray[index] == inputArray[innerIndex]) && inputArray[innerIndex] != replaceNumber) {
					isDuplicate = true;
					inputArray[innerIndex] = replaceNumber;
				}
			}
			if (isDuplicate)
				System.out.println(inputArray[index]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 1 : print duplicate numbers from given array");
		Assignment33_Program1 program1 = new Assignment33_Program1();
		int[] inputArray1 = { 10, 20, 10, 10, 44, 33, 55, 33 };
		program1.printDuplicateNumbers(inputArray1);
	}
}