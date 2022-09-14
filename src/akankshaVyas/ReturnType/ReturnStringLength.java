/*
	1.int getNameLength(String name) : if method is returning any value except boolean, method name should start with get
	2. boolean isPrimeNumber() : if method is returning boolean value, name should start with is
	3. display() : if method is not returning anything, any name would be ok but dont just start it with get or is.
	4. printInfo() : if method is prininting something, we can start method name with print keyword.

	// 1. write a method to return length of the given name
	// int getNameLength(String name)


	//2. return middle character from given name.
	// Hint : char getMiddleChar(String name)

	// input : Maulik
	// output : Middle character in name Maulik is u

	// input : Technocredits
	// output : Middle character in name Technocredits is c

	*/

package akankshaVyas.ReturnType;

public class ReturnStringLength {

	int getStringLength(String str) {
		int len = str.length();
		return len;
	}
	
	char getMiddleChar(String name) {
		
		int index = 0;
		if (name.length() % 2 == 0) {
			index = ((name.length() / 2) - 1);
		} else {
			index = (name.length() / 2);
		}
		char mid = (name.charAt(index));
		return mid;
	}

	public static void main(String[] args) {
		ReturnStringLength returnStringLength = new ReturnStringLength();

		String name = "Maulik";
		int length = returnStringLength.getStringLength(name);
		char middleChar = returnStringLength.getMiddleChar(name);
		System.out.println(
				" The middle char of string name " + name + " is- " + middleChar + " and string length is " + length);

		name = "Technocredits";
		length = returnStringLength.getStringLength(name);
		middleChar = returnStringLength.getMiddleChar(name);
		System.out.println(		" The middle char of string name " + name + " is- " + middleChar + " and string length is " + length);

	}
}
