/*
 * Assignment - 26 : 21st Sep'2022
find out frequency of each character from given input using single while loop.
String str = "technocreditst";
 */

package harshalRane.Assignments.assignment26FrequencyOfCharWhileLoop;

public class Assignment26 {

	void getFrequencyOfChar(String input) {
		int originalLength = 0;
		int newLength = 0;
		int frequency = 0;

		System.out.println("Given String is: " + input);
		System.out.println("--------------------------");
		System.out.println("Frequency of following characters in given String is: \n");
		while (input.length() > 0) {
			originalLength = input.length(); //Original length of input string

			char ch = input.charAt(0); //get character from input string and store it in char
			String str = Character.toString(ch); //convert character to string
			input = input.replace(str, ""); //replace char with blank space

			newLength = input.length(); // get the new length of input string
			frequency = originalLength - newLength; //get frequency of char

			System.out.println("\"" + ch + "\"" + " --> " + frequency); //print frequency of each character
		}
	}

	public static void main(String[] args) {
		String input = "technocreditst";
		Assignment26 assignment26 = new Assignment26();
		assignment26.getFrequencyOfChar(input);
	}
}
