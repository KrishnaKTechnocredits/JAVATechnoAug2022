package nehaniG;

public class NameOperation {

	int getNameLength(String name) {
		return name.length();
	}

	char getMiddleChar(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	void GetNameOperations(String str) {
		int strLength = getNameLength(str);
		System.out.println("Length of given input string : " + strLength);

		char middleChar = getMiddleChar(str);
		System.out.println("Middle character in name " + str + " is " + middleChar);
	}

	public static void main(String[] args) {
		NameOperation nameOperation = new NameOperation();

		nameOperation.GetNameOperations("Maulik");
		nameOperation.GetNameOperations("Technocredits");
	}
}
