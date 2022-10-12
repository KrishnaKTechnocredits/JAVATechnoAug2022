package hardikBhatia.Assignments;

import java.util.*;

public class Assignment37 {
	//Program 1 :
	//Given name from ArrayList.
	void removeSelectedNameList(ArrayList<String> names, String nameToRemove) {
		ArrayList<String> processingList = new ArrayList<String>(names);
		for(String name:names) {
			if(name.equals(nameToRemove)) {
				processingList.remove(nameToRemove);
			}
		}
		System.out.println("Output: " + processingList);
		System.out.println("===================================================");
	}
	
	//Program 2 :
    //Remove multiple occurance of given name from ArrayList.
	void removeMultipleOccuranceSelectedName(ArrayList<String> names, String nameToRemove) {
		ArrayList<String> processingList = new ArrayList<String>(names);
		for(int index = 0; index < processingList.size(); index++) {
			if(processingList.indexOf(nameToRemove) != processingList.lastIndexOf(nameToRemove)) {
				processingList.remove(processingList.lastIndexOf(nameToRemove));
			}
		}
	    System.out.println("Output: " + processingList);
		System.out.println("===================================================");
	}
	
	//Program 3 :
    //Remove multiple occurance from ArrayList.
	void removeMultipleOccurance(ArrayList<String> names){
		ArrayList<String> processingList = new ArrayList<String>();
		for(int index = 0; index < processingList.size(); index++) {
			if(processingList.indexOf(processingList.get(index)) != processingList.lastIndexOf(processingList.get(index))) {
				processingList.remove(processingList.lastIndexOf(processingList.get(index)));
			}
		}
		System.out.println("Output: " + processingList);
		System.out.println("===================================================");
	}
	public static void main(String[] args) {
		Assignment37 as37 = new Assignment37();
	
		ArrayList<String> progInput1 = new ArrayList<String>();
		progInput1.add("Sagar");
		progInput1.add("Harshal");
		progInput1.add("Apurva");
		progInput1.add("Gaurav");
		progInput1.add("Sagar");
		progInput1.add("Deepak");
		progInput1.add("Rashmi");
		progInput1.add("Sagar");
		System.out.println("Input: " + progInput1);
		as37.removeSelectedNameList(progInput1, "Sagar");
		
		ArrayList<String> progInput2 = new ArrayList<String>();
		progInput2.add("Sagar");
		progInput2.add("Harshal");
		progInput2.add("Sagar");
		progInput2.add("Apurva");
		progInput2.add("Gaurav");
		progInput2.add("Sagar");
		progInput2.add("Deepak");
		progInput2.add("Rashmi");
		progInput2.add("Sagar");
		System.out.println("Input: " + progInput2);
		as37.removeMultipleOccuranceSelectedName(progInput2, "Sagar");
		
		ArrayList<String> progInput3 = new ArrayList<String>();
		progInput3.add("Sagar");
		progInput3.add("Harshal");
		progInput3.add("Sagar");
		progInput3.add("Harshal");
		progInput3.add("Apurva");
		progInput3.add("Gaurav");
		progInput3.add("Sagar");
		progInput3.add("Gaurav");
		System.out.println("Input: " + progInput3);
		as37.removeMultipleOccurance(progInput3);

	}
}
