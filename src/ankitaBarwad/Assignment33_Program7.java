/*Assignment - 33 : 10th Oct'2022
program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program7 {

	// program 7 : print each number with its frequency.
	void printEachNumberFrequency(int[] inputArray) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		for (int index = 0; index < inputArray.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				if ((inputArray[index] == inputArray[innerIndex]) && inputArray[innerIndex] != 0) {
					count++;
					inputArray[innerIndex] = 0;
				}
			}
			if (inputArray[index] != 0) {
				System.out.println(inputArray[index] + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_Program7 program7 = new Assignment33_Program7();
		System.out.println("Program 7 : print each number with its frequency.");
		int inputArray7[] = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		program7.printEachNumberFrequency(inputArray7);
	}
}