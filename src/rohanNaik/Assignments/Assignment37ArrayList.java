/*Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);

Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);


*/
package rohanNaik.Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment37ArrayList {

	void removeName(ArrayList<String> listOfNames, String input) {

		while (listOfNames.contains(input)) {
			listOfNames.remove(input);
		}
	}

	void removeMultipleOccurance(ArrayList<String> nameList, String name) {

		while (nameList.indexOf(name) != nameList.lastIndexOf(name)) {
			int index = nameList.lastIndexOf(name);
			nameList.remove(index);
		}
	}

	ArrayList<String> UniqueOccurance(ArrayList<String> list1) {

		ArrayList<String> list2 = new ArrayList<String>();

		for (String name : list1) {
			if (!list2.contains(name)) {
				list2.add(name);
			}
		}
		return list2;
	}

	public static void main(String[] args) {

		Assignment37ArrayList obj = new Assignment37ArrayList();

		String[] arr = { "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Deepak", "Sagar", "Rashmi" };
		// Program 1.
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input :" + listOfNames.toString());
		obj.removeName(listOfNames, "Sagar");
		System.out.println("Output :" + listOfNames.toString());
		System.out.println("------------------------------------------------");

		// Program 2.
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input : " + nameList.toString());
		obj.removeMultipleOccurance(nameList, "Sagar");
		System.out.println("Output : " + nameList.toString());
		System.out.println("------------------------------------------------");

		// Program3
		String[] arr1 = { "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Gaurav" };
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));

		System.out.println("Input : " + list1.toString());
		ArrayList<String> list2 = obj.UniqueOccurance(list1);
		System.out.println("Output : " + list2.toString());
		System.out.println("------------------------------------------------");

	}

}
