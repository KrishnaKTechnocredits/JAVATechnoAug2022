package apurvaBabel;

public class Assignment28_SwitchCaseProgram1 {

	// Method to return count of vowels in a given string using switch case
	int getCountOfVowels(String input) {
		int count = 0;
		input = input.toLowerCase();
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {
			case 'a':
				count++;
				break;

			case 'e':
				count++;
				break;

			case 'i':
				count++;
				break;

			case 'o':
				count++;
				break;

			case 'u':
				count++;
				break;

			default:
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment28_SwitchCaseProgram1 assignment28 = new Assignment28_SwitchCaseProgram1();
		String input = "TechnOcredits";
		int count = assignment28.getCountOfVowels(input);
		System.out.println("Count of vowels in " + input + " --> " + count);
	}
}
