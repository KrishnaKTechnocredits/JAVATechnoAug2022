/*
 * Program 1: Print all duplicate names from given Array.
input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
 */
package hindaviIngle.Collections;

import java.util.Arrays;
import java.util.HashSet;

public class Assignment39_Program1 {
	void printDuplicateNamesFromArray(String[] arr) {
		HashSet<String> inputHash = new HashSet<>();
		System.out.println("\nDuplicate name: ");
		for (String name : arr) {
			boolean flag = inputHash.add(name);
			if (!flag) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment39_Program1 a39 = new Assignment39_Program1();
		System.out.println("Print all duplicate names from given Array:");
		String[] arr = { "Maulik", "Umesh", "Saroj", "Umesh" };
		System.out.println("Input Array: " + Arrays.toString(arr));
		a39.printDuplicateNamesFromArray(arr);

	}
}
