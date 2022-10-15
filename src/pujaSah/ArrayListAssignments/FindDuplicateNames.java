/*
Assignment 39 : 15th Oct'2022
Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
 */

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;

class FindDuplicateNames {

	// Method to print all duplicate names from given Array
	void displayDuplicateNames(String[] strArr) {
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(strArr));
		ArrayList<String> outList = new ArrayList<String>();
		System.out.println("Original list of names: " + listOfNames);

		for (String name : listOfNames) {
			if (listOfNames.indexOf(name) != listOfNames.lastIndexOf(name) && !outList.contains(name)) {
				outList.add(name);
			}
		}
		System.out.println("List of duplicate names are: " + outList);
	}

	public static void main(String[] args) {
		String[] str = { "Maulik", "Umesh", "Saroj", "Umesh" };
		new FindDuplicateNames().displayDuplicateNames(str);
	}
}
