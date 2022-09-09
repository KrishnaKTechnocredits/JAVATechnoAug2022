package shubhamG.Assignment11to20;

public class StringPractice2 {

	String getStringInRearrangeFormat(String str) {
		String numeric = "";
		String letters = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				numeric = numeric + str.charAt(i);
			else
				letters = letters + str.charAt(i);
		}
		String finalString = numeric + letters;
		return finalString;
	}

	String getStringInRequiredFormat(String str) {
		String numeric = "";
		String upperCase = "";
		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				numeric = numeric + str.charAt(i);
			else if (Character.isUpperCase(ch))
				upperCase = upperCase + str.charAt(i);
			else
				lowerCase = lowerCase + str.charAt(i);
		}
		String finalString = upperCase + numeric + lowerCase;
		return finalString;
	}

	int getFrequencyOfCharacter(String str, char targetChar) {
		int count = 0;
		str = str.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetChar)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		StringPractice2 stringPractice2 = new StringPractice2();

		System.out.println("String in rearranged Format is: " + stringPractice2.getStringInRearrangeFormat("te2cH4no"));
		System.out.println("String in rearranged Format is: " + stringPractice2.getStringInRequiredFormat("t8EcHNo5Cred3iTs"));
		System.out.println("Frequency of target character is: " + stringPractice2.getFrequencyOfCharacter("TechnoTtcredits",'t'));

	}
}
