package apurvaBabel;

public class Assignment26 {

	// Method to find out frequency of each character from given input
	void getFrequencyOfEachCharacter(String input) {
		int originalLength = 0;
		int newLength = 0;

		System.out.println("Input -> " + input);
		System.out.println("\nFrequency of each character from given input is : ");

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
		Assignment26 assignment26 = new Assignment26();
		String input = "technocreditst";
		assignment26.getFrequencyOfEachCharacter(input);
	}
}
