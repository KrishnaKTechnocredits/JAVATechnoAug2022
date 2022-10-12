package shubhamG.Assignment31to40;

import java.util.ArrayList;

/*Program 1 : 
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
}	

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

public class Assignment37 {

	//Remove given name from ArrayList.
	void removeNameFromList(ArrayList<String> list1, String name) {
		System.out.println("Given Input Array List is \n" + list1);
		while (list1.contains(name)) {
			list1.remove(name);
		}
		System.out.println("\nOutput after removing " + name + " is \n" + list1);
	}

	
//	Remove multiple occurance of given name from ArrayList.
	void removeMultipleOccuranceOfName(ArrayList<String> list2, String name) {
		System.out.println("\nGiven Input Array List is \n" + list2);
		int index = list2.indexOf(name);
		int lastIndex = list2.lastIndexOf(name);
		while (index != lastIndex) {
			list2.remove(lastIndex);
			lastIndex = list2.lastIndexOf(name);
		}
		System.out.println("\nOutput after removing multiple occurance of " + name + " is \n" + list2);

	}

//	Remove multiple occurance from ArrayList.
	void getRecordWithMultipleEntries(ArrayList<String> list3) {
		System.out.println("\nGiven Input Array List is \n" + list3);

		for (int i = 0; i < list3.size(); i++) {
			String name=list3.get(i);
			int index = list3.indexOf(name);
			int lastIndex = list3.lastIndexOf(name);
			if (index != lastIndex) {
				list3.remove(lastIndex);
			}
		}
		System.out.println("\nOutput after removing multiple occurance is \n" + list3);

	}

	public static void main(String[] args) {
		Assignment37 arrayListAssignment = new Assignment37();

		ArrayList<String> listOfNames1 = new ArrayList<String>();
		listOfNames1.add("Sagar");
		listOfNames1.add("Harshal");
		listOfNames1.add("Apurva");
		listOfNames1.add("Gaurav");
		listOfNames1.add("Sagar");
		listOfNames1.add("Deepak");
		listOfNames1.add("Rashmi");

		arrayListAssignment.removeNameFromList(listOfNames1, "Sagar");

		ArrayList<String> listOfNames2 = new ArrayList<String>();

		listOfNames2.add("Sagar");
		listOfNames2.add("Harshal");
		listOfNames2.add("Sagar");
		listOfNames2.add("Apurva");
		listOfNames2.add("Gaurav");
		listOfNames2.add("Sagar");
		listOfNames2.add("Deepak");
		listOfNames2.add("Rashmi");
		System.out.println("\n--------------------------------------------------------------------------------");
		arrayListAssignment.removeMultipleOccuranceOfName(listOfNames2, "Sagar");

		ArrayList<String> listOfNames3 = new ArrayList<String>();

		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Apurva");
		listOfNames3.add("Gaurav");
		listOfNames3.add("Sagar");
		listOfNames3.add("Gaurav");
		System.out.println("\n--------------------------------------------------------------------------------");
		arrayListAssignment.getRecordWithMultipleEntries(listOfNames3);

	}
}
