package avni.StringNdArray;

import java.util.Arrays;

public class DubNoFormArr {
		void findDuplicateNumber(int[] input) {
			System.out.println("Duplicate Numbers : ");
			int[] output = new int[input.length];
			for (int i = 0; i < input.length; i++) {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i] == input[j]) {
						output[i] = input[j];
						input[j] = 0;
					}
				}
				if (output[i] > 0)
					System.out.println(output[i]);
			}
		}

		public static void main(String[] args) {
			DubNoFormArr dupnum = new DubNoFormArr();
			int input[] = { 10, 12, 44, 12, 77, 67, 12, 44 };
			System.out.println("Input Array : " + Arrays.toString(input));
			dupnum.findDuplicateNumber(input);
		}
}
