package shubhamG.Assignment31to40;

import java.util.Arrays;

/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc
*/

public class Assignment33DuplicateNames {

	void printDuplicateNames(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].toLowerCase();
			for (int j = i + 1; j < arr.length; j++) {
				arr[j] = arr[j].toLowerCase();
				if (arr[i].equals(arr[j]) && i != j) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		Assignment33DuplicateNames names =new Assignment33DuplicateNames();
		
		String[] input = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input array is :" + Arrays.toString(input));
		System.out.println("Duplicate names in the input Array are - ");
		names.printDuplicateNames(input);
	
	}
}
