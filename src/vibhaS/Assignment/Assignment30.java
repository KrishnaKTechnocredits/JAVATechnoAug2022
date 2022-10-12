package vibhaS.Assignment;

import java.util.Arrays;

public class Assignment30 {

	int[] getDuplicateNumber(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j && arr[j] != -1) {
					arr[j] = -1;
					output[i] = arr[i];
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		int[] arr = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println(" Duplicate number in => " + Arrays.toString(arr));
		int[] ans = assignment30.getDuplicateNumber(arr);
		for (int index = 0; index < ans.length; index++) {
			if (ans[index] > 0)
				System.out.println(" " + ans[index]);
		}
	}
}
