/*Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
*/
package asthaSrivastava.collections;

import java.util.*;

public class ReturnNameWithVowelsDigitUpperCase {

	ArrayList<String> getNameWithVowelDigitsUcase(ArrayList<String> listOfName) {
		System.out.println("Input Array is " + listOfName);
		ArrayList<String> output = new ArrayList<>();

		for (int index = 0; index < listOfName.size(); index++) {
			String name = listOfName.get(index);
			char ch = name.charAt(0);
			boolean isDigit = false, flagUpperCase = false;

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				for (int innerIndex = 0; innerIndex < listOfName.get(index).length(); innerIndex++) {
					if (Character.isUpperCase(name.charAt(innerIndex))) {
						flagUpperCase = true;
					}
					if (Character.isDigit(name.charAt(innerIndex))) {
						isDigit = true;
					}
				}
				if (isDigit && flagUpperCase) {
					output.add(name);
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] nameList = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> name = new ArrayList<>(Arrays.asList(nameList));
		System.out.println(
				"\nOutput Array List is " + new ReturnNameWithVowelsDigitUpperCase().getNameWithVowelDigitsUcase(name));
	}
}
