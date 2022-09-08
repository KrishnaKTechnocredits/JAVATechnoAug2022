package harshalRane.Assignments.assignment18_rearrangeFrequency;

public class Assignment18RearrangeString {
	static String isDigit(String name) {
		String letter = "";
		String digit = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				letter = letter + ch;
			}
		}
		return digit + letter;
	}

	public static void main(String[] args) {
		System.out.println(Assignment18RearrangeString.isDigit("te2ch4no"));
	}

}