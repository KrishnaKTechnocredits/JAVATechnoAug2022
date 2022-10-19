
/*
 * 
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
package hindaviIngle.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment_37 {
	//method 1
	void removeNameFromArrayList(ArrayList<String> listOfName, String name) {
		while (listOfName.contains(name)) {
			listOfName.remove(name);
		}
	}

	
	void removeAllOccuranceNameFromArrayList(ArrayList<String> listOfName, String name) {
		for(int index=0;index<listOfName.size();index++) {
			int firstIndex = listOfName.indexOf(name);
			int lastIndex = listOfName.lastIndexOf(name);
			if(firstIndex!=lastIndex) {
				listOfName.remove(lastIndex);
			}
		}
	}
	
	void removeMultipleOccurancesFromArrayList(ArrayList<String> listOfName) {
		for(int index=0;index<listOfName.size();index++) {
			String name = listOfName.get(index);
			int firstIndex = listOfName.indexOf(name);
			int lastIndex = listOfName.lastIndexOf(name);
			if(firstIndex!=lastIndex) {
				listOfName.remove(lastIndex);
				// If input is {"Sagar","Harshal","Sagar","Harshal","Harshal","Apurva","Gaurav","Sagar","Gaurav"}
				index--; 
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_37 a37 = new Assignment_37();
		System.out.println("---------------Program 1-----------------------------");
		String[] arr = { "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi" };
		ArrayList<String> input = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input --> " + input);
		a37.removeNameFromArrayList(input, "Sagar");
		System.out.println("Output --> " + input);
		System.out.println("\n");
		System.out.println("-----------------Program 2-------------------------");
		String[] arr1 = {"Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList(arr1));
		System.out.println("Input --> "+input1);	
		a37.removeAllOccuranceNameFromArrayList(input1,"Sagar");
		System.out.println("Output --> " +input1);
		System.out.println("\n");
		System.out.println("-----------------Program 3---------------------------");
		String[] arr2 = {"Sagar","Harshal","Sagar","Harshal","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
		ArrayList<String> input2 = new ArrayList<String>(Arrays.asList(arr2));
		System.out.println("Input --> "+input2);	
		a37.removeMultipleOccurancesFromArrayList(input2);
		System.out.println("Output --> " +input2);

	}

}
