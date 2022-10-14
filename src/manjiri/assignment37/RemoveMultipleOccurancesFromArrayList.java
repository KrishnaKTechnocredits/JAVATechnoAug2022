/*Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);*/

package manjiri.assignment37;

import java.util.ArrayList;

public class RemoveMultipleOccurancesFromArrayList {
	
	void removeMultipleOccurancesOfGivenNameFromArrayList(ArrayList<String> listOfNames, String str) {
		while(listOfNames.indexOf(str)!= listOfNames.lastIndexOf(str)) {//till element in indexOf and lastIndexOf is not equal
			int index = listOfNames.lastIndexOf(str);
			listOfNames.remove(index);//remove element in lastIndexOf
		}
		System.out.println(listOfNames);
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>(); //create an arraylist
		listOfNames.add("Sagar"); // add elements t arraylist
		listOfNames.add("Harshal");
		listOfNames.add("Sagar");
		listOfNames.add("Apurva");
		listOfNames.add("Gaurav");
		listOfNames.add("Sagar");
		listOfNames.add("Deepak");
		listOfNames.add("Rashmi");
		
		System.out.println(listOfNames);
		String input = "Sagar";
		
		RemoveMultipleOccurancesFromArrayList removeMultipleOccurance = new RemoveMultipleOccurancesFromArrayList();
		removeMultipleOccurance.removeMultipleOccurancesOfGivenNameFromArrayList(listOfNames, input);
	}
}
