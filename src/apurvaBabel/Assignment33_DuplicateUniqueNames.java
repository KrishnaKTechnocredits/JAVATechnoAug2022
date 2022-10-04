package apurvaBabel;

import java.util.Arrays;

public class Assignment33_DuplicateUniqueNames {

	// Program 4 : Method to print duplicate names from given array (do not consider case sensitivity)
	void printDuplicateNames(String[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		System.out.println("Duplicate names from given string are : ");
		
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index].equalsIgnoreCase(input[innerIndex]) && input[innerIndex] != "") {
					input[innerIndex] = "";
					count++;
				}
			}
			if (count > 1) {
				System.out.println(input[index].toLowerCase());
			}
		}
	}

	// Program 5 : Method to print all Unique names from given array
	void printAllUniqueNames(String[] input) {
		System.out.println("\nInput : " + Arrays.toString(input));
		System.out.println("All Unique names from given string are : ");
		
		for (int index = 0; index < input.length; index++) {
			int count = 1;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index].equals(input[innerIndex]) && input[innerIndex] != "") {
					input[innerIndex] = "";
					count++;
				}
			}
			if (count >= 1 && input[index] != "") {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_DuplicateUniqueNames assignment33 = new Assignment33_DuplicateUniqueNames();
		String[] input = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		assignment33.printDuplicateNames(input);
		
		String[] input1 = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		assignment33.printAllUniqueNames(input1);

	}
}
