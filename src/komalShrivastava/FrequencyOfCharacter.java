/* Assignment 18 - 8th Sep 2022
Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4 */

package komalShrivastava;

public class FrequencyOfCharacter {

	static int getcharFrequency(String inputString, char targetCharacter) {
		int count = 0;
		for(int index = 0; index < inputString.length(); index++ ) {
			char ch = inputString.charAt(index);
			if(Character.toLowerCase(ch) == Character.toLowerCase(targetCharacter))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = "TechnoTtcredits";
		char targetCharacter = 't';
		int charcount = getcharFrequency(str, targetCharacter);
		System.out.println("Frequence of character " + targetCharacter + " in " + str + " is " + charcount);
	}
}