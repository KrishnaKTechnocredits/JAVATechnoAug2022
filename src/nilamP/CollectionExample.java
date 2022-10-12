/*Assignment - 37 : 12th Oct'2022

Program 1 : 
Remove given name from ArrayList.
Hint : contains, remove

input : ["Sagar","Harshal","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

Program 2 : 
Remove multiple occurance of given name from ArrayList.

input : ["Sagar","Harshal","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"] & "Sagar"
output : ["Sagar","Harshal","Apurva","Gaurav","Deepak","Rashmi"] 

Program 3 : 
Remove multiple occurance from ArrayList.

input : ["Sagar","Harshal","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"]
output : ["Sagar","Harshal","Apurva","Gaurav"] 

*/
package nilamP;

import java.util.ArrayList;

public class CollectionExample {
	void removeName(ArrayList<String> list, String name) {

		{
			while (list.contains(name)) {
				list.remove(name);
			}

			System.out.println("Output : " + list+"\n");
		}
	}

	void removeMultipleOccurance(ArrayList<String> list, String name) {
		{
			ArrayList<String> newList = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}
			System.out.println("Output : " + newList+"\n");
		}
	}

	void removeMultipleOccuranceFromList(ArrayList<String> list) {
		{
			ArrayList<String> newList = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (!newList.contains(list.get(i))) {
					newList.add(list.get(i));
				}
			}
			System.out.println("Output : " + newList+"\n");
		}
	}

	public static void main(String[] args) {
		CollectionExample ce = new CollectionExample();
		ArrayList<String> input = new ArrayList<>();
		input.add("Sagar");
		input.add("Harshal");
		input.add("Apurva");
		input.add("Gaurav");
		input.add("Sagar");
		input.add("Deepak");
		input.add("Rashmi");
		System.out.println(" ** program 1 output **");
		System.out.println("Input : " + input);
		ce.removeName(input, "Sagar");

		ArrayList<String> input2 = new ArrayList<>();
		input2.add("Sagar");
		input2.add("Harshal");
		input2.add("Apurva");
		input2.add("Gaurav");
		input2.add("Sagar");
		input2.add("Deepak");
		input2.add("Rashmi");
		System.out.println(" ** program 2 output **");
		System.out.println("Input : " + input2);
		ce.removeMultipleOccurance(input2, "Sagar");

		ArrayList<String> input3 = new ArrayList<>();
		input3.add("Sagar");
		input3.add("Harshal");
		input3.add("Sagar");
		input3.add("Harshal");
		input3.add("Apurva");
		input3.add("Gaurav");
		input3.add("Sagar");
		input3.add("Gaurav");
		System.out.println(" ** program 3 output **");
		System.out.println("Input : " + input3);
		ce.removeMultipleOccuranceFromList(input3);

	}
}
