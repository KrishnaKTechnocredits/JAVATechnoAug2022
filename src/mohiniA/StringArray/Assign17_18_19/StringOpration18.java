/****************Assignment - 18 : 8th Sep'2022

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



**********************/

package mohiniA.StringArray.Assign17_18_19;

public class StringOpration18 {

	String arrangeString(String name) {
		String Dstring = "";
		String Lstring = "";
		for (int index = 0; index < name.length(); index++) {

			if (Character.isDigit(name.charAt(index)))
				Dstring = Dstring + name.charAt(index);
			else
				Lstring = Lstring + name.charAt(index);
			
		}

		return (Dstring + Lstring);
	}

	String arrangeStringUpperDigitLower(String name) {
		String Ustring = "";
		String Dstring = "";
		String Lstring = "";
		for (int index = 0; index < name.length(); index++) {

			if (Character.isDigit(name.charAt(index)))
				Dstring = Dstring + name.charAt(index);
			else if (Character.isUpperCase(name.charAt(index)))
				Ustring = Ustring + name.charAt(index);
			else
				Lstring = Lstring + name.charAt(index);

		}

		return (Ustring + Dstring + Lstring);
	}

	int charCountInString(String name, char target) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {

			if (Character.toUpperCase(name.charAt(index)) == target)
				count++;
			else if (Character.toLowerCase(name.charAt(index)) == target)
				count++;
		}

		return (count);
	}

	public static void main(String[] args) {
		String str1 = "te2cH4no";
		String str2 = "t8EcHNo5Cred3iTs";
		String str3 = "TechnoTtcredits";
		char ch = 't';
		System.out.println("Rearrange String    : " + str1 + "         : : AllDigitAllCharacter   : : "	+ new StringOpration18().arrangeString(str1));
		System.out.println("Rearrange String    : " + str2 + " : : UpperDigitLower	  : : "	+ new StringOpration18().arrangeStringUpperDigitLower(str2));
		System.out.println("Frequency of char " + ch + " :  from String     : : " + str3 + "        : : "+ new StringOpration18().charCountInString(str3, ch));
		
	}

}
