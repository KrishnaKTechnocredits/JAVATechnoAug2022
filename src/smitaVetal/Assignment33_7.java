/*program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
*/
package smitaVetal;

import java.util.Arrays;

public class Assignment33_7 {

	void printFrequencyOfEachNumberFromArray(int[] arr) {
		int replaceNum = 0;
		for (int index = 0; index < arr.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex] && arr[index] != replaceNum) {
					arr[innerIndex] = replaceNum;
					count++;
				}
			}
			if (arr[index] != replaceNum) {
				System.out.println(arr[index] + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_7 prog = new Assignment33_7();
		int[] arr = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		System.out.println("Print frequency of each number from array");
		System.out.println("\nInput array: " + Arrays.toString(arr));
		System.out.println("\nFrequency of each number from array: ");
		prog
		.printFrequencyOfEachNumberFromArray(arr);
	}
}
