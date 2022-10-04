package nehaniG;

import java.util.Arrays;

public class Assignment24 {
	void printArray(int[] num) {
		int[] sumOfArrayValues = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			sumOfArrayValues[i] = 0;
			for (int j = 0; j < num.length; j++) {
				if (j != i) {
					sumOfArrayValues[i] += num[j];
				}
			}
		}
		System.out.println("output array : " + Arrays.toString(sumOfArrayValues));
	}

	public static void main(String[] args) {
		int[] num = { 12, 2, 11, 17 };
		Assignment24 assignment24 = new Assignment24();
		System.out.println("Input array : " + Arrays.toString(num));
		assignment24.printArray(num);
	}
}
