/* 
Assignment 39 : 15th Oct'2022
Program 2 : Return names uniquely from given Array.
String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
output : ["Maulik", "Umesh", "Saroj"]
*/

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

class FindUniqueNamesUsingHashSet {

	// Method to return names uniquely from given Array.
	LinkedHashSet<String> getNamesUniquely(String[] strArr) {
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(strArr));
		System.out.println("Original list of names: " + listOfNames);
		LinkedHashSet<String> setOfNames = new LinkedHashSet<String>();

		for (String name : listOfNames) {
			setOfNames.add(name);
		}
		return setOfNames;
	}

	public static void main(String[] args) {
		String[] str = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		System.out.println("List of unique names are: " + new FindUniqueNamesUsingHashSet().getNamesUniquely(str));
	}
}