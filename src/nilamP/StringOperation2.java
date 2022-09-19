
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
output : 4*/
package nilamP;

public class StringOperation2 {
	String getArrangeString(String name) {
		String str = "";
		String digit = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;

			} else if (Character.isLetter(ch)) {
				str = str + ch;
			}
		}
		return digit + str;
	}

	String ArrangeGivenForm(String name) {
		String upper = "";
		String lower = "";
		String digit = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch)) {
				upper = upper + ch;

			} else if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLowerCase(ch)) {
				lower = lower + ch;
			}
		}
		return upper + digit + lower;
	}

	int getFrequency(String name, char targetchar) {
		int count = 0;
		name = name.toLowerCase();
		targetchar = Character.toLowerCase(targetchar);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == targetchar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String arga[]) {
		StringOperation2 so = new StringOperation2();
		System.out.println("Arranged String is : " + so.getArrangeString("te2cH4no"));
		System.out.println(
				"Arranged String in UpperCase + Digit+ LowerCase format : " + so.ArrangeGivenForm("t8EcHNo5Cred3iTs"));
		System.out.println(
				"Frequency of Target character in given string is : " + so.getFrequency("TechnoTtcredits", 't'));
	}
}
