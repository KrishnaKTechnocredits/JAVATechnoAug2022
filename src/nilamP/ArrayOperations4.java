package nilamP;

import java.util.Arrays;

public class ArrayOperations4 {
	void getDuplicateNum(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) {
					output[i] = input[j];
					input[j] = 0;
				}
			}
			if (output[i] > 0) {
				System.out.println(output[i]);
			}
		}
	}

	public static void main(String[] args) {
		ArrayOperations4 ao = new ArrayOperations4();
		int[] input = { 10, 12, 44, 12, 77, 67, 12, 44 };
		System.out.println(Arrays.toString(input));
		ao.getDuplicateNum(input);
	}
}
