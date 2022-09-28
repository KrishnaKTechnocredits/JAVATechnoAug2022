/*
 * Assignment - 26 : 21st Sep'2022
find out frequency of each character from given input using single while loop.
String str = "technocreditst";
 */
package swatiM.assignments.doWhileProgram;

public class FrequencyOfEachCharacter {
	void getFrequencyOfChar(String input) {
		int originalLength = 0;
		int newLength = 0;
		int frequency = 0;

		System.out.println("Given String is: " + input);

		System.out.println("Assignment - 26 : 21st Sep'2022\r\n"
				+ "find out frequency of each character from given input using single while loop.\r\n"
				+ "String str = \"technocreditst\";");
		System.out.println("\n output as below \n");
		while (input.length() > 0) {
			originalLength = input.length(); // Here is the Original length of input string 

			char ch = input.charAt(0); // get one by one character from input string and store it in char
			String str = Character.toString(ch); // convert that character in to String
			input = input.replace(str, ""); // Now replace that character in blank space

			newLength = input.length(); // get new length of input string
			frequency = originalLength - newLength; // get frequency of character

			System.out.println("\"" + ch + "\"" + " --> " + frequency); // print frequency of each character
		}
	}

	public static void main(String[] args) {
		String input = "technocreditst";
		FrequencyOfEachCharacter assignment26 = new FrequencyOfEachCharacter();
		assignment26.getFrequencyOfChar(input);
	}

}
