/*Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] */
package asthaSrivastava.collections;

import java.util.ArrayList;

public class Assignment37RemoveName {

	void removeNameFromList(ArrayList<String> listOfName, String name) {
		System.out.println("Input ArrayList is" + listOfName);
		while (listOfName.contains(name)) {
			listOfName.remove(name);
		}
		System.out.println("\nAfter removing the element new ArrayList is:" + listOfName);
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sagar");
		list.add("Harshal");
		list.add("Apurva");
		list.add("Gaurav");
		list.add("Sagar");
		list.add("Deepak");
		list.add("Rashmi");
		list.add("Sagar");

		new Assignment37RemoveName().removeNameFromList(list, "Sagar");
	}
}
