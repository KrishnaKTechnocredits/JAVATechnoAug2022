/* 1. write a method to return length of the given name
 int getNameLength(String name)

2. return middle character from given name.
 Hint : char getMiddleChar(String name)

 input : Maulik
 output : Middle character in name Maulik is u

 input : Technocredits
 output : Middle character in name Technocredits is c
*/
package ankitaBarwad;

public class StringLengthExample {

	int getStringLength(String name) {
		return name.length();
	}

	char getMiddleChar(String name) {
		int index = 0;
		int length = name.length();
		if (name.length() % 2 == 0) {
			index = length / 2 - 1;
		} else
			index = length / 2;
		return name.charAt(index);
	}

	public static void main(String[] args) {
		char middleChar;
		int strLength;

		String string1 = "Dedication";
		StringLengthExample stringLengthex1 = new StringLengthExample();
		strLength = stringLengthex1.getStringLength(string1);
		middleChar = stringLengthex1.getMiddleChar(string1);
		System.out.println("String = '" + string1 + "', Length = " + strLength + " & Middle character = " + middleChar + "\n");

		String string2 = "Opportunity";
		StringLengthExample stringLengthex2 = new StringLengthExample();
		strLength = stringLengthex2.getStringLength(string2);
		middleChar = stringLengthex2.getMiddleChar(string2);
		System.out.println("String = '" + string2 + "', Length = " + strLength + " & Middle character = " + middleChar + "\n");
	}
}
