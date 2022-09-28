/*Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/


package manjiri.switchcase.assignment28;

public class CountOfVowels {
	
	int getVowelCount(String input){
		System.out.println("Input String is: " + input);
		input = input.toLowerCase();
		int count = 0;
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				break;	
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String input = "TechnOcredits";
		System.out.println("Number of Vowels in "+input+" string is: " + new CountOfVowels().getVowelCount(input));
	}

}
