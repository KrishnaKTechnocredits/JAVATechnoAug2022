package deepakBorse.Assignments;

public class Assignment36 {
// Program 1 : WAP to return String by encrypting all characters from given
	// string by its next character.
	String getencrypt(String str) {
		String encrypt = "";
		System.out.println("Encryption all character with next character of String '" + str + "' is: ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'z') {
				ch = 'a';
			} else {
				ch++;
			}
			encrypt = encrypt + ch;
		}
		return encrypt;
	}

//Program 2 : WAP to return ascii of given character. 
	int getascii(char ch) {
		int asci = (int) (ch);
		System.out.println(ch + " -> " + asci);
		return asci;
	}

//Program 3 : WAP to print ascii value of A->Z.   
	void printAtoZasci() {
		char ch = ' ';
		System.out.println("Ascii value from A->Z : ");
		for (ch = 'A'; ch <= 'Z'; ch++) {
			getascii(ch);
		}
	}

//Program 4 :Return count of digits from given String without using isDigit method of Character class..
	int getdigicount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int asci = (int) (ch);
			if (asci >= 48 && asci <= 57) {
				count++;
			}
		}
		return count;
	}

//Program 5 :Return character holding given Ascii value. 
	char getcharfromasci(int input) {
		char ch = (char) (input);
		System.out.println(input + " -> " + ch);
		return ch;
	}

// Program 6 : Print all characters having ascii value 91 to 96.
	void printA91to96asci() {
		int ascii = 0;
		System.out.println("Character which having ASCII from 91 to 96: ");
		for (ascii = 91; ascii <= 96; ascii++) {
			getcharfromasci(ascii);
		}
	}

//Program 7 : WAP to return String by encrypting all characters from given string by its next character.
	String getencryptallchar(String str) {
		String encryptstr = " ";
		System.out.println("Encryption all character with next character of String '" + str + "' is: ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				ch = 'A';
			} else if (ch == 'z') {
				ch = 'a';
			} else {
				if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
					ch++;
			}
			encryptstr = encryptstr + ch;
		}
		return (encryptstr);
	}

	public static void main(String[] args) {
		Assignment36 ascii = new Assignment36();
		System.out.println(ascii.getencrypt("apdz"));
		System.out.println("Ascii of given character : ");
		ascii.getascii('a');
		ascii.printAtoZasci();
		ascii.getcharfromasci(69);
		System.out.println("Digit Count from String :" + ascii.getdigicount("te1chno2cre4di6ts"));
		ascii.printA91to96asci();
		System.out.println(ascii.getencryptallchar("aPd%3zZ"));
	}
}