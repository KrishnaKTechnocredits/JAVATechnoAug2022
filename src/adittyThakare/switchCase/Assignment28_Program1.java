/*Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/
package adittyThakare.switchCase;

public class Assignment28_Program1 {
	
	//Method to count vowels in the given String
	int getVowelCountFromString(String str) {
		int count = 0;

		for (int index = 0; index < str.length(); index++) { // Iterate loop till string length
			char ch = str.charAt(index); // Get character at index position of string

			switch (ch) { // Switch case to check lowecase and uppercase vowels, if case satisfied increase count and break;
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
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment28_Program1 assignment28_Program1 = new Assignment28_Program1();
		String str = "TechnOcredits";
		System.out.println(
				"Number of vowels in string " + str + " -> " + assignment28_Program1.getVowelCountFromString(str));
		String str1 = "gurpEet";
		System.out.println(
				"Number of vowels in string " + str1 + " -> " + assignment28_Program1.getVowelCountFromString(str1));
	}

}
