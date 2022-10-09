package vibhaS.Assignment;

public class Assignment36 {

	// WAp to print ascii value of A->Z
	void m1(char ch1, char ch2) {
		for (char ch = ch1; ch <= ch2; ch++) {
			System.out.println((int) ch + " is ascii value " + ch);
		}
	}

	// WAp to return String by encrypting all character From given string by its
	// next character
	String getAllNextChar(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z') {
				ch = 'a';
				output = output + ch;
			} else {
				ch++;
				output = output + ch;
			}
		}
		return output;
	}

	// WAp to return ascii of given character
	void printAscii(char ch) {
		int ascii = ch;
		System.out.println("Ascii value is => " + ascii);
	}

	// Return count of digit from given String
	int getCountOfDigit(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	// return character holding given ascii value
	char getCharOfAscii(int x) {
		char ch = (char) x;
		return ch;
	}

	// Print all character having ascii value 91 to 96
	void printAsciiInRange(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i + "  ascii char is => " + (char) i);
		}
	}

	// WAP to return String by encrypted all character from given string its next
	// character
	String getNextString(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '%') {
				output = output + ch;
			} else if (ch == '3') {
				output = output + ch;
			} else if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else {
				ch++;
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		assignment36.m1('A', 'Z');
		System.out.println("");
		String ans = assignment36.getAllNextChar("apdz");
		System.out.println("Output String is " + ans);
		System.out.println("");
		assignment36.printAscii('C');
		System.out.println("");
		int count = assignment36.getCountOfDigit("te1chno2cre4di6ts");
		System.out.println("Digit count in String is =>" + count);
		System.out.println("");
		char ch = assignment36.getCharOfAscii(69);
		System.out.println(" Char of acsii 69 is " + ch);
		System.out.println("");
		assignment36.printAsciiInRange(91, 96);
		System.out.println("");
		String str1 = "aPd%3zZ";
		String ans1 = assignment36.getNextString(str1);
		System.out.println("output is => " + ans1);
	}
}
