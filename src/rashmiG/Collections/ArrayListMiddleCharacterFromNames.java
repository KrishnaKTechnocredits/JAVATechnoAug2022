/*Assignment - 38 : 14th Oct'2022
 
Program 3 : 
Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']*/

package rashmiG.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMiddleCharacterFromNames {

	ArrayList<Character> getMiddleCharacterArrayList(String[] input) {
		char middleChar = ' ';
		ArrayList<Character> listOfMiddleChar = new ArrayList<Character>();
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			int nameLength = name.length();
			if (name.length() > 6) {
				if (name.length() % 2 == 0) {
					middleChar = name.charAt((nameLength / 2) - 1);
					listOfMiddleChar.add(middleChar);
				} else {
					middleChar = name.charAt(nameLength / 2);
					listOfMiddleChar.add(middleChar);
				}
			}
		}
		return listOfMiddleChar;
	}

	public static void main(String[] args) {
		String[] input = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		System.out.println("inputArray: " + Arrays.toString(input));
		System.out.println(
				"\nOutputArrayList: " + new ArrayListMiddleCharacterFromNames().getMiddleCharacterArrayList(input));
	}
}