package amolMule.stringProg;

public class RearrangeStr {

	String strFormat1(String str) {
		String letter = "";
		String digit = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = (str.charAt(i));
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				letter = letter + ch;
			}
		}

		return digit + letter;
	}

	String strFormat2(String str) {

		String format2 = "";
		String upperC = "";
		String lowerC = "";
		String digit = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperC = upperC + ch;
			} else if (Character.isLowerCase(ch)) {

				lowerC = lowerC + ch;
			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			}

		}

		format2 = upperC + digit + lowerC;
		return format2;
	}

	int getFrequencyChar(String strg, char ch) {

		int freq = 0;
		String word = strg.toLowerCase();
		char ch1 = Character.toLowerCase(ch);

		for (int i = 0; i < word.length(); i++) {
			char index = word.charAt(i);
			if (index == ch1) {
				freq = freq + 1;
			}

		}

		return freq;
	}

	public static void main(String[] args) {

		RearrangeStr str = new RearrangeStr();
		String format = str.strFormat1("AMol71Mu9L5E");
		System.out.println();
		System.out.println("Reaarange word with digit and letter ");
		System.out.println(format);

		System.out.println();
		System.out.println("Reaarange word with capital letter, digit and small letters ");
		String format2 = str.strFormat2("t1EChNo37crEd5It9");
		System.out.println(format2);

		System.out.println();
		System.out.println("Frequency of letter: ");
		int freq = str.getFrequencyChar("AmTToltt", 't');
		System.out.println(freq);

	}

}
