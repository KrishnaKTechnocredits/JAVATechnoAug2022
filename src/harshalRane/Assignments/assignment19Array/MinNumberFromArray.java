package harshalRane.Assignments.assignment19Array;

import java.util.Arrays;

public class MinNumberFromArray {
	int getMinNumFromArray(int[] num) {
		int min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < min) {
				min = num[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		MinNumberFromArray minNumberFromArray = new MinNumberFromArray();
		int num[] = { 11, 4, 55, 23, 43 };
		System.out.println("Minimum Number from Given array is: " + minNumberFromArray.getMinNumFromArray(num));
		System.out.println(Arrays.toString(num));
	}
}
