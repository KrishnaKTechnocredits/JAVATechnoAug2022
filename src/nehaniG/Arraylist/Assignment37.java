package nehaniG.Arraylist;

import java.util.ArrayList;

public class Assignment37 {
	void removeNameFromList(ArrayList<String> listOfNames, String name) {
		{
			while (listOfNames.contains(name)) {
				listOfNames.remove(name);
			}
			System.out.println("Removed given name from list: " + listOfNames);
		}
	}
	void removeOccurancesFromListByName(ArrayList<String> listOfName, String name) {
		{
			ArrayList<String> modifiedList = new ArrayList<String>();
			for(int i = 0; i<listOfName.size();i++) {
				if(!modifiedList.contains(listOfName.get(i))) {
					modifiedList.add(listOfName.get(i));
				}
			}
			System.out.println("Removed occurances from given name list by name.");
			System.out.println(modifiedList);
		}
	}
	
	void removeOccurancesFromList(ArrayList<String> listOfName) {
		{
			ArrayList<String> modifiedList = new ArrayList<String>();
			for(int i = 0; i<listOfName.size();i++) {
				
				if(!modifiedList.contains(listOfName.get(i))) {
					modifiedList.add(listOfName.get(i));
				}
			}
			System.out.println("Removed occurances from given name list.");
			System.out.println(modifiedList);
		}
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		ArrayList<String> arrList1 = new ArrayList<>();

		arrList1.add("Sagar");
		arrList1.add("Harshal");
		arrList1.add("Apurva");
		arrList1.add("Gaurav");
		arrList1.add("Sagar");
		arrList1.add("Deepak");
		arrList1.add("Rashmi");
		System.out.println("Program 1");
		assignment37.removeNameFromList(arrList1, "Sagar");
		
		ArrayList<String> arrList2 = new ArrayList<>();
		arrList2.add("Sagar");
		arrList2.add("Harshal");
		arrList2.add("Sagar");
		arrList2.add("Apurva");
		arrList2.add("Gaurav");
		arrList2.add("Sagar");
		arrList2.add("Deepak");
		arrList2.add("Rashmi");
		System.out.println("Program 2");
		assignment37.removeOccurancesFromListByName(arrList2, "Sagar");
		

		ArrayList<String> arrList3 = new ArrayList<>();
		arrList3.add("Sagar");
		arrList3.add("Harshal");
		arrList3.add("Sagar");
		arrList3.add("Harshal");
		arrList3.add("Apurva");
		arrList3.add("Gaurav");
		arrList3.add("Sagar");
		arrList3.add("Gaurav");
		System.out.println("Program 3");
		assignment37.removeOccurancesFromList(arrList3);
	}
}
