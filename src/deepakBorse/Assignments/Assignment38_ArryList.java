/*
 * Program 1 : Replace all Deepak with Shivani.
input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 
Hint : use set, indexOf, contains

Program 2: Increse student marks by 10 if marks is less than 35.
input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]

Program 3 : Return list of Middle character from given name if length of the name is more than 6 characters.
input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']

Program 4 : Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.
input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
 */
package deepakBorse.Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_ArryList {

	// Program 1 : Replace all Deepak with Shivani.
	void printReplacedName(ArrayList<String> listOfName, String oldName, String updatedName) {
		System.out.println("Program 1 : Replace all Deepak with Shivani");
		System.out.println("Input String : " + listOfName);
		while (listOfName.contains(oldName)) {
			int index = listOfName.indexOf(oldName);
			listOfName.set(index, updatedName);
		}
		System.out.println("Replaced String : " + listOfName);
	}

	//Program 2: Increase student marks by 10 if marks is less than 35.
	ArrayList<Integer> getIncreMarks10(ArrayList<Integer> listOfNumber) {
		System.out.println("\nProgram 2 : Increase student marks by 10 if marks is less than 35");
		System.out.println("Input String : " + listOfNumber);
		for (int index = 0; index < listOfNumber.size(); index++) {
			int marks = listOfNumber.get(index);
			if (marks < 35) {
				listOfNumber.set(index, marks + 10);
			}
		}
		return listOfNumber;
	}

	//Program 3 : Return list of Middle character from given name if length of the name is more than 6 characters.
	ArrayList<Character> getMiddleChar(ArrayList<String> listOfName) {
		System.out.println("\nProgram 3 : Return list of Middle character from given name if length of the name is more than 6 characters");
		System.out.println("Input String : " + listOfName);
		ArrayList<Character> listOfMiddleCharacter = new ArrayList<>();
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			if (name.length() > 6) {
				if (name.length() % 2 != 0)
					listOfMiddleCharacter.add(name.charAt(name.length() / 2));
				else
					listOfMiddleCharacter.add(name.charAt((name.length() / 2) - 1));
			}
		}
		return listOfMiddleCharacter;
	}

	//Program 4 : Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.
	ArrayList<String> getStringWithVowels(ArrayList<String> listOfName) {
		System.out.println("\nProgram 4 : Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase");
		System.out.println("Input String : " + listOfName);
		ArrayList<String> vowelList = new ArrayList<>();
		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			char ch = name.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				char[] chars = name.toCharArray();
				int digitCount = 0;
				int upperCaseCount = 0;
				for (char c : chars) {
					if (Character.isDigit(c)) {
						digitCount++;
					}
					if (Character.isUpperCase(c)) {
						upperCaseCount++;
					}
				}
				if (upperCaseCount > 0 && digitCount > 0) {
					vowelList.add(name);
				}
			}
		}
		return vowelList;
	}

	public static void main(String[] args) {
		Assignment38_ArryList listexample = new Assignment38_ArryList();
		
		//Program 1 : Replace all Deepak with Shivani.

		String[] str = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(str));
		listexample.printReplacedName(listOfName, "Deepak", "Shivani");

		//Program 2: Increase student marks by 10 if marks is less than 35.
		ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(23, 55, 34, 88, 58, 81));
		System.out.println("Increased Marks : " + listexample.getIncreMarks10(listOfNumbers));

		//Program 3 : Return list of Middle character from given name if length of the name is more than 6 characters.
		listOfName = new ArrayList<String>(Arrays.asList("Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"));
		System.out.println("Middle Character : " + listexample.getMiddleChar(listOfName));

		listOfName = new ArrayList<String>(Arrays.asList("Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3"));
		System.out.println("Vowels String : " + listexample.getStringWithVowels(listOfName));
	}
}