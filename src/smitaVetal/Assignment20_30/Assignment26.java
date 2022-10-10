/*Assignment - 26 : 21st Sep'2022

find out frequency of each character from given input using single while loop.
String str = "technocreditst";*/

package smitaVetal.Assignment20_30;

public class Assignment26 {

	// method to find frequency of each character from string
	void getFreqOfEachChar(String input) {
		int originalLength = 0;
		int newLength = 0;
		System.out.println("Iput String is -> " + input);
		System.out.println("Frequency of each character in given string is as below :");

		while (input.length() > 0) {
			originalLength = input.length();
			char ch = input.charAt(0);
			String str = Character.toString(ch);
			input = input.replace(str, "");
			newLength = input.length();
			System.out.println(ch + " -> " + (originalLength - newLength));
		}
	}
	public static void main(String[] args) {
		Assignment26 Assign = new Assignment26();
		String input = "technocreditst";
		Assign.getFreqOfEachChar(input);
	}

}
