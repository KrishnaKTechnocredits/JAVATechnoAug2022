package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains
*/

public class Assignment38CollectionPractice1 {

	// Replace all Deepak with Shivani.
	void replaceStringwithOtherString(List<String> listOfNames1, String str1, String str2) {
		System.out.println("Given Input Array List is :\n" + listOfNames1);
		while (listOfNames1.contains(str1)) {
			int index = listOfNames1.indexOf(str1);
			listOfNames1.set(index, str2);
		}
		System.out.println("\nOutput after replacing " + str1 + " with " + str2 + "is\n" + listOfNames1);

	}

	public static void main(String[] args) {
		Assignment38CollectionPractice1 arrayListAssignment = new Assignment38CollectionPractice1();

		String[] str = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(str));

		arrayListAssignment.replaceStringwithOtherString(listOfName, "Deepak", "Shivani");
	}

}
