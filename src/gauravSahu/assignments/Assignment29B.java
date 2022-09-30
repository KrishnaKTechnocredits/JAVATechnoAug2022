package gauravSahu;

import java.util.Arrays;

public class Assignment29B {

	int[] setNum(int[] arr) {
		int[] arr2 = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				count++;
			}
		}
		for (int index2 = 0; index2 < arr.length; index2++) {
			if (arr[index2] != 0) {
				arr2[count] = arr[index2];
				count++;
			}
		}
		return arr2;
	}

	public static void main(String[] args) {
		Assignment29B a29 = new Assignment29B();
		int[] arr = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] arr2 = a29.setNum(arr);
		System.out.println("Input array : " + Arrays.toString(arr));
		System.out.println("Output array : " + Arrays.toString(arr2));
	}
}
