/*Assignment - 38 :

Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains

Program 2: 
Increase student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]

Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']

Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]

*/
package apurvaBabel.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38 {

	// Program 1 : Method to repalce name with other name
	void replaceNameWithTargetName(ArrayList<String> listOfNames, String name, String targetName) {
		System.out.println("Replacing " + name + " with " + targetName);
		System.out.println("Input ArrayList : " + listOfNames);
		while (listOfNames.contains(name)) {
			int index = listOfNames.indexOf(name);
			listOfNames.set(index, targetName);
		}
		System.out.println("Output ArrayList : " + listOfNames);
	}

	// Program 2 : Method to increase student marks by 10 if marks is less than 35
	void increaseMarks(ArrayList<Integer> listOfMarks) {
		System.out.println("\n\nIncreasing student marks by 10 if marks are less than 35 ");
		System.out.println("Original array of marks : " + listOfMarks);
		for (int index = 0; index < listOfMarks.size(); index++) {
			if (listOfMarks.get(index) < 35) {
				int replaceWith = listOfMarks.get(index) + 10;
				listOfMarks.set(index, replaceWith);
			}
		}
		System.out.println("Processed array of marks : " + listOfMarks);
	}

	// Program 3 : Method to return list of Middle character from given name if
	// length of the name is more than 6 characters
	char getMiddleCharacter(String input) {
		int length = input.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return input.charAt(index);
	}

	ArrayList<Character> getMiddleCharacterOfWordLengthMoreThan6(String[] input) {
		System.out.println("\n\nList of middle character from given name if length of name is more than 6");
		System.out.println("Input Array : " + Arrays.toString(input));
		ArrayList<Character> listOfCharacter = new ArrayList<Character>();
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > 6) {
				char ch = getMiddleCharacter(input[index]);
				listOfCharacter.add(ch);
			}
		}
		return listOfCharacter;
	}

	// Program 4 :Method to return list of name if name starts with Vowel, contains
	// atleast one digit and having exactly 1 uppercase
	ArrayList<String> getNamesStartWithVowelContainDigitAnd1Uppercase(String[] input) {
		System.out.println(
				"\n\nList of names if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase ");
		System.out.println("Input Array : " + Arrays.toString(input));
		ArrayList<String> listOfNames = new ArrayList<String>();
		boolean isVowelFlag;
		boolean isDigitFlag;
		boolean isUpperCaseFlag;
		int digitCount;
		int upperCaseCount;

		for (String name : input) {
			isVowelFlag = false;
			isDigitFlag = false;
			isUpperCaseFlag = false;
			digitCount = 0;
			upperCaseCount = 0;

			for (int index = 0; index < name.length(); index++) {
				if (index == 0) {
					char ch = Character.toLowerCase(name.charAt(0));
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
						isVowelFlag = true;
					}
				}
				if (Character.isDigit(name.charAt(index))) {
					digitCount++;
				}
				if (Character.isUpperCase(name.charAt(index))) {
					upperCaseCount++;
				}
			}
			if (digitCount > 0) {
				isDigitFlag = true;
			}
			if (upperCaseCount == 1) {
				isUpperCaseFlag = true;
			}
			if (isVowelFlag && isDigitFlag && isUpperCaseFlag) {
				listOfNames.add(name);
			}
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "Akanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(input));
		String name = "Deepak";
		String targetName = "Shivani";
		assignment38.replaceNameWithTargetName(listOfNames, name, targetName);

		Integer[] marks = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(Arrays.asList(marks));
		assignment38.increaseMarks(listOfMarks);

		String[] input1 = { "Manjiri", "Anuja", "Deepak", "Sagar", "Akanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<Character> listOfCharacter = assignment38.getMiddleCharacterOfWordLengthMoreThan6(input1);
		System.out.println("Output ArrayList : " + listOfCharacter);

		String[] input2 = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> listOfNames1 = assignment38.getNamesStartWithVowelContainDigitAnd1Uppercase(input2);
		System.out.println("Output ArrayList : " + listOfNames1);
	}
}
