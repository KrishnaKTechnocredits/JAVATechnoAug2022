package hindaviIngle;
/*
 * Assignment - 28 : 25th Sep'2022

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
}
 */

public class Assignment28 {
	
	void countOfVowels(String name) {
		int count = 0;
		name = name.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		System.out.println("Vowel Count is--> \n" + count);
	}

	char firstVowel(String name) {
		name = name.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a':
				return ch;
			case 'e':
				return ch;
			case 'i':
				return ch;

			case 'o':
				return ch;

			case 'u':
				return ch;
			}
		}
		return ' ';
	}

	void countOfEachVowel(String name) {
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		name = name.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			switch (ch) {
			case 'a': {
				countA++;
				break;
			}
			case 'e': {
				countE++;
				break;
			}
			case 'i': {
				countI++;
				break;
			}
			case 'o': {
				countO++;
				break;
			}
			case 'u': {
				countU++;
				break;
			}
			}
		}
		if (countA > 0) {
			System.out.println("a -->" + countA);
		}
		if (countE > 0) {
			System.out.println("e -->" + countE);
		}
		if (countI > 0) {
			System.out.println("i -->" + countI);
		}
		if (countO > 0) {
			System.out.println("o -->" + countO);
		}
		if (countU > 0) {
			System.out.println("u -->" + countU);
		}

	}

	void countOfVowelinStringArry(String[] strArry) {
		for (int index = 0; index < strArry.length; index++) {
			System.out.println("Count of each vowel-->" + strArry[index]);
			countOfEachVowel(strArry[index]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment28 assignment28 = new Assignment28();
		assignment28.countOfVowels("TechnOcredits");
		System.out.println("================================");
		char ch = assignment28.firstVowel("TechnOcredits");
		if (ch == ' ') {
			System.out.println("String has no wowel");
		} else {
			System.out.println("First vovel in the string is-->  " + ch);
		}
		System.out.println("================================");
		System.out.println("Print count of each vowels in a given String");
		assignment28.countOfEachVowel("TechnOcredits");
		System.out.println("================================");
		String[] strArry = { "technocredits", "swati", "aashvi" };
		assignment28.countOfVowelinStringArry(strArry);
	}

}

