package nehaniG;

public class Assignment36 {
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
		System.out.println("Program 2:Ascii of given character is" + ch + "-->" + ascii);

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
		System.out.println(value + " is - " + ch);
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		String input1 = "apdz";
		System.out.println("Program 1:Output of " + input1 + " is: " + assignment36.getNextCharacter(input1));

		assignment36.getAsciiOfGivenCharacter('C');

		System.out.println("Program 3:Ascii for all the Character is");
		assignment36.getAsciiOfAllCharacters();

		String input2 = "te1chno2cre4di6ts";
		System.out.println("Program 4:Count of " + input2 + " is: " + assignment36.getCountOfDigit(input2));

		System.out.println("Program 5:");
		int input4 = 69;
		assignment36.getCharacterOfAscii(input4);

		System.out.println("Program 6:Ascii value in given range (91 to 96)");
		for (int value = 91; value <= 96; value++) {
			assignment36.getCharacterOfAscii(value);

		}
		String input3 = "aPd%3zZ";
		System.out.println("Program 7:Output of " + input3 + " is: " + assignment36.getNextCharacter(input3));

	}

}
