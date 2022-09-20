package nikitaPhase;

public class LengthChar {
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
		LengthChar obj = new LengthChar();
		String inputString1 = "Nikita";

		System.out.println("Length of " + inputString1 + " is: " + obj.getNameLength(inputString1));
		System.out.println("Middle character in name " + inputString1 + " is: " + obj.getMiddleChar(inputString1));
		System.out.println("---------------------------------------------");

		String inputString2 = "Technocredits";
		System.out.println("Length of " + inputString2 + " is: " + obj.getNameLength(inputString2));
		System.out.println("Middle character in name " + inputString2 + " is: " + obj.getMiddleChar(inputString2));
	}
}
