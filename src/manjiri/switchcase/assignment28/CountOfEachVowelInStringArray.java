/*Print count of each vowels in a given String Array using switch case.

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
         i -> 1*/

package manjiri.switchcase.assignment28;

public class CountOfEachVowelInStringArray {
	
	void printCountofEachVowel(String input){
		input = input.toLowerCase();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			
			switch(ch) {
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
			default:
				break;	
			}
		}
		
		if(countA > 0) {
			System.out.println('a'+ "->" + countA);
		}
		if(countE > 0) {
			System.out.println('e'+ "->" + countE);
		}
		if(countI > 0) {
			System.out.println('i'+ "->" + countI);
		}
		if(countO > 0) {
			System.out.println('o'+ "->" + countO);
		}
		if(countU > 0){
			System.out.println('u'+ "->" + countU);
		}	
	}
	
	void printCountOfEachVowelInStringArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			System.out.println("Vowel count in "+input[index]+" is: ");
			printCountofEachVowel(input[index]);
		}
	}
	
	
	public static void main(String[] args) {
		String[] input = {"technocredits", "swati", "aashvi"};
		new CountOfEachVowelInStringArray().printCountOfEachVowelInStringArray(input);
	}
}
