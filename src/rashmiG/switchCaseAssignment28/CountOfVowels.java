/*Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/

package rashmiG.switchCaseAssignment28;

class CountOfVowels {
	int getCountOfVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			switch (ch) {
			case 'A':
			case 'a':
				count++;
				break;

			case 'E':
			case 'e':
				count++;
				break;
			case 'I':
			case 'i':
				count++;
				break;

			case 'O':
			case 'o':
				count++;
				break;
			case 'U':
			case 'u':
				count++;

			}
		}
		return count;
	}

	void displayVowels(String input) {
		int count = this.getCountOfVowels(input);
		System.out.println("Number of vowels in given word " + input + " : " + count);
	}

	/*
	 * int getCountOfVowelsAlternativeSwitch(String input){ int count=0; for(int
	 * index=0;index<input.length();index++){ char ch=input.charAt(index);
	 * 
	 * switch(ch){ case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case
	 * 'O': case 'o': case 'U': case 'u': count++; //break; } } return count; }
	 */

	public static void main(String[] args) {
		CountOfVowels countOfVowels = new CountOfVowels();
		countOfVowels.displayVowels("TechnOcredits");
		countOfVowels.displayVowels("Rsh");

	}
}
