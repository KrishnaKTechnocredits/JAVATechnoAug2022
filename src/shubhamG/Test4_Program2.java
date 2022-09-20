package shubhamG;

import java.util.Arrays;

public class Test4_Program2 {

	int getCountOfTreesVisible(int[] arr) {
		int count = 1;
		int maxHeight = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxHeight) {
				count++;
				maxHeight = arr[i];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Test4_Program2 trees = new Test4_Program2();

		int[] arr1 = { 3, 4, 11, 9, 10, 13 };

		System.out.println("Given heights of trees in order are : " + Arrays.toString(arr1));
		System.out.println("Number of trees visible are : " + trees.getCountOfTreesVisible(arr1));

		int[] arr2 = { 3, 7, 5 };
		System.out.println("\nGiven heights of trees in order are : " + Arrays.toString(arr2));
		System.out.println("Number of trees visible are : " + trees.getCountOfTreesVisible(arr2));
	}

}
