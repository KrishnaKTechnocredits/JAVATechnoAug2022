/*// 1. write a method to return length of the given name
// int getNameLength(String name)

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c*/
package asthaSrivastava;

public class GetNameLength {

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
		GetNameLength nameLength = new GetNameLength();
		int length = nameLength.getNameLength("Maulik");
		System.out.println("Length of name  Maulik is " + length);

		char name1 = nameLength.getMiddleChar("Technocredits");
		System.out.println("Middle character in Technocredits  is " + name1);

		char name2 = nameLength.getMiddleChar("Maulik");
		System.out.println("Middle character in Maulik  is " + name2);
	}
}
