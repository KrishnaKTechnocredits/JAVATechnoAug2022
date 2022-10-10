package saroj.asciiPrograms;

public class Assignment36 {

	int getAsciiOfChar(char ch) {
		int ascii = ch;
		return ascii;
	}

	void printAsciiOfAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int asciiVal = getAsciiOfChar(ch);
			System.out.println(ch + " -> " + asciiVal);
		}
	}

	int getCountOfDigit(String word) {
		int count = 0;
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			int ch1 = ch;
			if (ch1 >= 48 && ch1 <= 57) {
				count++;
			}
		}
		return count;
	}

	char getCharacter(int value) {
		char ch = (char) value;
		return ch;
	}

	void printAllCharAscii() {
		for (int index = 91; index <= 96; index++) {
			char ch = (char) index;
			System.out.println(index + " -> " + ch);
		}
	}

	String getEncryptedResult(String word) {
		String newWord = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch != 'z') {
				ch++;
				newWord = newWord + ch;
			} else {
				ch = 'a';
				newWord = newWord + ch;
			}
		}
		return newWord;
	}

	String getEncryptedString(String word) {
		String newWord = "";
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (ch == 'Z') {
				newWord = newWord + 'A';
			} else if (ch == 'z') {
				newWord = newWord + 'a';
			} else {
				if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
					ch++;
				}
				newWord = newWord + ch;
			}
		}
		return newWord;
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		char ch = 'C';
		int asciiVal = assignment36.getAsciiOfChar(ch);
		System.out.println("Ascii of " + ch + " is: " + asciiVal);
		System.out.println("=======================================");

		System.out.println("Ascii values are:");
		assignment36.printAsciiOfAlphabets();
		System.out.println("==========================================");

		String word = "te1chno2cre4di6ts";
		int count = assignment36.getCountOfDigit(word);
		System.out.println("Count of digit in " + word + " is: " + count);
		System.out.println("===========================================");

		int value = 69;
		char ch1 = assignment36.getCharacter(value);
		System.out.println("Ascii value of " + value + " is: " + ch1);
		System.out.println("============================================");

		assignment36.printAllCharAscii();
		System.out.println("===========================================");

		String str = "apdz";
		String encryptedWord = assignment36.getEncryptedResult(str);
		System.out.println("Encrypted String of " + str + " is: " + encryptedWord);
		System.out.println("===========================================");

		String str1 = "aPd%3zZ";
		String encryptedWord1 = assignment36.getEncryptedString(str1);
		System.out.println("Encrypted String of " + str1 + " is: " + encryptedWord1);
	}
}
