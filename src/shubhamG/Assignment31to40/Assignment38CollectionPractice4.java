package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
		
*/		
public class Assignment38CollectionPractice4 {
	// method to check if 1st character od string is vowel or not
	boolean isFirstCharVowel(String str) {
		char ch = str.charAt(0);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
    //method to check if the string contains atleast 1 digit
	boolean isStringContainsDigit(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		if (count >= 1) {
			return true;
		}
		return false;
	}
	//method to check if string contains 1 upper case letter
	boolean isStringContainsUpperCaseLetter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				count++;
			}
		}
		if (count == 1) {
			return true;
		}
		return false;
	}
   
	// method to check required operation
	ArrayList<String> returnStringAfterPerformingOperation(ArrayList<String> list) {
		ArrayList<String> outputList = new ArrayList<String>();
		for (String str : list) {
			if (isFirstCharVowel(str)) {
				if (isStringContainsDigit(str)) {
					if (isStringContainsUpperCaseLetter(str)) {
						outputList.add(str);
					}
				}
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		Assignment38CollectionPractice4 middleCharacter = new Assignment38CollectionPractice4();

		String[] str = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(str));
		System.out.println("Given Input Array List is :\n" + listOfName);

		ArrayList<String> output = middleCharacter.returnStringAfterPerformingOperation(listOfName);
		System.out.println(
				"\nName starts with Vowel, contains atleast one digit and having exactly 1 uppercase are :\n" + output);
	}

}
