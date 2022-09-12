package shivaniGour;

public class Assignment18 {

	String rearrangeStringDigitsChar(String name) {
		String digitStr = "", charStr = "";

		for (int i = 0; i <= name.length() - 1; i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
			} else {
				charStr = charStr + ch;
			}
		}
		return digitStr + charStr;
	}

	String rearrangeString(String name) {
		String digitStr = "", upperStr = "", lowerStr = "";

		for (int i = 0; i <= name.length() - 1; i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerStr = lowerStr + ch;
			} else if (Character.isUpperCase(ch)) {
				upperStr = upperStr + ch;
			}
		}
		return upperStr + digitStr + lowerStr;
	}

	int frequencyOfChar(String name, char targetChar) {
		int count = 0;
		name = name.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		for (int i = 0; i <= name.length() - 1; i++) {
			char ch = name.charAt(i);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment18 var = new Assignment18();
		String name = "gEt354Kje31Ie8";
		char charVar = 'E';
		System.out.println("AllDigitAllChar: " + var.rearrangeStringDigitsChar(name));
		System.out.println("UpperDigitLower: " + var.rearrangeString(name));
		System.out.println("Frequency of character "+charVar+": " + var.frequencyOfChar(name,charVar));
	}
}
