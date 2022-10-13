/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] */

package rashmiG.Collections;

import java.util.ArrayList;
//import java.util.Arrays;

public class ArrayListRemovalOfName {

	ArrayList<String> getProcessedArrayListApproach1(ArrayList<String> listOfNames, String name) {
		while (listOfNames.contains(name)) {
			listOfNames.remove(name);
		}
		return listOfNames;
	}

	static ArrayList<String> getArrayListApproach2(ArrayList<String> listofNames, String name) {
		for (int index = 0; index < listofNames.size(); index++) {
			if (listofNames.get(index).equals(name)) {
				listofNames.remove(name);
			}
		}
		return listofNames;
	}

	public static void main(String[] args) {
		// ArrayList<String> input = new
		// ArrayList<String>(Arrays.asList("Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi","Sagar"));
		
		
		String[] inputStr = { "Sagar", "Sagar", "Sagar", "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav",
				"Sagar", "Gaurav", "Apurva", "Apurva", "Apurva" };
			//{ "Sagar", "Harshal", "Apurva", "Gaurav", "Sagar", "Deepak", "Rashmi", "Sagar" };
		ArrayList<String> inputArrayList = new ArrayList<String>();
		for (String name : inputStr) {
			inputArrayList.add(name);
		}
		
		//ArrayList<String> originalArrayList = inputArrayList;
		
		System.out.println(inputArrayList + "\n");
		System.out.println(new ArrayListRemovalOfName().getProcessedArrayListApproach1(inputArrayList, "Sagar"));
		
		
		
//		ArrayListRemovalOfName al = new ArrayListRemovalOfName();
//		al.getArrayListApproach1(inputArrayList, "Sagar");
//		al.getArrayListApproach1(originalArrayList, "Deepak");
//
//		ArrayListRemovalOfName.getArrayListApproach2(inputArrayList, "harshal");
//		ArrayListRemovalOfName.getArrayListApproach2(originalArrayList, "Harshal");
//		ArrayList<String> output = originalArrayList;
//		System.out.println("Approach1\n" + output + "\n");
//		System.out.println("Approach2\n" + output);

	}

}
