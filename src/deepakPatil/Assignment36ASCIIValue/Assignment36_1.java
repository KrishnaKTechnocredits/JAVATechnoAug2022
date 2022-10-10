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

package deepakPatil.Assignment36ASCIIValue;

public class Assignment36_1 {

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

	public static void main(String[] args) {

		Assignment36_1 assignment36_1 = new Assignment36_1();

		String input = "apdz";
		System.out.println("Encrypted string of '" + input + "' is '" + assignment36_1.getEncryptedString(input) + "'");
		System.out.println("-------------------------------------");

		char ch = 'C';
		System.out.println("Ascii value of character '" + ch + "' is " + assignment36_1.getAsciiValue(ch));
		System.out.println("-------------------------------------");

		assignment36_1.printAsciiValues();
	}
}