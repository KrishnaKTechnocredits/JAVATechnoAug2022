/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4
*/
package asthaSrivastava.array.switchCase;

public class CountOfVowelsString {

	//count of first vowel from given String
	int getCountOfVowels(String str) {
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			ch = Character.toLowerCase(ch);
			switch(ch) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
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
		CountOfVowelsString test = new CountOfVowelsString();
		String input = "Technocredits";
		int count = test.getCountOfVowels(input);
		System.out.println("Count of Vowels in given string "+input+" is " +count);
	}
	}

