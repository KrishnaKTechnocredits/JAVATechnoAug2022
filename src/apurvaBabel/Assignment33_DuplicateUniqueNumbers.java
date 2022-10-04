package apurvaBabel;

import java.util.Arrays;

public class Assignment33_DuplicateUniqueNumbers {

	// Program 1 : Method to print duplicate numbers from given array
	void printDuplicateNumbers(int[] input) {
		System.out.println("Input Array : " + Arrays.toString(input));
		System.out.println("Duplicate numbers from given array are :");
		int minNum = getReplaceNumber(input);

		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && input[innerIndex] != minNum) {
					count++;
					input[innerIndex] = minNum;
				}
			}
			if (count > 1) {
				System.out.println(input[index]);
			}
		}
	}

	int getReplaceNumber(int[] input) {
		boolean isDigitZeroFlag = true;
		int minNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0 && minNum > input[index]) {
				isDigitZeroFlag = false;
				minNum = input[index];
			}
		}
		return isDigitZeroFlag ? 0 : minNum - 1;
	}

	// Program 2 : Method to print Unique numbers from given array having 1 frequency
	void printUniqueNumberFrequency1(int[] input) {
		System.out.println("\nInput Array : " + Arrays.toString(input));
		System.out.println("Unique numbers from given array having frequency 1 :");

		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && index != innerIndex) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(input[index]);
			}
		}
	}

	// Program 6 : Method to print Unique numbers from given array having all content uniquely
	void printAllUniqueNumber(int[] input) {
		System.out.println("\nInput Array : " + Arrays.toString(input));
		System.out.println("Unique numbers from given array having all content uniquely :");
		int minNum = getReplaceNumber(input);

		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && input[index] != minNum) {
					input[innerIndex] = minNum;
					count++;
				}
			}
			if (count >= 1 && input[index] != minNum) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_DuplicateUniqueNumbers assignment33 = new Assignment33_DuplicateUniqueNumbers();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		int[] input1 = { 10, 20, 10, 44, 33, 55, 33 };
		assignment33.printDuplicateNumbers(input);
		assignment33.printUniqueNumberFrequency1(input1);
		assignment33.printAllUniqueNumber(input1);
	}
}
