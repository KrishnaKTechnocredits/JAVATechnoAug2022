/*Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains
*/
package gauravSahu;

import java.util.ArrayList;

public class Assignment38A {

	void replaceName(ArrayList<String> array, String name, String replaceName) {
		for (int i = 0; i < array.size(); i++) {
			String name2 = array.get(i);
			if (name.equals(name2)) {
				int indexOfName = array.indexOf(name);
				array.set(indexOfName, replaceName);
			}
		}
		System.out.println("Output Array list : " + array);
	}

	public static void main(String[] args) {
		Assignment38A a38 = new Assignment38A();
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName = new ArrayList<String>();
		for (String name : input) {
			listOfName.add(name);
		}
		System.out.println("Program 38 : Replace all Deepak with Shivani ");
		System.out.println("Input Array list  : " + listOfName);
		String givenName = "Deepak";
		String replaceName = "Shivani";
		a38.replaceName(listOfName, givenName, replaceName);
	}
}
