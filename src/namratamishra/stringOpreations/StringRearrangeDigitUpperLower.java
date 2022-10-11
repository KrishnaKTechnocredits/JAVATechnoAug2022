package namratamishra.stringOpreations;
/*
Write a program to rearrange String in given format.  
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
Hint: Character.isUpperCase(ch), Character.isLowerCase(ch)
 */

import java.util.Scanner;

class StringRearrangeDigitUpperLower {
	String getStringRearrange(String str) {
		String strDgt = " ", strUpr = " ", strLwr = " ";
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean flagDgt = Character.isDigit(ch);
			boolean flagUpr = Character.isUpperCase(ch);
			boolean flagLwr = Character.isLowerCase(ch);
			if (flagDgt)
				strDgt = strDgt + ch;
			if (flagUpr)
				strUpr = strUpr + ch;
			if (flagLwr)
				strLwr = strLwr + ch;

		}
		strDgt = strDgt.replaceAll("\\s", "");
		strUpr = strUpr.replaceAll("\\s", "");
		strLwr = strLwr.replaceAll("\\s", "");
		return (strUpr + strDgt + strLwr);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to rearrange the name");
		String name = sc.nextLine();
		System.out.println(new StringRearrangeDigitUpperLower().getStringRearrange(name));
		sc.close();

	}
}