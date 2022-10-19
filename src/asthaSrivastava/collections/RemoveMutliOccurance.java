/*
Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 
*/
package asthaSrivastava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMutliOccurance {

	void getUniqueArrayList(List<String> listOfName) {
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			if (listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				int targetIndex = listOfName.lastIndexOf(name);
				listOfName.remove(targetIndex);
				index--;
			}
		}
		System.out.println("ArrayList after removing duplicates is : " +listOfName);
	}

	public static void main(String[] args) {
		String[] arr =  {"Sagar","Harshal","Sagar","Harshal","Gaurav","Apurva","Gaurav","Sagar","Gaurav","Apurva"};
		List<String> listOfName  = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("Input Arraylist is : " +listOfName);
		new RemoveMutliOccurance().getUniqueArrayList(listOfName);
	}

}
