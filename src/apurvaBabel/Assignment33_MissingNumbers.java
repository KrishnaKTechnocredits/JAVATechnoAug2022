package apurvaBabel;

import java.util.Arrays;

public class Assignment33_MissingNumbers {

	// Program 3 : Method to print Missing numbers from given array from range
	void printMissingNumbers(int[] input, int startNum, int endNum) {
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Missing numbers from given array from range " + startNum + " to" + endNum + " are : ");

		for (int num = startNum; num <= endNum; num++) {
			boolean isMissingNumflag = true;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index]) {
					isMissingNumflag = false;
					break;
				}
			}
			if (isMissingNumflag) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_MissingNumbers assignment33 = new Assignment33_MissingNumbers();
		int[] input = { 1, 3, 9, 5, 6, 10 };
		assignment33.printMissingNumbers(input, 1, 10);
	}
}
