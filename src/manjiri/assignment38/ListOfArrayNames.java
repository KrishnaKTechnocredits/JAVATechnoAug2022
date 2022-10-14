/*Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]*/

package manjiri.assignment38;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfArrayNames {

	boolean isFirstCharVowel(String str) {
		char ch = str.toLowerCase().charAt(0);
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}

	boolean isDigitCheck(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				return true;
		}
		return false;
	}

	int countUpperCaseCharacter(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				count++;
		}
		return count;
	}

	ArrayList<String> getProcessedArrayList(String[] input) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		boolean flagVowel = false;
		boolean flagDigit = false;
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			flagVowel = isFirstCharVowel(input[index]);
			flagDigit = isDigitCheck(input[index]);
			count = countUpperCaseCharacter(input[index]);

			if (count == 1 && flagDigit && flagVowel) {
				listOfNames.add(input[index]);
			}
		}
		return listOfNames;
	}
	
	public static void main(String[] args) {
		ListOfArrayNames listOfNames = new ListOfArrayNames();
		
		String[] input = {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"};
		System.out.println("Input Array is: ");
		System.out.println(Arrays.toString(input));
		System.out.println("---------------------------------------");
		
		ArrayList<String> processedList = listOfNames.getProcessedArrayList(input);
		System.out.println("Processed List is: ");
		System.out.println(processedList);
	}
}
