/*Assignment - 38 : 14th Oct'2022
Program 1 : 
Replace all Deepak with Shivani.
input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 
Hint : use set, indexOf, contains*/


package swatiM.assignment.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_Program1 {

	ArrayList<String> replaceNamesInList(ArrayList<String> listOfNames, String inputString, String outputString) {
		for (int index = 0; index < listOfNames.size(); index++) {
			if (listOfNames.contains(inputString)) {
				int index1 = listOfNames.indexOf(inputString);
				listOfNames.set(index1, outputString);
			}
		}

		return listOfNames;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment38_Program1 assignment38_Program1 = new Assignment38_Program1();
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		System.out.println("Program to replace Deepak with Shivani in Arraylist!");
		ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(input));
		System.out.println("\nInput Array list: " + listOfNames);
		ArrayList<String> outputList = assignment38_Program1.replaceNamesInList(listOfNames, "Deepak", "Shivani");
		System.out.println("\nOutput Array list: " + outputList);
	}

}
