/*Assignment - 38 : 14th Oct'2022

Program 1 : 
Replace all Deepak with Shivani.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : {"Manjiri", "Anuja", "Shivani", "Sagar", "AKanksha", "Amol", "Shivani", "Shivani"} 

Hint : use set, indexOf, contains

Program 2: 
Increse student marks by 10 if marks is less than 35.

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

package sanket;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAssignment38 {

	// Program 1 - method to replace all Deepak with Shivani.
	ArrayList<String> replaceStringInArrayList(ArrayList<String> listOfName, String name) {
		for (int index = 0; index < listOfName.size(); index++) {
			int indexName = listOfName.indexOf(name);
			if (listOfName.contains(name)) {
				listOfName.set(indexName, "Shivani");
			}
		}
		return listOfName;
	}

	// Program 2 - method to increase student marks by 10 if marks is less than 35.
	ArrayList<Integer> increaseStudentMarks(ArrayList<Integer> listOfMarks) {
		for (int index = 0; index < listOfMarks.size(); index++) {
			int marks = listOfMarks.get(index);
			if (marks < 35) {
				int modifiedMarks = marks + 10;
				listOfMarks.set(index, modifiedMarks);
			}
		}
		return listOfMarks;
	}

	// Program 3 - method to return list of Middle character from given name if
	// length of the name is more than 6 characters.
	// get middle character if length of the name is more than 6 characters
	char getMiddleCharacterOfString(String name) {
		int index = 0;
		if (name.length() % 2 == 0) {
			index = name.length() / 2 - 1;
		} else {
			index = name.length() / 2;
		}
		return name.charAt(index);
	}

	// method to return list of Middle character array list.
	ArrayList<Character> getMiddleCharacterOfNameLengthMoreThan6(ArrayList<String> listOfName) {
		ArrayList<Character> listOfCharacter = new ArrayList<Character>();
		for (int index = 0; index < listOfName.size(); index++) {
			if (listOfName.get(index).length() > 6) {
				char ch = getMiddleCharacterOfString(listOfName.get(index));
				listOfCharacter.add(ch);
			}
		}
		return listOfCharacter;
	}

	// Program 4 - Return list of name if name starts with Vowel, contains atleast
	// one digit and having exactly 1 uppercase
	// method to return is Name Start With Vowel
	boolean isStartWithVowel(String name) {
		boolean isVowelFlag = false;
		String outputString = name.toLowerCase();
		for (int index = 0; index < outputString.length(); index++) {
			char ch = outputString.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				isVowelFlag = true;
				break;
			}
		}
		return isVowelFlag;
	}

	// method to return atleast 1 digit
	boolean isDigit(String name) {
		boolean isDigit = false;
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
				break;
			}
		}
		if (count > 0) {
			isDigit = true;
		}
		return isDigit;
	}

	// method to return is name consist upper case
	boolean isUppercase(String name) {
		boolean isUpperCase = false;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				isUpperCase = true;
			}
		}
		return isUpperCase;
	}

	// Method to return arraylist of modified name
	ArrayList<String> modifiedName(ArrayList<String> listOfName) {
		ArrayList<String> al = new ArrayList<String>();
		for (int index = 0; index < listOfName.size(); index++) {
			String output = listOfName.get(index);
			if (isStartWithVowel(output) && isDigit(output) && isUppercase(output))
				al.add(output);
		}
		return al;
	}

	public static void main(String[] args) {

		System.out.println("***Program 1 - replace all Deepak with Shivani");
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName = new ArrayList<String>(Arrays.asList(input));
		System.out.println("The input array list is " + listOfName);
		System.out.println("The output array list is "
				+ new ArrayListAssignment38().replaceStringInArrayList(listOfName, "Deepak"));

		System.out.println("\n");

		System.out.println("***Program 2 - increase student marks by 10 if marks is less than 35");
		Integer[] input2 = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(Arrays.asList(input2));
		System.out.println("The input array list is " + listOfMarks);
		System.out.println("The output array list is " + new ArrayListAssignment38().increaseStudentMarks(listOfMarks));

		System.out.println("\n");

		System.out.println(
				"***Program 3 - method to return list of Middle character from given name if length of the name is more than 6 characters");
		String[] input3 = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfName2 = new ArrayList<String>(Arrays.asList(input3));
		System.out.println("The input array list is " + listOfName2);
		System.out.println("The output array list is "
				+ new ArrayListAssignment38().getMiddleCharacterOfNameLengthMoreThan6(listOfName2));
		
		System.out.println("\n");
		
		System.out.println(
				"***Program 4 - Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.");
		String[] input4 = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> listOfName3 = new ArrayList<String>(Arrays.asList(input4));
		System.out.println("The input array list is " + listOfName3);
		System.out.println("The output array list is " + new ArrayListAssignment38().modifiedName(listOfName3));
	}
}
