package sohail.stringprograms;

//Program 2: Write a method to print all the words having atleast one digit.
//String input = "Good mor9ning fr3iends t2hi2s is technocredits";
//output : mor9ning
//       fr3iends
//       t2hi2s	
public class DigitInString {
	void checkDigitInString(String inputString) {
		String[] words = inputString.split(" ");
		for (int index = 0; index < words.length; index++) {
			Boolean isDigit = isDigitPresent(words[index]);
			if (isDigit) {
				System.out.println(words[index]);
			}
		}
	}

	Boolean isDigitPresent(String word) {
		char[] charArray = word.toCharArray();
		Boolean isDigitPresentInWord = false;
		for (int index = 0; index < charArray.length; index++) {
			if (Character.isDigit(charArray[index])) {
				isDigitPresentInWord = true;
				break;
			}
		}
		return isDigitPresentInWord;
	}

	public static void main(String[] args) {
		DigitInString digitinstring = new DigitInString();
		String inputString = "Good mor9ning fr3iends t2hi2s is technocredits";
		digitinstring.checkDigitInString(inputString);

	}

}
