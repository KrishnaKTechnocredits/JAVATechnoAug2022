package pujaSah.assignments20_30;

public class WordsWithDigit {

	void displayWordsWithDigits(String inStr) {
		String[] outArr = inStr.split(" ");
		for (int i = 0; i < outArr.length; i++) {
			for (int j = 0; j <= outArr[i].length() - 1; j++) {
				if (Character.isDigit(outArr[i].charAt(j))) {
					System.out.println(outArr[i]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		WordsWithDigit obj = new WordsWithDigit();

		String inStr = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Input String: " + inStr);

		System.out.println("Words with atleast one digit are: "+ "\n");
		obj.displayWordsWithDigits(inStr);
	}
}
