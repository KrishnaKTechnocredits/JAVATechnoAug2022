/*program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1*/

package manjiri.arrayEx.assignment33;

import java.util.Arrays;
import java.util.Scanner;

public class NumberFrequency {

	void printFrequencyOfNumbersInArray(int[] input) {

		DuplicateNumbersInArray duplicateNum = new DuplicateNumbersInArray();
		int replaceNumber = duplicateNum.getReplaceNum(input);

		for (int index = 0; index < input.length; index++) {
			int count = 0;
			if (input[index] != replaceNumber) {
				for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
					if (input[index] == input[innerIndex]) {
						input[innerIndex] = replaceNumber;
						count++;
					}
				}
				if (input[index] != 0) {
					System.out.println(input[index] + "-->" + (count + 1));
				}
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

		new NumberFrequency().printFrequencyOfNumbersInArray(inputArr);
	}
}
