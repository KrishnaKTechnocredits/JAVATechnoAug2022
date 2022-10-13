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

hint : ArrayList<String> output = new ArrayList<String>();
		for (String name : listOfNames) {
			if (!output.contains(name)) {
				output.add(name);
			}
		}
		return output;
*/
package sanket;

import java.util.ArrayList;

public class CollectionArrayList {

	// method to remove given name from ArrayList.
	void deleleName(ArrayList<String> listOfNames, String name) {
		int count = 0;
		System.out.println("*** Program 1 Solution ***");
		System.out.println("The input ArrayList is : " + listOfNames);
		System.out.println("The delete element is : " + name);

		while (listOfNames.contains(name)) {
			listOfNames.remove(name);
			count++;
		}
		System.out.println("The occurance of " + name + " was in ArrayList : " + count);
		System.out.println("The output ArrayList is : " + listOfNames);
	}

	// method to remove multiple occurance of given name from ArrayList.
	void deleteMulOccName(ArrayList<String> listOfNames, String name) {
		System.out.println("*** Program 2 Solution ***");
		System.out.println("The input ArrayList is : " + listOfNames);
		System.out.println("The multiple occurance elements to be removed : " + name);

		for (int index = 0; index < listOfNames.size(); index++) {
			if (listOfNames.indexOf(name) != listOfNames.lastIndexOf(name)) {
				listOfNames.remove(listOfNames.lastIndexOf(name));
			}
		}
		System.out.println("The output ArrayList is : " + listOfNames);
	}

	// method to return to remove multiple occurance from ArrayList.
	ArrayList<String> deleteMulOccOfNames(ArrayList<String> listOfNames) {
		ArrayList<String> output = new ArrayList<String>();
		for (String name : listOfNames) {
			if (!output.contains(name)) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] args) {

		CollectionArrayList collArray = new CollectionArrayList();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Harshal");
		al.add("Apurva");
		al.add("Gaurav");
		al.add("Sagar");
		al.add("Deepak");
		al.add("Rashmi");
		collArray.deleleName(al, "Sagar");

		System.out.println("\n");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sagar");
		al2.add("Harshal");
		al2.add("Sagar");
		al2.add("Apurva");
		al2.add("Gaurav");
		al2.add("Sagar");
		al2.add("Deepak");
		al2.add("Rashmi");
		collArray.deleteMulOccName(al2, "Sagar");

		System.out.println("\n");

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Sagar");
		al3.add("Harshal");
		al3.add("Sagar");
		al3.add("Harshal");
		al3.add("Apurva");
		al3.add("Gaurav");
		al3.add("Sagar");
		al3.add("Gaurav");
		System.out.println("*** Program 3 Solution ***");
		System.out.println("The input ArrayList is : " + al3);
		System.out.println("The multiple occurance removal name ArrayList is : " + collArray.deleteMulOccOfNames(al3));
	}
}
