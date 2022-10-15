package maheshSantoki.ascii;

public class Ascii {
/* Program 1 : WAP to return String by encrypting all characters from given
* string by its next character.
* input : apdz output : bqea*/
	
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
//Program 2 : WAP to return ascii of given character.
	int getAscii(char ch) {
		int x = ch;
		return x;
	}

//Program 3 : WAP to print ascii value of A->Z.	
	int getCountofDigits(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57)
				count++;
		}
		return count;
	}
//Program 4 :Return count of digits from given String without using isDigit method of Character class..
	char getCharacter(int num) {
		char ch = (char) num;
		return ch;
	}
	public static void main(String[] args) {
		Ascii asciival = new Ascii();
		
		String input1 = "abdz";
		System.out.println("Program 1 : Encrypting all characters by its next character \nInput : " + input1);
		System.out.println("Output : " + asciival.getNextChar(input1));
		System.out.println();

		char ch = '9';
		System.out.println("Program 2 : Ascii of given character \nInput : " + ch);
		System.out.println(asciival.getAscii(ch));
		
		System.out.println("\nProgram 3 : Ascii value of A to Z");
		for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			System.out.println(ch1 + "-->" + asciival.getAscii(ch1));
		}
		
		String input2 = "te1chno2cre4di6ts";
		System.out.println("\nProgram 4 : Count of digits in given String \nInput : " + input2);
		System.out.println("Output : " + asciival.getCountofDigits(input2));
		
		int num = 69;
		System.out.println("\nProgram 5 : Return character holding given Ascii value \nInput : " + num);
		System.out.println("Output : " + asciival.getCharacter(num));
		
		System.out.println("\nProgram 6 : Print all characters having ascii value 91 to 96");
		for (int ascii = 91; ascii <= 96; ascii++) {
			System.out.println(ascii + "-->" + asciival.getCharacter(ascii));
		}
		
		String input3 = "aPd%3zZ";
		System.out.println("\nProgram 7 : return String by encrypting all characters from given string by its next character \nInput : " + input3);
		System.out.println(asciival.getNextChar(input3));
	}
}
