/*Assignment - 36 :
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

Program 7 : 
WAP to return String by encrypting all characters from given string by its next character.
input : aPd%3zZ
output : bQe%3aA
*/

package apurvaBabel;

public class Assignment36_Ascii {

	// Program 1 : Method to return String by encrypting all characters from given
	// string by its next character
	String getEncryptedWithNextCharacter(String input) {
		System.out.println("Encryption of all characters of string with its next character :");
		System.out.println("Input : " + input);
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'z') {
				output = output + 'a';
			} else if (ch == 'Z') {
				output = output + 'A';
			} else {
				ch++;
				output = output + ch;
			}
		}
		return output;
	}

	// Program 2 : Method to return Ascii value of given character
	int getAsciiValueOfCharacter(char ch) {
		System.out.println("\nAscii value of Character :");
		System.out.println("Input : " + ch);
		int num = ch;
		return num;
	}

	// Program 3 : Method to print Ascii value of given range
	void printAsciiValue(char startCh, char endCh) {
		System.out.println("\nAscii value of given range :");
		System.out.println("Range : " + startCh + " to " + endCh);
		for (char ch = startCh; ch <= endCh; ch++) {
			int value = ch;
			System.out.println(ch + " --> " + value);
		}
	}

	// Program 4 : Method to return count of digits from given String
	int getCountOfDigit(String input) {
		System.out.println("\nCount of digits from given string :");
		System.out.println("Input : " + input);
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	// Program 5 : Method to return character holding given Ascii value
	char getCharacterOfGivenAscii(int input) {
		System.out.println("\nCharacter holding given Ascii value :");
		System.out.println("Input : " + input);
		char ch = (char) input;
		return ch;
	}

	// Program 6 : Method to print all characters having Ascii value from given
	// range
	void printAllCharactersOfGivenAscii(int startNum, int endNum) {
		System.out.println("\nCharacters in given Ascii range : ");
		System.out.println("Range : " + startNum + " to " + endNum);
		for (int index = startNum; index <= endNum; index++) {
			char ch = (char) index;
			System.out.println(index + " --> " + ch);
		}
	}

	// Program 7 : Method to return String by encrypting all characters from given
	// string by its next character
	String getEncryptedWithNextCharacter2(String input) {
		System.out.println("\nEncryption of all characters of string with its next character :");
		System.out.println("Input : " + input);
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'z') {
				output = output + 'a';
			} else if (ch == 'Z') {
				output = output + 'A';
			} else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				ch++;
				output = output + ch;
			} else {
				output = output + ch;
			}

		}
		return output;
	}

	public static void main(String[] args) {

		Assignment36_Ascii assignment36 = new Assignment36_Ascii();
		String input = "apdz";
		String output = assignment36.getEncryptedWithNextCharacter(input);
		System.out.println("Output : " + output);

		char input1 = 'C';
		int output1 = assignment36.getAsciiValueOfCharacter(input1);
		System.out.println("Output : " + output1);

		assignment36.printAsciiValue('A', 'Z');

		String input2 = "te1chno2cre4di6ts";
		int output2 = assignment36.getCountOfDigit(input2);
		System.out.println("Output : " + output2);

		int num = 69;
		char ch = assignment36.getCharacterOfGivenAscii(num);
		System.out.println("Output : " + ch);

		assignment36.printAllCharactersOfGivenAscii(91, 96);

		String input3 = "aPd%3zZ";
		String output3 = assignment36.getEncryptedWithNextCharacter2(input3);
		System.out.println("Output : " + output3);
	}
}
