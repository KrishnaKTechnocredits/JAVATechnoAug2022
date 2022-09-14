package saroj.stringPrograms;

public class NameLength {

	int length;
	char ch;

	int getNameLength(String name) {
		length = name.length();
		return length;
	}

	char getMiddleChar(String name) {
		int index;
		int length = getNameLength(name);
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		ch = name.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		NameLength nameLength = new NameLength();
		String name1 = "saroj";
		System.out.println("Length of " + name1 + " is: " + nameLength.getNameLength(name1));
		System.out.println("Middle character of " + name1 + " is: " + nameLength.getMiddleChar(name1));
		System.out.println("--------------------------------------------------------");
		String name2 = "Technocredits";
		System.out.println("Length of " + name2 + " is: " + nameLength.getNameLength(name2));
		System.out.println("Middle character of " + name2 + " is: " + nameLength.getMiddleChar(name2));
	}
}
