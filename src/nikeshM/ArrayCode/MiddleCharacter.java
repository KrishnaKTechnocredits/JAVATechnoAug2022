package nikeshM.ArrayCode;

public class MiddleCharacter {
	
	char getMiddleCharacter(String name) {
		int length = name.length();
		char ch = 2;
		if (length % 2 == 0) {
			length = length / 2 - 1;
			}
		else {
			length = length/2;
		}
		ch = name.charAt(length);
		return ch;
	}

	void printMiddleCharacterArray(String[] name) {
		for (int index = 0; index < name.length; index++) {
			char ch = getMiddleCharacter(name[index]);
			System.out.println(name[index] + ":" + ch);
		}

	}

	public static void main(String[] args) {
		MiddleCharacter character = new MiddleCharacter();
		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita","technocredits" };
		character.printMiddleCharacterArray(input);
	}
}
