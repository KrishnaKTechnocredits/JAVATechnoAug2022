/*
 * Assignment - 36 : 9th Oct'2022
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
 */

package harshalRane.Assignments.assingment36.ascii;

public class Assignment36Program1 {
	// Program 1: return String by encrypting all characters from given string by
	// its next character

	String getNextCharacters(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'z') {
				output = output + 'a';
			} else {
				ch = (char) (ch + 1);
				output = output + ch;
			}
		}
		return output;
	}

	// Program 2: return ascii of given character

	int getAsciiOfChar(char ch) {
		int ascii = ch;
		return ascii;
	}

	// Program 3: print ascii value of A->Z

	void getAsciiOfAtoZ() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int ascii = getAsciiOfChar(ch);
			System.out.println(ch + " --> " + ascii);
		}
	}

	// Program 4: Return count of digits from given String without using isDigit
	// method of Character class

	int getCountOfDigitsFromSTring(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}
	
	//Program 5: Return character holding given Ascii value
	
	char getCharOfGivenAscii(int ascii) {
		char ch = (char) ascii;
		return ch;
	}
	
	//Program 6: Print all characters having ascii value 91 to 96
	
	void printAllCharFromGivenAscii() {
		for(int ascii=91;ascii<=96;ascii++) {
			char ch = getCharOfGivenAscii(ascii);
			System.out.println(ascii + "-->" + ch);
		}
	}
	
	//Program 7: To return String by encrypting all characters from given string by its next character
	
	String getNextChar1(String input) {
		String output = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(input.charAt(index) == 'Z') {
				output = output + 'A'; //A
			}
			else if(input.charAt(index) == 'z') {
				output = output + 'a'; //a //bQe%3a
			}
			else 
				{
					if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
					ch = (char) (ch + 1);
					}
			output = output + ch;
				}
		}
		return output; //bQe%3azAZ
	}
	
	public static void main(String[] args) {
		Assignment36Program1 assignment36Program1 = new Assignment36Program1();
		// Program 1
		String input = "apdz";
		System.out.println(
				"Program 1: To return String by encrypting all characters from given string by its next character");
		System.out
				.println("Input: --> " + input + "\n" + "Output: --> " + assignment36Program1.getNextCharacters(input));
		System.out.println("-------------------------------------------------------");

		// Program 2
		char ch = 'C';
		System.out.println("Program 2 : To return ascii of given character");
		System.out.println("Input: --> " + ch + "\n" + "Output: --> " + assignment36Program1.getAsciiOfChar(ch));
		System.out.println("-------------------------------------------------------");

		// Program 3
		System.out.println("Program 3 : Print ascii value of A->Z");
		assignment36Program1.getAsciiOfAtoZ();
		System.out.println("-------------------------------------------------------");

		// Program 4
		System.out.println("Program 4 : Return count of digits from given String without using isDigit method of Character class");
		String input1 = "te1chno2cre4di6ts";
		System.out.println("Input: --> " + input1 + "\n" + "Output: --> "+ assignment36Program1.getCountOfDigitsFromSTring(input1));
		System.out.println("-------------------------------------------------------");
		
		//Program 5
		System.out.println("Program 5: Return character holding given Ascii value");
		int input2 = 69;
		System.out.println("Input: --> " + input2 + "\n" + "Output: --> "+ assignment36Program1.getCharOfGivenAscii(input2));
		System.out.println("-------------------------------------------------------");
		
		// Program 6
		System.out.println("Program 6 : Print all characters having ascii value 91 ot 96");
		assignment36Program1.printAllCharFromGivenAscii();
		System.out.println("-------------------------------------------------------");
		
		//Program 7
		String input3 = "aPd%3zZ";
		System.out.println("Program 7: To return String by encrypting all characters from given string by its next character");
		System.out.println("Input: --> " + input3 + "\n" + "Output: --> " + assignment36Program1.getNextChar1(input3));
		System.out.println("-------------------------------------------------------");
	}
}
