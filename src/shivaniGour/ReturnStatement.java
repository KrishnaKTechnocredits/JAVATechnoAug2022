package shivaniGour;

public class ReturnStatement {
	int strLength;

	int getNameLength(String name) {
		strLength = name.length();
		return strLength;
	}

	char getMiddleChar(String name) {
		int midIndex;
		char midChar = ' ';

		strLength = name.length();
		midIndex = strLength / 2;

		if (strLength % 2 == 0) {
			midChar = name.charAt(midIndex - 1);
		} else {
			midChar = name.charAt(midIndex);
		}
		return midChar;
	}

	public static void main(String[] args) {
		ReturnStatement var = new ReturnStatement();
		String name1 = "Maulik";
		System.out.println("Length of Name " + name1 + " is: " + var.getNameLength(name1));
		System.out.println("Mid Character of Name " + name1 + " is: " + var.getMiddleChar(name1));
		String name2 = "Technocredits";
		System.out.println("Length of Name " + name2 + " is: " + var.getNameLength(name2));
		System.out.println("Mid Character of Name " + name2 + " is: " + var.getMiddleChar(name2));
	}

}
