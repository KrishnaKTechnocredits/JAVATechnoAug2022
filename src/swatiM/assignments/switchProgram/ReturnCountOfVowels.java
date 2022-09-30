package swatiM.assignments.switchProgram;

public class ReturnCountOfVowels {

	int getcountOfVowels(String input) {
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
					break;

			}

		}
		return count;
	}

	public static void main(String[] args) {
		ReturnCountOfVowels assignment28_Prog1 = new ReturnCountOfVowels();

		String input = "TechnOcredits";
		System.out.println("Program 1 : [10 mins - 13 mins]\r\n"
				+ "Return count of vowels in a given String using switch case.");
		System.out.println("\nCount of vowels is --> "+"\nInput -  " + input + "\nOutput - " + assignment28_Prog1.getcountOfVowels(input));

	}

}
