/*
 * Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst"; */

package pujaSah.assignments20_30;

public class FrequencyOfLetterInString {

	// Method to get frequency of a character in a string
	int getFrequencyOfLetter(String str) {
		int length1 = str.length();
		int newLength = 0;
		for (int i = 0; i < str.length(); i++) {
			str = str.replace("t", "");
			int length2 = str.length();
			newLength = length1 - length2;
		}
		return newLength;
	}

	public static void main(String[] args) {
		String inStr = "technocreditst";
		System.out.println("Input String: " + inStr);

		System.out.println("The frequency of letter t in " + inStr + " is "
				+ new FrequencyOfLetterInString().getFrequencyOfLetter(inStr));
	}
}
