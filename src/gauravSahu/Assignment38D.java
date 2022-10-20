/*Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]*/
package gauravSahu;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38D {

	void getName(String name) {
		ArrayList<String> outputName = new ArrayList<String>();
		boolean digit = false;
		boolean uCase = false;
		int digitcount = 0;
		int uCasecount = 0;
		String name3 = name.toLowerCase();
		char ch = name3.charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			for (int i = 0; i < name.length(); i++) {

				if (Character.isDigit(name.charAt(i))) {
					digitcount++;
				}
				if (Character.isUpperCase(name.charAt(i))) {
					uCasecount++;
				}
			}
			if (digitcount > 0) {
				digit = true;
			}
			if (uCasecount == 1) {
				uCase = true;
			}
			if (digit && uCase) {
				outputName.add(name);
				System.out.println("Output arrayList : " + outputName);
			}
		}
	}

	public static void main(String[] args) {
		Assignment38D a38 = new Assignment38D();
		String[] input = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };	
		System.out.println("Program 4 : Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.");
		System.out.println("Input array : " + Arrays.toString(input));
	
		for (String name : input) {
			
			a38.getName(name);
		}

	}

}
