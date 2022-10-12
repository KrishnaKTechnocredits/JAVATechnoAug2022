//Program:3 print missing numbers from given array from range 1 to 10. 
//input : {1,3,9,5,6,10}
//output : 2
//		 4
//		 7
//		 8
package maheshSantoki.SpecialInterview;

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
