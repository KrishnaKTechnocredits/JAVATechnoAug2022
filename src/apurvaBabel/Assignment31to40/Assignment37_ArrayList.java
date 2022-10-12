/*Assignment - 37 :
Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)

Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

hint : indexOf, lastIndexOf, remove(int index)
*/

package apurvaBabel.Assignment31to40;

import java.util.ArrayList;

public class Assignment37_ArrayList {

	// Program 1 : Method to remove given name from ArrayList
	void removeGivenNameFromArrayList(ArrayList<String> listOfNames1, String name) {
		System.out.println("Remove given name from ArrayList --> ");
		System.out.println("Input ArrayList : " + listOfNames1);
		System.out.println("Name : " + name);

		while (listOfNames1.contains(name)) {
			listOfNames1.remove(name);
		}
		System.out.println("Output ArrayList : " + listOfNames1);
	}

	// Program 2 : Method to remove multiple occurance of given name from ArrayList
	void removeMultipleOccuranceFromArrayList(ArrayList<String> listOfNames2, String name) {
		System.out.println("\nRemove multiple occurance of given name from ArrayList --> ");
		System.out.println("Input ArrayList : " + listOfNames2);
		System.out.println("Name : " + name);
		for (int index = 0; index < listOfNames2.size(); index++) {
			int FirstIndex = listOfNames2.indexOf(name);
			int lastIndex = listOfNames2.lastIndexOf(name);

			if (FirstIndex != lastIndex) {
				listOfNames2.remove(lastIndex);
			}
		}
		System.out.println("Output ArrayList : " + listOfNames2);
	}

	// Program 3 : Method to remove multiple occurance from ArrayList
	void removeMultipleOccuranceFromArrayList(ArrayList<String> listOfNames3) {
		System.out.println("\nRemove multiple occurance from given ArrayList --> ");
		System.out.println("Input ArrayList : " + listOfNames3);
		for (int index = 0; index < listOfNames3.size(); index++) {
			String name = listOfNames3.get(index);
			int FirstIndex = listOfNames3.indexOf(name);
			int lastIndex = listOfNames3.lastIndexOf(name);

			if (FirstIndex != lastIndex) {
				listOfNames3.remove(lastIndex);
			}
		}
		System.out.println("Output ArrayList : " + listOfNames3);
	}

	public static void main(String[] args) {
		Assignment37_ArrayList assignment37 = new Assignment37_ArrayList();
		ArrayList<String> listOfNames1 = new ArrayList<String>();
		listOfNames1.add("Sagar");
		listOfNames1.add("Harshal");
		listOfNames1.add("Apurva");
		listOfNames1.add("Gaurav");
		listOfNames1.add("Sagar");
		listOfNames1.add("Deepak");
		listOfNames1.add("Rashmi");
		String name = "Sagar";
		assignment37.removeGivenNameFromArrayList(listOfNames1, name);

		ArrayList<String> listOfNames2 = new ArrayList<String>();
		listOfNames2.add("Sagar");
		listOfNames2.add("Harshal");
		listOfNames2.add("Sagar");
		listOfNames2.add("Apurva");
		listOfNames2.add("Gaurav");
		listOfNames2.add("Sagar");
		listOfNames2.add("Deepak");
		listOfNames2.add("Rashmi");
		assignment37.removeMultipleOccuranceFromArrayList(listOfNames2, name);

		ArrayList<String> listOfNames3 = new ArrayList<String>();
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Apurva");
		listOfNames3.add("Gaurav");
		listOfNames3.add("Sagar");
		listOfNames3.add("Gaurav");
		assignment37.removeMultipleOccuranceFromArrayList(listOfNames3);
	}
}
