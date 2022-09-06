package harshalRane.practise;

public class ReturnEx1 {
	static int getLength(String name) {
		int length = name.length();
		return length;
	}

	static char getIndex(String name) {
		int index = 0;
		int length = getLength(name);

		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = name.charAt(index);
		return ch;
	}

	public static void main(String[] args) {
		String name = "Maulik";
		String name1 = "Technocredits";

		System.out.println("Length of " + name + " is: " + ReturnEx1.getLength(name));
		System.out.println("Middle Character in " + name + " is: " + ReturnEx1.getIndex(name));
		System.out.println("-----------------------------------");

		System.out.println("Length of " + name1 + " is: " + ReturnEx1.getLength(name1));
		System.out.println("Middle Character in " + name1 + " is: " + ReturnEx1.getIndex(name1));

	}
}
