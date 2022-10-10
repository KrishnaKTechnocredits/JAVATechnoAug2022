/*Assignment - 33 : 10th Oct'2022
program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
*/
package ankitaBarwad;

import java.util.Arrays;

public class Assignment33_Program4 {

	// program 4: print duplicate names from given array
	// (do not consider case sensitivity).
	void printDuplicateNamesFromArray(String[] inputArray) {
		System.out.println("Input : " + Arrays.toString(inputArray) + "\nOutput :");
		for (int index = 0; index < inputArray.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < inputArray.length; innerIndex++) {
				if ((inputArray[index].equalsIgnoreCase(inputArray[innerIndex]))
						&& !(inputArray[innerIndex].equals(""))) {
					count++;
					inputArray[innerIndex] = "";
				}
			}
			if (count > 1) {
				System.out.println(inputArray[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_Program4 program4 = new Assignment33_Program4();
		System.out.println("Program 4 : print duplicate names from given array");
		String inputArray4[] = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		program4.printDuplicateNamesFromArray(inputArray4);
	}
}