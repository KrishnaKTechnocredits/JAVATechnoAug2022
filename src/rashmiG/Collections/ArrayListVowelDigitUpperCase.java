/*Assignment - 38 : 14th Oct'2022

Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]*/

package rashmiG.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListVowelDigitUpperCase {

	boolean getNameStartingWithVowel(String input) {
		char ch = input.charAt(0);
		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'O':
		case 'o':
		case 'u':
		case 'U':
			return true;
		}
		return false;
	}

	boolean containsDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				count++;
				break;
			}
		}
		if (count > 0) {
			boolean vowelFlag = getNameStartingWithVowel(input);
			if (vowelFlag)
				return true;
		}
		return false;
	}

	boolean containsOneUpperCase(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				count++;
			}
		}
		if (count == 1) {
			boolean DigitFlag = containsDigit(input);
			if (DigitFlag)
				return true;
		}
		return false;
	}

	ArrayList<String> processedArrayList(String[] input) {
		boolean UpperCaseFlag = false;
		String name = "";
		ArrayList<String> outputArrayList = new ArrayList<String>();
		for (int index = 0; index < input.length; index++) {
			name = input[index];
			UpperCaseFlag = containsOneUpperCase(name);
			if (UpperCaseFlag) {
				outputArrayList.add(name);
			}
		}
		return outputArrayList;
	}

	public static void main(String[] args) {
		String[] input = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		System.out.println("InputArray: " + Arrays.toString(input));
		ArrayList<String> listOfNames = new ArrayListVowelDigitUpperCase().processedArrayList(input);
		System.out.println("OutputArrayList: " + listOfNames);
	}
}