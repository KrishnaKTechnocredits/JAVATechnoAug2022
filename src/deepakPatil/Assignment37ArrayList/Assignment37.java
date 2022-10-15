/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"]

Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"]

Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 
*/

package deepakPatil.Assignment37ArrayList;

import java.util.ArrayList;

public class Assignment37 {

	void removeDuplicateFromArrayList(ArrayList<String> nameList, String name) {

		// method to remove given string from ArrayList
		while (nameList.contains(name)) {
			nameList.remove(name);
		}

		System.out.println(nameList);
		System.out.println("-----------------------------------------------------------");
	}

	void removeMultipleOccurance(ArrayList<String> nameList2, String name) {

		while (nameList2.indexOf(name) != nameList2.lastIndexOf(name)) {
			nameList2.remove(nameList2.lastIndexOf(name));
		}
		System.out.println(nameList2);
	}

	void removeMultipleOccurance(ArrayList<String> nameList3) {

		ArrayList<String> newNameList = new ArrayList<String>();

		for (String name : nameList3) {
			if (!newNameList.contains(name)) {
				newNameList.add(name);
			}
		}
		System.out.println("Arraylist after removing multiple occurance is as below:");
		System.out.println(newNameList);
		System.out.println("-------------------------------------------------------------");
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();

		// Program: Remove Sagar from arraylist
		String[] names = { "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi" };
		ArrayList<String> nameList = new ArrayList<String>();
		String name = "Sagar";
		for (int index = 0; index < names.length; index++) {
			nameList.add(names[index]);
		}
		System.out.println("Given ArrayList is: " + nameList);
		System.out.println("Updated ArraList after removing name '" + name + "' is as below:");
		assignment37.removeDuplicateFromArrayList(nameList, name);

		// Program: Remove multiple occurrence of given name from ArrayList
		String[] names2 = { "Sagar", "Harshal", "Sagar", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi" };
		ArrayList<String> nameList2 = new ArrayList<String>();
		for (int index = 0; index < names2.length; index++) {
			nameList2.add(names2[index]);
		}
		System.out.println("Given ArrayList is: " + nameList2);
		System.out.println("Updated ArraList after removing duplicate occurance of '" + name + "' is as below:");
		assignment37.removeMultipleOccurance(nameList2, name);
		System.out.println("-----------------------------------------------------------");

		// Remove multiple occurrence
		String[] names3 = { "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Gaurav" };
		ArrayList<String> nameList3 = new ArrayList<String>();
		for (int index = 0; index < names3.length; index++) {
			nameList3.add(names3[index]);
		}
		System.out.println("Given ArrayList is: " + nameList);
		assignment37.removeMultipleOccurance(nameList3);
	}
}
