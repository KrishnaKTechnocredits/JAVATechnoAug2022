package pujaSah;

import java.util.Arrays;

public class ArrayProcessing {

	int[] getProcessedArray(int[] inArr) {
		int[] outArr = new int[inArr.length];
		for (int i = 0; i <= inArr.length - 1; i++) {
			int sum = 0;
			for (int j = 0; j <= inArr.length - 1; j++) {
				if (i != j) {
					sum += inArr[j];
				}
				outArr[i] = sum;
			}
		}
		return outArr;
	}

	public static void main(String[] args) {
		ArrayProcessing obj = new ArrayProcessing();

		int[] inArr = { 12, 2, 11, 17 };
		System.out.println("Input array: " + Arrays.toString(inArr) + "\n");
		
		int[] outArr = obj.getProcessedArray(inArr);
		System.out.println("The output array is " + Arrays.toString(outArr));
	}
}
