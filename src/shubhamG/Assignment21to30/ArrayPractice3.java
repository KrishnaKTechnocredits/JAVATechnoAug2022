package shubhamG.Assignment21to30;

/*
Assignment 21 14 Sept 2022

Que -Find the 2nd max element from the given array
*/
import java.util.Arrays;

public class ArrayPractice3 {

	int getSecondMaxValueFromArray(int[] arr) {
		int max = arr[0];
		int secondMax = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 21, 99, 87, 79, 81, 5 };
		System.out.println("Given input array is : " + Arrays.toString(arr));
		System.out.println(
				"Second max element form given array is : " + new ArrayPractice3().getSecondMaxValueFromArray(arr));
	}
}
