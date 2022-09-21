package jagruti.Assignment18;

public class FrequencyOfCharacter
{
	static int findFrequencyOfCharacter(String input, char targetChar)
	{
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
		System.out.println(FrequencyOfCharacter.findFrequencyOfCharacter("TechnoTtcredits", 't'));
	}

}
