/*Assignment - 33 : 10th Oct'2022
 * program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc*/
package adittyThakare.arrayoperations;

import java.util.Arrays;

public class Assignment33_Program4 {

	// Method to find duplicate words from String array
	void printDuplicateWordsFromArrayNew(String[] arr) {

		System.out.println("\nDuplicate words from array: ");
		for (int index = 0; index < arr.length; index++) {
			int strCount = 0;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index].equalsIgnoreCase(arr[innerIndex])) {
					strCount++;
					arr[innerIndex] = " ";
				}
			}
			if (strCount > 0 && arr[index] != " ") {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find duplicate words from array!");
		Assignment33_Program4 assignment33_Program4 = new Assignment33_Program4();
		String[] arr = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		System.out.println("\nInput array: " + Arrays.toString(arr));
		assignment33_Program4.printDuplicateWordsFromArrayNew(arr);
	}

}
