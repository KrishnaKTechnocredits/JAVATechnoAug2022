/*Assignment - 37 : 12th Oct'2022

Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);*/

package rashmiG.Collections;

import java.util.ArrayList;

public class ArrayListRemoveAllMultipleOccurences {

	ArrayList<String> getUniqueListOfNames1(ArrayList<String> listOfNames) {

		for (int index = 0; index < listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			while (listOfNames.indexOf(name) != listOfNames.lastIndexOf(name)) {
				listOfNames.remove(listOfNames.lastIndexOf(name));
			}
		}
		return listOfNames;
	}

	ArrayList<String> getUniqueListOfNames2(ArrayList<String> listOfNames) {

		ArrayList<String> uniqueList = new ArrayList<String>();
		for (String name : listOfNames) {
			if (!uniqueList.contains(name)) {
				uniqueList.add(name);
			}
		}
		return uniqueList;
	}

	ArrayList<String> getUniqueListOfNames3(ArrayList<String> listOfNames) {
		for (int index = 0; index < listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if (listOfNames.indexOf(name) != listOfNames.lastIndexOf(name)) {
				listOfNames.remove(listOfNames.lastIndexOf(name));
				index--;
			}
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		String[] input = { "Sagar", "Sagar", "Sagar", "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav",
				"Sagar", "Gaurav", "Apurva", "Apurva", "Apurva" };
		for (String name : input) {
			listOfNames.add(name);
		}

		System.out.println(new ArrayListRemoveAllMultipleOccurences().getUniqueListOfNames3(listOfNames));

	}

}
