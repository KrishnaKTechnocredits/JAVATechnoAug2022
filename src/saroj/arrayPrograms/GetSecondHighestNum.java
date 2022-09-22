package saroj.arrayPrograms;

import java.util.Arrays;

public class GetSecondHighestNum {

	int getSecondHighest(int[] numbers) {
		int max = 0;
		int secondMax = 0;
		if (numbers[0] < numbers[1]) {
			max = numbers[1];
			secondMax = numbers[0];
		} else {
			max = numbers[0];
			secondMax = numbers[1];
		}

		for (int index = 2; index < numbers.length; index++) {
			if (numbers[index] > max) {
				secondMax = max;
				max = numbers[index];

			} else if (secondMax < numbers[index]) {
				secondMax = numbers[index];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		GetSecondHighestNum getSecondHighestNum = new GetSecondHighestNum();
		int[] numbers = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second highest number in :" + Arrays.toString(numbers) + " is: "
				+ getSecondHighestNum.getSecondHighest(numbers));
	}
}
