/*Assignment - 37 : 12th Oct'2022
Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index); */

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;

public class RemoveAllMultipleOccurance {

	// method to remove multiple occurance from ArrayList.
	void removeAllMultipleOccuranceOfNamesFromList(ArrayList<String> listOfName) {
		System.out.println("Original List: " + "\n" + listOfName + "\n");
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			while (listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				listOfName.remove(listOfName.lastIndexOf(name));
			}
		}
		System.out.println("Processed list after removing all the multiple occurance of names is: " + "\n" + listOfName);
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

		new RemoveAllMultipleOccurance().removeAllMultipleOccuranceOfNamesFromList(listOfName);
	}
}
