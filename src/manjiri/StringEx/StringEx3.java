/*Write a program to rearrange String in given format. 
String str = "te2cH4no";
output : "24tecHno";
Hint : AllDigitAllCharacter*/

package manjiri.StringEx;

public class StringEx3 {
	String getRearrangedString(String name) {
		String digitStr = "";
		String alphaStr = "";
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				digitStr += ch;
			}
			else if(Character.isLetter(ch)) {
				alphaStr += ch;
			}
		}
		return digitStr+alphaStr;
	}
	
	public static void main(String[] args) {
		System.out.println(new StringEx3().getRearrangedString("te2cH4no"));
	}
}
