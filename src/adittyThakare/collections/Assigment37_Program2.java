/*Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);*/
package adittyThakare.collections;

import java.util.ArrayList;

public class Assigment37_Program2 {

	// Method to remove multiple occurence of given String
	void removeMultipleOccurrenceFromArraylist(ArrayList<String> listOfNames, String name) {

		while (listOfNames.contains(name) && listOfNames.indexOf(name) != listOfNames.lastIndexOf(name)) {
			int index = listOfNames.lastIndexOf(name);
			listOfNames.remove(index);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assigment37_Program2 assignment37_Program2 = new Assigment37_Program2();
		ArrayList<String> listOfNames = new ArrayList<String>();
		String[] arr = { "Sagar", "Harshal", "Sagar", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi" };
		String inputName = "Sagar";

		for (int index = 0; index < arr.length; index++) {
			listOfNames.add(arr[index]);
		}
		System.out.println("Program to remove multiple occurence of given name!");
		System.out.println("\nOriginal Arraylist: " + listOfNames);
		System.out.println("Given name: " + inputName);
		assignment37_Program2.removeMultipleOccurrenceFromArraylist(listOfNames, inputName);
		System.out.println("\nOutput Arraylist: " + listOfNames);
	}

}
