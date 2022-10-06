/*Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55*/

package manjiri.arrayEx.assignment33;

import java.util.Arrays;
import java.util.Scanner;

public class NumAllContentUniquely {

	void printAllUniqueNumbers(int[] input) {

		DuplicateNumbersInArray duplicateNum = new DuplicateNumbersInArray();
		int replaceNumber = duplicateNum.getReplaceNum(input);

		for (int index = 0; index < input.length; index++) {
			// compare outer index with each inner index and check if match found
			if (input[index] != replaceNumber) {
				for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
					if (input[index] == input[innerIndex] & index != innerIndex) {
						input[innerIndex] = replaceNumber;
					}
				}
				if (input[index] != replaceNumber)
					System.out.println(input[index]);
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

		new NumAllContentUniquely().printAllUniqueNumbers(inputArr);
	}
}
