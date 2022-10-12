/*Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);*/
package adittyThakare.collections;

import java.util.ArrayList;

public class Assignment37_Program3 {

	// Method to remove multiple occurences from Arraylist
	void removeAllMultipleOccurenceFromArraylist(ArrayList<String> listOfNames) {

		for (int index = 0; index < listOfNames.size(); index++) {
			String op = listOfNames.get(index);
			if (listOfNames.indexOf(op) != listOfNames.lastIndexOf(op)) {
				int lastIndex = listOfNames.lastIndexOf(op);
				listOfNames.remove(lastIndex);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment37_Program3 assignment37_Program3 = new Assignment37_Program3();
		ArrayList<String> listOfNames = new ArrayList<String>();
		String[] arr = { "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Gaurav" };

		for (int index = 0; index < arr.length; index++) {
			listOfNames.add(arr[index]);
		}

		System.out.println("Program to remove all multiple occurences from Arraylist!");
		System.out.println("\nOriginal Arraylist: " + listOfNames);

		assignment37_Program3.removeAllMultipleOccurenceFromArraylist(listOfNames);
		System.out.println("\nOutput Arraylist: " + listOfNames);
	}

}
