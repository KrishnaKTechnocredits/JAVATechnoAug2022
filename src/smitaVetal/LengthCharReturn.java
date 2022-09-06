/*// 1. write a method to return length of the given name
//int getNameLength(String name)
//2. return middle character from given name.
//Hint : char getMiddleChar(String name)
//input : Maulik
//output : Middle character in name Maulik is u
//input : Technocredits
//output : Middle character in name Technocredits is c*/

package smitaVetal;

public class LengthCharReturn {

	char getMiddleChar(String str) {
		int length = str.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return str.charAt(index);

	}

	int getNameLength(String str) {

		return (str.length());
	}

	public static void main(String[] args) {
		LengthCharReturn nameLength = new LengthCharReturn();
		int length = nameLength.getNameLength("Smita");
		System.out.println("Length of name  Smita is " + length);

		char name1 = nameLength.getMiddleChar("Techn");
		System.out.println("Middle character in Tech  is " + name1);

		char name2 = nameLength.getMiddleChar("Amol");
		System.out.println("Middle character in Amol  is " + name2);
	}
}
