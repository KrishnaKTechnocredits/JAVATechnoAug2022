/*
 Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains

 */
package swapnilMaheshwari.Collection.ArrayList.Assignment38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceAllOccOfGivenName {

	void getReplaceAllOccOfGivenName(ArrayList<String> listOfName, String name) {

		// for (int i=0;i<listOfName.size(); i++) {
		while (listOfName.contains(name)) {
			int index = listOfName.indexOf(name);
			// if(listOfName.contains(name))
			// {
			// listOfName.set(index, "Shivani");
			// }
			listOfName.set(index, "Shivani");
		}
		System.out.println(listOfName);
	}

	public static void main(String[] args) {
		String[] arr = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> name = new ArrayList<String>(Arrays.asList(arr));
		ReplaceAllOccOfGivenName replaceAllOccOfGivenName = new ReplaceAllOccOfGivenName();
		replaceAllOccOfGivenName.getReplaceAllOccOfGivenName(name, "Deepak");
	}
}
