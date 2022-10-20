/*Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 
*/

package sagarY.Assignment_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceString {

	void replaceStringWithAnotherString(ArrayList<String> list, String str1, String str2) {

		for (String str : list) {
			int index = list.indexOf(str1);

			if (list.contains(str1))
				list.set(index, str2);

		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		System.out.println("Program 1 : Replace all Deepak with Shivani.");
		System.out.println("------------------------------------------------------------------------");
		String str1 = "Deepak"; String str2 = "Shivani";
		String[] arr = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		List<String> array = Arrays.asList(arr);
		ArrayList<String> listOfNames = new ArrayList<String>(array);
		System.out.println("Input: " + listOfNames);
		ReplaceString replace = new ReplaceString();
		System.out.println();
		System.out.println("*Output after replacing "+str1+" with "+str2+" is:");
		replace.replaceStringWithAnotherString(listOfNames, str1, str2);

	}
}
