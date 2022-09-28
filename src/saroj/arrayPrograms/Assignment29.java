package saroj.arrayPrograms;

import java.util.Arrays;

public class Assignment29 {
	int[] shiftAllZeroInLast(int[] numbers) {
		int[] numArray = new int[numbers.length];
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] != 0) {
				numArray[count] = numbers[index];
				count++;
			}
		}
		return numArray;
	}

	int[] shiftAllZeroBegining(int[] numbers) {
		int[] arr = new int[numbers.length];
		int count = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == 0) {
				count++;
			}
		}
		for (int index1 = 0; index1 < arr.length; index1++) {
			if (numbers[index1] != 0) {
				arr[count] = numbers[index1];
				count++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		int[] numbers = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] arr = assignment29.shiftAllZeroInLast(numbers);
		System.out.println("Input array is: " + Arrays.toString(numbers));
		System.out.println("=============================================================");
		System.out.println("Output array after shifting 0 at last is: " + Arrays.toString(arr));
		System.out.println("=============================================================");
		int[] arr1 = assignment29.shiftAllZeroBegining(numbers);
		System.out.println("Output array after shifting 0 at beginning: " + Arrays.toString(arr1));
	}
}
