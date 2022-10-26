/*Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] */
package asthaSrivastava.array.assignments.collections39;

import java.util.*;

public class A39_PrintDuplicateNames {

	// method to find duplicate names from given array
	void getDuplicateName(String[] input) {
		System.out.println("Input array is " + Arrays.toString(input));
		HashSet<String> setOfName = new HashSet<String>();
		for (String name : input) {
			boolean flag = setOfName.add(name);
			if (!flag) {
				System.out.println("Duplicate name from given array : " + name);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Umesh", "Saroj", "Umesh" };
		new A39_PrintDuplicateNames().getDuplicateName(arr);
	}
}