package avni.impAssignments;

import java.util.Arrays;
public class MissingNumber {
	void missingNumber(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean isMissing = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					isMissing = false;
					break;
				}
			}
			if (isMissing) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		MissingNumber missing = new MissingNumber();
		int input[] = { 1, 3, 9, 5, 6, 10 };
		System.out.println("Given Array : " + Arrays.toString(input) + "\n" + "Missing Numbers :");
		missing.missingNumber(input);
	}
}
