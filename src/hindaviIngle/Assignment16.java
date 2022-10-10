/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
*/
package hindaviIngle;

public class Assignment16 {

	int getNameLength(String name) {
		int length = name.length();
		return length;

	}

	char getMiddleChar(String name) {
		int index = 0;
		int len = name.length();
		if (len % 2 == 0) {
			index = len / 2 - 1;
		} else {
			index = len / 2;
		}
		return name.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment16 stringlength = new Assignment16();
		int length = stringlength.getNameLength("Technocredits");
		System.out.println("Length of string is : " + length);
		char ch = stringlength.getMiddleChar("Technocredits");
		System.out.println("Middle character in name Technocredits is " + ch);

	}

}
