//Program 1: print duplicate numbers from given array. 
//
//input : {10,20,10,44,33,55,33};
//output : 10
//		   33
package maheshSantoki.SpecialInterview;

import java.util.Arrays;

public class DuplicateNumber {
	void duplicateNum(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					output[i] = arr[j];
					arr[j] = 0;
				}
			}
			if (output[i] > 0)
				System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		DuplicateNumber duplicatenum = new DuplicateNumber();

		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input Array : " + Arrays.toString(input) + "\n" + "Duplicate Numbers :");
		duplicatenum.duplicateNum(input);

	}
}
