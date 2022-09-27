/*Return first vowel from given String.

input : technocredits
output : e*/


package manjiri.switchcase.assignment28;

public class FirstVowelFromString {
	
	char getFirstVowelFromString(String input){
		System.out.println("Input String is: " + input);
		input = input.toLowerCase();
		char ch = ' ';
		
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return ch;
			default:
				break;	
			}
		}
		return ch;
	}
	
	
	public static void main(String[] args) {
		String input = "technocredits";
		System.out.println("First Vowel from "+input+" string is: " + new FirstVowelFromString().getFirstVowelFromString(input));
	}

}
