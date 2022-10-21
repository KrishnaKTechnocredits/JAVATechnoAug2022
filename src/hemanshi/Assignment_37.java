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

package hemanshi;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_37 {
	
// Program 1 :Remove given name from ArrayList.
	
	void rmNameFromList(ArrayList<String> listOfNames, String name) {
		while(listOfNames.contains(name)) {
			listOfNames.remove(name);
		}
		System.out.println("Output : " + listOfNames);
	}
		
//	Program 2 : Remove multiple occurance of given name from ArrayList.
	
	ArrayList<String> rmOccuranceName(ArrayList<String> listOfNames, String name) {
		     while(listOfNames.indexOf(name)!=listOfNames.lastIndexOf(name)) {
		    	    int index = listOfNames.lastIndexOf(name);
		    	    listOfNames.remove(index);
		        }
		        return listOfNames;
	}
	
//Program 3 : Remove multiple occurance from ArrayList.	
	
	void rmAllOccurance(ArrayList<String> listOfNames) {
		    for(int index=0; index<listOfNames.size(); index++) {
		    	   listOfNames = rmOccuranceName(listOfNames,listOfNames.get(index));
		    }
		    System.out.println("Output : " + listOfNames);
	}
	
	
	public static void main(String[] args) {
		Assignment_37 assignment_37 = new Assignment_37();
		
		System.out.println("-----------------");
		
		System.out.println("Program 1 : Remove given name from ArrayList.");
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Sagar");
		listOfNames.add("Harshal");
		listOfNames.add("Apurva");
		listOfNames.add("Gaurav");
		listOfNames.add("Sagar");
		listOfNames.add("Deepak");
		listOfNames.add("Rashmi");	
		System.out.println("Input 1 : " + listOfNames);
		assignment_37.rmNameFromList(listOfNames,"Sagar");
		System.out.println("");

		System.out.println("-----------");
		System.out.println("Program 2 : Remove multiple occurance of given name from ArrayList.");
		ArrayList<String> listOfNames2 = new ArrayList<String>();
		listOfNames2.add("Sagar");
		listOfNames2.add("Harshal");
		listOfNames2.add("Sagar");
		listOfNames2.add("Apurva");
		listOfNames2.add("Gaurav");
		listOfNames2.add("Sagar");
		listOfNames2.add("Deepak");
		listOfNames2.add("Rashmi");	
		System.out.println("Input 2 : " + listOfNames2);
		System.out.println("Output : " + assignment_37.rmOccuranceName(listOfNames2,"Sagar"));
		System.out.println("");


		System.out.println("-----------");
		System.out.println("Program 3 : Remove all occurance from ArrayList.");
		ArrayList<String> listOfNames3 = new ArrayList();
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Sagar");
		listOfNames3.add("Harshal");
		listOfNames3.add("Apurva");
		listOfNames3.add("Gaurav");
		listOfNames3.add("Sagar");
		listOfNames3.add("Gaurav");
		System.out.println("Input 3 : " + listOfNames3);
		assignment_37.rmAllOccurance(listOfNames3);
		System.out.println("");

	}
}
