/* Assignment - 37 : 12th Oct'2022
Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index); */

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;

// method to remove multiple occurance of given name from ArrayList.
public class RemoveMultipleOccurance {

	void removeMultipleOccuranceOfNamesFromList(ArrayList<String> listOfName, String name) {
		System.out.println("Original List: " + "\n" + listOfName + "\n");
		if (listOfName.contains(name)) {
			while (listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				listOfName.remove(listOfName.lastIndexOf(name));
			}
		}
		System.out.println("Processed list after removing multiple occurance of " + name + " is: " + "\n" + listOfName);
	}

	public static void main(String[] args) {
		ArrayList<String> listOfName = new ArrayList<String>();
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Sagar");
		listOfName.add("Apurva");
		listOfName.add("Gaurav");
		listOfName.add("Sagar");
		listOfName.add("Deepak");
		listOfName.add("Rashmi");
		listOfName.add("Sagar");

		RemoveMultipleOccurance obj = new RemoveMultipleOccurance();
		obj.removeMultipleOccuranceOfNamesFromList(listOfName, "Sagar");
	}
}
