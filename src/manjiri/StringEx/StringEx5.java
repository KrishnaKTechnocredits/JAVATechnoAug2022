/*Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4*/

package manjiri.StringEx;

public class StringEx5 {
	
	int getCharFrequency(String input, char targetChar) {
		int index = 0;
		int count = 0;
		while(index != input.length()) {
			input = input.toLowerCase();
			targetChar = Character.toLowerCase(targetChar);
			char ch = input.charAt(index);
			if(ch == targetChar) {
				count++;
			}
			index++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		String input = "TechnoTtcredits";
		char ch = 'T';
		System.out.println(input+" "+"has number of "+ch +": "+ new StringEx5().getCharFrequency(input,ch));
	}

}
