
// 1. write a method to return length of the given name
// int getNameLength(String name)

package sohail.prime_number;

public class LengthReturn {
	int getNameLength(String n) {
		int stringlength = n.length();
		System.out.println("Length of the String is "+stringlength);
		return stringlength;
	}

	public static void main(String[] args) {
		LengthReturn lengthreturn = new LengthReturn();
		lengthreturn.getNameLength("Technocredits");
	}
}
