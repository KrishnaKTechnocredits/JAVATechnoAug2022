//Assignment 36 : 09 Oct 2022

package komalShrivastava;

public class AsciiGames {

	// method to return String by encrypting all characters from given string by its next character

	String getNextChar(String str) {
		String outStr = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z')
				outStr = outStr + String.valueOf('a');
			else if (ch == 'Z')
				outStr = outStr + String.valueOf('A');
			else {
				if (ch >= 97 && ch <= 121 || ch >= 65 && ch <= 90)
					ch++;
				outStr = outStr + String.valueOf(ch);
			}
		}
		return outStr;
	}

	// method to return ascii of given character

	int getAscii(char ch) {
		int x = ch;
		return x;
	}

	// method to return count of digits from given String

	int getCountofDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57)
				count++;
		}
		return count;
	}

	// return character holding given Ascii value

	char getCharacter(int num) {
		char ch = (char) num;
		return ch;
	}

	public static void main(String[] args) {
		AsciiGames asciiGames = new AsciiGames();

		// return String by encrypting all characters from given string by its next
		// character
		String input1 = "abdz";
		System.out.println("Program 1 : Encrypting all characters by its next character \nInput : " + input1);
		System.out.println("Output : " + asciiGames.getNextChar(input1));
		System.out.println();

		// return ascii of given character
		char ch = '9';
		System.out.println("Program 2 : Ascii of given character \nInput : " + ch);
		System.out.println(asciiGames.getAscii(ch));

		// print ascii value of A->Z
		System.out.println("\nProgram 3 : Ascii value of A to Z");
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			System.out.println(ch1 + "-->" + asciiGames.getAscii(ch1));
		}

		// return count of digits from given String
		String input2 = "te1chno2cre4di6ts";
		System.out.println("\nProgram 4 : Count of digits in given String \nInput : " + input2);
		System.out.println("Output : " + asciiGames.getCountofDigits(input2));

		// return character holding given Ascii value
		int num = 69;
		System.out.println("\nProgram 5 : Return character holding given Ascii value \nInput : " + num);
		System.out.println("Output : " + asciiGames.getCharacter(num));

		// print all characters having ascii value 91 to 96
		System.out.println("\nProgram 6 : Print all characters having ascii value 91 to 96");
		for (int ascii = 91; ascii <= 96; ascii++) {
			System.out.println(ascii + "-->" + asciiGames.getCharacter(ascii));
		}

		// return String by encrypting all characters from given string by its next
		// character

		String input3 = "aPd%3zZ";
		System.out.println("\nProgram 7 : return String by encrypting all characters from given string by its next character \nInput : " + input3);
		System.out.println(asciiGames.getNextChar(input3));
	}
}