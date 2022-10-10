/*
Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
*/
package nilamP.assignment1to16;

public class Assignment16 {
	int getNameLength(String name) {
		int length = name.length();
		return length;
	}

	char getMiddleChar(String name) {
		int index = 0;
		int length = getNameLength(name);

		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = name.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		Assignment16 a = new Assignment16();
		System.out.println("Assignment 16 output : ");
		String inputString1 = "Nilam";

		System.out.println("Length of " + inputString1 + " is: " + a.getNameLength(inputString1));
		System.out.println("Middle character in name " + inputString1 + " is: " + a.getMiddleChar(inputString1));

		String inputString2 = "Technocredits";
		System.out.println("Length of " + inputString2 + " is: " + a.getNameLength(inputString2));
		System.out.println("Middle character in name " + inputString2 + " is: " + a.getMiddleChar(inputString2));
	}
}
