/*Assignment - 18 : 8th Sep'2022

1) Write a program to rearrange String in given format. 
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

Notes : 8th Sep'2022

Character is a predefined class in java.
1) boolean isDigit(char ch)
2) boolean isLetter(char ch)
3) boolean isLowerCase(char ch)
4) boolean isUpperCase(char ch)
5) int getNumericValue(char ch)
6) char toLowerCase(char ch)
7) char toUpperCase(char ch)
Note : All above methods are static methods.


String is a predefined class in a java.
1) int length()
String str = "";
sop(str.length()); // 0

String str = null;
sop(str.length()); // NullPointerException

String str = "null";
sop(str.length()); // 4

2)char charAt(int index)

3)String toLowerCase()

4) String toUpperCase()
-------------------------------------------
Find frequency of given character from given String.

String str = "TechnoTtcredits";
char targetChar = 't';
output : 4

int getCountOfTargetChar(String input, char targetChar){
	input = input.toLowerCase(); // technortcredits
	targetChar = Character.toLowerCase(targetChar);
	for(){
		char ch = input.charAt(index);
		if(ch == targetChar)
			count++;
	}
	return count;
}

String input = "TechnoTtcredits";
char targetChar = 'T';
int freqOfChar = getCountOfTargetChar(input,targetChar);
sop(input + " freq of character " + targetChar + " is " + freqOfChar);

*/

package akankshaVyas.StringOperation;

public class StringFormatting {

	String getDigitStringFormatting(String str) {
		String str1 = "", str2 = "";

		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				str1 = str1 + ch;
			} else if (!Character.isDigit(ch)) {
				str2 = str2 + ch;
			}

		}
		return str1 + str2;
	}

	String getUpperDigitLowerCaseArrangemnt(String input) {
		String str1 = "", str2 = "", str3 = "";
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				str1 = str1 + ch;
			} else if (Character.isDigit(ch)) {
				str2 = str2 + ch;
			} else if (Character.isLowerCase(ch)) {
				str3 = str3 + ch;
			}
		}
		return str1 + str2 + str3;
	}

	int getFrequencyOfTargetCharacter(String str, char targetChar) {

		int count = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.print(new StringFormatting().getDigitStringFormatting("te2cH4no"));
		System.out.print("\n" + new StringFormatting().getUpperDigitLowerCaseArrangemnt("t8EcHNo5Cred3iTs"));
		System.out.print("\n" + "TechnoTtcredits" + " frequency of character " + 't' + " is "
				+ new StringFormatting().getFrequencyOfTargetCharacter("TechnoTtcredits", 't'));

	}

}
