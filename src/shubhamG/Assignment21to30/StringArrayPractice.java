package shubhamG.Assignment21to30;

public class StringArrayPractice {

	String getMaxLengthWord(String input) {
		String[] str = input.split(" ");
		String str1 = str[0];
		int maxLength = str[0].length();
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() > maxLength) {
				maxLength = str[i].length();
				str1 = str[i];
			}
		}
		return str1;
	}

	boolean isStringContainsDigit(String input) {
		String[] str = input.split(" ");
		boolean isDigit = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				isDigit = true;
			}
		}
		return isDigit;
	}

	void stringWithAtleastOneDigit(String input) {
		String[] str = input.split(" ");
		for (int i = 0; i < str.length; i++) {
			boolean flag = isStringContainsDigit(str[i]);
			if (flag) {
				System.out.println(str[i]);
			}
		}
	}

	String getWordWithMaxUpperCaseLetter(String input) {
		String[] str = input.split(" ");
		int maxDigit = 0;
		String str1 = "";
		for (int i = 0; i < str.length; i++) {
			int count = 0;
			for (int j = 0; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if (Character.isUpperCase(ch)) {
					count++;
				}
			}
			if (maxDigit < count) {
				maxDigit = count;
				str1 = str[i];
			}
		}
		return str1;
	}

	boolean isStringContainsDigitAndUpperCase(String input) {
		String[] str = input.split(" ");
		boolean isDigitAndUpperCase = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) || Character.isUpperCase(ch)) {
				isDigitAndUpperCase = true;
			}
		}
		return isDigitAndUpperCase;
	}
	
	void stringWithoutDigitAndUpperCase(String input) {
		String[] str = input.split(" ");
		for (int i = 0; i < str.length; i++) {
			boolean flag = isStringContainsDigitAndUpperCase(str[i]);
			if (flag==false) {
				System.out.println(str[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		StringArrayPractice arrayPractice = new StringArrayPractice();

		String input = "Good morning friends this is technocredits";
		System.out.println("Given Input String is :" + input);
		System.out.println("Word with max length is: " + arrayPractice.getMaxLengthWord(input));

		String input1 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("\nGiven Input String is :" + input1);
		System.out.println("Words which contains atleast one digit are-  ");
		arrayPractice.stringWithAtleastOneDigit(input1);

		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("\nGiven Input String is :" + input3);
		System.out.println(
				"Word with max Uppercase Character  is: " + arrayPractice.getWordWithMaxUpperCaseLetter(input3));

		String input4= "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("\nGiven Input String is :" + input4);
		System.out.println("Words which does not contains digit and UpperCase letters are: ");
		arrayPractice.stringWithoutDigitAndUpperCase(input4);
	}

}
