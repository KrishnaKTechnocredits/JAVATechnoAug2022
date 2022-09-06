// 1. write a method to return length of the given name
// int getNameLength(String name)

package maheshSantoki.returnTypeExample;

public class LengthOfString {
	// for find a string length:
	int getNameLength(String str) {
		return (str.length());
	}

	// Return middle character from given name:
	char getMiddleChar(String str) {
		int len = str.length();
		int index = 0;
		if (len % 2 == 0) {
			index = len / 2 - 1;
		} else
			index = len / 2;
		return str.charAt(index);
	}

	public static void main(String[] args) {
		LengthOfString los = new LengthOfString();
		int length = los.getNameLength("Mahesh");
		System.out.println("Length of given string is - " + length);

		System.out.println("Middle character of from given name is - " + los.getMiddleChar("MaheshSantoki"));

		System.out.println("Middle character of from given name is - " + los.getMiddleChar("Gujarati"));
	}
}
