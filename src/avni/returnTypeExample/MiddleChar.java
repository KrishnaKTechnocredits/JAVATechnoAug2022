package avni.returnTypeExample;

public class MiddleChar {

	/*
	 * Program 1 : Return middle character of max length String from given array.
	 * input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"} output : c
	 */
	char getMiddleChar(String str) {
		if (str.length() % 2 != 0)
			return str.charAt(str.length() / 2);
		else
			return str.charAt(str.length() / 2 - 1);
	}

	void printMiddleChar(String[] name) {
		String maxString = "";
		for (int i = 0; i < name.length; i++) {
			if (maxString.length() < name[i].length()) {
				maxString = name[i];
			}
		}
		char ch = getMiddleChar(maxString);
		System.out.println("--->  " + maxString + "'s Middle character  : " + ch);
	}

	/*
	 * Program 2 : Write a method to return middle character of each elements from given array.
	 * input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"} output : Mahesh
	 * -> h Avni -> v Harshal -> s Aditty -> i Rahul -> h
	 */
	char getMiddleChar1(String str) {
		if (str.length() % 2 != 0)
			return str.charAt(str.length() / 2);
		else
			return str.charAt(str.length() / 2 - 1);
	}

	char[] printMiddleChar1(String[] name) {
		int length = name.length;
		char[] midchararr = new char[length];
		for (int i = 0; i < length; i++) {
			midchararr[i] = getMiddleChar1(name[i]);
		}
		return midchararr;
	}

	public static void main(String[] args) {
		MiddleChar middlechar1 = new MiddleChar();

		String[] str = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		middlechar1.printMiddleChar(str);
		
		String[] str1 = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] charArray = middlechar1.printMiddleChar1(str1);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("---> " + str1[i] + "-->" + charArray[i]);
		}
	}
}
