/*Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);*/

package manjiri.assignment37;

import java.util.ArrayList;

public class RemoveMultipleOccurance {

	void removeMultipleOccuranceFromArrayList(ArrayList<String> listOfNames) {
		for (int index = 0; index < listOfNames.size(); index++) {
			// till element in indexOf and lastIndexOf is not equal
			while (listOfNames.indexOf(listOfNames.get(index)) != listOfNames.lastIndexOf(listOfNames.get(index))) {
				int index1 = listOfNames.lastIndexOf(listOfNames.get(index));
				listOfNames.remove(index1);// remove element in lastIndexOf
			}
		}
		System.out.println("Processed ArrayList is: " + listOfNames);
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>(); // create an arraylist
		listOfNames.add("Sagar"); // add elements t arraylist
		listOfNames.add("Harshal");
		listOfNames.add("Sagar");
		listOfNames.add("Harshal");
		listOfNames.add("Apurva");
		listOfNames.add("Gaurav");
		listOfNames.add("Sagar");
		listOfNames.add("Gaurav");

		System.out.println("Input ArrayList is: " + listOfNames);

		RemoveMultipleOccurance removeMultipleOccurance = new RemoveMultipleOccurance();
		removeMultipleOccurance.removeMultipleOccuranceFromArrayList(listOfNames);
	}
}
