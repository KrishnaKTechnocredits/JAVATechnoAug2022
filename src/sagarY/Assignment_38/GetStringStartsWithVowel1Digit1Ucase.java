/*Program 4 :Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]
*/

package sagarY.Assignment_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetStringStartsWithVowel1Digit1Ucase {

	boolean isContainDigit(String name) {

		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index)))
				return true;
		}
		return false;
	}

	boolean isHavingExact1UpperCase(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isUpperCase(name.charAt(index))) {
				count++;
				if (count <= 1)
					return true;
			}
		}
		return false;

	}

	boolean isFirstCharVowel(String name) {
		if (name.charAt(0) == 'a' || name.charAt(0) == 'e' || name.charAt(0) == 'i' || name.charAt(0) == 'o'
				|| name.charAt(0) == 'u' || name.charAt(0) == 'A')
			return true;
		else
			return false;
	}

	ArrayList<String> getStringStartsWithVowel1Digit1Ucase(ArrayList<String> listOfNames) {

		ArrayList<String> output = new ArrayList<String>();

		for (String name : listOfNames) {
			boolean flag = isHavingExact1UpperCase(name);

			if (flag) {
				boolean flag1 = isContainDigit(name);
				if (flag1) {
					boolean flag2 = isFirstCharVowel(name);
					if (flag2)
						output.add(name);
				}
			}

		}

		return output;
	}

	public static void main(String[] args) {
		System.out.println("Program 4 :Return list of name if name starts with Vowel, \ncontains atleast one digit and having exactly 1 uppercase");
		System.out.println("----------------------------------------------------------");
		String[] arrayString = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" ,"eE5l3a"};
		List<String> arr = Arrays.asList(arrayString);
		ArrayList<String> listOfNames = new ArrayList<String>(arr);
		System.out.println("Input: " + listOfNames);
		ArrayList<String> output = new GetStringStartsWithVowel1Digit1Ucase()
				.getStringStartsWithVowel1Digit1Ucase(listOfNames);
		System.out.println("\nOutput is: " + output);
	}
}
