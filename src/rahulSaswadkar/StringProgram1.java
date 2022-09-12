/*
 * Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)
// boolean isPrimeNumber()
// display()
// printInfo()

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is cpackage rahulSaswadkar;
 */
package rahulSaswadkar;

public class StringProgram1 {
	public static void main(String[] args) {
		StringProgram1 stringProgram1 = new StringProgram1();
		
		String str = "Maulik";
		String str1 = "Technocredits";
		
		int nameLen = stringProgram1.getNameLength(str);
		System.out.println("Length of Name " + str + " is : " + nameLen);
		
		char firstChar = stringProgram1.getFirstChar(str);
		System.out.println("First Character of Name " + str + " is : " + firstChar);
		
		char middleChar = stringProgram1.getMiddleChar(str);
		System.out.println("Middle Character of Name " + str + " is : " + middleChar);
		
		char middleChar1 = stringProgram1.getMiddleChar(str1);
		System.out.println("Middle Character of Name " + str1 + " is : " + middleChar1);
		
	}
	
	int getNameLength(String str) {
		int nameLength = str.length();
		return nameLength;
	}
	
	char getFirstChar(String str) {
		char firstCh = str.charAt(0);
		return firstCh;
	}
	
	char getMiddleChar(String str) {
		int nameLength = str.length();
		char middleCh = 0;
			if(nameLength % 2 != 0) {
				middleCh = str.charAt(nameLength/2);
			}else {
				middleCh = str.charAt(nameLength/2 - 1);
			}
			return middleCh;
	}
}
