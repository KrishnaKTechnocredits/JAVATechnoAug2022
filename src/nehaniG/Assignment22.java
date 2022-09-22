package nehaniG;

import java.util.Arrays;

public class Assignment22 {
	int[] replaceCurrentIndex(int[] num) {
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] > num[i + 1]) {
				num[i] = 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		int[] input = { 10, 20, 30, 22, 44, 21, 92, 89 };
		System.out.println("Original Array : " + Arrays.toString(input));
		int[] output = new int[input.length];
		output = assignment22.replaceCurrentIndex(input);
		System.out.println("Output Array : " + Arrays.toString(output));
	}

}
