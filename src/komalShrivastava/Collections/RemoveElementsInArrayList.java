//Assignment - 37 : 12th Oct'2022

package komalShrivastava.Collections;
import java.util.*;

public class RemoveElementsInArrayList {
	
	// method to remove given name from ArrayList
	ArrayList<String> removeNameFromList(ArrayList<String> listofName, String name) {
		ArrayList<String> temp = new ArrayList<String>(listofName);
		while(temp.contains(name)) {
			temp.remove(name);
		}
		return temp;
	}
	
	//method to remove multiple occurrence of given name from ArrayList
	
	ArrayList<String> removeMultipleOccurence(ArrayList<String> listofName, String name) {
		ArrayList<String> temp = new ArrayList<String>(listofName);
		while(temp.indexOf(name)!=temp.lastIndexOf(name)) {
			int index = temp.lastIndexOf(name);
			temp.remove(index);
		}
		return temp;
	}

	// method to remove multiple occurrence from ArrayList
	
	ArrayList<String> removeMultipleOccurrence(ArrayList<String> listofName) {
		ArrayList<String> temp = new ArrayList<String>(listofName);
		for(String arr : temp) {
		temp = removeMultipleOccurence(temp, arr);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		
		String[] input = {"Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(input));
		System.out.println("Program 1 :\nRemove given name from ArrayList");
		System.out.println("Input : " + listOfName);
		ArrayList<String> listOfNameUpdated = new RemoveElementsInArrayList().removeNameFromList(listOfName, "Sagar");
		System.out.println("Output : " + listOfNameUpdated + "\n");
		
		System.out.println("Program 2 : \nRemove multiple occurance of given name from ArrayList.");
		System.out.println("Input : " + listOfName);
		ArrayList<String> listOfNameUpdated2 = new RemoveElementsInArrayList().removeMultipleOccurence(listOfName, "Sagar");
		System.out.println("Output : " + listOfNameUpdated2 + "\n");
		
		String[] input2 = {"Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
		ArrayList<String> listOfName2 = new ArrayList<String>(Arrays.asList(input2));
		System.out.println("Program 3 : \nRemove multiple occurance from ArrayList");
		System.out.println("Input : " + listOfName2);
		ArrayList<String> listOfNameUpdated3 = new RemoveElementsInArrayList().removeMultipleOccurrence(listOfName2);
		System.out.println("Output : " + listOfNameUpdated3 + "\n");
	}
}