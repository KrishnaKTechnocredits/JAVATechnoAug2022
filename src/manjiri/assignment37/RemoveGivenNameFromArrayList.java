/*Remove given name from ArrayList.
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
}*/

package manjiri.assignment37;

import java.util.ArrayList;

public class RemoveGivenNameFromArrayList {

	void removeNameFromArrayList(ArrayList<String> listOfNames, String name) {
		int count = 0;
		while (listOfNames.contains(name)) {//check if given string is present in arraylist
			listOfNames.remove(name); // if yes remove from array list
			count++;
		}
		System.out.println(listOfNames);
		System.out.println("Number of Occurances of "+name+" are: " + count);
	}
	
	void countOfNameFromArrayList(ArrayList<String> listOfNames, String name) {
		int count = 0;
		ArrayList<String> output = new ArrayList<String>(listOfNames);//copy arraylist to new arraylist
		while(output.contains(name)) {//check if new arraylist contains string, if yes remove from new arraylist, 
			//the original arraylist will remain intact
			output.remove(name);
			count++;
		}
		System.out.println("Number of Occurances of "+name+" are: " + count);
	}
	
	void countOfNameFromArrayListConventionalApproach(ArrayList<String> listOfNames, String name) {
		int count=0;
		for(String name1 : listOfNames) {
			if(name1.equals(name)) {
				count++;
			}
		}
		System.out.println("Number of Occurances of "+name+" are: " + count);
	}

	public static void main(String[] args) {

		ArrayList<String> listOfNames = new ArrayList<String>(); //create an arraylist
		listOfNames.add("Sagar"); // add elements t arraylist
		listOfNames.add("Harshal");
		listOfNames.add("Apurva");
		listOfNames.add("Gaurav");
		listOfNames.add("Sagar");
		listOfNames.add("Deepak");
		listOfNames.add("Rashmi");

		System.out.println(listOfNames); //print arraylist

		String input = "Sagar";
		RemoveGivenNameFromArrayList removeName = new RemoveGivenNameFromArrayList();
		removeName.countOfNameFromArrayList(listOfNames, input);
		removeName.countOfNameFromArrayListConventionalApproach(listOfNames, input);
		removeName.removeNameFromArrayList(listOfNames, input);
	}
}
