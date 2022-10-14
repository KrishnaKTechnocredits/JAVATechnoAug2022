package nehaniG.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38 {
	void removeAllDeepakWithShivani(ArrayList<String> listOfNames, String name, String targetName) {
		{
			while (listOfNames.contains(name)) {
				int index = listOfNames.indexOf(name);
				listOfNames.set(index, targetName);
			}
			System.out.println("ArrayList Of Names: " + listOfNames);
		}
	}

	void increaseMarks(ArrayList<Integer> listOfMarks) {

		for (int index = 0; index < listOfMarks.size(); index++) {
			if (listOfMarks.get(index) < 35) {
				int replaceWith = listOfMarks.get(index) + 10;
				listOfMarks.set(index, replaceWith);
			}
		}
		System.out.println("Array Of Marks : " + listOfMarks);
	}

	char getMiddleCharacterOfString(String str) {
		int strLength = str.length() / 2;
		if (str.length() % 2 == 0) {
			return str.charAt(strLength - 1);
		} else {
			return str.charAt(strLength);
		}
	}

	ArrayList<Character> getProcessedArrayList(String[] input) {
		ArrayList<Character> output = new ArrayList<Character>();

		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > 6) {

				output.add(getMiddleCharacterOfString(input[index]));
			}
		}
		return output;
	}

	void listOperation(ArrayList<String> listOfNames4) {
		String[] vowels = { "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" };
		ArrayList<String> output = new ArrayList<>();
		for (int i = 0; i < listOfNames4.size(); i++) {
			String ch = "" + listOfNames4.get(i).charAt(0);
			if (Arrays.asList(vowels).contains(ch) && checkDigitInString(listOfNames4.get(i))
					&& checkUpperCaseMoreThanOne(listOfNames4.get(i))) {
				output.add(listOfNames4.get(i));
			}
		}
		System.out.println("List Of Name Having  with Vowel,one digit & Uppercase : " + output);
	}

	boolean checkDigitInString(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	boolean checkUpperCaseMoreThanOne(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isUpperCase(name.charAt(i))) {
				count++;
			}
			if (count > 1) {
				return false;
			}
		}
		if (count < 1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "Akanksha", "Amol", "Deepak", "Deepak" };
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(input));
		String name = "Deepak";
		String targetName = "Shivani";
		assignment38.removeAllDeepakWithShivani(listOfNames, name, targetName);

		Integer[] marks = { 23, 55, 34, 88, 58, 81 };
		ArrayList<Integer> listOfMarks = new ArrayList<Integer>(Arrays.asList(marks));
		assignment38.increaseMarks(listOfMarks);

		String[] input3 = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };

		ArrayList<Character> listOfChar = assignment38.getProcessedArrayList(input3);
		System.out.println("ArrayList of characters is:" + listOfChar);

		String[] input4 = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> listOfNames4 = new ArrayList<String>(Arrays.asList(input4));

		assignment38.listOperation(listOfNames4);

	}
}
