package harshalRane.Assignments.assignment18_rearrangeFrequency;

public class Assignment18FindFrequencyOfChar {
	static int FindFrequencyOfLetter(String input, char targetChar) {
		int count = 0;
		input = input.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 't') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(Assignment18FindFrequencyOfChar.FindFrequencyOfLetter("TechnoTtcredits", 't'));
	}
}
