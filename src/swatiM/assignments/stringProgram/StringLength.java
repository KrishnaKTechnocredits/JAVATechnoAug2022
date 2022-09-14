// 1. write a method to return length of the given name
// int getNameLength(String name)

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
/*
 * Note : 
Method name convention:  

1.int getNameLength(String name) : if method is returning any value except boolean, method name should start with get
2. boolean isPrimeNumber() : if method is returning boolean value, name should start with is
3. display() : if method is not returning anything, any name would be ok but dont just start it with get or is.
4. printInfo() : if method is prininting something, we can start method name with print keyword.
 */

package swatiM.assignments.stringProgram;

public class StringLength {

	int getNameLength(String name) {
		int length = name.length();
		return length;

	}

	char getMiddleChar(String name) {
		int index = 0;
		int len = getNameLength(name);
		if (len % 2 == 0) {
			index = len / 2 - 1;
		} else {
			index = len / 2;
		}
		return name.charAt(index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringLength stringlength = new StringLength();
		int length = stringlength.getNameLength("Technocredits");
		System.out.println("Length of string is : " + length);
		char ch = stringlength.getMiddleChar("Technocredits");
		System.out.println("Middle character in name Technocredits is " + ch);
		length = stringlength.getNameLength("Swati");
		System.out.println("Length of string is : " + length);
		ch = stringlength.getMiddleChar("Swati");
		System.out.println("Middle character in name Swati is " + ch);

	}
}
