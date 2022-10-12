/*Assignment - 33 : 1st Oct'2022
program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc*/

package rashmiG.Assignment33_NumberStringDuplicateUnique;

import java.util.Scanner;

public class DuplicateNames {

	void printDuplicateNames(String[] input) {
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			if (input[index] != "") {
				for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
					if (input[index].equalsIgnoreCase(input[innerIndex])) {
						input[innerIndex] = "";
						count++;
					}
				}
			}
			if (count > 0)
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		DuplicateNames names = new DuplicateNames();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names you want to have in array");
		int length = sc.nextInt();
		String[] input = new String[length];
		for (int index = 0; index < input.length; index++) {
			System.out.println("Please enter " + (index + 1) + " name");
			input[index] = sc.next();
		}
		System.out.println("\nOutPut\n");
		names.printDuplicateNames(input);
		sc.close();
	}
}
