package saroj.arrayPrograms;

import java.util.Arrays;

public class Assignment24 {

	void replaceElementWithSum(int[] elements) {
		int[] arrNum = new int[elements.length];
		for (int index = 0; index < elements.length; index++) {
			int sum = 0;
			for (int index1 = 0; index1 < elements.length; index1++) {
				if (index1 != index) {
					sum = sum + elements[index1];
					arrNum[index] = sum;
				}
			}
		}
		System.out.println("Elements before replacement:\n" + Arrays.toString(elements));
		System.out.println("--------------------------------------------");
		System.out.println("Replaced element with sum of other elements:\n" + Arrays.toString(arrNum));
	}

	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		int[] numbers = { 12, 2, 11, 17 };
		assignment24.replaceElementWithSum(numbers);

	}
}