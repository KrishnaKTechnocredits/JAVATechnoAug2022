package harshalRane.Assignments.assignment18_rearrangeFrequency;

public class Assignment18RearrangeString2 {
	static String RearrangeLetterDigit(String name) {
		String upper = "";
		String lower = "";
		String digit = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				upper = upper + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLowerCase(ch)) {
				lower = lower + ch;
			}
		}
		return upper + digit + lower;
	}

	public static void main(String[] args) {
		System.out.println(Assignment18RearrangeString2.RearrangeLetterDigit("t8EcHNo5Cred3iTs"));
	}
}
