/*program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8*/

package manjiri.arrayEx.assignment33;

import java.util.Arrays;
import java.util.Scanner;

public class missingNumbers {

	void printMissingNumbers(int[] numArr, int startRange, int endRange) {
		// iterate the range of numbers
		System.out.println("Missing Numbers are: ");

		System.out.println("---------------------");

		for (int index = startRange; index <= endRange; index++) {
			boolean flag = true;
			// iterate the input array
			for (int innerIndex = 0; innerIndex < numArr.length; innerIndex++) {
				if (index == numArr[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(index);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Get start and end range from the user
		System.out.println("Enter Start Range: ");
		int startRange = sc.nextInt();
		System.out.println("Enter End Range: ");
		int endRange = sc.nextInt();

		System.out.println("How many elements you want to enter in the given Range: ");
		int length = sc.nextInt();

		int[] inputArr = new int[length];
		for (int index = 0; index < inputArr.length; index++) {
			inputArr[index] = sc.nextInt();
		}
		sc.close();

		System.out.println(Arrays.toString(inputArr));
		System.out.println("=========================================================");

		new missingNumbers().printMissingNumbers(inputArr, startRange, endRange);
	}
}
