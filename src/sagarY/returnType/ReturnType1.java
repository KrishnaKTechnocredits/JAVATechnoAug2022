/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c  */

package sagarY.returnType;

public class ReturnType1 {

	int num;

	int getNameLength(String name1) {
		System.out.println("Given String is : " + name1);
		System.out.print("Length of the String " + name1 + " is : ");
		return (name1.length());

	}

	char getMiddleChar(String name) {
		System.out.println("\n\nGiven String is : " + name);
		if (name.length() % 2 != 0) {
			System.out.print("Middle char if the String is : ");
			return (name.charAt(name.length() / 2));
		} else {
			System.out.print("Middle char of the String is: ");
			return (name.charAt(name.length() / 2 - 1));
		}
	}

	public static void main(String[] args) {
		ReturnType1 return1 = new ReturnType1();
		int length = return1.getNameLength("SagarNYadav");
		System.out.print(length);
		char ch = return1.getMiddleChar("SagarYadav");
		System.out.print(ch);
	}
}
