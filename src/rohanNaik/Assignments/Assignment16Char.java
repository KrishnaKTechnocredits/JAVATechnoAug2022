package rohanNaik.Assignments;

public class Assignment16Char {

	char getMiddleChar(String name) {
		String str = name;
		int length = str.length();
		int index = 0;

		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}

		return str.charAt(index);
	}

	int getLength(String name) {
		String str = name;
		return str.length();
	}

	public static void main(String[] args) {
		Assignment16Char assignment = new Assignment16Char();
		int length = assignment.getLength("Technocreditss");
		System.out.println(length);

		Character ch = assignment.getMiddleChar("Maulika");
		System.out.println(ch);
	}

}
