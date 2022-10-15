/*Assignment - 38 : 14th Oct'2022
Program 4 : 
Return list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase.

input : {"Aa3shvi", "is4h4a", "i5Sha4n","nUpur3"}
output : ["Aa3shvi", "i5Sha4n"]*/
package adittyThakare.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_Program4 {

	ArrayList<String> getNamesWithVowelDigitUppercase(ArrayList<String> inputList) {
		ArrayList<String> outpuList = new ArrayList<>();

		for (int index = 0; index < inputList.size(); index++) {
			String word = inputList.get(index);
			char ch = word.charAt(0);
			boolean uppercaseFlag = false, isDigit = false;
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				for (int innerIndex = 0; innerIndex < inputList.get(index).length(); innerIndex++) {
					if (Character.isUpperCase(word.charAt(innerIndex))) {
						uppercaseFlag = true;
					}
					if (Character.isDigit(word.charAt(innerIndex))) {
						isDigit = true;
					}
				}
				if (uppercaseFlag && isDigit) {
					outpuList.add(word);
				}
			}
		}
		return outpuList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment38_Program4 assignment38_Program4 = new Assignment38_Program4();
		String[] str = { "Aa3shvi", "is4h4a", "i5Sha4n", "nUpur3" };
		ArrayList<String> inputList = new ArrayList<>(Arrays.asList(str));
		System.out.println("Program to return list of names if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase");
		System.out.println("\nInput list: " + inputList);
		System.out.println("\nOutput list: " + assignment38_Program4.getNamesWithVowelDigitUppercase(inputList));
	}

}
