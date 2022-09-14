/*
 * Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c*/

package anujaD;

public class ReturnTypeEx1 {
	String name;
	int length;

	int getNameLength(String name) {
		length = name.length();

		return length;

	}

	char getMiddleChar(String name) {
		int Index = 0;
		int length = getNameLength(name);
		if (Index % 2 == 0) {
			Index = length / 2 - 1;
		} else {
			Index = length / 2;
		}
		return name.charAt(2);

	}

	public static void main(String[] args) {
		ReturnTypeEx1 namelength = new ReturnTypeEx1();
		String str1 = "Anuja";
		System.out.println("Length of " + str1 + " is: " + namelength.getNameLength(str1));
		String str2 = "Technocredits";
		String str3 = "Anuja";
		System.out.println("Middle char of " + str2 + " is: " + namelength.getMiddleChar(str2));
		System.out.println("Middle char of " + str3 + " is: " + namelength.getMiddleChar(str3));

	}

}
