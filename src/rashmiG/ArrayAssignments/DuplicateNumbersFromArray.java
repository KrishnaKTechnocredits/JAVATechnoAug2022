/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}*/

package rashmiG.ArrayAssignments;

import java.util.Arrays;

class DuplicateNumbersFromArray {

	int getMinumunNumber(int[] input) {
		int minNumber = input[0];
		for (int index = 2; index < input.length; index++) {
			if (input[index] < minNumber) {
				minNumber = input[index];
			}
		}
		return minNumber;
	}

	void printDuplicateNumbers(int[] input) {

		int replaceNumber = getMinumunNumber(input) - 1;
		for (int index = 0; index < input.length; index++) {
			boolean isDupliacteFlag = true;

			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && input[index] != replaceNumber) {
					input[innerIndex] = replaceNumber;
					isDupliacteFlag = false;

				}
			}
			if (!isDupliacteFlag)
				System.out.println(input[index]);
		}

	}

	public static void main(String[] args) {
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		int[] input1 = { 10, 0, 80, 10, -1, 44, 10, -80 };

		DuplicateNumbersFromArray dupLicateNumbers = new DuplicateNumbersFromArray();
		System.out.println(Arrays.toString(input));
		dupLicateNumbers.printDuplicateNumbers(input);
		System.out.print("\n");
		System.out.println(Arrays.toString(input1));
		dupLicateNumbers.printDuplicateNumbers(input1);

	}
}
