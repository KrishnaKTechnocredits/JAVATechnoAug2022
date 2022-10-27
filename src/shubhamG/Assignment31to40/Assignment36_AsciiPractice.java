package shubhamG.Assignment31to40;

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
public class Assignment36_AsciiPractice {

	String getNextCharacter(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else {
				if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
					ch++;
				}
				output = output + ch;
			}
		}
		return output;
	}

	int getAsciiOfGivenCharacter(char ch) {
		int ascii = ch;
		System.out.println("\nAscii of given character " + ch + " is :" + ascii);

		return ascii;
	}

	void getAsciiOfAllCharacters() {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int ascii = ch;
			System.out.println(ch + " is - " + ascii);
		}
	}

	int getCountOfDigit(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (ch > 48 && ch <= 57) {
				count++;
			}

		}

		return count;
	}

	void getCharacterOfAscii(int value) {

		char ch = (char) value;
		System.out.println("\nCharacter with Ascii value " + value + " is - " + ch);
	}

	public static void main(String[] args) {
		Assignment36_AsciiPractice assignment36 = new Assignment36_AsciiPractice();
		String input1 = "apdz";
		System.out.println("String by encrypting all characters from given string by its next character " + input1
				+ " is: " + assignment36.getNextCharacter(input1));

		assignment36.getAsciiOfGivenCharacter('C');

		System.out.println("\nAscii for all the Character between A to Z  are: ");
		assignment36.getAsciiOfAllCharacters();

		String input2 = "te1chno2cre4di6ts";
		System.out.println("\nCount of digits in string " + input2 + " is: " + assignment36.getCountOfDigit(input2));

		int input4 = 69;
		assignment36.getCharacterOfAscii(input4);

		System.out.println("\nAscii value in given range (91 to 96) are : ");
		for (int value = 91; value <= 96; value++) {
			assignment36.getCharacterOfAscii(value);

		}
		String input3 = "aPd%3zZ";
		System.out.println("\nString by encrypting all characters from given string by its next character of " + input3
				+ " is: " + assignment36.getNextCharacter(input3));

	}

}
