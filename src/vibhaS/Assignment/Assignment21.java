package vibhaS.Assignment;

import java.util.Arrays;

public class Assignment21 {
	
	int getSecondHighestNum(int[] arr) {
		int max = 0;
		int secmax = 0;
		if (arr[0] > arr[1]) {
			max = arr[0];
			secmax = arr[1];
		} else if (arr[1] > arr[0]) {
			max = arr[1];
			secmax = arr[0];
		}
		for (int index = 2; index < arr.length; index++) {
			if (max < arr[index]) {
				secmax = max;
				max = arr[index];
			} else if (secmax < arr[index]) {
				secmax = arr[index];
			}
		}
		return secmax;
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		int[] arr = { 10, 99, 33, 44, 89, 76 };
		int ans = assignment21.getSecondHighestNum(arr);
		System.out.println( Arrays.toString(arr));
		System.out.println("Second Highest number in given array is =>  "+ans);
	}
}
