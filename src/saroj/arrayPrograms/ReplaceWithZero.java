package saroj.arrayPrograms;

import java.util.Arrays;

public class ReplaceWithZero {

	int[] getReplaceNumbersArray(int[] numbers) {
		for (int index = 0; index < numbers.length - 1; index++) {
			if (numbers[index] > numbers[index + 1]) {
				numbers[index] = 0;
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		ReplaceWithZero replaceWithZero = new ReplaceWithZero();
		int[] numbers = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Orignal array: " + Arrays.toString(numbers));
		int[] numArray = replaceWithZero.getReplaceNumbersArray(numbers);
		System.out.println("Updated array: " + Arrays.toString(numArray));
	}
}
