/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/
package ankitaBarwad;

public class CharacterFrequency {

	public static void main(String[] args) {
		CharacterFrequency cFrequency = new CharacterFrequency();
		cFrequency.getFrequencyOfEachCharacter("technocreditst");
	}

	private void getFrequencyOfEachCharacter(String inputString) {
		System.out.println("Input String : " + inputString);
		inputString = inputString.toLowerCase();
		while (inputString.length() > 0) {
			char ch = inputString.charAt(0);
			int originalLength = inputString.length();
			inputString = inputString.replace(ch + "", "");
			int newLength = inputString.length();
			System.out.println("Frequency of " + ch + " : " + (originalLength - newLength));
		}
	}
}
