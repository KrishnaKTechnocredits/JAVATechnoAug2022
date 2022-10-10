/*
 Assignment - 36 : 9th Oct'2022

Program 1 : 
WAP to return String by encrypting all characters from given string by its next character.
input : apdz
output : bqea

Program 2 : 
WAP to return ASCII of given character.
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
} */

package pujaSah.assignments31_40;

import java.util.Scanner;

public class AsciiExamples {
	// method to return String by encrypting all characters from given string by its next character.
	String getEncryptedCharFromStirng(String str) {
		String outStr = " ";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z') {
				outStr += 'a';
			}
			else {
				outStr += ++ch;
			}
		}
		return outStr;
	}

	// method to return ASCII of given character.
	int getAsciiValueOfChar(char ch) {
		int ascii = (int) ch;
		return ascii;
	}

	// method to print ASCII value of A->Z.
	void displayAsciiValueOfCharacters() {
		for (char ch = 65; ch <= 90; ch++) {
			System.out.println(ch + "-->" + (int)ch);
		}
	}

	// method to return count of digits from given String without using isDigit
	// method of Character class
	int getCountOfDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 47 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	// method to return character holding given ASCII value.
	char getCharHoldingGivenAsciiValue(int ascii) {
		return (char) ascii;
	}
	
	// method to print all characters having ASCII value 91 to 96.
	void printCharsForGivenAscii() {
		for (int index = 91; index <= 96; index++) {
			System.out.println(index + "-->" + (char) index);
		}
	}

	// method to return String by encrypting all characters from given string by its next character.
	String getEncryptedString(String str) {
		String outStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				outStr += 'A';
			}
			else if (ch == 'z') {
				outStr += 'a';
			} 
			else if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
				outStr += ++ch;
			}
			else {
				outStr += ch;
			}
		}
		return outStr;
	}

	public static void main(String[] args) {
		AsciiExamples obj = new AsciiExamples();
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Enter a string to be encrypted(should contain only letters):");
		String str1 = sc.next();
		System.out.println("Encrypetd String is: " + obj.getEncryptedCharFromStirng(str1));

		System.out.println("2. Enter a character whose ascii value is to be returned: ");
		char ch1 = sc.next().charAt(0);
		System.out.println("Ascii value of " + ch1 + " is: " + obj.getAsciiValueOfChar(ch1));
		
		System.out.println("3. ASCII value from A to Z: ");
		obj.displayAsciiValueOfCharacters();
		
		System.out.println("4. Enter a string whose digits u want to count: ");
		String str2 = sc.next();
		System.out.println("Number of digits in " + str2 + " is: " + obj.getCountOfDigits(str2));
		
		System.out.println("5. Enter a ASCII number whose character equivalent you want to know");
		int asciiNum = sc.nextInt();
		System.out.println("The equivalent character for ASCII " + asciiNum + " is: " + obj.getCharHoldingGivenAsciiValue(asciiNum));
		
		System.out.println("6. The character for ASCII 91 to 96 are: ");
		obj.printCharsForGivenAscii();
		
		System.out.println("7. Enter a string to be encrypted(can contain any character):");
		String str3 = sc.next();
		System.out.println("Encrypetd String is: " + obj.getEncryptedString(str3));
		
		sc.close();
	}
}
