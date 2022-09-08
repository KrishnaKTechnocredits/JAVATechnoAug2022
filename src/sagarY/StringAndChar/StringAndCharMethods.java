package sagarY.StringAndChar;

public class StringAndCharMethods {

	String AllDigitAllCharacters(String str) {
		System.out.println("Given String is: " + str);
		String tempLetter = "";
		String tempDigit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch))
				tempLetter = tempLetter + ch;
			else if (Character.isDigit(ch))
				tempDigit = tempDigit + ch;

		}
		return tempDigit + tempLetter;

	}

	String upperAndLowerStrings(String str) {
		System.out.println("\nGiven String is: " + str);
		String upperCase = "";
		String lowerCase = "";
		String tempDigit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					upperCase = upperCase + ch;
				else if (Character.isLowerCase(ch)) {
					lowerCase = lowerCase + ch;
				}

			} else if (Character.isDigit(ch))
				tempDigit = tempDigit + ch;

		}
		return upperCase + tempDigit + lowerCase;

	}

	int getCountOfTargetChar(String str, char targetChar) {
		int count1 = 0;
		System.out.println("\nGiven String is: " + str);
		str = str.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetChar) {
				count1++;
			}

		}
		return count1;
	}

	public static void main(String[] args) {
		String output = new StringAndCharMethods().AllDigitAllCharacters("te2cH4no");
		System.out.println("Output in format of AllDigitAllCharacter is: " + output);
		String output1 = new StringAndCharMethods().upperAndLowerStrings("t8EcHNo5Cred3iTs");
		System.out.println("Output in format of Uppercase letters + digits + LowerCase letter is: " + output1);
		int output2 = new StringAndCharMethods().getCountOfTargetChar("TechnoTtcredits", 'T');
		System.out.println("Frequency of 'T/t' in given string is: " + output2);
	}
}
