/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

void removeNameFromList(ArrayList<String> listOfName, String name){
	for(String n : listOfName){
		if(n.equals(name))
			count++;
	}
	
	ArrayList<String> temp = new ArrayList<String>(listOfName);
	while(temp.contains(name)){
		temp.remove(name);
		count++;
	}
}	 */

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;

public class RemoveNameFromList {

	// method to remove given name from ArrayList.
	void removeNameFromList(ArrayList<String> listOfName, String name) {
		System.out.println("Original List: " + "\n" + listOfName + "\n");
		while (listOfName.contains(name)) {
			listOfName.remove(name);
		}
		System.out.println("Processed list after removing " + name + " is: " + "\n" + listOfName);
	}

	public static void main(String[] args) {
		ArrayList<String> listOfName = new ArrayList<String>();
		listOfName.add("Sagar");
		listOfName.add("Harshal");
		listOfName.add("Apurva");
		listOfName.add("Gaurav");
		listOfName.add("Sagar");
		listOfName.add("Deepak");
		listOfName.add("Rashmi");

		RemoveNameFromList obj = new RemoveNameFromList();
		obj.removeNameFromList(listOfName, "Sagar");
	}
}
