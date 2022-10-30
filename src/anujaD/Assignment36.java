/*
Assignment - 36 : 9th Oct'2022
Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.
input : apdz
output : bqea
Program 2 : 
WAP to return ascii of given character.
input : C
output : 67
Program 3 : 
WAP to print ascii value of A->Z.
output : A -> 65
         B -> 66
		 .
		 .
		 Z -> 90
*/
/*
Assignment - 36 : 9th Oct'2022
Program 4 :
Return count of digits from given String without using isDigit method of Character class..
input : te1chno2cre4di6ts 
output : 4
Program 5 : 
Return character holding given Ascii value.
input : 69
output : E
Program 6 : 
Print all characters having ascii value 91 ot 96.
output : 91 -> [
         92 -> \
         93 -> ]		
*/

package anujaD;

public class Assignment36 {
	String getEncryptedString(String input) {
		String encryptString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'z')
				encryptString += 'a';
			else
				encryptString = encryptString + (char) (ch + 1);
		}
		return encryptString;
	}

	int getAsciiValue(char ch) {

		int asciiValue = ch;
		return asciiValue;
	}

	void printAsciiValues() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println( ch + "-->" + (int)ch);
		}
	}
	int getCountOfDigitFromString(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int asciiValue = ch;
			if (asciiValue >= 48 && asciiValue <= 57)
				count++;
		}
		return count;
	}

	char getCharacterFromAsciiValue(int value) {
		char ch = (char) value;
		return ch;
	}

	void printCharacterFromAsciiValue() {
		for (int index = 91; index <= 96; index++) {
			char ch = (char) index;
			System.out.println(index + "---" + ch);
		}
	}
	public static void main(String[] args) {

		Assignment36 assignment36 = new Assignment36();

		String input = "apdz";
		System.out.println("Encrypted string of '" + input + "' is '" + assignment36.getEncryptedString(input) + "'");
		System.out.println("-------------------------------------");

		char ch = 'C';
		System.out.println("Ascii value of character '" + ch + "' is " + assignment36.getAsciiValue(ch));
		System.out.println("-------------------------------------");
		String input1 = "te1chno2cre4di6ts";
		System.out.println("Given input string is: '" + input1);
		System.out.println(
				"Digit count from String '" + input1 + "' is '" + assignment36.getCountOfDigitFromString(input1) + "'");
		System.out.println("----------------------------------");

		int asciiValue = 69;
		System.out.println("Character holding Ascii value " + asciiValue + " is '"
				+ assignment36.getCharacterFromAsciiValue(asciiValue) + "'");
		System.out.println("----------------------------------");

		assignment36.printCharacterFromAsciiValue();

		assignment36.printAsciiValues();
	}

}
