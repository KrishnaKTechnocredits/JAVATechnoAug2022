package sagarY.Arrays;

public class ArrayReturn {

	char getMiddleChar(String name) {
		char ch = ' ';

		if (name.length() % 2 == 0)
			System.out.println("Middle character of the string is: " + name.charAt(name.length() / 2 - 1));
		else
			System.out.println("Middle character of the string is: " + name.charAt(name.length() / 2));

		return ch;
	}

	String maxLengthName(String[] name) {

		int stringLength = name[0].length();
		String maxLengthName = "";

		for (int index = 1; index < name.length; index++) {
			if (stringLength < name[index].length()) {
				stringLength = name[index].length();
				maxLengthName = name[index];

			}
		}
		System.out.println("Maximum Length String is: " + maxLengthName);
		return maxLengthName;
	}

	public static void main(String[] args) {
		String[] name = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String str = new ArrayReturn().maxLengthName(name);
		char ch = new ArrayReturn().getMiddleChar(str);
	}

}
