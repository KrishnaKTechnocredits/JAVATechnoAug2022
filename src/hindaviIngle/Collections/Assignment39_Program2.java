/*
 * Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
 */
package hindaviIngle.Collections;

import java.util.Arrays;
import java.util.HashSet;

public class Assignment39_Program2 {
	void returnUniqueNamesFromArray(String[] arr) {
		HashSet<String> set1 = new HashSet<>();
		System.out.println("\nUnique Names: ");
		for (String name : arr) {
			boolean flag = set1.add(name);
			if (flag) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			// TODO Auto-generated method stub
			Assignment39_Program2 a39 = new Assignment39_Program2();
			System.out.println("Return unique names from given Array!");
			String[] arr = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
			System.out.println("\nInput Array: " + Arrays.toString(arr));
			a39.returnUniqueNamesFromArray(arr);
		}

	}

}
