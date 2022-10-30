/*Program 2 : Return unique names from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]*/
package asthaSrivastava.array.assignments.collections39;

import java.util.Arrays;

import java.util.LinkedHashSet;

public class A39_UniqueName {

	// method to find unique names from given array
	LinkedHashSet<String> getUniqueName(String[] input) {
		System.out.println("Input array is " + Arrays.toString(input));
		LinkedHashSet<String> setOfName = new LinkedHashSet<String>();
		for (String name : input) {
			setOfName.add(name);
		}
		System.out.println("Unique name from given array : " + setOfName);
		return setOfName;
	}

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		new A39_UniqueName().getUniqueName(arr);
	}
}
