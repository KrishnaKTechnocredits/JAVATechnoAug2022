/*Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains*/

package manjiri.assignment38;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceAllOccuranceOfGivenString {

	ArrayList<String> replaceAllOccurancesOfGivenName(ArrayList<String> listOfNames, String inputName,
			String outputName) {
		while (listOfNames.contains(inputName)) {
			int index = listOfNames.indexOf(inputName);
			listOfNames.set(index, outputName);
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(input)); // Convert array to arrayList
		String inputName = "Deepak";
		String outputName = "Shivani";
		System.out.println("Input ArrayList is: " + listOfNames);
		System.out.println("-------------------------------------------------------------------------------");

		ReplaceAllOccuranceOfGivenString replaceAllOccurances = new ReplaceAllOccuranceOfGivenString();
		ArrayList<String> processedList = replaceAllOccurances.replaceAllOccurancesOfGivenName(listOfNames, inputName,
				outputName);
		System.out.println("Processed ArrayList is: " + processedList);
	}
}
