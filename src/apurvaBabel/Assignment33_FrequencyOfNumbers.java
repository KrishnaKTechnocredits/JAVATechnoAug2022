package apurvaBabel;

import java.util.Arrays;

public class Assignment33_FrequencyOfNumbers {

	// Program 7 : Method to print frequency of each number from given array
	void printNumberFrequency(int[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Frequency of each number from given array :");
		int minNum = getReplaceNumber(input);

		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex] && input[innerIndex] != minNum) {
					count++;
					input[innerIndex] = minNum;
				}
			}
			if (input[index] != minNum) {
				System.out.println(input[index] + " --> " + count);
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
		return isDigitZeroFlag ? 0 : minNum-1;
	}

	public static void main(String[] args) {
		Assignment33_FrequencyOfNumbers assignment33 = new Assignment33_FrequencyOfNumbers();
		int[] input = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		assignment33.printNumberFrequency(input);
	}
}
