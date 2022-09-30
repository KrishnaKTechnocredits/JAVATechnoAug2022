/*
 Assignment - 28 : 25th Sep'2022

Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e

Program 3: [15 mins]
Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 
		 
Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
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

package pujaSah.assignments20_30;

import java.util.Arrays;

public class SwitchCaseExamples {
	// Method to return count of vowels in a given String using switch case.
	int getCountOfVowels(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			switch (name.toLowerCase().charAt(index)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		return count;
	}

	// Method to return first vowel from given String using switch case.
	char getFirstVowelFromString(String name) {
		for (int index = 0; index < name.length(); index++) {
			switch (name.toLowerCase().charAt(index)) {
			case 'a':
				return 'a';
			case 'e':
				return 'e';
			case 'i':
				return 'i';
			case 'o':
				return 'o';
			case 'u':
				return 'u';
			}
		}
		return '0';
	}

	// Method to print count of each vowels in a given String using switch case.
	void displayCountOfEachVowelInString(String name) {
		System.out.println("Count of each vowel in " + name + " is: ");
		int getAcount = 0, getEcount = 0, getIcount = 0, getOcount = 0, getUcount = 0;
		String updatedName = name.toLowerCase();
		for (int index = 0; index < updatedName.length(); index++) {
			switch (updatedName.charAt(index)) {
			case 'a':
				getAcount++;
				break;
			case 'e':
				getEcount++;
				break;
			case 'i':
				getIcount++;
				break;
			case 'o':
				getOcount++;
				break;
			case 'u':
				getUcount++;
				break;
			}
		}
		System.out.println("a->" + getAcount + "times");
		System.out.println("e->" + getEcount + "times");
		System.out.println("i->" + getIcount + "times");
		System.out.println("o->" + getOcount + "times");
		System.out.println("u->" + getUcount + "times");
	}

	// Method to print count of each vowels in a given String array using switch
	// case.
	void processCountOfEachVowelInStringArray(String[] name) {
		for (int index = 0; index < name.length; index++) {
			displayCountOfEachVowelInString(name[index]);
		}
	}

	public static void main(String[] args) {
		SwitchCaseExamples obj = new SwitchCaseExamples();

		String name1 = "TechnOcredits";
		System.out.println("Input String: " + name1);
		System.out.println("Count of vowels in " + name1 + " is: " + obj.getCountOfVowels(name1) + "\n");

		String name2 = "technocredits";
		System.out.println("Input String: " + name2);
		System.out.println("First vowel in " + name2 + " is: " + obj.getFirstVowelFromString(name2));
		obj.displayCountOfEachVowelInString(name2);
		System.out.println("\n");

		String[] name3 = { "technocredits", "swati", "aashvi" };
		System.out.println("Input String Array: " + Arrays.toString(name3));
		obj.processCountOfEachVowelInStringArray(name3);
	}
}
