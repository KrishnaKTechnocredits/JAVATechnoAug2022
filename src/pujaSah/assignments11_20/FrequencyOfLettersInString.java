package pujaSah.assignments11_20;

public class FrequencyOfLettersInString {

	int getFrequencyOfChar(String input, char ch) {
		input = input.toLowerCase();
		int length = input.length();
		int count = 0;
		for (int i = 0; i <= length - 1; i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "TechnoTtcredits";
		char ch = 't';
		System.out.println("Frequency of letter " + ch + " in " + str + " is "
				+ new FrequencyOfLettersInString().getFrequencyOfChar(str, ch));
	}
}
