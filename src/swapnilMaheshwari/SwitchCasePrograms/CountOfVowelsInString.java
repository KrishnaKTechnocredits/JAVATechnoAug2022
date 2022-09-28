/*
 Program  : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4
 */

package swapnilMaheshwari.SwitchCasePrograms;

public class CountOfVowelsInString {
	int count=0;
	int getCountOfVowelsInString(String str) {
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			switch(ch) {
			case 'A':
			case 'a':
				count++;
				break;
			case 'E':
			case 'e':
				count++;
				break;
			case 'I':
			case 'i':
				count++;
				break;
			case 'O':
			case 'o':
				count++;
				break;
			case 'U':
			case 'u':
				count++;
				break;
			default:
	}
}
		return count;
}
	public static void main(String[] args) {
		String input="Technocredits";
		System.out.println( " Total vowels in the " +input+ "->" + new CountOfVowelsInString().getCountOfVowelsInString(input) );
	}
}