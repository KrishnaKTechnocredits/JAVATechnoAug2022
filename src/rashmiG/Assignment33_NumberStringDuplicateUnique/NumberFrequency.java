/*Assignment - 33 : 1st Oct'2022
program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1*/
package rashmiG.Assignment33_NumberStringDuplicateUnique;

import java.util.Scanner;

public class NumberFrequency {

	int getReplaceNumber(int[] input) {
		int replaceNumber = 0;
		int minNumber = input[0];
		boolean isZeroAvailable = false;
		for (int num : input) {
			if (num == 0) {
				isZeroAvailable = true;
			}
			if (num < minNumber) {
				minNumber = num;
			}
		}
		return isZeroAvailable ? minNumber - 1 : replaceNumber;
	}

	void printEachNumberFrequency(int[] input) {
		System.out.println("\nOutput");
		int replaceNumber = getReplaceNumber(input);
		for (int index = 0; index < input.length; index++) {
			int numberCount = 1;
			if (input[index] != replaceNumber) {
				for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
					if (input[index] == input[innerIndex]) {
						input[innerIndex] = replaceNumber;
						numberCount++;
					}
				}
			}
			if (input[index] != replaceNumber)
				System.out.println(input[index] + " -> " + numberCount);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to have in array");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the "+(index+1)+" number");
			input[index] = sc.nextInt();
		}
		new NumberFrequency().printEachNumberFrequency(input);
		sc.close();
	}
}