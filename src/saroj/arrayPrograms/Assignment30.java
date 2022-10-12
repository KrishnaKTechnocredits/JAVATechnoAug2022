package saroj.arrayPrograms;

import java.util.Arrays;

public class Assignment30 {

	void getMinDigit(int[] digit) {
		int min = digit[0];
		for (int index = 1; index < digit.length; index++) {
			if (min > digit[index]) {
				min = digit[index];
			}
		}
		for (int index = 0; index < digit.length; index++) {
			int count = 0;
			for (int index1 = index + 1; index1 < digit.length; index1++) {
				if (digit[index] == digit[index1] && index != index1) {
					digit[index1] = --min;
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(digit[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		int[] numbers = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println("Duplicate number from given array: " + Arrays.toString(numbers) + " are:");
		assignment30.getMinDigit(numbers);
	}

}
