/*Assignment - 37 : 12th Oct'2022

Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);*/

package rashmiG.Collections;

import java.util.ArrayList;

public class ArrayListRemoveMultipleOccurences {

	void RemoveMultipleOccurences(ArrayList<String> listOfNames, String name) {
		while (listOfNames.indexOf(name) != listOfNames.lastIndexOf(name)) {
			listOfNames.remove(listOfNames.lastIndexOf(name));
		}
		System.out.println(listOfNames);
	}
	
	/*void Approach2(ArrayList<String> listOfNames, String targetName) {
		ArrayList<String> temp = new ArrayList<String>();
		for(String name : listOfNames ) {
			if(name.equals(targetName)) {
				if(!temp.contains(name)) {//while (!temp.contains(name))
				temp.add(name);
				}
			}
			else {
				temp.add(name);
			}
		}
		System.out.println(temp);
		
		
	}*/

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		String[] input = { "Sagar", "Sagar", "Sagar", "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav",
				"Sagar", "Gaurav", "Apurva", "Apurva", "Apurva" };
				//{ "Sagar", "Harshal","Rashmi", "Sagar", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi" };
		for (String name : input) {
			listOfNames.add(name);
		}
		System.out.println("Before deletion\n"+listOfNames);
		System.out.println("\nAfter deletion");
		new ArrayListRemoveMultipleOccurences().RemoveMultipleOccurences(listOfNames, "Sagar");
	}

}
