package swatiM.assignment;

import java.util.ArrayList;

public class Assignment_37 {
	
	// Program 1 : Method to remove given name from ArrayList
	void removeSelectedNameList(ArrayList<String> names, String nameToRemove) {
		ArrayList<String> processingList = new ArrayList<String>(names);
		for(String name:names) {
			if(name.equals(nameToRemove)) {
				processingList.remove(nameToRemove);
			}
		}
		System.out.println("Output - \n" + processingList +"\n");
		
	}
	
	
	
	// Program 2 : Method to remove multiple occurance of given name from ArrayList
	
	void removeMultipleOccuranceSelectedName(ArrayList<String> names, String nameToRemove) {
		ArrayList<String> processingList = new ArrayList<String>(names);
		for(int index = 0; index < processingList.size(); index++) {
			if(processingList.indexOf(nameToRemove) != processingList.lastIndexOf(nameToRemove)) {
				processingList.remove(processingList.lastIndexOf(nameToRemove));
			}
		}
	    System.out.println("Output - \n" + processingList +"\n");
		
	}
	
	// Program 3 : Method to remove multiple occurance from ArrayList
	
	void removeMultipleOccurance(ArrayList<String> names){
		ArrayList<String> processingList = new ArrayList<String>();
		for(int index = 0; index < processingList.size(); index++) {
			if(processingList.indexOf(processingList.get(index)) != processingList.lastIndexOf(processingList.get(index))) {
				processingList.remove(processingList.lastIndexOf(processingList.get(index)));
			}
		}
		System.out.println("Output - \n" + processingList +"\n");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment_37 assignment_37 = new Assignment_37();

		ArrayList<String> progInput1 = new ArrayList<String>();
		progInput1.add("Sagar");
		progInput1.add("Harshal");
		progInput1.add("Apurva");
		progInput1.add("Gaurav");
		progInput1.add("Sagar");
		progInput1.add("Deepak");
		progInput1.add("Rashmi");
		progInput1.add("Sagar");
		System.out.println("Input: \n" + progInput1);
		assignment_37.removeSelectedNameList(progInput1, "Sagar");

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
		System.out.println("Input: \n" + progInput2);
		assignment_37.removeMultipleOccuranceSelectedName(progInput2, "Sagar");

		ArrayList<String> progInput3 = new ArrayList<String>();
		progInput3.add("Sagar");
		progInput3.add("Harshal");
		progInput3.add("Sagar");
		progInput3.add("Harshal");
		progInput3.add("Apurva");
		progInput3.add("Gaurav");
		progInput3.add("Sagar");
		progInput3.add("Gaurav");
		System.out.println("Input: \n" + progInput3);
		assignment_37.removeMultipleOccurance(progInput3);


	}

}
