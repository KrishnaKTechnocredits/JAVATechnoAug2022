/*Assignment - 28 : 25th Sep'2022

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

int count = 0;
for(int index=0;index<str.length();index++){
	char ch = str.charAt(index);
	
	switch(ch){
		case 'a':
		case 'A':
			count++;
			break;	
	}
}*/
package shrutiArora;

import java.util.Arrays;

public class Assignment28 {
	int getCountOfVowels(String input) {
		input = input.toLowerCase();
		int count = 0;
		for (int index = 0; index < input.length(); index++) {

			char ch = input.charAt(index);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;

			}
		}

		return count;
	}

	char getFirstVowel(String input) {
		input = input.toLowerCase();
		int count = 0;
		char ch = input.charAt(0);
		for (int index = 0; index < input.length(); index++) {

			char ch1 = input.charAt(index);
			switch (ch1) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				ch = ch1;
				count++;
				break;
			}
			if (count == 1) {
				break;
			}
		}
		return ch;
	}

	void printCountOfEachVowel(String input) {
		input = input.toLowerCase();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			switch (ch) {
			case 'a':
				countA++;
				break;
			case 'e':
				countE++;
				break;
			case 'i':
				countI++;
				break;
			case 'o':
				countO++;
				break;
			case 'u':
				countU++;
				break;
			}
		}
		if (countA > 0)
			System.out.println("a" + "->" + countA);
		if (countE > 0)
			System.out.println("e" + "->" + countE);
		if (countI > 0)
			System.out.println("i" + "->" + countI);
		if (countO > 0)
			System.out.println("o" + "->" + countO);
		if (countU > 0)
			System.out.println("u" + "->" + countU);

	}

	void getVowelCountFromArrayString(String[] arr){
		for(int index = 0; index< arr.length; index++) {
			System.out.println("vowel count in "+arr[index]);
			printCountOfEachVowel(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		String name = "TechnOcredits";
		System.out.println("input: " +name);
		System.out.println("Total count of vowels from given String is --> " + assignment28.getCountOfVowels(name));

		String input1= "technocredits";
		System.out.println("input: "+input1);
		System.out.println("First vowel in given String is --> " + assignment28.getFirstVowel(input1));

		String input2 = "technocredits";
		System.out.println("input: " + input2);
		assignment28.printCountOfEachVowel(input2);
		
		String[] input3= {"technocredits", "swati", "aashvi"};
		System.out.println("input: " + Arrays.toString(input3));
		assignment28.getVowelCountFromArrayString(input3);

	}

}