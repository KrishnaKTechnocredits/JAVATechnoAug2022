/*Program 1: print duplicate numbers from given array. 
input : {10,20,10,44,33,55,33};
output : 10
		 33*/

package manjiri.arrayEx.assignment33;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumbersInArray {

	// Check if input array contains zero
	int getReplaceNum(int[] inputArr) {
		boolean replaceNumFlag = true;
		int replaceNum = 0;
		int minNum = inputArr[0];

		// Check if 0 is present in input array
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] == 0)
				replaceNumFlag = false;
		}

		// Check for minNum in array
		for (int index = 1; index < inputArr.length; index++) {
			if (inputArr[index] < minNum) {
				minNum = inputArr[index];
			}
		}
		return replaceNumFlag ? replaceNum : minNum - 1;
	}

	void printDuplicateNumbers(int[] numArr) {
		int replaceNumber = getReplaceNum(numArr);

		for (int index = 0; index < numArr.length; index++) {
			boolean flag = false;
			if (numArr[index] != replaceNumber) {
				for (int innerIndex = index + 1; innerIndex < numArr.length; innerIndex++) {
					if (numArr[index] == numArr[innerIndex]) {
						numArr[innerIndex] = replaceNumber;
						flag = true;
					}
				}
			}

			if (flag) {
				System.out.println(numArr[index]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		int length = sc.nextInt();

		int[] inputArr = new int[length];
		for (int index = 0; index < inputArr.length; index++) {
			inputArr[index] = sc.nextInt();
		}
		sc.close();

		System.out.println(Arrays.toString(inputArr));
		System.out.println("=========================================================");

		new DuplicateNumbersInArray().printDuplicateNumbers(inputArr);
	}
}
