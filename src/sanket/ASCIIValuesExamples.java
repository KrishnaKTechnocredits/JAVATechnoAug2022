/*Assignment - 36 : 9th Oct'2022

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
output : bQ%e3aA

if(ch =='Z'){
	output = output + 'A';
}else if(ch =='z'){
	output = output + 'a';
}else{
	if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
		ch++;
	}
	output = output + ch;
}
*/

package sanket;

public class ASCIIValuesExamples {

	// method to return String by encrypting all characters from given string by its
	// next character
	String getEncryptedCharc(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z') {
				ch = 'a';
			} else {
				ch = (char) (ch + 1);
			}
			output += String.valueOf(ch);
		}
		return output;
	}

	// method to return ASCII of given character
	int getASCIIOfCharacter(char ch) {
		int ascii = ch;
		return ascii;
	}

	// method to print ascii value of A->Z
	void getASCIIOfAtoZ() {
		for (int index = 'A'; index <= 'Z'; index++) {
			System.out.println((char) index + "-->" + getASCIIOfCharacter((char) index));
		}
	}

	// method to return count of digits from given String without using isDigit
	// method of Character class
	int getDigitCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch <= 48 || ch <= 57)
				count++;
		}
		return count;
	}

	// method to find character for given ASCII
	char getCharacterOfASCII(int ascii) {
		char ch = (char) ascii;
		return ch;
	}

	// method to find character for ascii value 91 ot 96
	void getCharactersOfASCII() {
		for (int ascii = 91; ascii <= 96; ascii++) {
			char ch = (char) ascii;
			System.out.println(ascii + "-->" + getCharacterOfASCII((char) ascii));
		}
	}

	String getEncodedString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				ch = 'A';
			} else if (ch == 'z') {
				ch = 'a';
			} else {
				if ((ch >= 65 && ch <= 90) || (ch > 97 && ch <= 122)) {
					ch++;
				}
			}
			output += ch;
		}
		return output;
	}

	public static void main(String[] args) {

		System.out.println("*** Program 1 ***");
		String input = "apdz";
		System.out.println("The input string is : " + input);
		System.out.println("The output is : " + new ASCIIValuesExamples().getEncryptedCharc(input));

		System.out.println("\n");

		System.out.println("*** Program 2 ***");
		char ch1 = 'C';
		System.out.println("The ASCII value of " + ch1 + " is : " + new ASCIIValuesExamples().getASCIIOfCharacter(ch1));
		char ch2 = '.';
		System.out.println("The ASCII value of " + ch2 + " is : " + new ASCIIValuesExamples().getASCIIOfCharacter(ch2));
		char ch3 = '*';
		System.out.println("The ASCII value of " + ch3 + " is : " + new ASCIIValuesExamples().getASCIIOfCharacter(ch3));

		System.out.println("\n");

		System.out.println("*** Program 3 ***");
		System.out.println("Print ASCII values of A->Z");
		new ASCIIValuesExamples().getASCIIOfAtoZ();

		System.out.println("\n");

		System.out.println("*** Program 4 ***");
		String input2 = "te1chno2cre4di6ts";
		System.out.println("The input string is : " + input2);
		System.out.println("The number of digits in string : " + new ASCIIValuesExamples().getDigitCount(input2));

		System.out.println("\n");

		System.out.println("*** Program 5 ***");
		int ascii = 69;
		System.out.println("The ASCII value " + ascii + " is associate to character : "
				+ new ASCIIValuesExamples().getCharacterOfASCII(ascii));

		System.out.println("\n");

		System.out.println("*** Program 6 ***");
		System.out.println("Printing all characters having ascii value 91 ot 96 : ");
		new ASCIIValuesExamples().getCharactersOfASCII();

		System.out.println("\n");

		System.out.println("*** Program 7 ***");
		String input3 = "aPd%3zZ";
		System.out.println("The input string is : " + input3);
		System.out.println("The output of String is : " + new ASCIIValuesExamples().getEncodedString(input3));
	}
}
