/*
 * Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst"; */

package pujaSah.assignments20_30;

public class FrequencyOfLetterInString {

	// Method to display frequency of each character in a string
	void displayFrequencyOfLetters(String str) {
		int length1 = str.length();
		while (length1 > 0) {
			char ch = str.charAt(0);
			String str2 = Character.toString(ch);
			str = str.replace(str2, "");
			int length2 = str.length();
			int newLength = length1 - length2;
			System.out.println(ch + " : " + newLength + " times");
			length1 = str.length();
		}
	}

	public static void main(String[] args) {
		String inStr = "technocreditst";
		System.out.println("Input String: " + inStr);

		System.out.println("The frequency of each letters in " + inStr + " are: ");
		new FrequencyOfLetterInString().displayFrequencyOfLetters(inStr);
	}
}
