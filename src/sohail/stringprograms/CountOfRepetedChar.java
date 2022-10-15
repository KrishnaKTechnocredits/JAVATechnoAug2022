//find out frequency of each character from given input using single while loop.
//String str = "technocreditst";
package sohail.stringprograms;

public class CountOfRepetedChar {
	void getCharCount(String inputString) {
		inputString = inputString.toLowerCase();
		int newLenght;
		while (inputString.length() > 0) {
			int originalLenght = inputString.length();
			String ch = Character.toString(inputString.charAt(0));
			inputString = inputString.replace(ch, "");
			newLenght = inputString.length();
			System.out.println(ch + " -> " + (originalLenght - newLenght));
		}
	}

	public static void main(String[] args) {
		CountOfRepetedChar countofrepetedchar = new CountOfRepetedChar();
		countofrepetedchar.getCharCount("technocreditst");
	}
}
