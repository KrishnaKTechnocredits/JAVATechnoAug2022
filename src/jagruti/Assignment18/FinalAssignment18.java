package jagruti.Assignment18;

public class FinalAssignment18 
{
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

	static String rearrangeNewString(String name) {
		String uppercase = "";
		String lowercase = "";
		String digit = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				uppercase = uppercase + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase = lowercase + ch;
			}
		}
		return uppercase + digit + lowercase;
	}
	
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
		System.out.println(FinalAssignment18.isDigit("te2cH4no"));
		System.out.println(FinalAssignment18.rearrangeNewString("t8EcHNo5Cred3iTs"));
		System.out.println(FinalAssignment18.findFrequencyOfCharacter("TechnoTtcredits", 't'));
	}
}
