package vibhaS.Assignment;

import java.util.Arrays;

public class Assignment22 {

	int[] getProcessData(int[] arr) {
		for (int index = 0; index < arr.length - 1; index++) {
			if (arr[index] > arr[index + 1])
				arr[index] = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		int[] arr = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Arrays before calling function =>" + Arrays.toString(arr));
		int[] arr1 = assignment22.getProcessData(arr);
		System.out.println("");
		System.out.println("Arrays After Calling function =>" + Arrays.toString(arr1));
	}
}
