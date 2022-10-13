/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

}	*/
package adittyThakare.collections;

import java.util.ArrayList;

public class Assignment37_Program1 {

	// Method to remove given name from Arraylist
	void removeNameFromArrayList(ArrayList<String> strArrayList, String strInput) {
		while (strArrayList.contains(strInput)) {
			strArrayList.remove(strInput);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment37_Program1 assignment37_Program1 = new Assignment37_Program1();
		ArrayList<String> inputStrArrayList = new ArrayList<String>();
		String[] arr = { "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi" };

		for (int index = 0; index < arr.length; index++) {
			inputStrArrayList.add(arr[index]);
		}
		String inputName = "Sagar";
		System.out.println("Program to remove given name from Array list!");
		System.out.println("\nOrginal Arraylist: " + inputStrArrayList.toString());
		System.out.println("Given name: " + inputName);
		assignment37_Program1.removeNameFromArrayList(inputStrArrayList, inputName);
		System.out.println("\nOutput Arraylist :" + inputStrArrayList.toString());

	}

}
