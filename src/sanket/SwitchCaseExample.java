/*Assingment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input: TechnOcredits
output: 4

Program 2 : [10 mins]
Return first vowel from given String.

input: technocredits
output: e

Program 3: [15 mins]
Print count of each vowel in a given String using switch case.

input: technocredits
output : 
e -> 2
o -> 1
i -> 1


Program 4: [15 mins]
Print count of each vowel in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output: vowel count in technocredits:
e -> 2
o -> 1
i -> 1
vowel count in swati:
a -> 1
i -> 1
vowel count in aashvi:
a -> 2
i -> 1
*/


package sanket;

import java.util.Arrays;

public class SwitchCaseExample {

	// method to find count of vowel in string
	int getCountOfVowelInString(String str) {

		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

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
				break;
			}
		}
		return count;
	}

	// method to find first of vowel in string
	String getFirstVowelOfString(String str) {

		String char2String = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			char2String = Character.toString(ch);

			switch (char2String) {

			case "A":
			case "a":
				return char2String;
			case "E":
			case "e":
				return char2String;
			case "I":
			case "i":
				return char2String;
			case "O":
			case "o":
				return char2String;
				
			case "U":
			case "u":
				return char2String;
			}
		}
		return char2String;
	}
	
	// method to count each vowel in string
	void getCountOfEachVowelInString(String str) {

		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		str = str.toLowerCase();
		
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			switch (ch) {

			case 'A':
			case 'a':
				countA++;
				break;
			case 'E':
			case 'e':
				countE++;
				break;
			case 'I':
			case 'i':
				countI++;
				break;
			case 'O':
			case 'o':
				countO++;
				break;
			case 'U':
			case 'u':
				countU++;
				break;
			}
		}
		if(countA>0)
		System.out.println("a" + " --> " + countA);
		if(countE>0)
		System.out.println("e" + " --> " + countE);
		if(countI>0)
		System.out.println("i" + " --> " + countI);
		if(countO>0)
		System.out.println("o" + " --> " + countO);
		if(countU>0)
		System.out.println("u" + " --> " + countU);
	}
	
	// method to find count of vowel in string array
	void getCountOfEachVowelInStringArray(String[] arr) {
		
		for (int index = 0; index < arr.length; index++) {
			
			String name = arr[index];
			System.out.println("The count of each vowel in string " + arr[index]);
			getCountOfEachVowelInString(name);
			System.out.println("-------------------------------------------");
		}
		
	}

	public static void main(String[] args) {

		String input = "TechnOcredits";
		int output = new SwitchCaseExample().getCountOfVowelInString(input);
		System.out.println("****Program 1 Solution****");
		System.out.println("The number of vowels in String " + input + " is : " + output);
		
		String input2 = "technocredits";
		String output2 = new SwitchCaseExample().getFirstVowelOfString(input2);
		System.out.println("\n" + "****Program 2 Solution****");
		System.out.println("The first of vowel in String " + input2 + " is : " + output2);
		
		String input3 = "technocredits";
		System.out.println("\n" + "****Program 3 Solution****");
		System.out.println("The count of each vowel in String " + input3 + " is : ");
		new SwitchCaseExample().getCountOfEachVowelInString(input3);
		
		String[] input4 = {"technocredits", "swati", "aashvi"};
		System.out.println("\n" + "****Program 4 Solution****");
		System.out.println("The given string is " + Arrays.toString(input4));
		new SwitchCaseExample().getCountOfEachVowelInStringArray(input4);
		
		
	}

}
