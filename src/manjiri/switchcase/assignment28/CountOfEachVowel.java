/*Print count of each vowels in a given String using switch case.

input : technocredits
output : e -> 2
         o -> 1
		 i -> 1*/

package manjiri.switchcase.assignment28;

public class CountOfEachVowel {
	
	void printCountofEachVowel(String input){
		System.out.println("Input String is: " + input);
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
	
	public static void main(String[] args) {
		String input = "technocredits";
		new CountOfEachVowel().printCountofEachVowel(input);
	}
}
