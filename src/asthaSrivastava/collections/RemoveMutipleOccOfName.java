/*Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

hint : indexOf, lastIndexOf, remove(int index)
int index = listOfName.lastIndexOf("Sagar");
listOfName.remove(index);

*/
package asthaSrivastava.collections;

import java.util.*;

public class RemoveMutipleOccOfName {

	void removeMutiOccuance(ArrayList<String> listOfName, String input) {
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			if (listOfName.indexOf(name) != listOfName.lastIndexOf(name)) {
				int tagrindex = listOfName.lastIndexOf(name);
				listOfName.remove(tagrindex);
				index--;
			}
		}
		System.out.println("Output ArrayList after removing multiple occurance of " + input + " is : " + listOfName);
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sagar");
		list.add("Harshal");
		list.add("Sagar");
		list.add("Apurva");
		list.add("Gaurav");
		list.add("Sagar");
		list.add("Deepak");
		list.add("Rashmi");
		list.add("Sagar");
		System.out.println("Input ArrayList is : " + list);
		new RemoveMutipleOccOfName().removeMutiOccuance(list, "Sagar");
	}
}
