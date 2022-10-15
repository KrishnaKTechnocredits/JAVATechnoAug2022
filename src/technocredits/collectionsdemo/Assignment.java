package technocredits.collectionsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment {

	ArrayList<String> getUniqueList(ArrayList<String> listOfName) {
		
		ArrayList<String> uniqueList = new ArrayList<String>();
		for(String name : listOfName) {
			if(!uniqueList.contains(name))
				uniqueList.add(name);
		}
		
		return uniqueList;
	}
	
	void getUniqueListUsingRemoveMethod(List<String> listOfName){ // {"Sagar","Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Gaurav"};
		ArrayList<String> temp = new ArrayList<String>(listOfName); //{"Sagar","Harshal","Apurva","Gaurav"};
		
		for(int index=0;index<listOfName.size();index++) {
			String name = listOfName.get(index);
			if(temp.indexOf(name) != temp.lastIndexOf(name)) {
				int targetIndex = temp.lastIndexOf(name);
				temp.remove(targetIndex);
			}
		}
		System.out.println(temp);
	}
	
	void getUniqueListUsingRemoveMethod1(List<String> listOfName){ // {"Sagar","Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Gaurav"};
		
		for(int index=0;index<listOfName.size();index++) {
			String name = listOfName.get(index);
			if(listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				int targetIndex = listOfName.lastIndexOf(name);
				listOfName.remove(targetIndex);
				index--;
			}
		}
		System.out.println(listOfName);
	}
	
	void removeAllMultipleOccuranceOfNamesFromList(List<String> listOfName) {
		System.out.println("Original List: " + "\n" + listOfName + "\n");
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index); //sagar
			while (listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				listOfName.remove(listOfName.lastIndexOf(name));
			}
		}
		System.out.println("Processed list after removing all the multiple occurance of names is: " + "\n" + listOfName);
	}

	
	public static void main(String[] args) {
		String[] arr = {"Sagar","Sagar","Sagar","Harshal","Harshal","Apurva","Gaurav","Gaurav","Apurva","Apurva"};
		//{"Sagar","Harshal","Apurva","Gaurav"};
		List<String> listOfName = new ArrayList<String>(Arrays.asList(arr));
		new Assignment().removeAllMultipleOccuranceOfNamesFromList(listOfName);
	}
}
