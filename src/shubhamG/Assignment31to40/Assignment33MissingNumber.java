package shubhamG.Assignment31to40;

import java.util.Arrays;
/*program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8*/

public class Assignment33MissingNumber {

	void printMissingNumber(int[] arr, int startRange, int endRange) {
		System.out.println("Missing number from given array in range of " + startRange + " and " + endRange + " are :");
		for (int num = startRange; num <= endRange; num++) {
			boolean isMissingFlag = true;
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) {
					isMissingFlag = false;
					break;
				}
			}
			if (isMissingFlag) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {

		Assignment33MissingNumber missing = new Assignment33MissingNumber();
		int[] input = { 1, 3, 9, 5, 6, 10 };
		System.out.println("Input array is :" + Arrays.toString(input));
		missing.printMissingNumber(input, 1, 10);

	}
}
