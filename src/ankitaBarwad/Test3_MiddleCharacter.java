/*Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (30 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h
*/
package ankitaBarwad;

import java.util.Arrays;

public class Test3_MiddleCharacter {

	char getCharOfMaxLengthString(String[] inputString) {

		int maxLength = inputString[0].length();
		String maxString = inputString[0];
		for (int index = 1; index < inputString.length; index++) {
			if (maxLength < inputString[index].length()) {
				maxLength = inputString[index].length();
				maxString = inputString[index];
			}
		}
		return getMiddleChar(maxString);
	}

	char getMiddleChar(String stringInput) {
		int strLength = stringInput.length();
		if (strLength % 2 == 0)
			return stringInput.charAt(strLength/2 - 1);
		else
			return stringInput.charAt(strLength / 2);
	}

	char[] getMiddleCharOfAllStringsArray(String[] inputArray) {
		char[] middleCharArray = new char[inputArray.length];
		for (int index = 0; index < inputArray.length; index++) {
			middleCharArray[index] = getMiddleChar(inputArray[index]);
		}
		return middleCharArray;
	}

	public static void main(String[] args) {

		Test3_MiddleCharacter middleChar = new Test3_MiddleCharacter();
		String[] inputString1 = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		char ch1 = middleChar.getCharOfMaxLengthString(inputString1);
		System.out.println("Input Array : " + Arrays.toString(inputString1) + "\nMiddle character of Max Length String : " + ch1);

		String[] inputString2 = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] ch2 = middleChar.getMiddleCharOfAllStringsArray(inputString2);
		System.out.println("\nMiddle character of All Strings in an Array :");
		for (int index = 0; index < ch2.length; index++) {
			System.out.println(inputString2[index] + " : " + ch2[index]);
		}
	}
}
