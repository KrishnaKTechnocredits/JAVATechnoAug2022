/*
 * Program 1 : 
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

 */

package harshalRane.Assignments.assignment37.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment37ArrayList {
	//Program 1: Remove given name from ArrayList
	void removeNameFromArrayList(ArrayList<String> listOfName, String name) {
		while(listOfName.contains(name)) {
			listOfName.remove(name);
			}
	}
	
	//Program 2: Remove multiple occurrences of given name from ArrayList
	void removeAllOccuranceNameFromArrayList(ArrayList<String> listOfName, String name) {
		for(int index=0;index<listOfName.size();index++) {
			int firstIndex = listOfName.indexOf(name);
			int lastIndex = listOfName.lastIndexOf(name);
			
			if(firstIndex!=lastIndex) {
				listOfName.remove(lastIndex);
			}
		}
	}
	
	//Program 3: Remove multiple occurrences from ArrayList
	void removeMultipleOccurancesFromArrayList(ArrayList<String> listOfName) {
		for(int index=0;index<listOfName.size();index++) {
			String name = listOfName.get(index);
			int firstIndex = listOfName.indexOf(name);
			int lastIndex = listOfName.lastIndexOf(name);
			
			if(firstIndex!=lastIndex) {
				listOfName.remove(lastIndex);
				index--; // If input is {"Sagar","Harshal","Sagar","Harshal","Harshal","Apurva","Gaurav","Sagar","Gaurav"}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment37ArrayList a = new Assignment37ArrayList();
		
		//Program 1
		String[] arr = {"Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
		ArrayList<String> input = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input --> "+input.toString());	
		a.removeNameFromArrayList(input,"Sagar");
		System.out.println("Output --> " +input.toString());
		
		/*Alternate to adding elements in ArrayList
		for(int index=0;index<arr.length;index++) {
			input.add(arr[index]);
		}*/
		System.out.println("--------------------------------------------");
		
		//Program 2
		String[] arr1 = {"Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList(arr1));
		System.out.println("Input --> "+input1.toString());	
		a.removeAllOccuranceNameFromArrayList(input1,"Sagar");
		System.out.println("Output --> " +input1.toString());
		
		System.out.println("--------------------------------------------");
		
		//Program 3
		String[] arr2 = {"Sagar","Harshal","Sagar","Harshal","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
		ArrayList<String> input2 = new ArrayList<String>(Arrays.asList(arr2));
		System.out.println("Input --> "+input2.toString());	
		a.removeMultipleOccurancesFromArrayList(input2);
		System.out.println("Output --> " +input2.toString());
		
	}
}
