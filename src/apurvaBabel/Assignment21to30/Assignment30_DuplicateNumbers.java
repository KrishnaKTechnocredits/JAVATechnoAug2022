/*Assignment - 30 :

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)
*/

package apurvaBabel.Assignment21to30;

import java.util.Arrays;

public class Assignment30_DuplicateNumbers {

	// Method to find duplicate numbers from given array
	void findDuplicateNumber(int[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("\nDuplicate numbers from the given string are :");
		int minNum = getMinNum(input);
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && input[innerIndex] != minNum) {
					input[innerIndex] = minNum;
					System.out.println(input[index]);
					break;
				}
			}
		}
	}

	int getMinNum(int[] input) {
		int minNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (minNum > input[index]) {
				minNum = input[index];
			}
		}
		return minNum - 1;
	}

	public static void main(String[] args) {
		Assignment30_DuplicateNumbers assignment30 = new Assignment30_DuplicateNumbers();
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		assignment30.findDuplicateNumber(input);
	}
}
