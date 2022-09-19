/*1) Write a program to rearrange String in given format.
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter

2) Write a program to rearrange String in given format.
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

3) Find frequency of given character from given String.
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4
*/

package smitaVetal;

public class StringFrequency {

	String getString1(String str) {
		String tempDigit = "";
		String tempChar = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;
			} else if (Character.isLetter(ch)) {
				tempChar = tempChar + ch;
			}
		}
		return tempDigit + tempChar;
	}

	String getString2(String str) {
		String tempUpper = "";
		String tempLower = "";
		String tempDigit = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				tempUpper = tempUpper + ch;
			} else if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;
			} else if (Character.isLowerCase(ch)) {
				tempLower = tempLower + ch;
			}
		}
		return tempUpper + tempDigit + tempLower;
	}

	int getString3(String str, char targetChar) {
		int count = 0;
		String tempString = str.toLowerCase();
		char TempChar = Character.toLowerCase(targetChar);
		for (int index = 0; index < tempString.length(); index++) {
			char ch = tempString.charAt(index);
			if (ch == TempChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str1 = "te2cH4no";
		String rearrangeStr1 = new StringFrequency().getString1(str1);
		System.out.println(	"After rearranging the string " + str1 + " in format AllDigitAllCharacter is : " + rearrangeStr1);
		String str2 = "t8EcHNo5Cred3iTs";
		String rearrangeStr2 = new StringFrequency().getString2(str2);
		System.out.println("After rearranging the string " + str2 + " in format Uppercase letters,digits,LowerCase letter is : " + rearrangeStr2);
		String str3 = "TechnoTtcredits";
		char targetChar = 'T';
		int rearrangeStr3 = new StringFrequency().getString3(str3, targetChar);
		System.out.println(	"Frequency of target character " + targetChar + " from string " + str3 + " is : " + rearrangeStr3);
	}
}
