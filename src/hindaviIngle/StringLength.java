package hindaviIngle;

public class StringLength {

	int getNameLength(String name) {
		int length = name.length();
		return length;

	}

	char getMiddleChar(String name) {
		int index = 0;
		int len = name.length();
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

	}

}
