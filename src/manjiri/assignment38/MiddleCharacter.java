/*Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']*/

package manjiri.assignment38;

import java.util.ArrayList;
import java.util.Arrays;

public class MiddleCharacter {

	char getMiddleCharacterOfString(String str) { // returns middle character of String
		int strLength = str.length() / 2;
		if (str.length() % 2 == 0) {
			return str.charAt(strLength - 1);
		} else {
			return str.charAt(strLength);
		}
	}

	ArrayList<Character> getProcessedArrayList(String[] input) {
		ArrayList<Character> output = new ArrayList<Character>();
		char ch = ' ';

		for (int index = 0; index < input.length; index++) {//if length of string is > 6 add middle char to arraylist
			if (input[index].length() > 6) {
				ch = getMiddleCharacterOfString(input[index]);
				output.add(ch);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		System.out.println("Input Array is: ");
		System.out.println(Arrays.toString(input));
		System.out.println("---------------------------------------------------------------------");

		MiddleCharacter middleCharacter = new MiddleCharacter();
		ArrayList<Character> listOfChar = middleCharacter.getProcessedArrayList(input);
		System.out.println("Processed ArrayList of characters is:" + listOfChar);
	}
}
