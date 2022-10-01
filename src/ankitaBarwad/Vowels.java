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
package ankitaBarwad;

public class Vowels {

	// Program 1 : Return count of vowels in a given String using switch case.
	int getVowelsCount(String str) {
		System.out.println("*Count of vowels in a given String*");
		System.out.print(str + " : ");
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			switch (Character.toLowerCase(str.charAt(index))) {
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

	// Program 2 : Return first vowel from given String.
	char getFirstVowel(String str) {
		System.out.println("*First vowel from given String*");
		System.out.print(str + " : ");
		for (int index = 0; index < str.length(); index++) {
			switch (Character.toLowerCase(str.charAt(index))) {
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
		return ' ';
	}

	// Program 3:Print count of each vowels in a given String using switch case.
	void printEachVowelCount(String str) {
		System.out.print("String : " + str + "\n");
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
		for (int index = 0; index < str.length(); index++) {
			switch (Character.toLowerCase(str.charAt(index))) {
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
			System.out.println("'a' : " + countA);
		if (countE > 0)
			System.out.println("'e' : " + countE);
		if (countI > 0)
			System.out.println("'i' : " + countI);
		if (countO > 0)
			System.out.println("'o' : " + countO);
		if (countU > 0)
			System.out.println("'u' : " + countU);
	}

	//Program 4:Print count of each vowels in a given String Array using switch case.
	void printEachVowelCountInArray(String[] inputString) {
		for(int index = 0; index < inputString.length; index++) {
			printEachVowelCount(inputString[index]);
		}
	}
	
	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		System.out.println(vowels.getVowelsCount("TechnOcredits"));
		System.out.println("-------------------------------------------");
		System.out.println(vowels.getFirstVowel("technocredits"));
		System.out.println("-------------------------------------------");
		System.out.println("*Count of each vowels in given String*");
		vowels.printEachVowelCount("technocredits");
		System.out.println("-------------------------------------------");
		System.out.println("*Count of each vowels in given String Array*");
		String[] inputArray = {"technocredits", "swati", "aashvi"};
		vowels.printEachVowelCountInArray(inputArray);
		System.out.println("-------------------------------------------");
	}
}
