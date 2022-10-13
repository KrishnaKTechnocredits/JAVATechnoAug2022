package vibhaS.Assignment;

import java.util.ArrayList;

public class Assignment37 {

	// Remove given name from ArrayList
	void removeNameFromArrayList(ArrayList<String> listOfName, String name) {
		System.out.println("Remove given name From ArrayList ");
		System.out.println("ArrayList => " + listOfName);
		System.out.println("Name => " + name);
		while (listOfName.contains(name)) {
			listOfName.remove(name);
		}
		System.out.println("output ArrayList => " + listOfName);
	}

	// Remove multiple occurance of given name from ArrayList
	void removeMultipleOccuranceFromArrayList(ArrayList<String> listOfName, String name) {
		System.out.println("Remove Multiple occurance From ArrayList ");
		System.out.println("ArrayList => " + listOfName);
		System.out.println("Name => " + name);
		for (int index = 0; index < listOfName.size(); index++) {
			if (listOfName.indexOf(name) != (listOfName.lastIndexOf(name))) {
				listOfName.remove(listOfName.lastIndexOf(name));
			}
		}
		System.out.println("output ArrayList => " + listOfName);
	}

	// Remove multiple occurance from given ArrayList
	void printAllDuplicateName(ArrayList<String> listOfName) {
		System.out.println("Print Multiple occurance From ArrayList ");
		System.out.println("ArrayList => " + listOfName);
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			int firstindex = listOfName.indexOf(name);
			int lastindex = listOfName.lastIndexOf(name);
			if (firstindex != lastindex) {
				listOfName.remove(lastindex);
				index--;
			}
		}
		System.out.println("output ArrayList => " + listOfName);
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		ArrayList<String> listOfName1 = new ArrayList<String>();
		listOfName1.add("Sagar");
		listOfName1.add("Harshal");
		listOfName1.add("Apurva");
		listOfName1.add("Gaurav");
		listOfName1.add("Sagar");
		listOfName1.add("Deepak");
		listOfName1.add("Rashmi");
		String name = "Sagar";
		assignment37.removeNameFromArrayList(listOfName1, name);
		System.out.println("");
		ArrayList<String> listOfName2 = new ArrayList<String>();
		listOfName2.add("Sagar");
		listOfName2.add("Harshal");
		listOfName2.add("Apurva");
		listOfName2.add("Gaurav");
		listOfName2.add("Sagar");
		listOfName2.add("Deepak");
		listOfName2.add("Rashmi");
		String name2 = "Sagar";
		assignment37.removeMultipleOccuranceFromArrayList(listOfName2, name2);
		System.out.println("");
		ArrayList<String> listOfName3 = new ArrayList<String>();
		listOfName3.add("Sagar");
		listOfName3.add("Harshal");
		listOfName3.add("Apurva");
		listOfName3.add("Gaurav");
		listOfName3.add("Sagar");
		listOfName3.add("Apurva");
		listOfName3.add("Harshal");
		assignment37.printAllDuplicateName(listOfName3);
	}
}
