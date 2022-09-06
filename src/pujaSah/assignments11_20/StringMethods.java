package pujaSah.assignments11_20;

public class StringMethods {

	int getLength(String name) {
		String str = name;
		int length = str.length();
		return length;
	}

	int getIndex(int length) {
		int index = 0;
		if (length % 2 == 0) {
			index = (length / 2) - 1;
		} else {
			index = (length / 2);
		}
		return index;
	}

	char getMiddleChar(String name) {
		String str = name;
		int length = getLength(name);
		int index = getIndex(length);
		char middleChar = str.charAt(index);
		return middleChar;
	}

	public static void main(String[] args) {
		StringMethods str = new StringMethods();
		String name1 = "Krishna";

		char ch1 = str.getMiddleChar(name1);
		char ch2 = str.getMiddleChar("Maulik");
		char ch3 = str.getMiddleChar("Technocredits");

		System.out.println("Middle character in the name " + name1 + " is " + ch1);
		System.out.println("Middle character in the name Maulik is " + ch2);
		System.out.println("Middle character in the name Technocredits is " + ch3);
		System.out.println("Middle character in the name Puja Sah is " + str.getMiddleChar("Puja Sah"));

	}
}
