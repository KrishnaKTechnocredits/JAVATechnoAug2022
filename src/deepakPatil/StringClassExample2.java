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

package deepakPatil;

public class StringClassExample2 {

	String rearrangeString(String name) {
		String allDigit = "";
		String allChar = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isDigit(ch))
				allDigit = allDigit + ch;
			else
				allChar = allChar + ch;
		}

		return allDigit + allChar;
	}

	String rearrangeString1(String name) {
		String uppercaseCh = "";
		String lowercaseCh = "";
		String allDigit = "";

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isUpperCase(ch))
				uppercaseCh = uppercaseCh + ch;
			else if (Character.isLowerCase(ch))
				lowercaseCh = lowercaseCh + ch;
			else if (Character.isDigit(ch))
				allDigit = allDigit + ch;
		}

		return uppercaseCh + allDigit + lowercaseCh;
	}
	
	int findFrequecyOfChar(String name, char checkingChar) {
		int count =0;
		name=name.toLowerCase();
		checkingChar =Character.toLowerCase(checkingChar);
		for(int i=0; i<name.length(); i++) {
			char ch= name.charAt(i);
			if(ch==checkingChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		StringClassExample2 stringClassExample2 = new StringClassExample2();

		System.out.println(stringClassExample2.rearrangeString("24tecHno"));
		System.out.println(stringClassExample2.rearrangeString1("t8EcHNo5Cred3iTs"));
		System.out.println(stringClassExample2.findFrequecyOfChar("TechnoTtcredits", 't'));

	}
}
