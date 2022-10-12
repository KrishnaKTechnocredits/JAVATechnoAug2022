package nilamP;



public class StringOperations6 {
	String getNexrChar(String name) {
		System.out.println("Input : " + name);
		String output = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'z') {
				output = output + 'a';
			} else {
				ch++;
				output = output + ch;
			}
		}
		return output;
	}

	int getAsciiValue(char ch) {
		int ascii = ch;
		return ascii;
	}

	void display(char ch) {
		System.out.println("ASCII value of " + ch + " : " + getAsciiValue(ch));
	}

	void AsciiValue() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int ascii = ch;
			System.out.println(" ASCII value of " + ch + " : " + ascii);
		}
	}

	int getCountOfDigits(String input) {
		int count = 0;
		System.out.println("input : " + input);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 48 && ch <= 57) {
				count++;
			}
		}
		return count;
	}

	char getAsciiChar(int num) {
		return (char) num;
	}

	void PrintAscciChar() {
		for (int i = 91; i <= 96; i++) {
						System.out.println(i + " : " +getAsciiChar(i));
		}
	}

	String getAllNextChar(String input) {
		String output = "";
		System.out.println("input : "+input);
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if (ch== 'Z') {
				output = output + 'A';
			}
			else if (ch == 'z') {
				output = output + 'a';
			}else if ((ch>=65 && ch<=90) || (ch>=97 && ch<122)) {
				output = output + (char)(ch+1);
			}
			else {
				output = output + (char)ch;
			}
			
		}
		return output;
		
	}
	public static void main(String[] args) {
		StringOperations6 so = new StringOperations6();
		System.out.println("** program 1 output ** ");
		String output = so.getNexrChar("apdz");
		System.out.println("output : " + output);
		System.out.println("** program 2 output ** ");
		so.display('C');
		System.out.println("** program 3 output  ** ");
		so.AsciiValue();
		System.out.println("** program 4 output ** ");
		int output1 = so.getCountOfDigits(" te1chno2cre4di6ts ");
		System.out.println("No of Digits : " + output1);
		System.out.println("** program 5 output  **");
		int input = 69;
		System.out.println("input : " + input + "\n" + "output : " + so.getAsciiChar(input));
		System.out.println("** program 6 output  **");
		so.PrintAscciChar();
		System.out.println("** program 7 output  **");
		System.out.println("output : "+so.getAllNextChar(" aPd%3zZ"));
	}
}
