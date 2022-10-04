package harshalRane.Assignments.assignment18_rearrangeFrequency;

public class Assignment18FindFrequencyOfChar {
	static int findFrequencyOfLetter(String input, char targetChar) {
		int count = 0;
		input = input.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(Assignment18FindFrequencyOfChar.findFrequencyOfLetter("TechnoTtcredits", 't'));
	}
}
