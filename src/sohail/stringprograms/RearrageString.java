//1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";
//Hint : AllDigitAllCharacter

package sohail.stringprograms;

public class RearrageString {
	int retstring;
	String strdigit = "";
	String stralp = "";

	String getString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				strdigit = strdigit + ch;
			} else if (Character.isLetter(ch)) {
				stralp = stralp + ch;
			}
		}
		System.out.print("" + strdigit + "" + stralp);
		return str;
	}

	public static void main(String... args) { // Please ignore ... as I was experimenting this from Javatpoint website
		RearrageString rearrangestring = new RearrageString();
		rearrangestring.getString("te2cH4no7");
	}

}
