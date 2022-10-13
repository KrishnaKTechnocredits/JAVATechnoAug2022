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

	// method to remove multiple occurrence from ArrayList.
	void removeAllMultipleOccuranceOfNamesFromList(ArrayList<String> listOfName) {
		System.out.println("Original List: " + "\n" + listOfName + "\n");
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			if(listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				listOfName.remove(listOfName.lastIndexOf(name));
				index--;
			}
		}
		System.out.println("Processed list after removing all the multiple occurance of names is: " + "\n" + listOfName);
	}
	
	// not an optimized method
	void removeAllMultipleOccuranceOfNamesFromList1(ArrayList<String> listOfName) {
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
		listOfName.add("Sagar");
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Harshal");
		listOfName.add("Apurva");
		listOfName.add("Gaurav");
		listOfName.add("Gaurav");
		listOfName.add("Apurva");
		listOfName.add("Apurva");
		
		new RemoveAllMultipleOccurance().removeAllMultipleOccuranceOfNamesFromList(listOfName);
	}
}
