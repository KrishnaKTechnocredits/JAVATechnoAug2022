/*Assignment - 28 : 25th Sep'2022
Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e*/
package adittyThakare.switchCase;

public class Assignment28_Program2 {
	
	//Method to return first character in the String
	char getFirstVowelInTheString(String str) {

		for (int index = 0; index < str.length(); index++) { // Iterate loop till string length
			char ch = str.charAt(index); //Get character at index position of string

			switch (ch) { // Switch case to check lowecase and uppercase vowels, if vowel present then return that vowel
			case 'a':
				return ch;
			case 'A':
				return ch;
			case 'e':
				return ch;
			case 'E':
				return ch;
			case 'i':
				return ch;
			case 'I':
				return ch;
			case 'o':
				return ch;
			case 'O':
				return ch;
			case 'u':
				return ch;
			case 'U':
				return ch;
			default:
			}
		}
		return ' ';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment28_Program2 assignment28_Program2 = new Assignment28_Program2();
		String str = "technocredits";
		System.out.println(
				"First vowel in the string " + str + " : " + assignment28_Program2.getFirstVowelInTheString(str));
		String str1 = "Aditty";
		System.out.println(
				"First vowel in the string " + str1 + " : " + assignment28_Program2.getFirstVowelInTheString(str1));
	}

}
