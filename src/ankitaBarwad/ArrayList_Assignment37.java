/*Assignment - 37 : 12th Oct'2022
Program 1 : 
Remove given name from ArrayList.
input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

Program 2 : 
Remove multiple occurance of given name from ArrayList.
input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

Program 3 : 
Remove multiple occurance from ArrayList.
input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 
*/
package ankitaBarwad;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Assignment37 {

	// Program 1 :Remove given name from ArrayList.
	void removeNameFromList(ArrayList<String> listOfName, String name) {
		System.out.println("Input ArrayList before removing " + name + " : " + listOfName);
		ArrayList<String> temp = new ArrayList<String>(listOfName);
		while (temp.contains(name)) {
			temp.remove(name);
		}
		System.out.println("Output Arraylist after removing " + name + " : " + temp);
	}

	// Program 2 :Remove multiple occurance of given name from ArrayList.
	void removeMultipleOccurenceOfName(ArrayList<String> listOfName, String name) {
		System.out.println("Input ArrayList before multiple Occurrance of " + name + " : "+  listOfName);
		ArrayList<String> temp = new ArrayList<String>(listOfName);
		while (temp.indexOf(name) != temp.lastIndexOf(name)) {
			int lastIndex = temp.lastIndexOf(name);
			temp.remove(lastIndex);
		}
		System.out.println("Output Arraylist after removing multiple occurences of " + name + " : " + temp);
	}

	// Program 3 :Remove multiple occurance from ArrayList.
	ArrayList<String> getUniqueNames(ArrayList<String> listOfName) {
		System.out.println("Input ArrayList before multiple Occurrance : " + listOfName);
		ArrayList<String> temp = new ArrayList<>();
		for (String name : listOfName) {
			if(!temp.contains(name)) {
				temp.add(name);
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		ArrayList_Assignment37 arrayListExample = new ArrayList_Assignment37();
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList("Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi"));
		String name = "Sagar";
		
		System.out.println("Program1 : Remove given name from ArrayList");
		arrayListExample.removeNameFromList(listOfName, name);
		
		System.out.println("\nProgram2 : Remove multiple occurance of given name from ArrayList");
		listOfName = new ArrayList<String>(Arrays.asList("Sagar", "Harshal", "Sagar", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi"));
		arrayListExample.removeMultipleOccurenceOfName(listOfName, name);
		
		System.out.println("\nProgram3 : Remove multiple occurance from ArrayList.");
		listOfName = new ArrayList<String>(Arrays.asList("Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"));
		ArrayList<String> output = arrayListExample.getUniqueNames(listOfName);
		System.out.println("Output Arraylist with unique names : " + output);
	}
}
