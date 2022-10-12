/*Program 4: [15 mins]
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
package asthaSrivastava.array.switchCase;

public class CountOfVowels {

	//to find count of vowels from String Array
	void printVowelCount(String input) {
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			ch = Character.toLowerCase(ch);
			switch (ch) {
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			default:
				break;
			}
		}
		if (aCount > 0)
			System.out.println('a' + "->" + aCount);
		if (eCount > 0)
			System.out.println('e' + "->" + eCount);
		if (iCount > 0)
			System.out.println('i' + "->" + iCount);
		if (oCount > 0)
			System.out.println('o' + "->" + oCount);
		if (uCount > 0)
			System.out.println('u' + "->" + uCount);

	}

	void displayVowelCount(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Count of Vowels in " +arr[index]);
			printVowelCount(arr[index]);
		}
	}

	public static void main(String[] args) {
		CountOfVowels test = new CountOfVowels();
		String[] input = {"technocredits", "swati", "aashvi"};
		test.displayVowelCount(input);

	}
}
