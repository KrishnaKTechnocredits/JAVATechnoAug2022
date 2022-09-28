/*Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/

package smitaVetal.Assignment20_30;

public class Assignment28_Prog1 {

	void getCountOfVowels(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			

			switch (ch) {
			case 'a':
			case 'A':
				count++;
				break;
			case 'e':
			case 'E':
				count++;
				break;
			case 'i':
			case 'I':
				count++;
				break;
			case 'o':
			case 'O':
				count++;
				break;
			case 'u':
			case 'U':
				count++;
				break;
			}
		}
		System.out.print("Counts of vowels in above string is : " +count);
	}

	public static void main(String[] args) {
		Assignment28_Prog1 program1 = new Assignment28_Prog1();
		String input = "TechnOcredits";
		System.out.println("Given string is : " + input);
		program1.getCountOfVowels(input);	
		

	}
}
