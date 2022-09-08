/*Assignment - 16 : 6th Sep'2022
1. write a method to return length of the given name
 int getNameLength(String name)
2. return middle character from given name.
 Hint : char getMiddleChar(String name)
input : Maulik
output : Middle character in name Maulik is u
input : Technocredits
output : Middle character in name Technocredits is c  */

package pranjaliV.assignment16;


public class MiddleChar {
	
	int getNameLength(String name) {
		int length = name.length();
		return length;
	}
	
	char getMiddleChar(String name) {
		char letter;
		int len = getNameLength(name);
		if(len%2==0) {
			letter = name.charAt((len/2)-1);
			return letter;
		}
		else {
			letter = name.charAt(len/2);
			return letter;
		}
			
	}
	
	void printInfo(String name) {
		char letter = getMiddleChar(name);
		System.out.println("Middle character in name "+ name +" is : "+ letter);
	}	
	
	
	public static void main(String[] args) {
		MiddleChar middleChar = new MiddleChar();
		middleChar.printInfo("Maulik");
		middleChar.printInfo("Technocredits");
	}
}
