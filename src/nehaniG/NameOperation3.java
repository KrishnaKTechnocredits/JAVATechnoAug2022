package nehaniG;

public class NameOperation3 {
	String allDigitAllCharacter(String input) {
		String digit = "";
		String word = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				word = word + ch;
			}
		}
		return digit + word;

	}

	String reaarangeString(String input) {
		String upperletter = "";
		String lowerletter = "";
		String digit = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperletter = upperletter + ch;
			} else if (Character.isLowerCase(ch)) {
				lowerletter = lowerletter + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;

			}
		}

		return upperletter + digit + lowerletter;
	}

	int frequencyOfGivenLetter(String input,char targetChar) {
		 input = input.toLowerCase();
		    targetChar = Character.toLowerCase(targetChar);
		    int count = 0;
		    for (int index = 0; index < input.length(); index++) {
		      char ch = input.charAt(index);
		      if (ch == targetChar) {
		        count++;
		      }
		    }
		    return count;
		
	}
	

	public static void main(String[] args) {
		NameOperation3 nameOperation3 = new NameOperation3();
		System.out.println(nameOperation3.allDigitAllCharacter("te2cH4no"));
		System.out.println(nameOperation3.reaarangeString("t8EcHNo5Cred3iTs"));
		int getCountOfTargetChar = nameOperation3.frequencyOfGivenLetter("TechnoTtcredits", 't');
	    System.out.println(getCountOfTargetChar);

	}

}
