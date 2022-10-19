/*Assignment - 38 : 14th Oct'2022
Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
*/

package pujaSah.ArrayListAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class OperationOnStuName {

	// method to return list of name if name starts with Vowel, contains atleast one digit
	// and having exactly 1 uppercase
	ArrayList<String> getProcessedNames(String[] stuArr) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		char firstChar = ' ';
		boolean digitFlag;
		boolean vowelFlag;
		boolean upperCaseFlag;
		int digitCount = 0;
		int upperCaseCount = 0;
		for (String name : stuArr) {
			upperCaseCount = 0;
			digitCount = 0;
			digitFlag = false;
			vowelFlag = false;
			upperCaseFlag = false;
			for (int index = 0; index < name.length(); index++) {
				if (index == 0) {
					firstChar = Character.toUpperCase(name.charAt(0));
					if (firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O'
							|| firstChar == 'U') {
						vowelFlag = true;
					}
				}
				if (Character.isDigit(name.charAt(index))) {
					digitCount++;
				}
				if (Character.isUpperCase(name.charAt(index))) {
					upperCaseCount++;
				}
			}
			if (upperCaseCount == 1) {
				upperCaseFlag = true;
			}
			if (digitCount >= 1) {
				digitFlag = true;
			}

			if (vowelFlag == true && digitFlag == true && upperCaseFlag == true) {
				listOfNames.add(name);
			}
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		String[] nameArr = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		System.out.println("Original List of names: " + Arrays.toString(nameArr));
		
		ArrayList<String> listOfNames = new OperationOnStuName().getProcessedNames(nameArr);
		System.out.println(
				"List of names if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase is: "
						+ listOfNames);
	}
}
