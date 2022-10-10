package rohini.arrayAssignments;

import java.util.Arrays;

//Assignment 21-Return second highest number from given array
public class SecondHighestNum {
	int getSecondHighestNum(int[] input) {
		int max = 0;
		int secMax = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i]>max) {
				secMax = max;
				max = input[i];

			} else if (input[i]>secMax) {
				secMax = input[i];
			}
		}
		return secMax;
	}
	public static void main(String[] args) {
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Input: "+Arrays.toString(input));
		System.out.println("Minimum number from Array: " + new SecondHighestNum().getSecondHighestNum(input));
	}
}
