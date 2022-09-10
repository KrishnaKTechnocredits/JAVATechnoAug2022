package harshalRane.Tests;

public class MiddleCharOfMaxLength {
	String getMaxLength(String[] input) {
		int maxLength = input[0].length();
		String maxString = input[0];
		for (int index = 1; index < input.length; index++) {
			if (maxLength < input[index].length()) {
				maxLength = input[index].length();
				maxString = input[index];
			}
		}
		return maxString;
	}

	char middleChar(String name) {
		char ch = ' ';
		for (int index = 0; index < name.length(); index++) {
			int arrIndex = 0;
			int length = name.length();
			if (length % 2 == 0) {
				arrIndex = length / 2 - 1;
			} else {
				arrIndex = length / 2;
			}
			ch = name.charAt(arrIndex);
		}
		return ch;
	}

	public static void main(String[] args) {
		MiddleCharOfMaxLength middleCharOfMaxLength = new MiddleCharOfMaxLength();
		String[] str = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String name = middleCharOfMaxLength.getMaxLength(str);
		System.out.println(name);
		char ch = middleCharOfMaxLength.middleChar(name);
		System.out.println(ch);
	}
}
