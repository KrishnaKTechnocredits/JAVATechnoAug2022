//In a program, write a method to return length and return middle character from given name.

package komalShrivastava;

public class StringFunctions {

	int getNameLength(String name) {
		int length = name.length();
		System.out.println("Length of name " + name + " is " + length);
		return length;
	}
	
	char getMiddleCharacter(String name) {
		int nameLength = getNameLength(name);
		int charNo = 0;
		if(nameLength%2==0)
			charNo =  nameLength/2 - 1;
		else
			charNo =  nameLength/2;
		char ch = name.charAt(charNo);
		return ch;
	}
	
	public static void main(String[] args) {
		StringFunctions stringFunctions = new StringFunctions();
		String name = "Komirag";
		char middleChar = stringFunctions.getMiddleCharacter(name);
		System.out.println("Middle character in name " + name + " is " + middleChar);
		
		name = "Johnsnow";
		middleChar = stringFunctions.getMiddleCharacter(name);
		System.out.println("Middle character in name " + name + " is " + middleChar);
	}
}