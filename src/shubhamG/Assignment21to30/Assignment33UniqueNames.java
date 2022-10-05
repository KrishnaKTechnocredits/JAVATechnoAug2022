package shubhamG.Assignment21to30;

import java.util.Arrays;

/*
program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
		 */
public class Assignment33UniqueNames {
	void printUniqueNames(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && i != j) {
					arr[j] = arr[j].replace(arr[j], "");
				}

			}
			if (arr[i] != "")
				System.out.println(arr[i]);

		}
	}

	public static void main(String[] args) {

		Assignment33UniqueNames uniqueNames = new Assignment33UniqueNames();

		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("Input array is :" + Arrays.toString(input));
		System.out.println("Unique names in the input Array are - ");
		uniqueNames.printUniqueNames(input);

	}

}
