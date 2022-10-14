/*Assignment - 38 : 14th Oct'2022

Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains */

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class OperationsOnArrayList {

	// method to replace all Deepak with Shivani.
	void displayProcessedList(ArrayList<String> listOfName, String name1, String name2) {
		System.out.println("Original list: " + listOfName);
		while (listOfName.contains(name1)) {
			listOfName.set(listOfName.indexOf(name1), name2);
		}
		System.out.println("Replaced " + name1 + " with " + name2 + "...");
		System.out.println("Updated List: " + listOfName);
	}

	public static void main(String[] args) {
		String[] strArr = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(strArr));

		new OperationsOnArrayList().displayProcessedList(listOfName, "Deepak", "Shivani");
	}
}
