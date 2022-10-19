/*Assignment - 38 : 14th Oct'2022
Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']*/

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class StuName {

	// method to return list of Middle character from given name if length of the
	// name is more than 6 characters
	ArrayList<Character> getMiddleCharFromNames(String[] stuName) {
		System.out.println("Original list of names: " + Arrays.toString(stuName));
		ArrayList<Character> listOfMiddleChar = new ArrayList<Character>();
		for (String name : stuName) {
			if (name.length() > 6 && name.length() % 2 != 0) {
				// middleIndex = name.length()/2
				listOfMiddleChar.add(name.charAt(name.length() / 2));
			} else if (name.length() > 6 && name.length() % 2 == 0) {
				listOfMiddleChar.add(name.charAt(name.length() / 2 - 1));
			}
		}
		return listOfMiddleChar;
	}

	public static void main(String[] args) {
		String[] nameArr = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };

		ArrayList<Character> charList = new StuName().getMiddleCharFromNames(nameArr);
		System.out.println("List of middle chars for names whose length is more than 6 is: " + charList);
	}
}
