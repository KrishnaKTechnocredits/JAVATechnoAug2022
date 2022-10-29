package ankitaBarwad;

import java.util.Scanner;

public class Assignment36_ASCII_Encryption {

	/*Program 1 : 
	WAP to return String by encrypting all characters from given string by its next character.
	input : apdz
	output : bqea*/
	String getEncryptedString(String input){
		String outputString = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == 'z') { // if char is 'z' then replace by 'a'
				ch = 'a';
			}else { // for any other char replace by next char
				ch++;
			}
			outputString += ch;
		}	
		return outputString;	
	}
	
	/*Program 2 : 
	WAP to return ascii of given character.
	input : C
	output : 67*/
	int charToAscii(char ch) {
		int asciiValue = ch;
		return asciiValue;
	}
	
	/*Program 3 : 
	WAP to print ascii value of A->Z.
	output : A -> 65
	         B -> 66
			 .
			 .
			 Z -> 90*/
	void printAsciiValueOfCapitalAlphabets() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			int asciiValue = charToAscii(ch);
			System.out.println(ch + "--> " + asciiValue);
		}
	}
	
	/*Program 4 :
	Return count of digits from given String without using isDigit method of Character class..
	input : te1chno2cre4di6ts 
	output : 4*/
	int getCountOfDigits(String str){
		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if(ch >= 48 && ch <= 57) {//check whether char is in ascii range of 0-9
				count++;
			}
		}	
		return count;
	}
	
	/*Program 5 : 
	Return character holding given Ascii value.
	input : 69
	output : E*/
	char asciiToCharacter(int asciiValue) {
		char ch = (char)asciiValue; //Ascii to char conversion
		return ch;
	}
	
	/*Program 6 : 
	Print all characters having ascii value 91 ot 96.
	output : 91 -> [
	         92 -> \
	         93 -> ]		 
	*/
	void printCharactersOfGivenAsciiValueRange(int startRange, int endRange){
		for (int index = startRange; index <= endRange; index++) {
			char ch1 = asciiToCharacter(index);
			System.out.println(index +"--> "+ ch1);
		}
	}
	
	/*Program 7 : 
	WAP to return String by encrypting all characters from given string by its next character.
	input : aPd%3zZ
	output : bQe%3aA*/
	String getEncryptedStringByNextCharacter(String str) {
		String outputString = "";
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (ch == 'Z') {
				ch = 'A';
			} else if (ch == 'z') {
				ch = 'a';
			} else {
				if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					ch++;
				}
			}
			outputString += ch;
		}
		return outputString;
	}


	void display(String input) {
		System.out.println("Input String is: " + input);
		String output = getEncryptedStringByNextCharacter(input);
		System.out.println("Encrypted String is: " + output);
	}
	
	public static void main(String[] args) {
		Assignment36_ASCII_Encryption assignment36 = new Assignment36_ASCII_Encryption();
		String input = "apdz";
		System.out.println("Program1 : \nInput String is: " + input);
		System.out.println("Encrypted String is: " + assignment36.getEncryptedString(input));
		//-----------------------------------------------------------------------
		System.out.println("\nProgram2 : ");
		char inputChar = 'C';
		System.out.println("Ascii value of "+inputChar+" is: " + assignment36.charToAscii(inputChar));
		//-----------------------------------------------------------------------
		System.out.println("\nProgram3 : ASCII values of A to Z");
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			int asciiValue = assignment36.charToAscii(ch);
			System.out.println(ch + "--> " + asciiValue);
		}
		//-----------------------------------------------------------------------
		System.out.println("\nProgram4 : ");
		input = "te1chno2cre4di6ts";
		System.out.println("Count of Digits in "+input+" is: " + assignment36.getCountOfDigits(input));
		//-----------------------------------------------------------------------
		System.out.println("\nProgram5 : ");
		int number = 69;
		System.out.println("Character having ascii value "+number+" is: " + assignment36.asciiToCharacter(number));
		//-----------------------------------------------------------------------
		System.out.println("\nProgram6 : ");
		System.out.println("Enter Start Range and End Range of Ascii Value: ");
		Scanner sc = new Scanner(System.in);
		int startRange = sc.nextInt();
		int endRange = sc.nextInt();
		sc.close();
		System.out.println("Characters for the given ascii values are: ");
		assignment36.printCharactersOfGivenAsciiValueRange(startRange,endRange);
		//-----------------------------------------------------------------------
		System.out.println("\nProgram7 : ");
		input = "aPd%3zZ";
		assignment36.getEncryptedStringByNextCharacter(input);
		assignment36.display(input);
	}
}
